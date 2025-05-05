package com.jcabi.http.wire;

import com.jcabi.http.Request;
import com.jcabi.http.request.JdkRequest;
import org.junit.Test;

import java.io.IOException;

public class FcWireAspectTest {
    @Test
    public void testFcWireAspect1() throws IOException {
        Request req = new JdkRequest("http://google.com")
                .through(FcWire.class);
        req.fetch();
        req.fetch();
    }
}
