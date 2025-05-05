package com.jcabi.http.wire;

import com.jcabi.http.Response;
import com.jcabi.http.request.JdkRequest;
import org.junit.Test;

import java.io.IOException;

public class AbstractResponseCacheTest {
    @Test
    public void testAbstractResponseHeaderCacheAspect1() throws IOException {
        Response response = new JdkRequest("http://google.com")
                .through(LastModifiedCachingWire.class).fetch();
    }

    @Test
    public void testAbstractResponseHeaderCacheAspect2() throws IOException {
        Response response = new JdkRequest("http://google.com")
                .through(ETagCachingWire.class).fetch();
    }
}
