package com.jcabi.http.wire;

import com.jcabi.http.Request;
import com.jcabi.http.Response;
import com.jcabi.http.request.FakeRequest;
import com.jcabi.http.request.JdkRequest;
import org.junit.Test;

import java.io.IOException;

public class RetryWireAspectTest {
    @Test
    public void retryWireTest1() {
        Request request = new JdkRequest("http://not-a-real-domain-name.com")
                .through(RetryWire.class);
        try {
            Response response = request.fetch();
        } catch (IOException ex) {
            System.err.println("Exception test hit exception.");
            request.reset("end"); // Used to trigger the end of the test.
            return;
        }
        request.reset("end"); // Used to trigger the end of the test.
        System.err.println("Fail: Exception test did not hit exception.");
    }

    @Test
    public void retryWireTest2() {
        Request request = new FakeRequest()
                .through(RetryWire.class);
        try {
            Response response = request.fetch();
        } catch (IOException ex) {
            System.err.println("Fail: Non-exception test hit exception.");
            request.reset("end"); // Used to trigger the end of the test.
            return;
        }
        request.reset("end"); // Used to trigger the end of the test.
        System.err.println("Non-exception test did not hit exception.");
    }
}
