package com.jcabi.http;

import com.jcabi.http.mock.MkAnswer;
import com.jcabi.http.mock.MkContainer;
import com.jcabi.http.mock.MkGrizzlyContainer;
import com.jcabi.http.mock.MkQuery;
import com.jcabi.http.request.*;
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
                    .next(new MkAnswer.Simple(200, "world"))
                    .start();
        }

        @AfterEach
        public void stopContainer() { server.stop(); }

        // header is set properly
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
        public void backTest() {
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


    }



