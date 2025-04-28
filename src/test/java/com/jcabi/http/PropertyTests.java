package com.jcabi.http;

import com.jcabi.http.mock.MkAnswer;
import com.jcabi.http.mock.MkContainer;
import com.jcabi.http.mock.MkGrizzlyContainer;
import com.jcabi.http.mock.MkQuery;
import com.jcabi.http.request.*;
import com.jcabi.http.response.JsonResponse;
import com.jcabi.http.response.RestResponse;
import com.jcabi.http.wire.AutoRedirectingWire;
import jakarta.ws.rs.core.HttpHeaders;
import org.junit.jupiter.api.*;
import java.io.ByteArrayInputStream;
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
        @Test
        public void headersTest() throws Exception {
            Response req = new JdkRequest(server.home())
                    .header("CS574", "student")
                    .fetch();

            MkQuery resp = server.take();
            assertEquals("student",resp.headers().get("Cs574").get(0));
        }

        // request are immutable -> objects are different
        @Test
        public void requestTest() {
            Request r1 = new FakeRequest();
            Request r2 = r1.header("new", "request");
            assertNotEquals(r1, r2);
        }

        // reset clears the header
        @Test
        public void resetTest() throws Exception {
            Request r1 = new ApacheRequest(server.home())
                    .header("reset", "test");
            r1.fetch();

            MkQuery rp1 = server.take();

            Response r2 = r1.reset("reset")
                    .fetch();
            MkQuery rp2 = server.take();
            assertEquals("test", rp1.headers().get("Reset").get(0));
            assertNull( rp2.headers().get("Reset"));
        }

        // request body is set properly
        @Test
        public void bodySetGetTest() {
            RequestBody body = new FakeRequest().body().set("test");
            assertEquals("test", body.get());
        }

        // fetch fails with param when body is set
        // otherwise works
        @Test
        public void fetchTest() throws Exception {
            Request req = new FakeRequest().withBody("test");

            assertThrows(IllegalStateException.class, () -> req.fetch(new ByteArrayInputStream("newBody".getBytes())));

            req.fetch();
            MkQuery resp = server.take();
            System.out.println(resp.body());

        }

        // back returns the same request
        @Test
        public void backFromBodyTest() {
            Request r1 = new JdkRequest(server.home());
            Request r2 = r1.body().back();

            assertEquals(r1.uri(), r2.uri()); // back retruns BaseRequest but they shuold have the same uri
        }

        // queryParam is set properly
        @Test
        public void queryParamTest() throws Exception {
            RequestURI req = new JdkRequest(server.home())
                    .uri().queryParam("param", "value");

            assertEquals(server.home() + "?param=value", req.toString());
        }

        // formParam is set properly
        @Test
        public void formParamTest() throws Exception {
            RequestBody req = new JdkRequest(server.home())
                    .body().formParam("param", "value");

            assertEquals("param=value", req.get());
        }

        // setUri overwrites the uri
        @Test
        public void setUriTest() throws Exception {
            RequestURI req = new JdkRequest(server.home())
                    .uri().set(new URI("newUri"));

            assertEquals("newUri", req.toString());
        }

        // URI path is set properly
        @Test
        public void uriPathTest() throws Exception {
            RequestURI req = new JdkRequest(server.home())
                    .uri().path("/newPath");

            assertEquals(server.home() + "/newPath", req.toString());
        }

        // URI userinfo is set properly
        @Test
        public void uriUserInfoTest() throws Exception {
            String username = "username";
            RequestURI req = new JdkRequest(server.home())
                    .uri().userInfo(username);

            assertEquals("http://" + username + "@" + server.home().getHost() + ":" + server.home().getPort() + "/", req.toString());
        }

        // URI port is set properly
        @Test
        public void uriPortTest() throws Exception {
            RequestURI req = new JdkRequest(server.home())
                    .uri().port(8080);

            System.out.println(server.home().getPort());
            System.out.println(server.home().getHost());
            System.out.println(server.home().getPath());
            assertEquals("http://" + server.home().getHost() + ":8080/", req.toString());
        }

        // test status code
        @Test
        public void statusTest() throws Exception {
            Request req = new JdkRequest(server.home())
                    .method(Request.GET);

            Response response = req.fetch();
            Response response2 = req.fetch();

            assertEquals(200, response.status());
            assertEquals(212, response2.status());

        }

        // test reason
        @Test
        public void reasonTest() throws Exception {
            Request req = new JdkRequest(server.home())
                    .method(Request.GET);

            Response response = req.fetch();
            Response response2 = req.fetch();

            assertEquals("OK", response.reason());
            assertEquals("CUSTOM", response2.reason());

        }

        // test body
        @Test
        public void bodyTest() throws Exception {
            Request req = new JdkRequest(server.home())
                    .method(Request.GET);

            Response response = req.fetch();
            Response response2 = req.fetch();

            assertEquals("hello", response.body());
            assertEquals("world", response2.body());

        }

        // retrieves and parses Json
        @Test
        public void jsonResponseTest() throws Exception {
            MkContainer server2 = new MkGrizzlyContainer()
                    .next(new MkAnswer.Simple(200, "{\"hello\":\"world\"}"))
                    .start();
            String response = new JdkRequest(server2.home())
                    .method(Request.GET).fetch().as(JsonResponse.class)
                    .json().readObject().getString("hello");


            assertEquals("world", response);

        }

        // gets cookies by name and gets paths
        @Test
        public void cookiesTest() throws Exception {
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
        @Test
        public void redirectingWireTest() throws Exception {
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




    }



