package com.jcabi.http;

import com.jcabi.http.mock.MkAnswer;
import com.jcabi.http.mock.MkContainer;
import com.jcabi.http.mock.MkGrizzlyContainer;
import com.jcabi.http.mock.MkQuery;
import com.jcabi.http.request.*;
import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
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
        public void requestTest() {
            Request r1 = new FakeRequest();
            Request r2 = r1.header("new", "request");
            assertNotEquals(r1, r2);
        }

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

        @Test
        public void bodySetGetTest() {
            RequestBody body = new FakeRequest().body().set("test");
            assertEquals("test", body.get());
        }

        @Test
        public void fetchTest() throws Exception {
            Request req = new FakeRequest().withBody("test");

            assertThrows(IllegalStateException.class, () -> req.fetch(new ByteArrayInputStream("newBody".getBytes())));

            req.fetch();
            MkQuery resp = server.take();
            System.out.println(resp.body());

        }

    }



