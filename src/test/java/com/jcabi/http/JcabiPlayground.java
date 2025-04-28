//package com.jcabi.http;
//
//import com.google.common.net.HttpHeaders;
//import com.google.common.net.MediaType;
//import com.jcabi.http.request.JdkRequest;
//import com.jcabi.http.response.JsonResponse;
//import com.jcabi.http.wire.RetryWire;
//import jakarta.json.JsonArray;
//
//public class JcabiPlayground {
//    public static void main(String[] args) {
//        String query = "what is jcabi-http";
//        String apiUrl = "https://www.google.com/";
//
//        try {
//            // Create the request
//             String response = new JdkRequest(apiUrl)
//                     .header(HttpHeaders.USER_AGENT, "Mozilla/5.0")
//                     .header(HttpHeaders.ACCEPT, "application/json")
//                .uri()
//                .queryParam("q", query)
//                .queryParam("format", "json")
//                .back()
//                     .through(RetryWire.class)
//                .method("GET")
//                .fetch()
//                        .as()
//
//
//             System.out.println("Response: " + response);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}