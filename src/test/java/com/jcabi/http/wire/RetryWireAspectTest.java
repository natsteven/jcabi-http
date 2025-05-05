package com.jcabi.http.wire;

import com.jcabi.http.Response;
import com.jcabi.http.request.JdkRequest;
import org.junit.Test;

import java.io.IOException;

public class RetryWireAspectTest {
    @Test
    public void retryWireTest() throws IOException {
        Response response = new JdkRequest("http://google.com")
            .through(RetryWire.class).fetch();
    }
}
