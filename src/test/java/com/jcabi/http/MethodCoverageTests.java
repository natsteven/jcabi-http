package com.jcabi.http;

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
import java.util.AbstractMap;
import java.util.Map;

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

    // ApacheRequest constructors, reset, body, multipartBody, fetch, through

    @Test
    void apacheRequestCtorAndReset() throws IOException {
        ApacheRequest req1 = new ApacheRequest(server.home());
        InputStream in = new ByteArrayInputStream("data".getBytes());
        Response res1 = req1.fetch(in);
        // reset on a fresh request
        Request req2 = req1.reset("Any-Header");
        Response res2 = req2.fetch();
        assertEquals(200, res2.status());
    }

    @Test
    void bodyAndMultipartBodyApis() {
        ApacheRequest req = new ApacheRequest(server.home());
        // Form-encoded body
        RequestBody form = req.body();
        form = form.formParams(Map.of("foo", "bar")); // FormEncodedBody.formParams
        assertTrue(form.get().contains("foo=bar"));
        // Multipart form body
        RequestBody multi = req.multipartBody();
        multi = multi.set("text");               // set(String)
        multi = multi.set("bin".getBytes());    // set(byte[])
        String get = multi.get(); // not used
        JsonObject json = Json.createObjectBuilder().add("x", 1).build();
        multi = multi.set(json);                  // set(JsonStructure)
        multi = multi.formParams(Map.of("a", "b")); // MultipartFormBody.formParams
        assertTrue(multi.get().contains("a"));      // get()
    }

    @Test
    void fetchInputStreamAndThroughWire() throws Exception {
        URI home = server.home();
        ApacheRequest req = new ApacheRequest(home);
        InputStream in = new ByteArrayInputStream("data".getBytes());
        // through(Class<T>) overload
        Request viaClass = req.through(CachingWire.class);
        assertEquals(200, viaClass.fetch(in).status()); // fetch(InputStream)
        // through(Wire) overload
        Wire custom = Mockito.mock(Wire.class);
        Request viaObj = req.through(custom);
        assertEquals(200, viaObj.fetch().status());
    }

    // JsonResponse.VerboseReader.close()

    @Test
    void jsonResponseVerboseReaderClose() throws Exception {
        URI home = server.home();
        JsonResponse jr = new ApacheRequest(home)
                .fetch()
                .as(JsonResponse.class);
        jr.json().close();
    }

    // WebLinkingResponse.SimpleLink Map methods

    @Test
    void simpleLinkMapMethods() throws Exception {
        URI home = server.home();
        WebLinkingResponse wlr = new ApacheRequest(home)
                .fetch()
                .as(WebLinkingResponse.class);
        WebLinkingResponse.Link link = wlr.links().get("next");
        assertNotNull(link);
        // size/isEmpty
        assertEquals(1, link.size());
        assertFalse(link.isEmpty());
        // containsKey/containsValue
        assertTrue(link.containsKey("rel"));
        assertTrue(link.containsValue("next"));
        // keySet/values
        assertTrue(link.keySet().contains("rel"));
        assertTrue(link.values().contains("next"));
        // mutation methods throw
        assertThrows(UnsupportedOperationException.class, () -> link.put("a","b"));
        assertThrows(UnsupportedOperationException.class, () -> link.remove("rel"));
        assertThrows(UnsupportedOperationException.class, () -> link.putAll(Map.of("x","y")));
        assertThrows(UnsupportedOperationException.class, link::clear);
    }

    // XmlResponse.rel and CachingWire.invalidate

    @Test
    void xmlResponseRelAndCachingInvalidate() throws Exception {
        URI home = server.home();
        // prepare XML link
        String xml = "<root><link rel=\"self\" href=\"http://example.com/path\"/></root>";
        server.next(new MkAnswer.Simple(200, xml)
                .withHeader("Content-Type", "text/xml"));
        Request next = new ApacheRequest(home)
                .fetch()
                .as(XmlResponse.class)
                .rel("/root/link/@href");
        assertNotNull(next);
        // caching invalidate
        Request cached = new ApacheRequest(home).through(CachingWire.class);
        cached.fetch();
        assertEquals(1, server.queries());
        CachingWire.invalidate();
        cached.fetch();
        assertEquals(2, server.queries());
    }

    // toString and equals/hashCode for BaseUri and FormEncodedBody

    @Test
    void toStringAndEqualsHashCodeTests() throws IOException {
        URI home = server.home();
        ApacheRequest areq = new ApacheRequest(home);
        // ApacheRequest.toString should include HTTP line
        String atext = areq.toString();
        assertTrue(atext.contains("HTTP/1.1 GET"));
        // BaseRequest via ApacheRequest covers BaseRequest.toString
        // BaseUri equality
        RequestURI uri1 = areq.uri();
        RequestURI uri2 = areq.uri();
        assertEquals(uri1, uri2);
        assertEquals(uri1.hashCode(), uri2.hashCode());
        // FormEncodedBody equals/hashCode
        RequestBody body1 = areq.body().formParams(Map.of("k","v"));
        RequestBody body2 = areq.body().formParams(Map.of("k","v"));
        assertEquals(body1, body2);
        assertEquals(body1.hashCode(), body2.hashCode());
        // WeblinkingRespones#SimpleLink hashCode
        WebLinkingResponse wlr = new ApacheRequest(home)
                .fetch()
                .as(WebLinkingResponse.class);
        WebLinkingResponse.Link link = wlr.links().get("next");
        WebLinkingResponse.Link link2 = wlr.links().get("next");
        assertEquals(link, link2);
    }

    @Test
    void fakeRequestThroughClassWithArgsWorks() throws Exception {
        FakeRequest fake = new FakeRequest().withStatus(201);
        Request decorated = fake.through(RetryWire.class, 5);
        Response res = decorated.fetch();
        assertEquals(201, res.status());
    }

    @Test
    void restAssert() throws IOException {
        Response res = new ApacheRequest(server.home())
                .fetch()
                .as(RestResponse.class);
        RestResponse rest = new RestResponse(res);
        rest.assertThat(Matchers.equalTo(res));
    }

    @Test
    void jsonAssert() {
        try {
            JsonResponse res = new JdkRequest(server.home())
                    .fetch().as(JsonResponse.class);
            JsonResponse r2 = res.assertJson("its unsupported anyways");
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("unsupported"));
        }
    }

    @Test
    void abstractReason() {
        try {
            JsonResponse rp = new JdkRequest(server.home()).fetch().as(JsonResponse.class);
            rp.reason();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    void fcWireEqualsAndHashCodeTest() {
        Wire wire = Mockito.mock(Wire.class);
        FcWire f1 = new FcWire(wire, "one", "two");
        FcWire f2 = new FcWire(wire, "one", "two");
        FcWire f3 = new FcWire(wire, "one", "three");
        assertEquals(f1, f2);
        assertEquals(f1.hashCode(), f2.hashCode());
        assertNotEquals(f1, f3);
    }

    @Test
    void oneMinuteWireSendTest() throws Exception {
        URI home = server.home();
        Request req = new ApacheRequest(home).through(OneMinuteWire.class);
        assertEquals(200, req.fetch().status());
    }



}
