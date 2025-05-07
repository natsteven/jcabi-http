package com.jcabi.http.wire;

import com.jcabi.http.Request;
import com.jcabi.http.Response;
import com.jcabi.http.request.FakeRequest;
import com.jcabi.http.request.JdkRequest;
import org.junit.Test;

import java.io.IOException;

public class AbstractResponseHeaderAspectTest {
    @Test
    public void abstractResponseHeaderTest1() throws IOException {
        Request request = new FakeRequest()
                .through(LastModifiedCachingWire.class);
        Response response = request.fetch();
        response = request.fetch();
        response = request.fetch();
        request.uri(); // Used to trigger the end of the test.
    }

    @Test
    public void abstractResponseHeaderTest2() throws IOException {
        Request request = new FakeRequest()
                .through(ETagCachingWire.class);
        Response response = request.fetch();
        response = request.fetch();
        response = request.fetch();
        request.uri(); // Used to trigger the end of the test.
    }
}
