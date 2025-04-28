package com.jcabi.http;

import com.jcabi.http.mock.MkAnswer;
import com.jcabi.http.mock.MkContainer;
import com.jcabi.http.mock.MkGrizzlyContainer;
import com.jcabi.http.mock.MkQuery;
import com.jcabi.http.request.*;
import org.junit.jupiter.api.*;

import java.util.List;
import java.util.Map;

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

        @Test
        public void headersTest() throws Exception {
            Response req = new JdkRequest(server.home())
                    .header("CS574", "student")
                    .fetch();

            MkQuery resp = server.take();
            assertEquals("student",resp.headers().get("Cs574").get(0));
        }

        @Test
        void requestTest() {
            Request r1 = new FakeRequest();
            Request r2 = r1.header("new", "request");
            assertNotEquals(r1, r2);
        }

        @Test
        void resetTest() throws Exception {
            Request r1 = new ApacheRequest(server.home())
                    .header("reset", "test");
            r1.fetch();

            MkQuery rp1 = server.take();

            Response r2 = r1.reset("reset")
                    .fetch();
            MkQuery rp2 = server.take();
            assertNotEquals(r1, r2);
            assertNotEquals(rp1, rp2);

        }

        @Test
        void bodySetGetTest() {
            RequestBody body = new FakeRequest().body().set("test");
            assertEquals("test", body.get());
        }
//
//        @Test
//        void queryParamTest() {
//            RequestURI uri = new FakeRequest().uri()
//                    .queryParam("a", "x")
//                    .queryParam("b", "y");
//            String built = uri.get().toString();
//        }
//
//        @Test
//        void responseHeadersPreserved() throws Exception {
//            Response res = new ApacheRequest(server.home()).fetch();
//            List<Map.Entry<String,String>> foo = res.headers("Foo");
//
//        }
//
//        @Test
//        void reasonNotEmpty() throws Exception {
//            String reason = new FakeRequest().withReason("Teapot").fetch().reason();
//            assertNotNull(reason);
//            assertFalse(reason.isEmpty());
//        }
//
//        @Test
//        void backReturnsSameRequest() throws Exception {
//            FakeRequest origin = new FakeRequest();
//            Response res = origin.fetch();
//            assertSame(origin, res.back());
//        }
//
//        @Test
//        void responseBodyUtf8() throws Exception {
//            String text = "Привет";
//            Response res = new FakeRequest().withBody(text).fetch();
//            assertEquals(text, res.body());
//        }
    }



