package com.jcabi.http;

import com.jcabi.http.request.*;
import com.jcabi.http.response.*;
import com.jcabi.http.wire.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import com.jcabi.immutable.Array;
import java.util.AbstractMap;
import java.net.URL;
import java.util.Map;

public class InfoMethodTests {

    // TRIVIAL TESTS: ---------------------------------------
    // This tests the toString, equals, and hashCode methods of all classes.
    // These are often generated through the lombok package and aren't really related to functionality.
    // Certain other trivial coverage of, for example, unused constructors is also achieved here.
    @Test
    void toStringTests() throws Exception {
        try {
            // Requests Classes
            String urlString = "http://localhost:8080/";
            URL basicURL = new URL(urlString);
            Wire wire = Mockito.mock(Wire.class);

            ApacheRequest apacheRequest = new ApacheRequest(basicURL);
            String expected = "HTTP/1.1 GET / (localhost)\n\n";
            assert(apacheRequest.toString().contains(expected));

            BaseRequest baseRequest = new BaseRequest(wire, urlString);
            assert(baseRequest.toString().contains(expected));
            assert(baseRequest.uri().toString().equals(urlString));
            RequestBody body = baseRequest.body().formParam("a","b").formParam("c","d");
            assert(body.toString().equals("a=b&c=d"));
            assert(baseRequest.multipartBody().toString().contains("<<empty>>"));

            FakeRequest fakeRequest = new FakeRequest();
            assert(fakeRequest.toString().contains("FakeRequest"));

            JdkRequest jdkRequest = new JdkRequest(urlString);
            assert(jdkRequest.toString().contains("JdkRequest"));

            // Wire Classes
            AutoRedirectingWire wire1 = new AutoRedirectingWire(wire);
            assert(wire1.toString().contains("AutoRedirectingWire"));

            BasicAuthWire wire2 = new BasicAuthWire(wire);
            assert(wire2.toString().contains("BasicAuthWire"));

            CachingWire wire3 = new CachingWire(wire);
            assert(wire3.toString().contains("CachingWire"));

            CookieOptimizingWire wire4 = new CookieOptimizingWire(wire);
            assert(wire4.toString().contains("CookieOptimizingWire"));

            ETagCachingWire wire5 = new ETagCachingWire(wire);
            assert(wire5.toString().contains("ETagCachingWire"));

            FcWire wire6 = new FcWire(wire);
            assert(wire6.toString().contains("FcWire"));

            LastModifiedCachingWire wire7 = new LastModifiedCachingWire(wire);
            assert(wire7.toString().contains("LastModifiedCachingWire"));

            OneMinuteWire wire8 = new OneMinuteWire(wire);
            assert(wire8.toString().contains("OneMinuteWire"));

            RetryWire wire9 = new RetryWire(wire);
            assert(wire9.toString().contains("RetryWire"));

            TrustedWire wire10 = new TrustedWire(wire);
            assert(wire10.toString().contains("TrustedWire"));

            UserAgentWire wire11 = new UserAgentWire(wire);
            assert(wire11.toString().contains("UserAgentWire"));

            VerboseWire wire12 = new VerboseWire(wire);
            assert(wire12.toString().contains("VerboseWire"));

        } catch (Exception e) {
            System.out.println("Exception in toStringTests: " + e.getMessage());
        }
    }

    @Test
    void equalsTest() throws Exception {
        try {
            String urlString = "http://localhost:8080/";
            URL basicURL = new URL(urlString);
            Wire wire = Mockito.mock(Wire.class);

            // Create identical headers and content
            Array<Map.Entry<String, String>> headers = new Array<>(
                    new AbstractMap.SimpleEntry<>("Content-Type", "application/json"),
                    new AbstractMap.SimpleEntry<>("Authorization", "Bearer token")
            );
            byte[] content = "response body".getBytes();

            ApacheRequest apacheRequest = new ApacheRequest(basicURL);
            ApacheRequest apacheRequest2 = new ApacheRequest(basicURL);
            assert (apacheRequest.equals(apacheRequest2));

            DefaultResponse defaultResponse = new DefaultResponse(apacheRequest, 200, "OK", headers, content);
            DefaultResponse defaultResponse2 = new DefaultResponse(apacheRequest2, 200, "OK", headers, content);
            assert (defaultResponse.equals(defaultResponse2));

            FakeRequest fakeRequest = new FakeRequest();
            FakeRequest fakeRequest2 = new FakeRequest();
            assert (fakeRequest.equals(fakeRequest2));

            JdkRequest jdkRequest = new JdkRequest(urlString);
            JdkRequest jdkRequest2 = new JdkRequest(urlString);
            assert (jdkRequest.equals(jdkRequest2));

            // Response Classes
            Response response = Mockito.mock(Response.class);

            JacksonResponse jacksonResponse = new JacksonResponse(response);
            JacksonResponse jacksonResponse2 = new JacksonResponse(response);
            assert (jacksonResponse.equals(jacksonResponse2));

            JsonResponse jsonResponse = new JsonResponse(response);
            JsonResponse jsonResponse2 = new JsonResponse(response);
            assert (jsonResponse.equals(jsonResponse2));

            JsoupResponse jsoupResponse = new JsoupResponse(response);
            JsoupResponse jsoupResponse2 = new JsoupResponse(response);
            assert (jsoupResponse.equals(jsoupResponse2));

            RestResponse restResponse = new RestResponse(response);
            RestResponse restResponse2 = new RestResponse(response);
            assert (restResponse.equals(restResponse2));

            WebLinkingResponse webLinkingResponse = new WebLinkingResponse(response);
            WebLinkingResponse webLinkingResponse2 = new WebLinkingResponse(response);
            assert (webLinkingResponse.equals(webLinkingResponse2));

            XmlResponse xmlResponse = new XmlResponse(response);
            XmlResponse xmlResponse2 = new XmlResponse(response);
            assert (xmlResponse.equals(xmlResponse2));

            // Wire Classes

            AutoRedirectingWire autoRedirectingWire = new AutoRedirectingWire(wire);
            AutoRedirectingWire autoRedirectingWire2 = new AutoRedirectingWire(wire);
            assert (autoRedirectingWire.equals(autoRedirectingWire2));

            BasicAuthWire basicAuthWire = new BasicAuthWire(wire);
            BasicAuthWire basicAuthWire2 = new BasicAuthWire(wire);
            assert (basicAuthWire.equals(basicAuthWire2));

            CachingWire cachingWire = new CachingWire(wire);
            CachingWire cachingWire2 = new CachingWire(wire);
            assert (cachingWire.equals(cachingWire2));

            CookieOptimizingWire cookieOptimizingWire = new CookieOptimizingWire(wire);
            CookieOptimizingWire cookieOptimizingWire2 = new CookieOptimizingWire(wire);
            assert (cookieOptimizingWire.equals(cookieOptimizingWire2));

            FcWire fcWire = new FcWire(wire);
            FcWire fcWire2 = new FcWire(wire);
            assert (fcWire.equals(fcWire2));

            OneMinuteWire oneMinuteWire = new OneMinuteWire(wire);
            OneMinuteWire oneMinuteWire2 = new OneMinuteWire(wire);
            assert (oneMinuteWire.equals(oneMinuteWire2));

            RetryWire retryWire = new RetryWire(wire);
            RetryWire retryWire2 = new RetryWire(wire);
            assert (retryWire.equals(retryWire2));

            TrustedWire trustedWire = new TrustedWire(wire);
            TrustedWire trustedWire2 = new TrustedWire(wire);
            assert (trustedWire.equals(trustedWire2));

            UserAgentWire userAgentWire = new UserAgentWire(wire);
            UserAgentWire userAgentWire2 = new UserAgentWire(wire);
            assert (userAgentWire.equals(userAgentWire2));

            VerboseWire verboseWire = new VerboseWire(wire);
            VerboseWire verboseWire2 = new VerboseWire(wire);
            assert (verboseWire.equals(verboseWire2));

        } catch (Exception e) {
            System.out.println("Exception in equalsTest: " + e.getMessage());
        }
    }

    // BaseRequest reset
}
