package com.jcabi.http.wire;

import com.jcabi.http.Request;
import com.jcabi.http.request.JdkRequest;
import org.junit.Test;

import java.io.IOException;

public class FcWireAspectTest {
    @Test
    public void testFcWireAspect() {
        Request req = new JdkRequest("http://google.com")
                .through(FcWire.class);
        try {
            req.fetch();
            req.fetch();
            req.method("end"); // Used to trigger the end of the test.
        } catch (IOException ex) {
            System.err.println("Test exception: " + ex.toString());
        }
    }
}
