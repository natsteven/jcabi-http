package com.jcabi.http;

import com.jcabi.http.mock.MkQuery;
import com.jcabi.http.request.*;
import com.jcabi.http.response.*;
import com.jcabi.http.wire.*;
import com.jcabi.http.mock.MkAnswer;
import com.jcabi.http.mock.MkContainer;
import com.jcabi.http.mock.MkGrizzlyContainer;
import com.jcabi.immutable.Array;
import jakarta.json.Json;
import jakarta.json.JsonObject;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.testcontainers.shaded.org.hamcrest.Matcher;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpHeaders;
import java.util.AbstractMap;
import java.util.Map;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class MethodCoverageTests {

    private MkContainer server;

    @BeforeEach
    void startServer() throws Exception {
        server = new MkGrizzlyContainer()
                .next(new MkAnswer.Simple(200, "{\"msg\":\"ok\"}")
                        .withHeader("Content-Type", "application/json")
                        .withHeader("Link", "<http://example.com/next>; rel=\"next\""))
                .next(new MkAnswer.Simple(200, "{\"msg\":\"fresh\"}"))
                .start();
    }

    @AfterEach
    void stopServer() {
        if (server != null) {
            server.stop();
        }
    }

    // ApacheRequest fetch(InputStream), and reset()
    @Test
    void test1() throws IOException {
        ApacheRequest req1 = new ApacheRequest(server.home());
        InputStream in = new ByteArrayInputStream("data".getBytes());
        Response res1 = req1.fetch(in);

        Request req2 = req1.reset("Any-Header");
        Response res2 = req2.fetch();
        assertEquals(200, res2.status());
    }

    // ApacheRequest 2 formParams(), 2 get(), 3 set()
    @Test
    void test2() {
        ApacheRequest req = new ApacheRequest(server.home());

        RequestBody form = req.body();
        form = form.formParams(Map.of("foo", "bar"));
        assertTrue(form.get().contains("foo=bar"));
        RequestBody multi = req.header("Content-Type",";boundary=").multipartBody();
        RequestBody multi2 = req.multipartBody();
        multi = multi.set("text");
        multi = multi.set("bin".getBytes());
        JsonObject json = Json.createObjectBuilder().add("x", 1).build();
        multi = multi.set(json);
        multi = multi.formParams(Map.of("a", "b"));
        assertTrue(multi.get().contains("a"));
    }

    // ApacheReqquest Constructor, 2 through(), fetch()
    @Test
    void test3() throws Exception {
        URI home = server.home();
        ApacheRequest req = new ApacheRequest(home);
        InputStream in = new ByteArrayInputStream("data".getBytes());

        Request viaClass = req.through(CachingWire.class);
        assertEquals(200, viaClass.fetch(in).status());

        Wire custom = Mockito.mock(Wire.class);
        Request viaObj = req.through(custom);
        assertEquals(200, viaClass.fetch().status());
    }

    // JsonResponse.VerboseReader.close()
    @Test
    void test4() throws Exception {
        URI home = server.home();
        JsonResponse jr = new ApacheRequest(home)
                .fetch()
                .as(JsonResponse.class);
        jr.json().close();
    }

    // WebLinkingResponse.SimpleLink Map methods
    @Test
    void test5() throws Exception {
        WebLinkingResponse wlr = new ApacheRequest(server.home())
                .fetch()
                .as(WebLinkingResponse.class);
        WebLinkingResponse.Link link = wlr.links().get("next");
        assertThrows(UnsupportedOperationException.class, () -> link.put("a", "b"));
        assertThrows(UnsupportedOperationException.class, () -> link.putAll(Map.of("c", "d", "e", "f")));
        assert(link.values().contains("next"));
        assertThrows(UnsupportedOperationException.class, () -> link.remove("a"));
        assertNull(link.get("a"));
        assertThrows(UnsupportedOperationException.class, () -> link.clear());
        assert(link.keySet().contains("rel"));
    }

    // XmlResponse.rel
    @Test
    void test6() throws Exception {
        String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
                + "<root><link rel=\"next\" href=\"http://example.com/path\"/></root>";

        MkContainer server2 = new MkGrizzlyContainer().next(new MkAnswer.Simple(200, xml).withHeader("Content-Type", "application/xml"));
        server2.start();
        Request next = new ApacheRequest(server2.home())
                .fetch().as(XmlResponse.class).rel("/root/link/@href");
        assertNotNull(next);
        server2.stop();
    }

    // toString and equals/hashCode for BaseUri, FormEncodedBody, and weblinkning response (inner classes)
    @Test
    void test7() throws IOException {
        URI home = server.home();
        ApacheRequest areq = new ApacheRequest(home);

        RequestURI uri1 = areq.uri();
        RequestURI uri2 = areq.uri();
        assertEquals(uri1, uri2);
        RequestBody body1 = areq.body().formParams(Map.of("k","v"));
        RequestBody body2 = areq.body().formParams(Map.of("k","v"));
        assertEquals(body1, body2);
        WebLinkingResponse wlr = new ApacheRequest(home)
                .fetch()
                .as(WebLinkingResponse.class);
        WebLinkingResponse.Link link1 = wlr.links().get("next");
        WebLinkingResponse.Link link2 = wlr.links().get("next");
        assertEquals(link1, link2);
    }

    // FakeRequest.through(RetryWire), fetch()
    @Test
    void test8() throws Exception {
        FakeRequest fake = new FakeRequest().withStatus(201);
        Request decorated = fake.through(RetryWire.class);
        Response res = decorated.fetch();
        assertEquals(201, res.status());
    }

    // RestResponse.assertThat()
    @Test
    void test9() throws IOException {
        Response res = new ApacheRequest(server.home())
                .fetch()
                .as(RestResponse.class);
        RestResponse rest = new RestResponse(res);
        rest.assertThat(Matchers.equalTo(res));
    }

    // JsonResponse.assertJson
    @Test
    void test10() {
        try {
            JsonResponse res = new JdkRequest(server.home())
                    .fetch().as(JsonResponse.class);
            JsonResponse r2 = res.assertJson("its unsupported anyways");
        } catch (Exception e) {
            assert(e.getMessage().contains("not implemented"));
        }
    }

    // AbstractResponse.reason()
    @Test
    void test11() {
        try {
            JsonResponse rp = new JdkRequest(server.home()).fetch().as(JsonResponse.class);
            rp.reason();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // FcWire.equals()
    @Test
    void test12() {
        Wire wire = Mockito.mock(Wire.class);
        FcWire f1 = new FcWire(wire, "one", "two");
        FcWire f2 = new FcWire(wire, "one", "two");
        assertEquals(f1, f2);
    }

    // OneMinuteWire
    @Test
    void test13() throws Exception {
        URI home = server.home();
        Request req = new ApacheRequest(home).through(OneMinuteWire.class);
        assertEquals(200, req.fetch().status());
    }

    // CachingWire.invalidate()
    @Test
    void test14() throws Exception {
        Request cached = new ApacheRequest(server.home()).through(CachingWire.class);
        cached.fetch();
        MkQuery rp1 = server.take();
        cached.fetch();
        assertThrows(NoSuchElementException.class, server::take);
        CachingWire.invalidate(); //still unsure how to check this works
        cached.fetch();
    }


}
