package com.jcabi.http;

import com.google.common.annotations.VisibleForTesting;
import com.jcabi.http.mock.MkAnswer;
import com.jcabi.http.mock.MkContainer;
import com.jcabi.http.mock.MkGrizzlyContainer;
import com.jcabi.http.mock.MkQuery;
import com.jcabi.http.request.*;
import com.jcabi.http.response.JsonResponse;
import com.jcabi.http.response.RestResponse;
import com.jcabi.http.response.WebLinkingResponse;
import com.jcabi.http.response.XmlResponse;
import com.jcabi.http.wire.AutoRedirectingWire;
import com.jcabi.http.wire.UserAgentWire;
import com.jcabi.http.wire.VerboseWire;
import jakarta.ws.rs.core.HttpHeaders;
import org.junit.jupiter.api.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.net.URI;


import static org.junit.jupiter.api.Assertions.*;


    public class PropertyTests {

        private MkContainer server;

        @BeforeEach
        public void startContainer() throws Exception {
            server = new MkGrizzlyContainer()
                    .next(new MkAnswer.Simple(200, "hello"))
                    .next(new MkAnswer.Simple(212, "world"))
                    .start();
        }

        @AfterEach
        public void stopContainer() { server.stop(); }

        // header is set properly in headers
        // BaseRequest.header(String, Object)
        @Test
        public void test1() throws Exception {
            Response req = new JdkRequest(server.home())
                    .header("CS574", "student")
                    .fetch();

            MkQuery resp = server.take();
            assertEquals("student",resp.headers().get("Cs574").get(0));
        }

        // request are immutable -> objects are different
        // BaseRequest.header(String, Object) returns new object
        @Test
        public void test2() {
            Request r1 = new FakeRequest();
            Request r2 = r1.header("new", "request");
            Request r3 = r1.header("new", "request");
            assert(r2 != r3);
            assert(r2.equals(r3));
        }

        // reset clears the specified header
        // BaseRequest.reset(String)
        @Test
        public void test3() throws Exception {
            Request r1 = new ApacheRequest(server.home()).header("reset", "test");
            r1.fetch();

            MkQuery rp1 = server.take();
            Response r2 = r1.reset("reset").fetch();
            MkQuery rp2 = server.take();
            assertEquals("test", rp1.headers().get("Reset").get(0));
            assertNull( rp2.headers().get("Reset"));
        }

        // request body is set properly
        // BaseRequest#FormEncodedBody.set(String)
        @Test
        public void test4() {
            RequestBody body = new FakeRequest().body().set("test");
            assertEquals("test", body.get());
        }

        // fetch fails with param when body is set
        // BaseRequest.fetch(InputStream)
        @Test
        public void test5() throws Exception {
            Request req = new JdkRequest(server.home()).body().set("test").back();

            assertThrows(IllegalStateException.class, () -> req.fetch(new ByteArrayInputStream("newBody".getBytes())));

            req.fetch();
            MkQuery resp = server.take(); // currently throws nosuchelementexception
            System.out.println(resp.body());

        }

        // back returns the same request
        // BaseRequest#BaseUri.back()
        @Test
        public void test6() {
            Request r1 = new JdkRequest(server.home());
            Request r2 = r1.body().back();

            assertEquals(r1.uri(), r2.uri()); // back retruns BaseRequest but they shuold have the same uri
        }

        // queryParam is set properly
        // BaseRequest#BaseUri.queryParam(String, Object)
        @Test
        public void test7() throws Exception {
            RequestURI req = new JdkRequest(server.home())
                    .uri().queryParam("param", "value");

            assertEquals(server.home() + "?param=value", req.toString());
        }

        // formParam is set properly
        // BaseRequest#FormEncodedBody.formParam(String, Object)
        @Test
        public void test8() throws Exception {
            RequestBody req = new JdkRequest(server.home())
                    .body().formParam("param", "value");

            assertEquals("param=value", req.get());
        }

        // setUri overwrites the uri
        // BaseRequest#BaseUri.set(URI)
        @Test
        public void test9() throws Exception {
            RequestURI req = new JdkRequest(server.home())
                    .uri().set(new URI("newUri"));

            assertEquals("newUri", req.toString());
        }

        // URI path is appended properly to URI
        // BaseRequest#BaseUri.path(String)
        @Test
        public void test10() throws Exception {
            RequestURI req = new JdkRequest(server.home())
                    .uri().path("/newPath");

            assertEquals(server.home() + "newPath", req.toString());
        }

        // URI userinfo is set properly
        // BaseRequest#BaseUri.userInfo(String)
        @Test
        public void test11() throws Exception {
            String username = "username";
            RequestURI req = new JdkRequest(server.home())
                    .uri().userInfo(username);

            assertEquals("http://" + username + "@" + server.home().getHost() + ":" + server.home().getPort() + "/", req.toString());
        }

        // URI port is set properly
        // BaseRequest#BaseUri.port(int)
        @Test
        public void test12() throws Exception {
            RequestURI req = new JdkRequest(server.home())
                    .uri().port(8080);

            assertEquals(server.home().getScheme() + "://" + server.home().getHost() + ":8080/", req.toString());
        }

        // test status code
        // DefaultResponse.status()
        @Test
        public void test13() throws Exception {
            Request req = new JdkRequest(server.home())
                    .method(Request.GET);

            Response response = req.fetch();
            Response response2 = req.fetch();

            assertEquals(200, response.status());
            assertEquals(212, response2.status());

        }

        // test reason
        // DefaultResponse.reason()
        @Test
        public void test14() throws Exception {
            Request req = new JdkRequest(server.home())
                    .method(Request.GET);

            Response response = req.fetch();
            Response response2 = req.fetch();

            assertEquals("OK", response.reason());
            assertEquals("CUSTOM", response2.reason());

        }

        // test body
        // DefaultResponse.body()
        @Test
        public void test15() throws Exception {
            Request req = new JdkRequest(server.home())
                    .method(Request.GET);

            Response response = req.fetch();
            Response response2 = req.fetch();

            assertEquals("hello", response.body());
            assertEquals("world", response2.body());

        }

        // retrieves and parses Json
        // JsonResponse.json()
        @Test
        public void test16() throws Exception {
            MkContainer server2 = new MkGrizzlyContainer()
                    .next(new MkAnswer.Simple(200, "{\"hello\":\"world\"}"))
                    .start();
            String response = new JdkRequest(server2.home())
                    .method(Request.GET).fetch().as(JsonResponse.class)
                    .json().readObject().getString("hello");


            assertEquals("world", response);
            server2.stop();

        }

        // gets cookies by name and gets paths
        // RestResponse.cookie(String)
        @Test
        public void test17() throws Exception {
            RestResponse response = new RestResponse(
                    new FakeRequest().withHeader(HttpHeaders.SET_COOKIE, "cookie1=value1")
                            .withHeader(HttpHeaders.SET_COOKIE, "cookie2=value2; path=value3")
                            .fetch()
            );
            assertEquals("value1", response.cookie("cookie1").getValue());
            assertEquals("value2", response.cookie("cookie2").getValue());
            assertEquals("value3", response.cookie("cookie2").getPath());
        }

        // follows redirects to final destination
        // AutoRedirectingWire.send()
        @Test
        public void test18() throws Exception {
            MkContainer container = new MkGrizzlyContainer()
                    .next(new MkAnswer.Simple(302, "Redirected")
                            .withHeader(HttpHeaders.LOCATION, "/newLocation"))
                    .next(new MkAnswer.Simple(200, "Final Destination"))
                    .start();

            RestResponse response = new JdkRequest(container.home())
                    .through(AutoRedirectingWire.class)
                    .fetch()
                    .as(RestResponse.class);

            response.assertStatus(200);
            assertEquals("Final Destination", response.body());
        }

        // properly parses XML
        // XmlResponse.xml()
        // most of the parsing is actually done by an external library
        @Test
        public void test19() throws Exception {
            MkContainer server2 = new MkGrizzlyContainer()
                    .next(new MkAnswer.Simple(200, "<root><child>value</child></root>"))
                    .start();
            String response = new JdkRequest(server2.home())
                    .method(Request.GET).fetch().as(XmlResponse.class)
                    .xml().xpath("/root/child/text()").get(0);

            assertEquals("value", response);
            server2.stop();
        }

        // parses and follows links in headers
        // WebLinkingResponse.follow()
        @Test
        public void test20() throws Exception {
            MkContainer server2 = new MkGrizzlyContainer()
                    .next(new MkAnswer.Simple(200, "hello")
                            .withHeader("Link", "</newLocation>; rel=\"next\""))
                    .start();
            URI response = new JdkRequest(server2.home())
                    .method(Request.GET).fetch().as(WebLinkingResponse.class)
                    .follow("next").uri().get();

            assertEquals(server2.home() + "newLocation", response.toString());
            server2.stop();
        }

        // verbose wire logs requests
        // VerboseWire
        @Test
        public void test21() throws Exception {
            MkContainer server2 = new MkGrizzlyContainer()
                    .next(new MkAnswer.Simple(200, "secretMessage"))
                    .start();
            ByteArrayOutputStream newOut = new ByteArrayOutputStream();
            System.setOut(new PrintStream(newOut));

            new JdkRequest(server2.home())
                    .through(VerboseWire.class)
                    .method(Request.GET)
                    .fetch();


            assert(newOut.toString().contains("secretMessage"));
            System.setOut(System.out);
            server2.stop();
        }

        // userAgentWire automatically adds user agent header
        // UserAgentWire.send()
        @Test
        public void test22() throws Exception {
            new JdkRequest(server.home())
                    .through(UserAgentWire.class)
                    .fetch();
            MkQuery resp = server.take();
            assert(resp.headers().get("User-Agent").get(0).startsWith("jcabi-"));
        }



    }



