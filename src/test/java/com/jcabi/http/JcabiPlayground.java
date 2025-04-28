package com.jcabi.http;

import com.jcabi.http.request.JdkRequest;
import com.jcabi.http.wire.RetryWire;

public class JcabiPlayground {
    public static void main(String[] args) throws Exception {
        Response resp = new JdkRequest("https://www.google.com/search")
                .through(RetryWire.class)
                .header("Browser", "Mozilla/5.0")
                .uri()
                .queryParam("q", "jcabi-http tutorial")
                .back()
                .method(Request.GET)
                .fetch();

        String html = resp.body();
        System.out.println(html);
    }
}