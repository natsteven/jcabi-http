//package com.jcabi.http;
//
//import org.junit.FixMethodOrder;
//import org.junit.Test;
//import org.junit.runners.MethodSorters;
//
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
//public class RegressionTest0 {
//
//    public static boolean debug = false;
//
//    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
//        if (expectedArray.length != actualArray.length) {
//            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
//        }
//        for (int i = 0; i < expectedArray.length; i++) {
//            if (expectedArray[i] != actualArray[i]) {
//                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
//            }
//        }
//    }
//
//    @Test
//    public void test001() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test001");
//        String str0 = Request.OPTIONS;
//        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "OPTIONS" + "'", str0, "OPTIONS");
//    }
//
//    @Test
//    public void test002() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test002");
//        String str0 = Request.PATCH;
//        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PATCH" + "'", str0, "PATCH");
//    }
//
//    @Test
//    public void test003() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test003");
//        java.util.Random random0 = null;
//        com.jcabi.http.request.Boundary boundary1 = new com.jcabi.http.request.Boundary(random0);
//        // The following exception was thrown during execution in test generation
//        try {
//            String str2 = boundary1.value();
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (NullPointerException e) {
//            // Expected exception.
//        }
//    }
//
//    @Test
//    public void test004() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test004");
//        java.net.URI uRI0 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest(uRI0);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (NullPointerException e) {
//            // Expected exception.
//        }
//    }
//
//    @Test
//    public void test005() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test005");
//        Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        java.io.InputStream inputStream20 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            Response response21 = baseRequest19.fetch(inputStream20);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Request Body is not empty, use fetch() instead");
//        } catch (IllegalStateException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//    }
//
//    @Test
//    public void test006() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test006");
//        String str0 = Request.GET;
//        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "GET" + "'", str0, "GET");
//    }
//
//    @Test
//    public void test007() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test007");
//        String str0 = Request.DELETE;
//        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "DELETE" + "'", str0, "DELETE");
//    }
//
//    @Test
//    public void test008() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test008");
//        Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        // The following exception was thrown during execution in test generation
//        try {
//            Response response20 = baseRequest19.fetch();
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (NullPointerException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//    }
//
//    @Test
//    public void test009() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test009");
//        String str0 = Request.PUT;
//        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PUT" + "'", str0, "PUT");
//    }
//
//    @Test
//    public void test010() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test010");
//        String str0 = Request.POST;
//        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "POST" + "'", str0, "POST");
//    }
//
//    @Test
//    public void test011() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test011");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.request.FakeRequest fakeRequest3 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList6 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse13 = new com.jcabi.http.request.DefaultResponse((Request) fakeRequest3, (-1), "OPTIONS", strEntryList6, byteArray12);
//        com.jcabi.http.Request request16 = fakeRequest3.timeout((int) (byte) -1, (int) (short) 10);
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Request request17 = jdkRequest1.header("", (Object) request16);
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray12);
//        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request16);
//    }
//
//    @Test
//    public void test012() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test012");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        String str3 = fakeRequest2.toString();
//        java.io.InputStream inputStream4 = null;
//        com.jcabi.http.Response response5 = fakeRequest2.fetch(inputStream4);
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>" + "'", str3, "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        org.junit.Assert.assertNotNull(response5);
//    }
//
//    @Test
//    public void test013() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test013");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        java.io.InputStream inputStream3 = null;
//        com.jcabi.http.Response response4 = fakeRequest0.fetch(inputStream3);
//        com.jcabi.http.Wire wire5 = null;
//        com.jcabi.http.Request request6 = fakeRequest0.through(wire5);
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(response4);
//        org.junit.Assert.assertNotNull(request6);
//    }
//
//    @Test
//    public void test014() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test014");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Request request16 = fakeRequest0.header("", (Object) (-1L));
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//    }
//
//    @Test
//    public void test015() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test015");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request3 = jdkRequest1.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.request.FakeRequest fakeRequest10 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList13 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse20 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest10, (-1), "OPTIONS", strEntryList13, byteArray19);
//        com.jcabi.http.Wire wire21 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest23 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList26 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse33 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest23, (-1), "OPTIONS", strEntryList26, byteArray32);
//        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest40 = new com.jcabi.http.request.BaseRequest(wire21, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList26, "hi!", byteArray37, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder41 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray37);
//        com.jcabi.http.request.FakeRequest fakeRequest42 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList13, byteArray37);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder43 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray44 = multipartBodyBuilder43.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest45 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList13, byteArray44);
//        com.jcabi.http.request.FakeRequest fakeRequest48 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList51 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray57 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse58 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest48, (-1), "OPTIONS", strEntryList51, byteArray57);
//        com.jcabi.http.request.FakeRequest fakeRequest59 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList62 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray68 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse69 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest59, (-1), "OPTIONS", strEntryList62, byteArray68);
//        com.jcabi.http.request.FakeRequest fakeRequest70 = new com.jcabi.http.request.FakeRequest(0, "V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList51, byteArray68);
//        com.jcabi.http.request.DefaultResponse defaultResponse71 = new com.jcabi.http.request.DefaultResponse(request3, (int) (short) 0, "d\001\nd\n", strEntryList13, byteArray68);
//        Class<?> wildcardClass72 = request3.getClass();
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray32);
//        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray37);
//        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray44);
//        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray57);
//        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray68);
//        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(wildcardClass72);
//    }
//
//    @Test
//    public void test016() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test016");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestURI requestURI4 = jdkRequest1.uri();
//        com.jcabi.http.Wire wire6 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest8 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList11 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse18 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest8, (-1), "OPTIONS", strEntryList11, byteArray17);
//        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest25 = new com.jcabi.http.request.BaseRequest(wire6, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList11, "hi!", byteArray22, 0, 100);
//        com.jcabi.http.Request request27 = baseRequest25.method("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Request request28 = jdkRequest1.header("", (Object) request27);
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestURI4);
//        org.junit.Assert.assertNotNull(byteArray17);
//        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray22);
//        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request27);
//    }
//
//    @Test
//    public void test017() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test017");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request3 = jdkRequest1.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.request.FakeRequest fakeRequest10 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList13 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse20 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest10, (-1), "OPTIONS", strEntryList13, byteArray19);
//        com.jcabi.http.Wire wire21 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest23 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList26 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse33 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest23, (-1), "OPTIONS", strEntryList26, byteArray32);
//        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest40 = new com.jcabi.http.request.BaseRequest(wire21, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList26, "hi!", byteArray37, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder41 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray37);
//        com.jcabi.http.request.FakeRequest fakeRequest42 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList13, byteArray37);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder43 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray44 = multipartBodyBuilder43.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest45 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList13, byteArray44);
//        com.jcabi.http.request.FakeRequest fakeRequest48 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList51 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray57 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse58 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest48, (-1), "OPTIONS", strEntryList51, byteArray57);
//        com.jcabi.http.request.FakeRequest fakeRequest59 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList62 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray68 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse69 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest59, (-1), "OPTIONS", strEntryList62, byteArray68);
//        com.jcabi.http.request.FakeRequest fakeRequest70 = new com.jcabi.http.request.FakeRequest(0, "V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList51, byteArray68);
//        com.jcabi.http.request.DefaultResponse defaultResponse71 = new com.jcabi.http.request.DefaultResponse(request3, (int) (short) 0, "d\001\nd\n", strEntryList13, byteArray68);
//        byte[] byteArray72 = defaultResponse71.binary();
//        java.util.Map<String, java.util.List<String>> strMap73 = defaultResponse71.headers();
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray32);
//        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray37);
//        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray44);
//        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray57);
//        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray68);
//        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray72);
//        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(strMap73);
//    }
//
//    @Test
//    public void test018() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test018");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder0 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray1 = multipartBodyBuilder0.asBytes();
//        byte[] byteArray2 = multipartBodyBuilder0.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        com.jcabi.http.Wire wire16 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest18 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList21 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse28 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest18, (-1), "OPTIONS", strEntryList21, byteArray27);
//        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest35 = new com.jcabi.http.request.BaseRequest(wire16, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList21, "hi!", byteArray32, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder36 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray32);
//        com.jcabi.http.request.FakeRequest fakeRequest37 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList8, byteArray32);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder38 = multipartBodyBuilder0.appendLine(byteArray32);
//        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder44 = multipartBodyBuilder38.appendLine(byteArray43);
//        com.jcabi.http.Wire wire45 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest47 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList50 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray56 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse57 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest47, (-1), "OPTIONS", strEntryList50, byteArray56);
//        byte[] byteArray61 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest64 = new com.jcabi.http.request.BaseRequest(wire45, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList50, "hi!", byteArray61, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder65 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray61);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder66 = multipartBodyBuilder38.append(byteArray61);
//        byte[] byteArray67 = multipartBodyBuilder38.asBytes();
//        org.junit.Assert.assertNotNull(byteArray1);
//        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray2);
//        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray27);
//        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray32);
//        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder38);
//        org.junit.Assert.assertNotNull(byteArray43);
//        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder44);
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray61);
//        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder66);
//        org.junit.Assert.assertNotNull(byteArray67);
//        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 0, (byte) 100, (byte) 13, (byte) 10 });
//    }
//
//    @Test
//    public void test019() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test019");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        String str20 = baseRequest19.toString();
//        com.jcabi.http.RequestURI requestURI21 = baseRequest19.uri();
//        java.io.InputStream inputStream22 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response23 = baseRequest19.fetch(inputStream22);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Request Body is not empty, use fetch() instead");
//        } catch (IllegalStateException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str20, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//        org.junit.Assert.assertNotNull(requestURI21);
//    }
//
//    @Test
//    public void test020() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test020");
//        java.net.URL uRL0 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest(uRL0);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (NullPointerException e) {
//            // Expected exception.
//        }
//    }
//
//    @Test
//    public void test021() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test021");
//        com.jcabi.http.Wire wire0 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.request.BaseRequest baseRequest2 = new com.jcabi.http.request.BaseRequest(wire0, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 8: HTTP/1.1 hi! hi! (null)???d");
//        } catch (IllegalArgumentException e) {
//            // Expected exception.
//        }
//    }
//
//    @Test
//    public void test022() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test022");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request21 = baseRequest19.method("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response22 = baseRequest19.fetch();
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (NullPointerException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request21);
//    }
//
//    @Test
//    public void test023() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test023");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        boolean boolean23 = fakeRequest2.equals((Object) strEntryList8);
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        com.jcabi.http.Wire wire40 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest42 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList45 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse52 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest42, (-1), "OPTIONS", strEntryList45, byteArray51);
//        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest59 = new com.jcabi.http.request.BaseRequest(wire40, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList45, "hi!", byteArray56, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder60 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray56);
//        com.jcabi.http.request.FakeRequest fakeRequest61 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList32, byteArray56);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder62 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray63 = multipartBodyBuilder62.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest64 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList32, byteArray63);
//        com.jcabi.http.request.BaseRequest baseRequest65 = new com.jcabi.http.request.BaseRequest(wire0, "OPTIONS", (Iterable<java.util.Map.Entry<String, String>>) strEntryList8, "PUT", byteArray63);
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response66 = baseRequest65.fetch();
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (NullPointerException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray51);
//        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray63);
//        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
//    }
//
//    @Test
//    public void test024() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test024");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        boolean boolean23 = fakeRequest2.equals((Object) strEntryList8);
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        com.jcabi.http.Wire wire40 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest42 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList45 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse52 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest42, (-1), "OPTIONS", strEntryList45, byteArray51);
//        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest59 = new com.jcabi.http.request.BaseRequest(wire40, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList45, "hi!", byteArray56, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder60 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray56);
//        com.jcabi.http.request.FakeRequest fakeRequest61 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList32, byteArray56);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder62 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray63 = multipartBodyBuilder62.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest64 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList32, byteArray63);
//        com.jcabi.http.request.BaseRequest baseRequest65 = new com.jcabi.http.request.BaseRequest(wire0, "OPTIONS", (Iterable<java.util.Map.Entry<String, String>>) strEntryList8, "PUT", byteArray63);
//        java.io.InputStream inputStream66 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response67 = baseRequest65.fetch(inputStream66);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (NullPointerException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray51);
//        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray63);
//        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
//    }
//
//    @Test
//    public void test025() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test025");
//        com.jcabi.http.Wire wire0 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.request.BaseRequest baseRequest2 = new com.jcabi.http.request.BaseRequest(wire0, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 24: JdkRequest(base=HTTP/1.1 GET OPTIONS (null)??<<empty>>)");
//        } catch (IllegalArgumentException e) {
//            // Expected exception.
//        }
//    }
//
//    @Test
//    public void test026() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test026");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest23 = fakeRequest2.withBody(byteArray19);
//        byte[] byteArray24 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.request.FakeRequest fakeRequest25 = fakeRequest2.withBody(byteArray24);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (NullPointerException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest23);
//    }
//
//    @Test
//    public void test027() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test027");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.BaseRequest baseRequest2 = new com.jcabi.http.request.BaseRequest(wire0, "DELETE");
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response3 = baseRequest2.fetch();
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (NullPointerException e) {
//            // Expected exception.
//        }
//    }
//
//    @Test
//    public void test028() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test028");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.request.JdkRequest jdkRequest4 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request6 = jdkRequest4.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        String str7 = jdkRequest4.toString();
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Request request8 = jdkRequest1.header("", (Object) str7);
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
//        } catch (ArrayIndexOutOfBoundsException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(request6);
//        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str7, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//    }
//
//    @Test
//    public void test029() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test029");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request3 = jdkRequest1.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.Wire wire4 = null;
//        com.jcabi.http.Request request5 = jdkRequest1.through(wire4);
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response6 = jdkRequest1.fetch();
//            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: 'OPTIONS' is incorrect");
//        } catch (java.io.IOException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(request5);
//    }
//
//    @Test
//    public void test030() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test030");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest23 = fakeRequest2.withBody(byteArray19);
//        java.io.InputStream inputStream24 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response25 = fakeRequest23.fetch(inputStream24);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Request Body is not empty, use fetch() instead");
//        } catch (IllegalStateException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest23);
//    }
//
//    @Test
//    public void test031() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test031");
//        String str0 = com.jcabi.http.Request.HEAD;
//        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "HEAD" + "'", str0, "HEAD");
//    }
//
//    @Test
//    public void test032() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test032");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.reset("PATCH");
//        com.jcabi.http.request.FakeRequest fakeRequest17 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire18 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest20 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList23 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse30 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest20, (-1), "OPTIONS", strEntryList23, byteArray29);
//        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest37 = new com.jcabi.http.request.BaseRequest(wire18, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList23, "hi!", byteArray34, 0, 100);
//        boolean boolean38 = fakeRequest17.equals((Object) strEntryList23);
//        com.jcabi.http.Request request39 = fakeRequest0.header("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk", (Object) fakeRequest17);
//        com.jcabi.http.Request request42 = fakeRequest17.timeout((int) 'a', (int) (byte) 0);
//        com.jcabi.http.RequestBody requestBody43 = fakeRequest17.body();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(byteArray29);
//        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray34);
//        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
//        org.junit.Assert.assertNotNull(request39);
//        org.junit.Assert.assertNotNull(request42);
//        org.junit.Assert.assertNotNull(requestBody43);
//    }
//
//    @Test
//    public void test033() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test033");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.request.JdkRequest jdkRequest24 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request26 = jdkRequest24.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.request.FakeRequest fakeRequest33 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList36 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse43 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest33, (-1), "OPTIONS", strEntryList36, byteArray42);
//        com.jcabi.http.Wire wire44 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest46 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList49 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray55 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse56 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest46, (-1), "OPTIONS", strEntryList49, byteArray55);
//        byte[] byteArray60 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest63 = new com.jcabi.http.request.BaseRequest(wire44, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList49, "hi!", byteArray60, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder64 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray60);
//        com.jcabi.http.request.FakeRequest fakeRequest65 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList36, byteArray60);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder66 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray67 = multipartBodyBuilder66.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest68 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList36, byteArray67);
//        com.jcabi.http.request.FakeRequest fakeRequest71 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList74 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray80 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse81 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest71, (-1), "OPTIONS", strEntryList74, byteArray80);
//        com.jcabi.http.request.FakeRequest fakeRequest82 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList85 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray91 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse92 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest82, (-1), "OPTIONS", strEntryList85, byteArray91);
//        com.jcabi.http.request.FakeRequest fakeRequest93 = new com.jcabi.http.request.FakeRequest(0, "V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList74, byteArray91);
//        com.jcabi.http.request.DefaultResponse defaultResponse94 = new com.jcabi.http.request.DefaultResponse(request26, (int) (short) 0, "d\001\nd\n", strEntryList36, byteArray91);
//        boolean boolean95 = baseRequest19.equals((Object) byteArray91);
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(request26);
//        org.junit.Assert.assertNotNull(byteArray42);
//        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray55);
//        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray60);
//        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray67);
//        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray80);
//        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray91);
//        org.junit.Assert.assertArrayEquals(byteArray91, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
//    }
//
//    @Test
//    public void test034() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test034");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        String str20 = baseRequest19.toString();
//        com.jcabi.http.RequestURI requestURI21 = baseRequest19.uri();
//        com.jcabi.http.request.JdkRequest jdkRequest23 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire24 = null;
//        com.jcabi.http.Request request25 = jdkRequest23.through(wire24);
//        boolean boolean26 = baseRequest19.equals((Object) request25);
//        com.jcabi.http.Request request28 = baseRequest19.reset("hi!");
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str20, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//        org.junit.Assert.assertNotNull(requestURI21);
//        org.junit.Assert.assertNotNull(request25);
//        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
//        org.junit.Assert.assertNotNull(request28);
//    }
//
//    @Test
//    public void test035() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test035");
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        com.jcabi.http.Wire wire13 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest15 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList18 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse25 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest15, (-1), "OPTIONS", strEntryList18, byteArray24);
//        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest32 = new com.jcabi.http.request.BaseRequest(wire13, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList18, "hi!", byteArray29, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder33 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray29);
//        com.jcabi.http.request.FakeRequest fakeRequest34 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList5, byteArray29);
//        com.jcabi.http.request.FakeRequest fakeRequest36 = fakeRequest34.withBody("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.RequestURI requestURI37 = fakeRequest36.uri();
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray24);
//        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray29);
//        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest36);
//        org.junit.Assert.assertNotNull(requestURI37);
//    }
//
//    @Test
//    public void test036() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test036");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        java.io.InputStream inputStream2 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response3 = jdkRequest1.fetch(inputStream2);
//            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: 'OPTIONS' is incorrect");
//        } catch (java.io.IOException e) {
//            // Expected exception.
//        }
//    }
//
//    @Test
//    public void test037() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test037");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder14 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray15 = multipartBodyBuilder14.asBytes();
//        byte[] byteArray16 = multipartBodyBuilder14.asBytes();
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.request.BaseRequest baseRequest17 = new com.jcabi.http.request.BaseRequest(wire0, "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n", (Iterable<java.util.Map.Entry<String, String>>) strEntryList5, "PUT", byteArray16);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 0: -1 OPTIONS [http://localhost:12345/see-FakeRequest-class]??d??d?");
//        } catch (IllegalArgumentException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray15);
//        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
//    }
//
//    @Test
//    public void test038() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test038");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//    }
//
//    @Test
//    public void test039() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test039");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestURI requestURI4 = jdkRequest1.uri();
//        com.jcabi.http.Request request7 = jdkRequest1.timeout((int) (short) -1, 10);
//        String str8 = jdkRequest1.toString();
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestURI4);
//        org.junit.Assert.assertNotNull(request7);
//        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str8, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//    }
//
//    @Test
//    public void test040() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test040");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<String, String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (Iterable<java.util.Map.Entry<String, String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        boolean boolean23 = fakeRequest2.equals((Object) strEntryList8);
//        com.jcabi.http.request.FakeRequest fakeRequest25 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<String, java.lang.String>> strEntryList28 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray34 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse35 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest25, (-1), "OPTIONS", strEntryList28, byteArray34);
//        com.jcabi.http.request.BaseRequest baseRequest38 = new com.jcabi.http.request.BaseRequest(wire0, "GET", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "OPTIONS", byteArray34, (int) (short) -1, 10);
//        java.lang.Class<?> wildcardClass39 = strEntryList8.getClass();
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
//        org.junit.Assert.assertNotNull(byteArray34);
//        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(wildcardClass39);
//    }
//
//    @Test
//    public void test041() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test041");
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        com.jcabi.http.Wire wire13 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest15 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList18 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse25 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest15, (-1), "OPTIONS", strEntryList18, byteArray24);
//        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest32 = new com.jcabi.http.request.BaseRequest(wire13, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList18, "hi!", byteArray29, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder33 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray29);
//        com.jcabi.http.request.FakeRequest fakeRequest34 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, byteArray29);
//        com.jcabi.http.request.FakeRequest fakeRequest37 = fakeRequest34.withHeader("HTTP/1.1 hi! hi! (null)\n\n\000d", "OPTIONS");
//        com.jcabi.http.Wire wire38 = null;
//        com.jcabi.http.Request request39 = fakeRequest34.through(wire38);
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray24);
//        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray29);
//        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest37);
//        org.junit.Assert.assertNotNull(request39);
//    }
//
//    @Test
//    public void test042() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test042");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.method("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.request.FakeRequest fakeRequest18 = fakeRequest0.withHeader("9U090yzM2PXs6aJeMMc1MJDiLebGjalZTTMp", "");
//        com.jcabi.http.request.FakeRequest fakeRequest20 = fakeRequest0.withReason("OPTIONS");
//        java.lang.String str21 = fakeRequest20.toString();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(fakeRequest18);
//        org.junit.Assert.assertNotNull(fakeRequest20);
//        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>" + "'", str21, "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//    }
//
//    @Test
//    public void test043() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test043");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder0 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray1 = multipartBodyBuilder0.asBytes();
//        byte[] byteArray2 = multipartBodyBuilder0.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        com.jcabi.http.Wire wire16 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest18 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList21 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse28 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest18, (-1), "OPTIONS", strEntryList21, byteArray27);
//        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest35 = new com.jcabi.http.request.BaseRequest(wire16, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList21, "hi!", byteArray32, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder36 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray32);
//        com.jcabi.http.request.FakeRequest fakeRequest37 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, byteArray32);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder38 = multipartBodyBuilder0.appendLine(byteArray32);
//        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder44 = multipartBodyBuilder38.appendLine(byteArray43);
//        com.jcabi.http.Wire wire45 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest47 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList50 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray56 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse57 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest47, (-1), "OPTIONS", strEntryList50, byteArray56);
//        byte[] byteArray61 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest64 = new com.jcabi.http.request.BaseRequest(wire45, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList50, "hi!", byteArray61, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder65 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray61);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder66 = multipartBodyBuilder38.append(byteArray61);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder67 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray68 = multipartBodyBuilder67.asBytes();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder69 = multipartBodyBuilder38.append(byteArray68);
//        org.junit.Assert.assertNotNull(byteArray1);
//        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray2);
//        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray27);
//        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray32);
//        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder38);
//        org.junit.Assert.assertNotNull(byteArray43);
//        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder44);
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray61);
//        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder66);
//        org.junit.Assert.assertNotNull(byteArray68);
//        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] {});
//        org.junit.Assert.assertNotNull(multipartBodyBuilder69);
//    }
//
//    @Test
//    public void test044() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test044");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.request.FakeRequest fakeRequest4 = fakeRequest0.withBody("DELETE");
//        com.jcabi.http.request.FakeRequest fakeRequest7 = fakeRequest0.withHeader("JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)", "PUT");
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(fakeRequest4);
//        org.junit.Assert.assertNotNull(fakeRequest7);
//    }
//
//    @Test
//    public void test045() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test045");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire1 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest3 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList6 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse13 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest3, (-1), "OPTIONS", strEntryList6, byteArray12);
//        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest20 = new com.jcabi.http.request.BaseRequest(wire1, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList6, "hi!", byteArray17, 0, 100);
//        boolean boolean21 = fakeRequest0.equals((java.lang.Object) strEntryList6);
//        com.jcabi.http.RequestBody requestBody22 = fakeRequest0.multipartBody();
//        com.jcabi.http.RequestURI requestURI23 = fakeRequest0.uri();
//        com.jcabi.http.RequestBody requestBody24 = fakeRequest0.body();
//        org.junit.Assert.assertNotNull(byteArray12);
//        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray17);
//        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
//        org.junit.Assert.assertNotNull(requestBody22);
//        org.junit.Assert.assertNotNull(requestURI23);
//        org.junit.Assert.assertNotNull(requestBody24);
//    }
//
//    @Test
//    public void test046() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test046");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        java.lang.String str20 = baseRequest19.toString();
//        com.jcabi.http.RequestURI requestURI21 = baseRequest19.uri();
//        java.lang.Class<?> wildcardClass22 = requestURI21.getClass();
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str20, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//        org.junit.Assert.assertNotNull(requestURI21);
//        org.junit.Assert.assertNotNull(wildcardClass22);
//    }
//
//    @Test
//    public void test047() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test047");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.method("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.request.FakeRequest fakeRequest18 = fakeRequest0.withHeader("9U090yzM2PXs6aJeMMc1MJDiLebGjalZTTMp", "");
//        com.jcabi.http.Request request21 = fakeRequest0.timeout((-1), (int) '#');
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(fakeRequest18);
//        org.junit.Assert.assertNotNull(request21);
//    }
//
//    @Test
//    public void test048() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test048");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.reason();
//        java.lang.String str12 = defaultResponse10.body();
//        int int13 = defaultResponse10.status();
//        java.lang.String str14 = defaultResponse10.reason();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OPTIONS" + "'", str11, "OPTIONS");
//        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d\001\nd\n" + "'", str12, "d\001\nd\n");
//        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
//        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OPTIONS" + "'", str14, "OPTIONS");
//    }
//
//    @Test
//    public void test049() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test049");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.method("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.Wire wire16 = null;
//        com.jcabi.http.Request request17 = fakeRequest0.through(wire16);
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(request17);
//    }
//
//    @Test
//    public void test050() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test050");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        java.lang.String str20 = baseRequest19.toString();
//        com.jcabi.http.RequestBody requestBody21 = baseRequest19.body();
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str20, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//        org.junit.Assert.assertNotNull(requestBody21);
//    }
//
//    @Test
//    public void test051() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test051");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestBody requestBody4 = jdkRequest1.multipartBody();
//        java.lang.String str5 = jdkRequest1.toString();
//        java.lang.String str6 = jdkRequest1.toString();
//        java.io.InputStream inputStream7 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response8 = jdkRequest1.fetch(inputStream7);
//            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: 'OPTIONS' is incorrect");
//        } catch (java.io.IOException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestBody4);
//        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str5, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str6, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//    }
//
//    @Test
//    public void test052() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test052");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request3 = jdkRequest1.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        java.lang.String str4 = jdkRequest1.toString();
//        com.jcabi.http.RequestBody requestBody5 = jdkRequest1.body();
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str4, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(requestBody5);
//    }
//
//    @Test
//    public void test053() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test053");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.BaseRequest baseRequest2 = new com.jcabi.http.request.BaseRequest(wire0, "huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        java.io.InputStream inputStream3 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response4 = baseRequest2.fetch(inputStream3);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//            // Expected exception.
//        }
//    }
//
//    @Test
//    public void test054() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test054");
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        com.jcabi.http.Wire wire13 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest15 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList18 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse25 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest15, (-1), "OPTIONS", strEntryList18, byteArray24);
//        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest32 = new com.jcabi.http.request.BaseRequest(wire13, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList18, "hi!", byteArray29, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder33 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray29);
//        com.jcabi.http.request.FakeRequest fakeRequest34 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, byteArray29);
//        com.jcabi.http.request.FakeRequest fakeRequest36 = fakeRequest34.withBody("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.Request request38 = fakeRequest34.method("JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray24);
//        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray29);
//        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest36);
//        org.junit.Assert.assertNotNull(request38);
//    }
//
//    @Test
//    public void test055() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test055");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        byte[] byteArray11 = defaultResponse10.binary();
//        com.jcabi.http.Request request12 = defaultResponse10.back();
//        byte[] byteArray13 = defaultResponse10.binary();
//        java.lang.String str14 = defaultResponse10.body();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request12);
//        org.junit.Assert.assertNotNull(byteArray13);
//        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d\001\nd\n" + "'", str14, "d\001\nd\n");
//    }
//
//    @Test
//    public void test056() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test056");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Request request4 = fakeRequest0.reset("");
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
//        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(fakeRequest2);
//    }
//
//    @Test
//    public void test057() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test057");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        boolean boolean23 = fakeRequest2.equals((java.lang.Object) strEntryList8);
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        com.jcabi.http.Wire wire40 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest42 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList45 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse52 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest42, (-1), "OPTIONS", strEntryList45, byteArray51);
//        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest59 = new com.jcabi.http.request.BaseRequest(wire40, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList45, "hi!", byteArray56, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder60 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray56);
//        com.jcabi.http.request.FakeRequest fakeRequest61 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray56);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder62 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray63 = multipartBodyBuilder62.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest64 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray63);
//        com.jcabi.http.request.BaseRequest baseRequest65 = new com.jcabi.http.request.BaseRequest(wire0, "OPTIONS", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "PUT", byteArray63);
//        com.jcabi.http.Wire wire66 = null;
//        com.jcabi.http.Request request67 = baseRequest65.through(wire66);
//        com.jcabi.http.RequestBody requestBody68 = baseRequest65.body();
//        com.jcabi.http.RequestBody requestBody69 = baseRequest65.body();
//        com.jcabi.http.Request request71 = baseRequest65.reset("PATCH");
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray51);
//        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray63);
//        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
//        org.junit.Assert.assertNotNull(request67);
//        org.junit.Assert.assertNotNull(requestBody68);
//        org.junit.Assert.assertNotNull(requestBody69);
//        org.junit.Assert.assertNotNull(request71);
//    }
//
//    @Test
//    public void test058() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test058");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.Request request24 = baseRequest19.reset("POST");
//        com.jcabi.http.Request request26 = baseRequest19.reset("-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n");
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(request24);
//        org.junit.Assert.assertNotNull(request26);
//    }
//
//    @Test
//    public void test059() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test059");
//        com.jcabi.http.Wire wire0 = null;
//        java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryIterable2 = null;
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder4 = new com.jcabi.http.request.MultipartBodyBuilder();
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray16 = defaultResponse15.binary();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder17 = multipartBodyBuilder4.append(byteArray16);
//        byte[] byteArray18 = multipartBodyBuilder17.asBytes();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder19 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray20 = multipartBodyBuilder19.asBytes();
//        byte[] byteArray21 = multipartBodyBuilder19.asBytes();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder22 = multipartBodyBuilder17.append(byteArray21);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder23 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray24 = multipartBodyBuilder23.asBytes();
//        byte[] byteArray25 = multipartBodyBuilder23.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest28 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList31 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray37 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse38 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest28, (-1), "OPTIONS", strEntryList31, byteArray37);
//        com.jcabi.http.Wire wire39 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest41 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList44 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray50 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse51 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest41, (-1), "OPTIONS", strEntryList44, byteArray50);
//        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest58 = new com.jcabi.http.request.BaseRequest(wire39, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList44, "hi!", byteArray55, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder59 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray55);
//        com.jcabi.http.request.FakeRequest fakeRequest60 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList31, byteArray55);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder61 = multipartBodyBuilder23.appendLine(byteArray55);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder62 = multipartBodyBuilder22.appendLine(byteArray55);
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.request.BaseRequest baseRequest63 = new com.jcabi.http.request.BaseRequest(wire0, "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n", strEntryIterable2, "0IllljFfduTj_3ljBBP8zIH6tn-WbXBXIneoG", byteArray55);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 0: -1 OPTIONS [http://localhost:12345/see-FakeRequest-class]??d??d?");
//        } catch (java.lang.IllegalArgumentException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder17);
//        org.junit.Assert.assertNotNull(byteArray18);
//        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray20);
//        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray21);
//        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
//        org.junit.Assert.assertNotNull(multipartBodyBuilder22);
//        org.junit.Assert.assertNotNull(byteArray24);
//        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray25);
//        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray37);
//        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray50);
//        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray55);
//        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder61);
//        org.junit.Assert.assertNotNull(multipartBodyBuilder62);
//    }
//
//    @Test
//    public void test060() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test060");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.request.JdkRequest jdkRequest25 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request27 = jdkRequest25.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.Request request28 = baseRequest19.header("9UjAhLEd1uzegZSctHUhLVKa0jxnirx", (java.lang.Object) jdkRequest25);
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response29 = baseRequest19.fetch();
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(request27);
//        org.junit.Assert.assertNotNull(request28);
//    }
//
//    @Test
//    public void test061() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test061");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        boolean boolean12 = defaultResponse10.equals((java.lang.Object) '4');
//        int int13 = defaultResponse10.status();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
//        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
//    }
//
//    @Test
//    public void test062() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test062");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.reset("PATCH");
//        com.jcabi.http.Response response16 = fakeRequest0.fetch();
//        com.jcabi.http.RequestURI requestURI17 = fakeRequest0.uri();
//        java.lang.Object obj18 = null;
//        boolean boolean19 = fakeRequest0.equals(obj18);
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(response16);
//        org.junit.Assert.assertNotNull(requestURI17);
//        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
//    }
//
//    @Test
//    public void test063() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test063");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestBody requestBody4 = jdkRequest1.multipartBody();
//        java.lang.String str5 = jdkRequest1.toString();
//        java.lang.String str6 = jdkRequest1.toString();
//        com.jcabi.http.request.JdkRequest jdkRequest9 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request11 = jdkRequest9.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.request.FakeRequest fakeRequest13 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse23 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest13, (-1), "OPTIONS", strEntryList16, byteArray22);
//        com.jcabi.http.Request request24 = jdkRequest9.header("-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n", (java.lang.Object) byteArray22);
//        com.jcabi.http.Request request27 = jdkRequest9.timeout((int) (short) 1, (int) 'a');
//        com.jcabi.http.Request request28 = jdkRequest1.header("POST", (java.lang.Object) jdkRequest9);
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestBody4);
//        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str5, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str6, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(request11);
//        org.junit.Assert.assertNotNull(byteArray22);
//        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request24);
//        org.junit.Assert.assertNotNull(request27);
//        org.junit.Assert.assertNotNull(request28);
//    }
//
//    @Test
//    public void test064() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test064");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.body();
//        java.lang.String str12 = defaultResponse10.body();
//        com.jcabi.http.Request request13 = defaultResponse10.back();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d\001\nd\n" + "'", str11, "d\001\nd\n");
//        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d\001\nd\n" + "'", str12, "d\001\nd\n");
//        org.junit.Assert.assertNotNull(request13);
//    }
//
//    @Test
//    public void test065() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test065");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.reset("PATCH");
//        com.jcabi.http.request.FakeRequest fakeRequest17 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire18 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest20 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList23 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse30 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest20, (-1), "OPTIONS", strEntryList23, byteArray29);
//        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest37 = new com.jcabi.http.request.BaseRequest(wire18, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList23, "hi!", byteArray34, 0, 100);
//        boolean boolean38 = fakeRequest17.equals((java.lang.Object) strEntryList23);
//        com.jcabi.http.Request request39 = fakeRequest0.header("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk", (java.lang.Object) fakeRequest17);
//        com.jcabi.http.Request request42 = fakeRequest17.timeout((int) 'a', (int) (byte) 0);
//        com.jcabi.http.RequestBody requestBody43 = fakeRequest17.multipartBody();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(byteArray29);
//        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray34);
//        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
//        org.junit.Assert.assertNotNull(request39);
//        org.junit.Assert.assertNotNull(request42);
//        org.junit.Assert.assertNotNull(requestBody43);
//    }
//
//    @Test
//    public void test066() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test066");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestURI requestURI4 = jdkRequest1.uri();
//        com.jcabi.http.RequestURI requestURI5 = jdkRequest1.uri();
//        java.io.InputStream inputStream6 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response7 = jdkRequest1.fetch(inputStream6);
//            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: 'OPTIONS' is incorrect");
//        } catch (java.io.IOException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestURI4);
//        org.junit.Assert.assertNotNull(requestURI5);
//    }
//
//    @Test
//    public void test067() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test067");
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("HTTP/1.1 hi! hi! (null)\n\n\000d");
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in path at index 8: HTTP/1.1 hi! hi! (null)???d");
//        } catch (java.lang.IllegalArgumentException e) {
//            // Expected exception.
//        }
//    }
//
//    @Test
//    public void test068() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test068");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder0 = new com.jcabi.http.request.MultipartBodyBuilder();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder1 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray2 = multipartBodyBuilder1.asBytes();
//        byte[] byteArray3 = multipartBodyBuilder1.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest6 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse16 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest6, (-1), "OPTIONS", strEntryList9, byteArray15);
//        com.jcabi.http.Wire wire17 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest19 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList22 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse29 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest19, (-1), "OPTIONS", strEntryList22, byteArray28);
//        byte[] byteArray33 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest36 = new com.jcabi.http.request.BaseRequest(wire17, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList22, "hi!", byteArray33, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder37 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray33);
//        com.jcabi.http.request.FakeRequest fakeRequest38 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList9, byteArray33);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder39 = multipartBodyBuilder1.appendLine(byteArray33);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder40 = multipartBodyBuilder0.append(byteArray33);
//        org.junit.Assert.assertNotNull(byteArray2);
//        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray3);
//        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray15);
//        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray28);
//        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray33);
//        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder39);
//        org.junit.Assert.assertNotNull(multipartBodyBuilder40);
//    }
//
//    @Test
//    public void test069() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test069");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Wire wire11 = null;
//        com.jcabi.http.Request request12 = fakeRequest0.through(wire11);
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request12);
//    }
//
//    @Test
//    public void test070() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test070");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        java.io.InputStream inputStream3 = null;
//        com.jcabi.http.Response response4 = fakeRequest0.fetch(inputStream3);
//        com.jcabi.http.request.FakeRequest fakeRequest6 = fakeRequest0.withStatus((int) (short) 1);
//        com.jcabi.http.Wire wire7 = null;
//        com.jcabi.http.Request request8 = fakeRequest6.through(wire7);
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(response4);
//        org.junit.Assert.assertNotNull(fakeRequest6);
//        org.junit.Assert.assertNotNull(request8);
//    }
//
//    @Test
//    public void test071() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test071");
//        byte[] byteArray0 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder1 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray0);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//            // Expected exception.
//        }
//    }
//
//    @Test
//    public void test072() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test072");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        java.lang.String str20 = baseRequest19.toString();
//        com.jcabi.http.RequestURI requestURI21 = baseRequest19.uri();
//        com.jcabi.http.request.JdkRequest jdkRequest23 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire24 = null;
//        com.jcabi.http.Request request25 = jdkRequest23.through(wire24);
//        boolean boolean26 = baseRequest19.equals((java.lang.Object) request25);
//        com.jcabi.http.RequestBody requestBody27 = baseRequest19.body();
//        com.jcabi.http.Request request29 = baseRequest19.method("0IllljFfduTj_3ljBBP8zIH6tn-WbXBXIneoG");
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str20, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//        org.junit.Assert.assertNotNull(requestURI21);
//        org.junit.Assert.assertNotNull(request25);
//        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
//        org.junit.Assert.assertNotNull(requestBody27);
//        org.junit.Assert.assertNotNull(request29);
//    }
//
//    @Test
//    public void test073() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test073");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Wire wire4 = null;
//        com.jcabi.http.Wire wire6 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest8 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse18 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest8, (-1), "OPTIONS", strEntryList11, byteArray17);
//        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest25 = new com.jcabi.http.request.BaseRequest(wire6, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList11, "hi!", byteArray22, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder27 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray28 = multipartBodyBuilder27.asBytes();
//        byte[] byteArray29 = multipartBodyBuilder27.asBytes();
//        com.jcabi.http.request.BaseRequest baseRequest30 = new com.jcabi.http.request.BaseRequest(wire4, "huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList11, "", byteArray29);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder32 = new com.jcabi.http.request.MultipartBodyBuilder();
//        com.jcabi.http.request.FakeRequest fakeRequest33 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList36 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse43 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest33, (-1), "OPTIONS", strEntryList36, byteArray42);
//        byte[] byteArray44 = defaultResponse43.binary();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder45 = multipartBodyBuilder32.append(byteArray44);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder46 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray47 = multipartBodyBuilder46.asBytes();
//        byte[] byteArray48 = multipartBodyBuilder46.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest51 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList54 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray60 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse61 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest51, (-1), "OPTIONS", strEntryList54, byteArray60);
//        com.jcabi.http.Wire wire62 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest64 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList67 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray73 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse74 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest64, (-1), "OPTIONS", strEntryList67, byteArray73);
//        byte[] byteArray78 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest81 = new com.jcabi.http.request.BaseRequest(wire62, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList67, "hi!", byteArray78, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder82 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray78);
//        com.jcabi.http.request.FakeRequest fakeRequest83 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList54, byteArray78);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder84 = multipartBodyBuilder46.appendLine(byteArray78);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder85 = multipartBodyBuilder32.appendLine(byteArray78);
//        com.jcabi.http.request.BaseRequest baseRequest88 = new com.jcabi.http.request.BaseRequest(wire2, "0IllljFfduTj_3ljBBP8zIH6tn-WbXBXIneoG", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList11, "", byteArray78, (int) (short) 0, 1);
//        byte[] byteArray96 = new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.BaseRequest baseRequest99 = new com.jcabi.http.request.BaseRequest(wire0, "HEAD", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList11, "GET", byteArray96, (int) (byte) 0, (int) (short) 0);
//        org.junit.Assert.assertNotNull(byteArray17);
//        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray22);
//        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray28);
//        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray29);
//        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray42);
//        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray44);
//        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder45);
//        org.junit.Assert.assertNotNull(byteArray47);
//        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray48);
//        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray60);
//        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray73);
//        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray78);
//        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder84);
//        org.junit.Assert.assertNotNull(multipartBodyBuilder85);
//        org.junit.Assert.assertNotNull(byteArray96);
//        org.junit.Assert.assertArrayEquals(byteArray96, new byte[] { (byte) 100, (byte) -1, (byte) 100, (byte) 100, (byte) 100, (byte) 10 });
//    }
//
//    @Test
//    public void test074() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test074");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestBody requestBody4 = jdkRequest1.multipartBody();
//        java.lang.String str5 = jdkRequest1.toString();
//        com.jcabi.http.Wire wire6 = null;
//        com.jcabi.http.Request request7 = jdkRequest1.through(wire6);
//        boolean boolean9 = jdkRequest1.equals((java.lang.Object) "9UjAhLEd1uzegZSctHUhLVKa0jxnirx");
//        com.jcabi.http.RequestURI requestURI10 = jdkRequest1.uri();
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestBody4);
//        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str5, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(request7);
//        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
//        org.junit.Assert.assertNotNull(requestURI10);
//    }
//
//    @Test
//    public void test075() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test075");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request3 = jdkRequest1.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        java.lang.String str4 = jdkRequest1.toString();
//        com.jcabi.http.Request request7 = jdkRequest1.timeout((int) '#', (int) (byte) -1);
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response8 = jdkRequest1.fetch();
//            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: 'OPTIONS' is incorrect");
//        } catch (java.io.IOException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str4, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(request7);
//    }
//
//    @Test
//    public void test076() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test076");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        boolean boolean23 = fakeRequest2.equals((java.lang.Object) strEntryList8);
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        com.jcabi.http.Wire wire40 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest42 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList45 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse52 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest42, (-1), "OPTIONS", strEntryList45, byteArray51);
//        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest59 = new com.jcabi.http.request.BaseRequest(wire40, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList45, "hi!", byteArray56, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder60 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray56);
//        com.jcabi.http.request.FakeRequest fakeRequest61 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray56);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder62 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray63 = multipartBodyBuilder62.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest64 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray63);
//        com.jcabi.http.request.BaseRequest baseRequest65 = new com.jcabi.http.request.BaseRequest(wire0, "OPTIONS", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "PUT", byteArray63);
//        com.jcabi.http.RequestBody requestBody66 = baseRequest65.multipartBody();
//        java.io.InputStream inputStream67 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response68 = baseRequest65.fetch(inputStream67);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray51);
//        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray63);
//        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
//        org.junit.Assert.assertNotNull(requestBody66);
//    }
//
//    @Test
//    public void test077() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test077");
//        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList7 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse14 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest4, (-1), "OPTIONS", strEntryList7, byteArray13);
//        com.jcabi.http.Wire wire15 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest17 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList20 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse27 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest17, (-1), "OPTIONS", strEntryList20, byteArray26);
//        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest34 = new com.jcabi.http.request.BaseRequest(wire15, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList20, "hi!", byteArray31, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder35 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray31);
//        com.jcabi.http.request.FakeRequest fakeRequest36 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList7, byteArray31);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder37 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray38 = multipartBodyBuilder37.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest39 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList7, byteArray38);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder40 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray38);
//        org.junit.Assert.assertNotNull(byteArray13);
//        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray26);
//        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray31);
//        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
//    }
//
//    @Test
//    public void test078() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test078");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder0 = new com.jcabi.http.request.MultipartBodyBuilder();
//        com.jcabi.http.request.FakeRequest fakeRequest1 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList4 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse11 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest1, (-1), "OPTIONS", strEntryList4, byteArray10);
//        byte[] byteArray12 = defaultResponse11.binary();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder13 = multipartBodyBuilder0.append(byteArray12);
//        byte[] byteArray14 = multipartBodyBuilder13.asBytes();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder15 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray14);
//        org.junit.Assert.assertNotNull(byteArray10);
//        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray12);
//        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder13);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//    }
//
//    @Test
//    public void test079() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test079");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.reset("PATCH");
//        java.io.InputStream inputStream16 = null;
//        com.jcabi.http.Response response17 = fakeRequest0.fetch(inputStream16);
//        com.jcabi.http.RequestBody requestBody18 = fakeRequest0.body();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(response17);
//        org.junit.Assert.assertNotNull(requestBody18);
//    }
//
//    @Test
//    public void test080() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test080");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest23 = fakeRequest2.withBody(byteArray19);
//        com.jcabi.http.request.FakeRequest fakeRequest25 = fakeRequest23.withBody("hi!");
//        java.lang.String str26 = fakeRequest23.toString();
//        com.jcabi.http.Request request28 = fakeRequest23.method("GET");
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        com.jcabi.http.Request request42 = fakeRequest29.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request44 = fakeRequest29.method("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        boolean boolean45 = fakeRequest23.equals((java.lang.Object) "vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest23);
//        org.junit.Assert.assertNotNull(fakeRequest25);
//        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>" + "'", str26, "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        org.junit.Assert.assertNotNull(request28);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request42);
//        org.junit.Assert.assertNotNull(request44);
//        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
//    }
//
//    @Test
//    public void test081() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test081");
//        com.jcabi.http.request.JdkRequest jdkRequest3 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request5 = jdkRequest3.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.request.FakeRequest fakeRequest12 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList15 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse22 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest12, (-1), "OPTIONS", strEntryList15, byteArray21);
//        com.jcabi.http.Wire wire23 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest25 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList28 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray34 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse35 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest25, (-1), "OPTIONS", strEntryList28, byteArray34);
//        byte[] byteArray39 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest42 = new com.jcabi.http.request.BaseRequest(wire23, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList28, "hi!", byteArray39, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder43 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray39);
//        com.jcabi.http.request.FakeRequest fakeRequest44 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList15, byteArray39);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder45 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray46 = multipartBodyBuilder45.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest47 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList15, byteArray46);
//        com.jcabi.http.request.FakeRequest fakeRequest50 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList53 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray59 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse60 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest50, (-1), "OPTIONS", strEntryList53, byteArray59);
//        com.jcabi.http.request.FakeRequest fakeRequest61 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList64 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray70 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse71 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest61, (-1), "OPTIONS", strEntryList64, byteArray70);
//        com.jcabi.http.request.FakeRequest fakeRequest72 = new com.jcabi.http.request.FakeRequest(0, "V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList53, byteArray70);
//        com.jcabi.http.request.DefaultResponse defaultResponse73 = new com.jcabi.http.request.DefaultResponse(request5, (int) (short) 0, "d\001\nd\n", strEntryList15, byteArray70);
//        byte[] byteArray75 = new byte[] { (byte) -1 };
//        com.jcabi.http.request.FakeRequest fakeRequest76 = new com.jcabi.http.request.FakeRequest((-1), "9U090yzM2PXs6aJeMMc1MJDiLebGjalZTTMp", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList15, byteArray75);
//        org.junit.Assert.assertNotNull(request5);
//        org.junit.Assert.assertNotNull(byteArray21);
//        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray34);
//        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray39);
//        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray46);
//        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray59);
//        org.junit.Assert.assertArrayEquals(byteArray59, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray70);
//        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray75);
//        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) -1 });
//    }
//
//    @Test
//    public void test082() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test082");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request21 = baseRequest19.method("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.Wire wire22 = null;
//        com.jcabi.http.Request request23 = baseRequest19.through(wire22);
//        com.jcabi.http.request.FakeRequest fakeRequest24 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest26 = fakeRequest24.withReason("");
//        com.jcabi.http.Wire wire27 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest46 = new com.jcabi.http.request.BaseRequest(wire27, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, "hi!", byteArray43, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest47 = fakeRequest26.withBody(byteArray43);
//        com.jcabi.http.RequestBody requestBody48 = fakeRequest26.multipartBody();
//        com.jcabi.http.request.FakeRequest fakeRequest50 = fakeRequest26.withReason("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.Wire wire51 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest53 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList56 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray62 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse63 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest53, (-1), "OPTIONS", strEntryList56, byteArray62);
//        byte[] byteArray67 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest70 = new com.jcabi.http.request.BaseRequest(wire51, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList56, "hi!", byteArray67, 0, 100);
//        boolean boolean71 = fakeRequest26.equals((java.lang.Object) wire51);
//        boolean boolean72 = baseRequest19.equals((java.lang.Object) wire51);
//        com.jcabi.http.Request request75 = baseRequest19.timeout((int) (byte) 10, (int) ' ');
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request21);
//        org.junit.Assert.assertNotNull(request23);
//        org.junit.Assert.assertNotNull(fakeRequest26);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray43);
//        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest47);
//        org.junit.Assert.assertNotNull(requestBody48);
//        org.junit.Assert.assertNotNull(fakeRequest50);
//        org.junit.Assert.assertNotNull(byteArray62);
//        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray67);
//        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
//        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
//        org.junit.Assert.assertNotNull(request75);
//    }
//
//    @Test
//    public void test083() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test083");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.BaseRequest baseRequest2 = new com.jcabi.http.request.BaseRequest(wire0, "DELETE");
//        com.jcabi.http.Request request4 = baseRequest2.reset("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        org.junit.Assert.assertNotNull(request4);
//    }
//
//    @Test
//    public void test084() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test084");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestBody requestBody4 = jdkRequest1.multipartBody();
//        java.lang.String str5 = jdkRequest1.toString();
//        com.jcabi.http.request.FakeRequest fakeRequest7 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse17 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest7, (-1), "OPTIONS", strEntryList10, byteArray16);
//        java.lang.String str18 = defaultResponse17.body();
//        com.jcabi.http.Request request19 = jdkRequest1.header("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK", (java.lang.Object) defaultResponse17);
//        com.jcabi.http.request.FakeRequest fakeRequest20 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList23 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse30 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest20, (-1), "OPTIONS", strEntryList23, byteArray29);
//        com.jcabi.http.Request request33 = fakeRequest20.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request35 = fakeRequest20.reset("PATCH");
//        com.jcabi.http.request.FakeRequest fakeRequest37 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire38 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest40 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList43 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray49 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse50 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest40, (-1), "OPTIONS", strEntryList43, byteArray49);
//        byte[] byteArray54 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest57 = new com.jcabi.http.request.BaseRequest(wire38, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList43, "hi!", byteArray54, 0, 100);
//        boolean boolean58 = fakeRequest37.equals((java.lang.Object) strEntryList43);
//        com.jcabi.http.Request request59 = fakeRequest20.header("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk", (java.lang.Object) fakeRequest37);
//        com.jcabi.http.request.FakeRequest fakeRequest61 = fakeRequest20.withReason("JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        com.jcabi.http.Request request63 = fakeRequest20.method("HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        boolean boolean64 = jdkRequest1.equals((java.lang.Object) "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        com.jcabi.http.Request request66 = jdkRequest1.method("HTTP/1.1 hi! hi! (null)\n\n\000d");
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestBody4);
//        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str5, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d\001\nd\n" + "'", str18, "d\001\nd\n");
//        org.junit.Assert.assertNotNull(request19);
//        org.junit.Assert.assertNotNull(byteArray29);
//        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request33);
//        org.junit.Assert.assertNotNull(request35);
//        org.junit.Assert.assertNotNull(byteArray49);
//        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray54);
//        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
//        org.junit.Assert.assertNotNull(request59);
//        org.junit.Assert.assertNotNull(fakeRequest61);
//        org.junit.Assert.assertNotNull(request63);
//        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
//        org.junit.Assert.assertNotNull(request66);
//    }
//
//    @Test
//    public void test085() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test085");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        byte[] byteArray11 = defaultResponse10.binary();
//        com.jcabi.http.Request request12 = defaultResponse10.back();
//        int int13 = defaultResponse10.status();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request12);
//        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
//    }
//
//    @Test
//    public void test086() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test086");
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("");
//            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.ClassNotFoundException: Provider for jakarta.ws.rs.ext.RuntimeDelegate cannot be found");
//        } catch (java.lang.RuntimeException e) {
//            // Expected exception.
//        }
//    }
//
//    @Test
//    public void test087() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test087");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.request.JdkRequest jdkRequest25 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request27 = jdkRequest25.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.Request request28 = baseRequest19.header("9UjAhLEd1uzegZSctHUhLVKa0jxnirx", (java.lang.Object) jdkRequest25);
//        com.jcabi.http.RequestBody requestBody29 = baseRequest19.body();
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(request27);
//        org.junit.Assert.assertNotNull(request28);
//        org.junit.Assert.assertNotNull(requestBody29);
//    }
//
//    @Test
//    public void test088() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test088");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        java.lang.String str20 = baseRequest19.toString();
//        com.jcabi.http.Request request22 = baseRequest19.method("JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        com.jcabi.http.Request request25 = baseRequest19.timeout((int) ' ', (int) (short) 0);
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str20, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(request25);
//    }
//
//    @Test
//    public void test089() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test089");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestBody requestBody4 = jdkRequest1.multipartBody();
//        java.lang.String str5 = jdkRequest1.toString();
//        com.jcabi.http.Wire wire6 = null;
//        com.jcabi.http.Request request7 = jdkRequest1.through(wire6);
//        java.lang.String str8 = jdkRequest1.toString();
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestBody4);
//        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str5, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(request7);
//        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str8, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//    }
//
//    @Test
//    public void test090() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test090");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        java.lang.String str23 = baseRequest22.toString();
//        com.jcabi.http.Request request26 = baseRequest22.timeout(0, (int) 'a');
//        com.jcabi.http.Request request27 = jdkRequest1.header("PUT", (java.lang.Object) baseRequest22);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str23, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//        org.junit.Assert.assertNotNull(request26);
//        org.junit.Assert.assertNotNull(request27);
//    }
//
//    @Test
//    public void test091() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test091");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder0 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray1 = multipartBodyBuilder0.asBytes();
//        byte[] byteArray2 = multipartBodyBuilder0.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        com.jcabi.http.Wire wire16 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest18 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList21 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse28 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest18, (-1), "OPTIONS", strEntryList21, byteArray27);
//        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest35 = new com.jcabi.http.request.BaseRequest(wire16, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList21, "hi!", byteArray32, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder36 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray32);
//        com.jcabi.http.request.FakeRequest fakeRequest37 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, byteArray32);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder38 = multipartBodyBuilder0.appendLine(byteArray32);
//        com.jcabi.http.request.FakeRequest fakeRequest41 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList44 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray50 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse51 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest41, (-1), "OPTIONS", strEntryList44, byteArray50);
//        com.jcabi.http.Wire wire52 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest54 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList57 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray63 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse64 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest54, (-1), "OPTIONS", strEntryList57, byteArray63);
//        byte[] byteArray68 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest71 = new com.jcabi.http.request.BaseRequest(wire52, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList57, "hi!", byteArray68, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder72 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray68);
//        com.jcabi.http.request.FakeRequest fakeRequest73 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList44, byteArray68);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder74 = multipartBodyBuilder0.append(byteArray68);
//        org.junit.Assert.assertNotNull(byteArray1);
//        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray2);
//        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray27);
//        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray32);
//        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder38);
//        org.junit.Assert.assertNotNull(byteArray50);
//        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray63);
//        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray68);
//        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder74);
//    }
//
//    @Test
//    public void test092() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test092");
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        com.jcabi.http.request.FakeRequest fakeRequest13 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse23 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest13, (-1), "OPTIONS", strEntryList16, byteArray22);
//        com.jcabi.http.request.FakeRequest fakeRequest24 = new com.jcabi.http.request.FakeRequest(0, "V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, byteArray22);
//        com.jcabi.http.Request request26 = fakeRequest24.reset("-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n");
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray22);
//        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request26);
//    }
//
//    @Test
//    public void test093() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test093");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        byte[] byteArray11 = defaultResponse10.binary();
//        java.lang.String str12 = defaultResponse10.body();
//        java.lang.String str13 = defaultResponse10.toString();
//        int int14 = defaultResponse10.status();
//        int int15 = defaultResponse10.status();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d\001\nd\n" + "'", str12, "d\001\nd\n");
//        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n" + "'", str13, "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n");
//        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
//    }
//
//    @Test
//    public void test094() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test094");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request21 = baseRequest19.method("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.Wire wire22 = null;
//        com.jcabi.http.Request request23 = baseRequest19.through(wire22);
//        com.jcabi.http.RequestBody requestBody24 = baseRequest19.multipartBody();
//        com.jcabi.http.Request request27 = baseRequest19.timeout((int) (short) 1, (int) (short) -1);
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request21);
//        org.junit.Assert.assertNotNull(request23);
//        org.junit.Assert.assertNotNull(requestBody24);
//        org.junit.Assert.assertNotNull(request27);
//    }
//
//    @Test
//    public void test095() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test095");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.BaseRequest baseRequest2 = new com.jcabi.http.request.BaseRequest(wire0, "DELETE");
//        com.jcabi.http.RequestBody requestBody3 = baseRequest2.body();
//        com.jcabi.http.RequestBody requestBody4 = baseRequest2.multipartBody();
//        com.jcabi.http.RequestURI requestURI5 = baseRequest2.uri();
//        org.junit.Assert.assertNotNull(requestBody3);
//        org.junit.Assert.assertNotNull(requestBody4);
//        org.junit.Assert.assertNotNull(requestURI5);
//    }
//
//    @Test
//    public void test096() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test096");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((int) (byte) -1, (int) (short) 10);
//        com.jcabi.http.Wire wire14 = null;
//        com.jcabi.http.Request request15 = fakeRequest0.through(wire14);
//        com.jcabi.http.Wire wire16 = null;
//        com.jcabi.http.Request request17 = fakeRequest0.through(wire16);
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(request17);
//    }
//
//    @Test
//    public void test097() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test097");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.request.JdkRequest jdkRequest25 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request27 = jdkRequest25.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.Request request28 = baseRequest19.header("9UjAhLEd1uzegZSctHUhLVKa0jxnirx", (java.lang.Object) jdkRequest25);
//        java.lang.Class<?> wildcardClass29 = jdkRequest25.getClass();
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(request27);
//        org.junit.Assert.assertNotNull(request28);
//        org.junit.Assert.assertNotNull(wildcardClass29);
//    }
//
//    @Test
//    public void test098() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test098");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestBody requestBody4 = jdkRequest1.multipartBody();
//        java.lang.String str5 = jdkRequest1.toString();
//        com.jcabi.http.request.FakeRequest fakeRequest7 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse17 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest7, (-1), "OPTIONS", strEntryList10, byteArray16);
//        java.lang.String str18 = defaultResponse17.body();
//        com.jcabi.http.Request request19 = jdkRequest1.header("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK", (java.lang.Object) defaultResponse17);
//        com.jcabi.http.request.FakeRequest fakeRequest20 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList23 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse30 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest20, (-1), "OPTIONS", strEntryList23, byteArray29);
//        com.jcabi.http.Request request33 = fakeRequest20.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request35 = fakeRequest20.reset("PATCH");
//        com.jcabi.http.request.FakeRequest fakeRequest37 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire38 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest40 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList43 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray49 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse50 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest40, (-1), "OPTIONS", strEntryList43, byteArray49);
//        byte[] byteArray54 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest57 = new com.jcabi.http.request.BaseRequest(wire38, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList43, "hi!", byteArray54, 0, 100);
//        boolean boolean58 = fakeRequest37.equals((java.lang.Object) strEntryList43);
//        com.jcabi.http.Request request59 = fakeRequest20.header("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk", (java.lang.Object) fakeRequest37);
//        com.jcabi.http.request.FakeRequest fakeRequest61 = fakeRequest20.withReason("JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        com.jcabi.http.Request request63 = fakeRequest20.method("HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        boolean boolean64 = jdkRequest1.equals((java.lang.Object) "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response65 = jdkRequest1.fetch();
//            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: 'OPTIONS' is incorrect");
//        } catch (java.io.IOException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestBody4);
//        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str5, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d\001\nd\n" + "'", str18, "d\001\nd\n");
//        org.junit.Assert.assertNotNull(request19);
//        org.junit.Assert.assertNotNull(byteArray29);
//        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request33);
//        org.junit.Assert.assertNotNull(request35);
//        org.junit.Assert.assertNotNull(byteArray49);
//        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray54);
//        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
//        org.junit.Assert.assertNotNull(request59);
//        org.junit.Assert.assertNotNull(fakeRequest61);
//        org.junit.Assert.assertNotNull(request63);
//        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
//    }
//
//    @Test
//    public void test099() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test099");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((int) (byte) -1, (int) (short) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.method("PATCH");
//        com.jcabi.http.request.FakeRequest fakeRequest16 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest18 = fakeRequest16.withReason("");
//        boolean boolean19 = fakeRequest0.equals((java.lang.Object) "");
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(fakeRequest18);
//        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
//    }
//
//    @Test
//    public void test100() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test100");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.request.FakeRequest fakeRequest12 = fakeRequest0.withStatus((-1));
//        java.lang.String str13 = fakeRequest0.toString();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(fakeRequest12);
//        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>" + "'", str13, "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//    }
//
//    @Test
//    public void test101() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test101");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.Request request25 = baseRequest19.header("d\001\nd\n", (java.lang.Object) 'a');
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response26 = baseRequest19.fetch();
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(request25);
//    }
//
//    @Test
//    public void test102() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test102");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.request.JdkRequest jdkRequest25 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request27 = jdkRequest25.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.Request request28 = baseRequest19.header("9UjAhLEd1uzegZSctHUhLVKa0jxnirx", (java.lang.Object) jdkRequest25);
//        java.io.InputStream inputStream29 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response30 = baseRequest19.fetch(inputStream29);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Request Body is not empty, use fetch() instead");
//        } catch (java.lang.IllegalStateException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(request27);
//        org.junit.Assert.assertNotNull(request28);
//    }
//
//    @Test
//    public void test103() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test103");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.reset("PATCH");
//        com.jcabi.http.request.FakeRequest fakeRequest18 = fakeRequest0.withHeader("d\001\nd\n", "DELETE");
//        com.jcabi.http.Wire wire19 = null;
//        com.jcabi.http.Request request20 = fakeRequest0.through(wire19);
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(fakeRequest18);
//        org.junit.Assert.assertNotNull(request20);
//    }
//
//    @Test
//    public void test104() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test104");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestBody requestBody4 = jdkRequest1.multipartBody();
//        java.lang.String str5 = jdkRequest1.toString();
//        com.jcabi.http.request.FakeRequest fakeRequest7 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse17 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest7, (-1), "OPTIONS", strEntryList10, byteArray16);
//        java.lang.String str18 = defaultResponse17.body();
//        com.jcabi.http.Request request19 = jdkRequest1.header("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK", (java.lang.Object) defaultResponse17);
//        com.jcabi.http.request.FakeRequest fakeRequest20 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList23 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse30 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest20, (-1), "OPTIONS", strEntryList23, byteArray29);
//        com.jcabi.http.Request request33 = fakeRequest20.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request35 = fakeRequest20.reset("PATCH");
//        com.jcabi.http.request.FakeRequest fakeRequest37 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire38 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest40 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList43 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray49 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse50 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest40, (-1), "OPTIONS", strEntryList43, byteArray49);
//        byte[] byteArray54 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest57 = new com.jcabi.http.request.BaseRequest(wire38, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList43, "hi!", byteArray54, 0, 100);
//        boolean boolean58 = fakeRequest37.equals((java.lang.Object) strEntryList43);
//        com.jcabi.http.Request request59 = fakeRequest20.header("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk", (java.lang.Object) fakeRequest37);
//        com.jcabi.http.request.FakeRequest fakeRequest61 = fakeRequest20.withReason("JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        com.jcabi.http.Request request63 = fakeRequest20.method("HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        boolean boolean64 = jdkRequest1.equals((java.lang.Object) "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        com.jcabi.http.RequestBody requestBody65 = jdkRequest1.multipartBody();
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestBody4);
//        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str5, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d\001\nd\n" + "'", str18, "d\001\nd\n");
//        org.junit.Assert.assertNotNull(request19);
//        org.junit.Assert.assertNotNull(byteArray29);
//        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request33);
//        org.junit.Assert.assertNotNull(request35);
//        org.junit.Assert.assertNotNull(byteArray49);
//        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray54);
//        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
//        org.junit.Assert.assertNotNull(request59);
//        org.junit.Assert.assertNotNull(fakeRequest61);
//        org.junit.Assert.assertNotNull(request63);
//        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
//        org.junit.Assert.assertNotNull(requestBody65);
//    }
//
//    @Test
//    public void test105() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test105");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.body();
//        java.lang.String str12 = defaultResponse10.body();
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = defaultResponse10.headers();
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = defaultResponse10.headers();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d\001\nd\n" + "'", str11, "d\001\nd\n");
//        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d\001\nd\n" + "'", str12, "d\001\nd\n");
//        org.junit.Assert.assertNotNull(strMap13);
//        org.junit.Assert.assertNotNull(strMap14);
//    }
//
//    @Test
//    public void test106() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test106");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.method("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.RequestBody requestBody16 = fakeRequest0.body();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(requestBody16);
//    }
//
//    @Test
//    public void test107() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test107");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        byte[] byteArray11 = defaultResponse10.binary();
//        com.jcabi.http.Request request12 = defaultResponse10.back();
//        com.jcabi.http.Request request13 = defaultResponse10.back();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request12);
//        org.junit.Assert.assertNotNull(request13);
//    }
//
//    @Test
//    public void test108() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test108");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.reason();
//        java.lang.String str12 = defaultResponse10.body();
//        int int13 = defaultResponse10.status();
//        com.jcabi.http.Request request14 = defaultResponse10.back();
//        boolean boolean16 = defaultResponse10.equals((java.lang.Object) "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        java.lang.String str17 = defaultResponse10.reason();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OPTIONS" + "'", str11, "OPTIONS");
//        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d\001\nd\n" + "'", str12, "d\001\nd\n");
//        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
//        org.junit.Assert.assertNotNull(request14);
//        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
//        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OPTIONS" + "'", str17, "OPTIONS");
//    }
//
//    @Test
//    public void test109() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test109");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        java.lang.String str20 = baseRequest19.toString();
//        com.jcabi.http.RequestURI requestURI21 = baseRequest19.uri();
//        com.jcabi.http.request.JdkRequest jdkRequest23 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire24 = null;
//        com.jcabi.http.Request request25 = jdkRequest23.through(wire24);
//        boolean boolean26 = baseRequest19.equals((java.lang.Object) request25);
//        com.jcabi.http.RequestBody requestBody27 = baseRequest19.body();
//        com.jcabi.http.RequestURI requestURI28 = baseRequest19.uri();
//        com.jcabi.http.RequestBody requestBody29 = baseRequest19.multipartBody();
//        java.lang.String str30 = baseRequest19.toString();
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str20, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//        org.junit.Assert.assertNotNull(requestURI21);
//        org.junit.Assert.assertNotNull(request25);
//        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
//        org.junit.Assert.assertNotNull(requestBody27);
//        org.junit.Assert.assertNotNull(requestURI28);
//        org.junit.Assert.assertNotNull(requestBody29);
//        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str30, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//    }
//
//    @Test
//    public void test110() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test110");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.BaseRequest baseRequest2 = new com.jcabi.http.request.BaseRequest(wire0, "huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.Request request4 = baseRequest2.method("JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(request4);
//    }
//
//    @Test
//    public void test111() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test111");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestURI requestURI4 = jdkRequest1.uri();
//        com.jcabi.http.request.FakeRequest fakeRequest6 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse16 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest6, (-1), "OPTIONS", strEntryList9, byteArray15);
//        com.jcabi.http.Request request19 = fakeRequest6.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request21 = fakeRequest6.method("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.Request request22 = jdkRequest1.header("HTTP/1.1 hi! hi! (null)\n\n\000d", (java.lang.Object) "vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        java.io.InputStream inputStream23 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response24 = jdkRequest1.fetch(inputStream23);
//            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: 'OPTIONS' is incorrect");
//        } catch (java.io.IOException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestURI4);
//        org.junit.Assert.assertNotNull(byteArray15);
//        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request19);
//        org.junit.Assert.assertNotNull(request21);
//        org.junit.Assert.assertNotNull(request22);
//    }
//
//    @Test
//    public void test112() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test112");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        boolean boolean23 = fakeRequest2.equals((java.lang.Object) strEntryList8);
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        com.jcabi.http.Wire wire40 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest42 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList45 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse52 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest42, (-1), "OPTIONS", strEntryList45, byteArray51);
//        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest59 = new com.jcabi.http.request.BaseRequest(wire40, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList45, "hi!", byteArray56, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder60 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray56);
//        com.jcabi.http.request.FakeRequest fakeRequest61 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray56);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder62 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray63 = multipartBodyBuilder62.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest64 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray63);
//        com.jcabi.http.request.BaseRequest baseRequest65 = new com.jcabi.http.request.BaseRequest(wire0, "OPTIONS", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "PUT", byteArray63);
//        com.jcabi.http.RequestBody requestBody66 = baseRequest65.body();
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray51);
//        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray63);
//        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
//        org.junit.Assert.assertNotNull(requestBody66);
//    }
//
//    @Test
//    public void test113() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test113");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.body();
//        java.lang.String str12 = defaultResponse10.body();
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = defaultResponse10.headers();
//        java.lang.String str14 = defaultResponse10.toString();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d\001\nd\n" + "'", str11, "d\001\nd\n");
//        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d\001\nd\n" + "'", str12, "d\001\nd\n");
//        org.junit.Assert.assertNotNull(strMap13);
//        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n" + "'", str14, "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n");
//    }
//
//    @Test
//    public void test114() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test114");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder0 = new com.jcabi.http.request.MultipartBodyBuilder();
//        com.jcabi.http.request.FakeRequest fakeRequest1 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList4 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse11 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest1, (-1), "OPTIONS", strEntryList4, byteArray10);
//        byte[] byteArray12 = defaultResponse11.binary();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder13 = multipartBodyBuilder0.append(byteArray12);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder14 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray15 = multipartBodyBuilder14.asBytes();
//        byte[] byteArray16 = multipartBodyBuilder14.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest19 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList22 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse29 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest19, (-1), "OPTIONS", strEntryList22, byteArray28);
//        com.jcabi.http.Wire wire30 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest32 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList35 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray41 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse42 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest32, (-1), "OPTIONS", strEntryList35, byteArray41);
//        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest49 = new com.jcabi.http.request.BaseRequest(wire30, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList35, "hi!", byteArray46, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder50 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray46);
//        com.jcabi.http.request.FakeRequest fakeRequest51 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList22, byteArray46);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder52 = multipartBodyBuilder14.appendLine(byteArray46);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder53 = multipartBodyBuilder0.appendLine(byteArray46);
//        com.jcabi.http.request.FakeRequest fakeRequest54 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList57 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray63 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse64 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest54, (-1), "OPTIONS", strEntryList57, byteArray63);
//        java.lang.String str65 = defaultResponse64.reason();
//        java.lang.String str66 = defaultResponse64.body();
//        int int67 = defaultResponse64.status();
//        com.jcabi.http.Request request68 = defaultResponse64.back();
//        byte[] byteArray69 = defaultResponse64.binary();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder70 = multipartBodyBuilder53.append(byteArray69);
//        byte[] byteArray71 = multipartBodyBuilder53.asBytes();
//        org.junit.Assert.assertNotNull(byteArray10);
//        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray12);
//        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder13);
//        org.junit.Assert.assertNotNull(byteArray15);
//        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray28);
//        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray41);
//        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray46);
//        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder52);
//        org.junit.Assert.assertNotNull(multipartBodyBuilder53);
//        org.junit.Assert.assertNotNull(byteArray63);
//        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "OPTIONS" + "'", str65, "OPTIONS");
//        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "d\001\nd\n" + "'", str66, "d\001\nd\n");
//        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
//        org.junit.Assert.assertNotNull(request68);
//        org.junit.Assert.assertNotNull(byteArray69);
//        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder70);
//        org.junit.Assert.assertNotNull(byteArray71);
//        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 0, (byte) 100, (byte) 13, (byte) 10 });
//    }
//
//    @Test
//    public void test115() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test115");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.reason();
//        java.lang.String str12 = defaultResponse10.body();
//        int int13 = defaultResponse10.status();
//        com.jcabi.http.Request request14 = defaultResponse10.back();
//        java.lang.String str15 = defaultResponse10.reason();
//        java.lang.String str16 = defaultResponse10.body();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OPTIONS" + "'", str11, "OPTIONS");
//        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d\001\nd\n" + "'", str12, "d\001\nd\n");
//        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
//        org.junit.Assert.assertNotNull(request14);
//        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OPTIONS" + "'", str15, "OPTIONS");
//        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "d\001\nd\n" + "'", str16, "d\001\nd\n");
//    }
//
//    @Test
//    public void test116() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test116");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.request.FakeRequest fakeRequest4 = fakeRequest0.withBody("DELETE");
//        com.jcabi.http.RequestBody requestBody5 = fakeRequest4.body();
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(fakeRequest4);
//        org.junit.Assert.assertNotNull(requestBody5);
//    }
//
//    @Test
//    public void test117() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test117");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestBody requestBody4 = jdkRequest1.multipartBody();
//        java.lang.String str5 = jdkRequest1.toString();
//        com.jcabi.http.Wire wire6 = null;
//        com.jcabi.http.Request request7 = jdkRequest1.through(wire6);
//        boolean boolean9 = jdkRequest1.equals((java.lang.Object) "9UjAhLEd1uzegZSctHUhLVKa0jxnirx");
//        com.jcabi.http.RequestBody requestBody10 = jdkRequest1.multipartBody();
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestBody4);
//        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str5, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(request7);
//        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
//        org.junit.Assert.assertNotNull(requestBody10);
//    }
//
//    @Test
//    public void test118() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test118");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.Request request24 = baseRequest19.reset("POST");
//        com.jcabi.http.request.FakeRequest fakeRequest30 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList33 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray39 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse40 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest30, (-1), "OPTIONS", strEntryList33, byteArray39);
//        com.jcabi.http.request.FakeRequest fakeRequest41 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList44 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray50 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse51 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest41, (-1), "OPTIONS", strEntryList44, byteArray50);
//        com.jcabi.http.request.FakeRequest fakeRequest52 = new com.jcabi.http.request.FakeRequest(0, "V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList33, byteArray50);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder53 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray54 = multipartBodyBuilder53.asBytes();
//        byte[] byteArray55 = multipartBodyBuilder53.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest56 = new com.jcabi.http.request.FakeRequest(1, "vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList33, byteArray55);
//        com.jcabi.http.request.FakeRequest fakeRequest58 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest60 = fakeRequest58.withReason("");
//        com.jcabi.http.Wire wire61 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest63 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList66 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray72 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse73 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest63, (-1), "OPTIONS", strEntryList66, byteArray72);
//        byte[] byteArray77 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest80 = new com.jcabi.http.request.BaseRequest(wire61, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList66, "hi!", byteArray77, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest81 = fakeRequest60.withBody(byteArray77);
//        com.jcabi.http.request.FakeRequest fakeRequest83 = fakeRequest81.withBody("hi!");
//        com.jcabi.http.Request request84 = fakeRequest56.header("d\001\nd\n", (java.lang.Object) fakeRequest81);
//        com.jcabi.http.Request request85 = baseRequest19.header("PUT", (java.lang.Object) "d\001\nd\n");
//        java.lang.String str86 = baseRequest19.toString();
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(request24);
//        org.junit.Assert.assertNotNull(byteArray39);
//        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray50);
//        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray54);
//        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray55);
//        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
//        org.junit.Assert.assertNotNull(fakeRequest60);
//        org.junit.Assert.assertNotNull(byteArray72);
//        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray77);
//        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest81);
//        org.junit.Assert.assertNotNull(fakeRequest83);
//        org.junit.Assert.assertNotNull(request84);
//        org.junit.Assert.assertNotNull(request85);
//        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str86, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//    }
//
//    @Test
//    public void test119() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test119");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.Request request25 = baseRequest19.header("d\001\nd\n", (java.lang.Object) 'a');
//        java.lang.Class<?> wildcardClass26 = baseRequest19.getClass();
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(request25);
//        org.junit.Assert.assertNotNull(wildcardClass26);
//    }
//
//    @Test
//    public void test120() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test120");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        java.lang.String str20 = baseRequest19.toString();
//        com.jcabi.http.RequestURI requestURI21 = baseRequest19.uri();
//        com.jcabi.http.request.JdkRequest jdkRequest23 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire24 = null;
//        com.jcabi.http.Request request25 = jdkRequest23.through(wire24);
//        boolean boolean26 = baseRequest19.equals((java.lang.Object) request25);
//        com.jcabi.http.RequestBody requestBody27 = baseRequest19.body();
//        com.jcabi.http.RequestURI requestURI28 = baseRequest19.uri();
//        com.jcabi.http.Request request30 = baseRequest19.method("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        java.io.InputStream inputStream31 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response32 = baseRequest19.fetch(inputStream31);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Request Body is not empty, use fetch() instead");
//        } catch (java.lang.IllegalStateException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str20, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//        org.junit.Assert.assertNotNull(requestURI21);
//        org.junit.Assert.assertNotNull(request25);
//        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
//        org.junit.Assert.assertNotNull(requestBody27);
//        org.junit.Assert.assertNotNull(requestURI28);
//        org.junit.Assert.assertNotNull(request30);
//    }
//
//    @Test
//    public void test121() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test121");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request3 = jdkRequest1.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        java.lang.String str4 = jdkRequest1.toString();
//        com.jcabi.http.Request request7 = jdkRequest1.timeout((int) '#', (int) (byte) -1);
//        com.jcabi.http.RequestBody requestBody8 = jdkRequest1.multipartBody();
//        com.jcabi.http.Request request11 = jdkRequest1.timeout((int) (byte) 100, 100);
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str4, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(request7);
//        org.junit.Assert.assertNotNull(requestBody8);
//        org.junit.Assert.assertNotNull(request11);
//    }
//
//    @Test
//    public void test122() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test122");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request21 = baseRequest19.method("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.Wire wire22 = null;
//        com.jcabi.http.Request request23 = baseRequest19.through(wire22);
//        com.jcabi.http.RequestBody requestBody24 = baseRequest19.multipartBody();
//        com.jcabi.http.RequestBody requestBody25 = baseRequest19.multipartBody();
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request21);
//        org.junit.Assert.assertNotNull(request23);
//        org.junit.Assert.assertNotNull(requestBody24);
//        org.junit.Assert.assertNotNull(requestBody25);
//    }
//
//    @Test
//    public void test123() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test123");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        java.lang.Class<?> wildcardClass1 = fakeRequest0.getClass();
//        org.junit.Assert.assertNotNull(wildcardClass1);
//    }
//
//    @Test
//    public void test124() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test124");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.Request request25 = baseRequest19.header("d\001\nd\n", (java.lang.Object) 'a');
//        com.jcabi.http.Request request27 = baseRequest19.reset("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.Request request30 = baseRequest19.timeout((int) ' ', (int) ' ');
//        com.jcabi.http.Wire wire31 = null;
//        com.jcabi.http.Request request32 = baseRequest19.through(wire31);
//        com.jcabi.http.Request request35 = baseRequest19.timeout((int) ' ', 10);
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(request25);
//        org.junit.Assert.assertNotNull(request27);
//        org.junit.Assert.assertNotNull(request30);
//        org.junit.Assert.assertNotNull(request32);
//        org.junit.Assert.assertNotNull(request35);
//    }
//
//    @Test
//    public void test125() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test125");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        boolean boolean23 = fakeRequest2.equals((java.lang.Object) strEntryList8);
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        com.jcabi.http.Wire wire40 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest42 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList45 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse52 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest42, (-1), "OPTIONS", strEntryList45, byteArray51);
//        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest59 = new com.jcabi.http.request.BaseRequest(wire40, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList45, "hi!", byteArray56, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder60 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray56);
//        com.jcabi.http.request.FakeRequest fakeRequest61 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray56);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder62 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray63 = multipartBodyBuilder62.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest64 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray63);
//        com.jcabi.http.request.BaseRequest baseRequest65 = new com.jcabi.http.request.BaseRequest(wire0, "OPTIONS", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "PUT", byteArray63);
//        com.jcabi.http.Wire wire66 = null;
//        com.jcabi.http.Request request67 = baseRequest65.through(wire66);
//        com.jcabi.http.Wire wire68 = null;
//        com.jcabi.http.Request request69 = baseRequest65.through(wire68);
//        java.lang.String str70 = baseRequest65.toString();
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray51);
//        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray63);
//        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
//        org.junit.Assert.assertNotNull(request67);
//        org.junit.Assert.assertNotNull(request69);
//        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "HTTP/1.1 PUT OPTIONS (null)\n\n<<empty>>" + "'", str70, "HTTP/1.1 PUT OPTIONS (null)\n\n<<empty>>");
//    }
//
//    @Test
//    public void test126() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test126");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder0 = new com.jcabi.http.request.MultipartBodyBuilder();
//        com.jcabi.http.request.FakeRequest fakeRequest1 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList4 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse11 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest1, (-1), "OPTIONS", strEntryList4, byteArray10);
//        byte[] byteArray12 = defaultResponse11.binary();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder13 = multipartBodyBuilder0.append(byteArray12);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder14 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray15 = multipartBodyBuilder14.asBytes();
//        byte[] byteArray16 = multipartBodyBuilder14.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest19 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList22 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse29 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest19, (-1), "OPTIONS", strEntryList22, byteArray28);
//        com.jcabi.http.Wire wire30 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest32 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList35 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray41 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse42 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest32, (-1), "OPTIONS", strEntryList35, byteArray41);
//        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest49 = new com.jcabi.http.request.BaseRequest(wire30, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList35, "hi!", byteArray46, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder50 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray46);
//        com.jcabi.http.request.FakeRequest fakeRequest51 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList22, byteArray46);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder52 = multipartBodyBuilder14.appendLine(byteArray46);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder53 = multipartBodyBuilder0.appendLine(byteArray46);
//        byte[] byteArray54 = multipartBodyBuilder0.asBytes();
//        org.junit.Assert.assertNotNull(byteArray10);
//        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray12);
//        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder13);
//        org.junit.Assert.assertNotNull(byteArray15);
//        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray28);
//        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray41);
//        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray46);
//        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder52);
//        org.junit.Assert.assertNotNull(multipartBodyBuilder53);
//        org.junit.Assert.assertNotNull(byteArray54);
//        org.junit.Assert.assertArrayEquals(byteArray54, new byte[] {});
//    }
//
//    @Test
//    public void test127() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test127");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request3 = jdkRequest1.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.Request request5 = jdkRequest1.reset("hi!");
//        com.jcabi.http.Request request8 = jdkRequest1.timeout(10, (int) '#');
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(request5);
//        org.junit.Assert.assertNotNull(request8);
//    }
//
//    @Test
//    public void test128() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test128");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        java.io.InputStream inputStream3 = null;
//        com.jcabi.http.Response response4 = fakeRequest0.fetch(inputStream3);
//        com.jcabi.http.request.FakeRequest fakeRequest6 = fakeRequest0.withBody("");
//        com.jcabi.http.RequestURI requestURI7 = fakeRequest0.uri();
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(response4);
//        org.junit.Assert.assertNotNull(fakeRequest6);
//        org.junit.Assert.assertNotNull(requestURI7);
//    }
//
//    @Test
//    public void test129() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test129");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestBody requestBody4 = jdkRequest1.multipartBody();
//        java.lang.String str5 = jdkRequest1.toString();
//        com.jcabi.http.Request request7 = jdkRequest1.reset("HTTP/1.1 hi! hi! (null)\n\n\000d");
//        com.jcabi.http.RequestURI requestURI8 = jdkRequest1.uri();
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestBody4);
//        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str5, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(request7);
//        org.junit.Assert.assertNotNull(requestURI8);
//    }
//
//    @Test
//    public void test130() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test130");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Wire wire4 = null;
//        com.jcabi.http.Wire wire6 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest8 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray17 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse18 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest8, (-1), "OPTIONS", strEntryList11, byteArray17);
//        byte[] byteArray22 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest25 = new com.jcabi.http.request.BaseRequest(wire6, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList11, "hi!", byteArray22, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder27 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray28 = multipartBodyBuilder27.asBytes();
//        byte[] byteArray29 = multipartBodyBuilder27.asBytes();
//        com.jcabi.http.request.BaseRequest baseRequest30 = new com.jcabi.http.request.BaseRequest(wire4, "huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList11, "", byteArray29);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder32 = new com.jcabi.http.request.MultipartBodyBuilder();
//        com.jcabi.http.request.FakeRequest fakeRequest33 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList36 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse43 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest33, (-1), "OPTIONS", strEntryList36, byteArray42);
//        byte[] byteArray44 = defaultResponse43.binary();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder45 = multipartBodyBuilder32.append(byteArray44);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder46 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray47 = multipartBodyBuilder46.asBytes();
//        byte[] byteArray48 = multipartBodyBuilder46.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest51 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList54 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray60 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse61 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest51, (-1), "OPTIONS", strEntryList54, byteArray60);
//        com.jcabi.http.Wire wire62 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest64 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList67 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray73 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse74 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest64, (-1), "OPTIONS", strEntryList67, byteArray73);
//        byte[] byteArray78 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest81 = new com.jcabi.http.request.BaseRequest(wire62, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList67, "hi!", byteArray78, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder82 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray78);
//        com.jcabi.http.request.FakeRequest fakeRequest83 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList54, byteArray78);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder84 = multipartBodyBuilder46.appendLine(byteArray78);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder85 = multipartBodyBuilder32.appendLine(byteArray78);
//        com.jcabi.http.request.BaseRequest baseRequest88 = new com.jcabi.http.request.BaseRequest(wire2, "0IllljFfduTj_3ljBBP8zIH6tn-WbXBXIneoG", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList11, "", byteArray78, (int) (short) 0, 1);
//        byte[] byteArray89 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.request.FakeRequest fakeRequest90 = new com.jcabi.http.request.FakeRequest((int) (short) 10, "PUT", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList11, byteArray89);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray17);
//        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray22);
//        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray28);
//        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray29);
//        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray42);
//        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray44);
//        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder45);
//        org.junit.Assert.assertNotNull(byteArray47);
//        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray48);
//        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray60);
//        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray73);
//        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray78);
//        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder84);
//        org.junit.Assert.assertNotNull(multipartBodyBuilder85);
//    }
//
//    @Test
//    public void test131() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test131");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.RequestBody requestBody23 = baseRequest19.multipartBody();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder24 = new com.jcabi.http.request.MultipartBodyBuilder();
//        com.jcabi.http.request.FakeRequest fakeRequest25 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList28 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray34 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse35 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest25, (-1), "OPTIONS", strEntryList28, byteArray34);
//        byte[] byteArray36 = defaultResponse35.binary();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder37 = multipartBodyBuilder24.append(byteArray36);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder38 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray39 = multipartBodyBuilder38.asBytes();
//        byte[] byteArray40 = multipartBodyBuilder38.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest43 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList46 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray52 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse53 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest43, (-1), "OPTIONS", strEntryList46, byteArray52);
//        com.jcabi.http.Wire wire54 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest56 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList59 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray65 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse66 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest56, (-1), "OPTIONS", strEntryList59, byteArray65);
//        byte[] byteArray70 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest73 = new com.jcabi.http.request.BaseRequest(wire54, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList59, "hi!", byteArray70, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder74 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray70);
//        com.jcabi.http.request.FakeRequest fakeRequest75 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList46, byteArray70);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder76 = multipartBodyBuilder38.appendLine(byteArray70);
//        byte[] byteArray81 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder82 = multipartBodyBuilder76.appendLine(byteArray81);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder83 = multipartBodyBuilder37.append(byteArray81);
//        boolean boolean84 = baseRequest19.equals((java.lang.Object) byteArray81);
//        java.lang.String str85 = baseRequest19.toString();
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(requestBody23);
//        org.junit.Assert.assertNotNull(byteArray34);
//        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray36);
//        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder37);
//        org.junit.Assert.assertNotNull(byteArray39);
//        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray40);
//        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray52);
//        org.junit.Assert.assertArrayEquals(byteArray52, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray65);
//        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray70);
//        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder76);
//        org.junit.Assert.assertNotNull(byteArray81);
//        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder82);
//        org.junit.Assert.assertNotNull(multipartBodyBuilder83);
//        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
//        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str85, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//    }
//
//    @Test
//    public void test132() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test132");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request21 = baseRequest19.method("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.Wire wire22 = null;
//        com.jcabi.http.Request request23 = baseRequest19.through(wire22);
//        com.jcabi.http.request.FakeRequest fakeRequest24 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest26 = fakeRequest24.withReason("");
//        com.jcabi.http.Wire wire27 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest46 = new com.jcabi.http.request.BaseRequest(wire27, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, "hi!", byteArray43, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest47 = fakeRequest26.withBody(byteArray43);
//        com.jcabi.http.RequestBody requestBody48 = fakeRequest26.multipartBody();
//        com.jcabi.http.request.FakeRequest fakeRequest50 = fakeRequest26.withReason("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.Wire wire51 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest53 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList56 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray62 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse63 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest53, (-1), "OPTIONS", strEntryList56, byteArray62);
//        byte[] byteArray67 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest70 = new com.jcabi.http.request.BaseRequest(wire51, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList56, "hi!", byteArray67, 0, 100);
//        boolean boolean71 = fakeRequest26.equals((java.lang.Object) wire51);
//        boolean boolean72 = baseRequest19.equals((java.lang.Object) wire51);
//        com.jcabi.http.RequestURI requestURI73 = baseRequest19.uri();
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response74 = baseRequest19.fetch();
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request21);
//        org.junit.Assert.assertNotNull(request23);
//        org.junit.Assert.assertNotNull(fakeRequest26);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray43);
//        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest47);
//        org.junit.Assert.assertNotNull(requestBody48);
//        org.junit.Assert.assertNotNull(fakeRequest50);
//        org.junit.Assert.assertNotNull(byteArray62);
//        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray67);
//        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
//        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
//        org.junit.Assert.assertNotNull(requestURI73);
//    }
//
//    @Test
//    public void test133() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test133");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.body();
//        java.lang.String str12 = defaultResponse10.reason();
//        java.lang.String str13 = defaultResponse10.body();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d\001\nd\n" + "'", str11, "d\001\nd\n");
//        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OPTIONS" + "'", str12, "OPTIONS");
//        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "d\001\nd\n" + "'", str13, "d\001\nd\n");
//    }
//
//    @Test
//    public void test134() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test134");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.method("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.request.FakeRequest fakeRequest18 = fakeRequest0.withHeader("9U090yzM2PXs6aJeMMc1MJDiLebGjalZTTMp", "");
//        com.jcabi.http.request.FakeRequest fakeRequest20 = fakeRequest0.withReason("OPTIONS");
//        com.jcabi.http.request.JdkRequest jdkRequest22 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request24 = jdkRequest22.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.request.FakeRequest fakeRequest26 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList29 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray35 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse36 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest26, (-1), "OPTIONS", strEntryList29, byteArray35);
//        com.jcabi.http.Request request37 = jdkRequest22.header("-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n", (java.lang.Object) byteArray35);
//        com.jcabi.http.request.FakeRequest fakeRequest38 = fakeRequest20.withBody(byteArray35);
//        com.jcabi.http.Request request41 = fakeRequest20.timeout((int) (byte) 0, (int) (byte) 10);
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(fakeRequest18);
//        org.junit.Assert.assertNotNull(fakeRequest20);
//        org.junit.Assert.assertNotNull(request24);
//        org.junit.Assert.assertNotNull(byteArray35);
//        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request37);
//        org.junit.Assert.assertNotNull(fakeRequest38);
//        org.junit.Assert.assertNotNull(request41);
//    }
//
//    @Test
//    public void test135() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test135");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        java.lang.String str20 = baseRequest19.toString();
//        com.jcabi.http.RequestURI requestURI21 = baseRequest19.uri();
//        com.jcabi.http.request.JdkRequest jdkRequest23 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire24 = null;
//        com.jcabi.http.Request request25 = jdkRequest23.through(wire24);
//        boolean boolean26 = baseRequest19.equals((java.lang.Object) request25);
//        com.jcabi.http.RequestBody requestBody27 = baseRequest19.body();
//        com.jcabi.http.RequestURI requestURI28 = baseRequest19.uri();
//        com.jcabi.http.RequestBody requestBody29 = baseRequest19.multipartBody();
//        java.io.InputStream inputStream30 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response31 = baseRequest19.fetch(inputStream30);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Request Body is not empty, use fetch() instead");
//        } catch (java.lang.IllegalStateException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str20, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//        org.junit.Assert.assertNotNull(requestURI21);
//        org.junit.Assert.assertNotNull(request25);
//        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
//        org.junit.Assert.assertNotNull(requestBody27);
//        org.junit.Assert.assertNotNull(requestURI28);
//        org.junit.Assert.assertNotNull(requestBody29);
//    }
//
//    @Test
//    public void test136() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test136");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.BaseRequest baseRequest2 = new com.jcabi.http.request.BaseRequest(wire0, "huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        boolean boolean4 = baseRequest2.equals((java.lang.Object) "huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.RequestURI requestURI5 = baseRequest2.uri();
//        java.io.InputStream inputStream6 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response7 = baseRequest2.fetch(inputStream6);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
//        org.junit.Assert.assertNotNull(requestURI5);
//    }
//
//    @Test
//    public void test137() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test137");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire1 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest3 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList6 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse13 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest3, (-1), "OPTIONS", strEntryList6, byteArray12);
//        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest20 = new com.jcabi.http.request.BaseRequest(wire1, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList6, "hi!", byteArray17, 0, 100);
//        boolean boolean21 = fakeRequest0.equals((java.lang.Object) strEntryList6);
//        com.jcabi.http.RequestBody requestBody22 = fakeRequest0.multipartBody();
//        com.jcabi.http.RequestURI requestURI23 = fakeRequest0.uri();
//        com.jcabi.http.request.FakeRequest fakeRequest25 = fakeRequest0.withReason("HEAD");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder26 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray27 = multipartBodyBuilder26.asBytes();
//        byte[] byteArray28 = multipartBodyBuilder26.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest29 = fakeRequest25.withBody(byteArray28);
//        org.junit.Assert.assertNotNull(byteArray12);
//        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray17);
//        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
//        org.junit.Assert.assertNotNull(requestBody22);
//        org.junit.Assert.assertNotNull(requestURI23);
//        org.junit.Assert.assertNotNull(fakeRequest25);
//        org.junit.Assert.assertNotNull(byteArray27);
//        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray28);
//        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] {});
//        org.junit.Assert.assertNotNull(fakeRequest29);
//    }
//
//    @Test
//    public void test138() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test138");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.RequestBody requestBody23 = baseRequest19.multipartBody();
//        com.jcabi.http.request.FakeRequest fakeRequest24 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList27 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse34 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest24, (-1), "OPTIONS", strEntryList27, byteArray33);
//        com.jcabi.http.Request request37 = fakeRequest24.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request39 = fakeRequest24.reset("PATCH");
//        com.jcabi.http.request.FakeRequest fakeRequest42 = fakeRequest24.withHeader("d\001\nd\n", "DELETE");
//        com.jcabi.http.RequestURI requestURI43 = fakeRequest24.uri();
//        com.jcabi.http.Wire wire44 = null;
//        com.jcabi.http.Request request45 = fakeRequest24.through(wire44);
//        boolean boolean46 = baseRequest19.equals((java.lang.Object) fakeRequest24);
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(requestBody23);
//        org.junit.Assert.assertNotNull(byteArray33);
//        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request37);
//        org.junit.Assert.assertNotNull(request39);
//        org.junit.Assert.assertNotNull(fakeRequest42);
//        org.junit.Assert.assertNotNull(requestURI43);
//        org.junit.Assert.assertNotNull(request45);
//        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
//    }
//
//    @Test
//    public void test139() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test139");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request3 = jdkRequest1.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.request.FakeRequest fakeRequest10 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse20 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest10, (-1), "OPTIONS", strEntryList13, byteArray19);
//        com.jcabi.http.Wire wire21 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest23 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList26 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse33 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest23, (-1), "OPTIONS", strEntryList26, byteArray32);
//        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest40 = new com.jcabi.http.request.BaseRequest(wire21, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList26, "hi!", byteArray37, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder41 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray37);
//        com.jcabi.http.request.FakeRequest fakeRequest42 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList13, byteArray37);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder43 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray44 = multipartBodyBuilder43.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest45 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList13, byteArray44);
//        com.jcabi.http.request.FakeRequest fakeRequest48 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList51 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray57 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse58 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest48, (-1), "OPTIONS", strEntryList51, byteArray57);
//        com.jcabi.http.request.FakeRequest fakeRequest59 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList62 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray68 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse69 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest59, (-1), "OPTIONS", strEntryList62, byteArray68);
//        com.jcabi.http.request.FakeRequest fakeRequest70 = new com.jcabi.http.request.FakeRequest(0, "V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList51, byteArray68);
//        com.jcabi.http.request.DefaultResponse defaultResponse71 = new com.jcabi.http.request.DefaultResponse(request3, (int) (short) 0, "d\001\nd\n", strEntryList13, byteArray68);
//        byte[] byteArray72 = defaultResponse71.binary();
//        com.jcabi.http.Request request73 = defaultResponse71.back();
//        java.lang.String str74 = defaultResponse71.body();
//        com.jcabi.http.request.JdkRequest jdkRequest76 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire77 = null;
//        com.jcabi.http.Request request78 = jdkRequest76.through(wire77);
//        com.jcabi.http.RequestURI requestURI79 = jdkRequest76.uri();
//        com.jcabi.http.RequestURI requestURI80 = jdkRequest76.uri();
//        boolean boolean81 = defaultResponse71.equals((java.lang.Object) jdkRequest76);
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray32);
//        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray37);
//        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray44);
//        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray57);
//        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray68);
//        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray72);
//        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request73);
//        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "d\001\nd\n" + "'", str74, "d\001\nd\n");
//        org.junit.Assert.assertNotNull(request78);
//        org.junit.Assert.assertNotNull(requestURI79);
//        org.junit.Assert.assertNotNull(requestURI80);
//        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
//    }
//
//    @Test
//    public void test140() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test140");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request21 = baseRequest19.method("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.Request request23 = baseRequest19.method("GET");
//        com.jcabi.http.Request request26 = baseRequest19.timeout((int) (short) 0, (-1));
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request21);
//        org.junit.Assert.assertNotNull(request23);
//        org.junit.Assert.assertNotNull(request26);
//    }
//
//    @Test
//    public void test141() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test141");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        boolean boolean23 = fakeRequest2.equals((java.lang.Object) strEntryList8);
//        com.jcabi.http.request.FakeRequest fakeRequest25 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList28 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray34 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse35 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest25, (-1), "OPTIONS", strEntryList28, byteArray34);
//        com.jcabi.http.request.BaseRequest baseRequest38 = new com.jcabi.http.request.BaseRequest(wire0, "GET", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "OPTIONS", byteArray34, (int) (short) -1, 10);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder39 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray34);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
//        org.junit.Assert.assertNotNull(byteArray34);
//        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//    }
//
//    @Test
//    public void test142() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test142");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder0 = new com.jcabi.http.request.MultipartBodyBuilder();
//        com.jcabi.http.request.FakeRequest fakeRequest1 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList4 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse11 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest1, (-1), "OPTIONS", strEntryList4, byteArray10);
//        byte[] byteArray12 = defaultResponse11.binary();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder13 = multipartBodyBuilder0.append(byteArray12);
//        byte[] byteArray14 = multipartBodyBuilder13.asBytes();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder15 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray16 = multipartBodyBuilder15.asBytes();
//        byte[] byteArray17 = multipartBodyBuilder15.asBytes();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder18 = multipartBodyBuilder13.append(byteArray17);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder19 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray20 = multipartBodyBuilder19.asBytes();
//        byte[] byteArray21 = multipartBodyBuilder19.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest24 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList27 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray33 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse34 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest24, (-1), "OPTIONS", strEntryList27, byteArray33);
//        com.jcabi.http.Wire wire35 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest37 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList40 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray46 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse47 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest37, (-1), "OPTIONS", strEntryList40, byteArray46);
//        byte[] byteArray51 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest54 = new com.jcabi.http.request.BaseRequest(wire35, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList40, "hi!", byteArray51, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder55 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray51);
//        com.jcabi.http.request.FakeRequest fakeRequest56 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList27, byteArray51);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder57 = multipartBodyBuilder19.appendLine(byteArray51);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder58 = multipartBodyBuilder18.appendLine(byteArray51);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder59 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray60 = multipartBodyBuilder59.asBytes();
//        byte[] byteArray61 = multipartBodyBuilder59.asBytes();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder62 = multipartBodyBuilder18.appendLine(byteArray61);
//        org.junit.Assert.assertNotNull(byteArray10);
//        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray12);
//        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder13);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray17);
//        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
//        org.junit.Assert.assertNotNull(multipartBodyBuilder18);
//        org.junit.Assert.assertNotNull(byteArray20);
//        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray21);
//        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray33);
//        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray46);
//        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray51);
//        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder57);
//        org.junit.Assert.assertNotNull(multipartBodyBuilder58);
//        org.junit.Assert.assertNotNull(byteArray60);
//        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray61);
//        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] {});
//        org.junit.Assert.assertNotNull(multipartBodyBuilder62);
//    }
//
//    @Test
//    public void test143() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test143");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request21 = baseRequest19.method("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.Wire wire22 = null;
//        com.jcabi.http.Request request23 = baseRequest19.through(wire22);
//        com.jcabi.http.request.FakeRequest fakeRequest24 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest26 = fakeRequest24.withReason("");
//        com.jcabi.http.Wire wire27 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest46 = new com.jcabi.http.request.BaseRequest(wire27, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, "hi!", byteArray43, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest47 = fakeRequest26.withBody(byteArray43);
//        com.jcabi.http.RequestBody requestBody48 = fakeRequest26.multipartBody();
//        com.jcabi.http.request.FakeRequest fakeRequest50 = fakeRequest26.withReason("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.Wire wire51 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest53 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList56 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray62 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse63 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest53, (-1), "OPTIONS", strEntryList56, byteArray62);
//        byte[] byteArray67 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest70 = new com.jcabi.http.request.BaseRequest(wire51, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList56, "hi!", byteArray67, 0, 100);
//        boolean boolean71 = fakeRequest26.equals((java.lang.Object) wire51);
//        boolean boolean72 = baseRequest19.equals((java.lang.Object) wire51);
//        com.jcabi.http.RequestBody requestBody73 = baseRequest19.body();
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request21);
//        org.junit.Assert.assertNotNull(request23);
//        org.junit.Assert.assertNotNull(fakeRequest26);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray43);
//        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest47);
//        org.junit.Assert.assertNotNull(requestBody48);
//        org.junit.Assert.assertNotNull(fakeRequest50);
//        org.junit.Assert.assertNotNull(byteArray62);
//        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray67);
//        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
//        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
//        org.junit.Assert.assertNotNull(requestBody73);
//    }
//
//    @Test
//    public void test144() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test144");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((int) (byte) -1, (int) (short) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.reset("HTTP/1.1 hi! hi! (null)\n\n\000d");
//        com.jcabi.http.RequestBody requestBody16 = fakeRequest0.multipartBody();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(requestBody16);
//    }
//
//    @Test
//    public void test145() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test145");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder2 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray3 = multipartBodyBuilder2.asBytes();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder4 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray3);
//        boolean boolean5 = jdkRequest1.equals((java.lang.Object) multipartBodyBuilder4);
//        org.junit.Assert.assertNotNull(byteArray3);
//        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
//        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
//    }
//
//    @Test
//    public void test146() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test146");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.request.JdkRequest jdkRequest25 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request27 = jdkRequest25.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.Request request28 = baseRequest19.header("9UjAhLEd1uzegZSctHUhLVKa0jxnirx", (java.lang.Object) jdkRequest25);
//        com.jcabi.http.Request request30 = baseRequest19.method("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(request27);
//        org.junit.Assert.assertNotNull(request28);
//        org.junit.Assert.assertNotNull(request30);
//    }
//
//    @Test
//    public void test147() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test147");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.body();
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = defaultResponse10.headers();
//        com.jcabi.http.Request request13 = defaultResponse10.back();
//        com.jcabi.http.Request request14 = defaultResponse10.back();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d\001\nd\n" + "'", str11, "d\001\nd\n");
//        org.junit.Assert.assertNotNull(strMap12);
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request14);
//    }
//
//    @Test
//    public void test148() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test148");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest23 = fakeRequest2.withBody(byteArray19);
//        com.jcabi.http.RequestBody requestBody24 = fakeRequest2.multipartBody();
//        com.jcabi.http.request.FakeRequest fakeRequest26 = fakeRequest2.withReason("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.request.FakeRequest fakeRequest29 = fakeRequest2.withHeader("HTTP/1.1 hi! hi! (null)\n\n\000d", "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        com.jcabi.http.Request request31 = fakeRequest29.reset("JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest23);
//        org.junit.Assert.assertNotNull(requestBody24);
//        org.junit.Assert.assertNotNull(fakeRequest26);
//        org.junit.Assert.assertNotNull(fakeRequest29);
//        org.junit.Assert.assertNotNull(request31);
//    }
//
//    @Test
//    public void test149() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test149");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestBody requestBody4 = jdkRequest1.multipartBody();
//        java.lang.String str5 = jdkRequest1.toString();
//        com.jcabi.http.Request request7 = jdkRequest1.reset("HTTP/1.1 hi! hi! (null)\n\n\000d");
//        com.jcabi.http.Request request10 = jdkRequest1.timeout((int) (short) 10, (int) (byte) 1);
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestBody4);
//        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str5, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(request7);
//        org.junit.Assert.assertNotNull(request10);
//    }
//
//    @Test
//    public void test150() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test150");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.request.FakeRequest fakeRequest4 = fakeRequest0.withReason("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        java.lang.String str5 = fakeRequest0.toString();
//        com.jcabi.http.request.FakeRequest fakeRequest7 = fakeRequest0.withStatus((int) '#');
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(fakeRequest4);
//        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>" + "'", str5, "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        org.junit.Assert.assertNotNull(fakeRequest7);
//    }
//
//    @Test
//    public void test151() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test151");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.Request request25 = baseRequest19.header("d\001\nd\n", (java.lang.Object) 'a');
//        com.jcabi.http.Request request28 = baseRequest19.timeout((int) (short) 0, (int) '4');
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(request25);
//        org.junit.Assert.assertNotNull(request28);
//    }
//
//    @Test
//    public void test152() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test152");
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        com.jcabi.http.Wire wire13 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest15 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList18 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse25 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest15, (-1), "OPTIONS", strEntryList18, byteArray24);
//        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest32 = new com.jcabi.http.request.BaseRequest(wire13, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList18, "hi!", byteArray29, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder33 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray29);
//        com.jcabi.http.request.FakeRequest fakeRequest34 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, byteArray29);
//        com.jcabi.http.request.FakeRequest fakeRequest36 = fakeRequest34.withBody("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.request.FakeRequest fakeRequest38 = fakeRequest36.withBody("9UjAhLEd1uzegZSctHUhLVKa0jxnirx");
//        java.lang.String str39 = fakeRequest36.toString();
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray24);
//        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray29);
//        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest36);
//        org.junit.Assert.assertNotNull(fakeRequest38);
//        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>" + "'", str39, "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//    }
//
//    @Test
//    public void test153() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test153");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder0 = new com.jcabi.http.request.MultipartBodyBuilder();
//        com.jcabi.http.request.FakeRequest fakeRequest1 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList4 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse11 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest1, (-1), "OPTIONS", strEntryList4, byteArray10);
//        byte[] byteArray12 = defaultResponse11.binary();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder13 = multipartBodyBuilder0.append(byteArray12);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder14 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray15 = multipartBodyBuilder14.asBytes();
//        byte[] byteArray16 = multipartBodyBuilder14.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest19 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList22 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse29 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest19, (-1), "OPTIONS", strEntryList22, byteArray28);
//        com.jcabi.http.Wire wire30 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest32 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList35 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray41 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse42 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest32, (-1), "OPTIONS", strEntryList35, byteArray41);
//        byte[] byteArray46 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest49 = new com.jcabi.http.request.BaseRequest(wire30, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList35, "hi!", byteArray46, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder50 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray46);
//        com.jcabi.http.request.FakeRequest fakeRequest51 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList22, byteArray46);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder52 = multipartBodyBuilder14.appendLine(byteArray46);
//        byte[] byteArray57 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder58 = multipartBodyBuilder52.appendLine(byteArray57);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder59 = multipartBodyBuilder13.append(byteArray57);
//        com.jcabi.http.request.FakeRequest fakeRequest60 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList63 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray69 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse70 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest60, (-1), "OPTIONS", strEntryList63, byteArray69);
//        byte[] byteArray71 = defaultResponse70.binary();
//        com.jcabi.http.Request request72 = defaultResponse70.back();
//        byte[] byteArray73 = defaultResponse70.binary();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder74 = multipartBodyBuilder59.appendLine(byteArray73);
//        byte[] byteArray75 = multipartBodyBuilder74.asBytes();
//        org.junit.Assert.assertNotNull(byteArray10);
//        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray12);
//        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder13);
//        org.junit.Assert.assertNotNull(byteArray15);
//        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray28);
//        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray41);
//        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray46);
//        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder52);
//        org.junit.Assert.assertNotNull(byteArray57);
//        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder58);
//        org.junit.Assert.assertNotNull(multipartBodyBuilder59);
//        org.junit.Assert.assertNotNull(byteArray69);
//        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray71);
//        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request72);
//        org.junit.Assert.assertNotNull(byteArray73);
//        org.junit.Assert.assertArrayEquals(byteArray73, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder74);
//        org.junit.Assert.assertNotNull(byteArray75);
//        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10, (byte) 10, (byte) 100, (byte) 0, (byte) 0, (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10, (byte) 13, (byte) 10 });
//    }
//
//    @Test
//    public void test154() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test154");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((int) (byte) -1, (int) (short) 10);
//        com.jcabi.http.Wire wire14 = null;
//        com.jcabi.http.Request request15 = fakeRequest0.through(wire14);
//        com.jcabi.http.request.JdkRequest jdkRequest18 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire19 = null;
//        com.jcabi.http.Request request20 = jdkRequest18.through(wire19);
//        com.jcabi.http.RequestBody requestBody21 = jdkRequest18.multipartBody();
//        java.lang.String str22 = jdkRequest18.toString();
//        com.jcabi.http.Request request24 = jdkRequest18.reset("HTTP/1.1 hi! hi! (null)\n\n\000d");
//        com.jcabi.http.Request request26 = jdkRequest18.method("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.RequestURI requestURI27 = jdkRequest18.uri();
//        com.jcabi.http.Request request28 = fakeRequest0.header("PUT", (java.lang.Object) requestURI27);
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(request20);
//        org.junit.Assert.assertNotNull(requestBody21);
//        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str22, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(request24);
//        org.junit.Assert.assertNotNull(request26);
//        org.junit.Assert.assertNotNull(requestURI27);
//        org.junit.Assert.assertNotNull(request28);
//    }
//
//    @Test
//    public void test155() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test155");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.body();
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = defaultResponse10.headers();
//        com.jcabi.http.Request request13 = defaultResponse10.back();
//        java.lang.String str14 = defaultResponse10.body();
//        com.jcabi.http.Wire wire15 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest17 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList20 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse27 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest17, (-1), "OPTIONS", strEntryList20, byteArray26);
//        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest34 = new com.jcabi.http.request.BaseRequest(wire15, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList20, "hi!", byteArray31, 0, 100);
//        com.jcabi.http.Request request37 = baseRequest34.timeout(0, (int) (short) 1);
//        com.jcabi.http.Request request40 = baseRequest34.header("d\001\nd\n", (java.lang.Object) 'a');
//        com.jcabi.http.Request request42 = baseRequest34.reset("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        boolean boolean43 = defaultResponse10.equals((java.lang.Object) request42);
//        com.jcabi.http.Request request44 = defaultResponse10.back();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d\001\nd\n" + "'", str11, "d\001\nd\n");
//        org.junit.Assert.assertNotNull(strMap12);
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d\001\nd\n" + "'", str14, "d\001\nd\n");
//        org.junit.Assert.assertNotNull(byteArray26);
//        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray31);
//        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request37);
//        org.junit.Assert.assertNotNull(request40);
//        org.junit.Assert.assertNotNull(request42);
//        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
//        org.junit.Assert.assertNotNull(request44);
//    }
//
//    @Test
//    public void test156() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test156");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest23 = fakeRequest2.withBody(byteArray19);
//        com.jcabi.http.request.FakeRequest fakeRequest25 = fakeRequest23.withBody("hi!");
//        java.lang.String str26 = fakeRequest23.toString();
//        com.jcabi.http.Request request28 = fakeRequest23.method("GET");
//        com.jcabi.http.request.FakeRequest fakeRequest31 = fakeRequest23.withHeader("HTTP/1.1 hi! hi! (null)\n\n\000d", "OPTIONS");
//        com.jcabi.http.request.FakeRequest fakeRequest34 = fakeRequest23.withHeader("DELETE", "huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.request.FakeRequest fakeRequest36 = fakeRequest34.withStatus((int) 'a');
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest23);
//        org.junit.Assert.assertNotNull(fakeRequest25);
//        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>" + "'", str26, "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        org.junit.Assert.assertNotNull(request28);
//        org.junit.Assert.assertNotNull(fakeRequest31);
//        org.junit.Assert.assertNotNull(fakeRequest34);
//        org.junit.Assert.assertNotNull(fakeRequest36);
//    }
//
//    @Test
//    public void test157() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test157");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.BaseRequest baseRequest2 = new com.jcabi.http.request.BaseRequest(wire0, "huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        boolean boolean4 = baseRequest2.equals((java.lang.Object) "huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.RequestURI requestURI5 = baseRequest2.uri();
//        java.lang.String str6 = baseRequest2.toString();
//        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
//        org.junit.Assert.assertNotNull(requestURI5);
//        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HTTP/1.1 GET huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK (null)\n\n<<empty>>" + "'", str6, "HTTP/1.1 GET huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK (null)\n\n<<empty>>");
//    }
//
//    @Test
//    public void test158() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test158");
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        com.jcabi.http.Wire wire13 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest15 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList18 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse25 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest15, (-1), "OPTIONS", strEntryList18, byteArray24);
//        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest32 = new com.jcabi.http.request.BaseRequest(wire13, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList18, "hi!", byteArray29, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder33 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray29);
//        com.jcabi.http.request.FakeRequest fakeRequest34 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, byteArray29);
//        com.jcabi.http.request.FakeRequest fakeRequest37 = fakeRequest34.withHeader("HTTP/1.1 hi! hi! (null)\n\n\000d", "OPTIONS");
//        com.jcabi.http.request.FakeRequest fakeRequest39 = fakeRequest37.withBody("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.request.FakeRequest fakeRequest41 = fakeRequest39.withBody("HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray24);
//        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray29);
//        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest37);
//        org.junit.Assert.assertNotNull(fakeRequest39);
//        org.junit.Assert.assertNotNull(fakeRequest41);
//    }
//
//    @Test
//    public void test159() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test159");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder0 = new com.jcabi.http.request.MultipartBodyBuilder();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder1 = new com.jcabi.http.request.MultipartBodyBuilder();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray13 = defaultResponse12.binary();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder14 = multipartBodyBuilder1.append(byteArray13);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder15 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray16 = multipartBodyBuilder15.asBytes();
//        byte[] byteArray17 = multipartBodyBuilder15.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest20 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList23 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse30 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest20, (-1), "OPTIONS", strEntryList23, byteArray29);
//        com.jcabi.http.Wire wire31 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest33 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList36 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray42 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse43 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest33, (-1), "OPTIONS", strEntryList36, byteArray42);
//        byte[] byteArray47 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest50 = new com.jcabi.http.request.BaseRequest(wire31, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList36, "hi!", byteArray47, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder51 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray47);
//        com.jcabi.http.request.FakeRequest fakeRequest52 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList23, byteArray47);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder53 = multipartBodyBuilder15.appendLine(byteArray47);
//        byte[] byteArray58 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder59 = multipartBodyBuilder53.appendLine(byteArray58);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder60 = multipartBodyBuilder14.append(byteArray58);
//        com.jcabi.http.request.FakeRequest fakeRequest61 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList64 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray70 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse71 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest61, (-1), "OPTIONS", strEntryList64, byteArray70);
//        byte[] byteArray72 = defaultResponse71.binary();
//        com.jcabi.http.Request request73 = defaultResponse71.back();
//        byte[] byteArray74 = defaultResponse71.binary();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder75 = multipartBodyBuilder60.appendLine(byteArray74);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder76 = multipartBodyBuilder0.appendLine(byteArray74);
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray13);
//        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder14);
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray17);
//        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray29);
//        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray42);
//        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray47);
//        org.junit.Assert.assertArrayEquals(byteArray47, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder53);
//        org.junit.Assert.assertNotNull(byteArray58);
//        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder59);
//        org.junit.Assert.assertNotNull(multipartBodyBuilder60);
//        org.junit.Assert.assertNotNull(byteArray70);
//        org.junit.Assert.assertArrayEquals(byteArray70, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray72);
//        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request73);
//        org.junit.Assert.assertNotNull(byteArray74);
//        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder75);
//        org.junit.Assert.assertNotNull(multipartBodyBuilder76);
//    }
//
//    @Test
//    public void test160() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test160");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        byte[] byteArray11 = defaultResponse10.binary();
//        com.jcabi.http.Request request12 = defaultResponse10.back();
//        java.lang.String str13 = defaultResponse10.body();
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = defaultResponse10.headers();
//        com.jcabi.http.Request request15 = defaultResponse10.back();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request12);
//        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "d\001\nd\n" + "'", str13, "d\001\nd\n");
//        org.junit.Assert.assertNotNull(strMap14);
//        org.junit.Assert.assertNotNull(request15);
//    }
//
//    @Test
//    public void test161() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test161");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Wire wire4 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest6 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse16 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest6, (-1), "OPTIONS", strEntryList9, byteArray15);
//        byte[] byteArray20 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest23 = new com.jcabi.http.request.BaseRequest(wire4, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList9, "hi!", byteArray20, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder25 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray26 = multipartBodyBuilder25.asBytes();
//        byte[] byteArray27 = multipartBodyBuilder25.asBytes();
//        com.jcabi.http.request.BaseRequest baseRequest28 = new com.jcabi.http.request.BaseRequest(wire2, "huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList9, "", byteArray27);
//        byte[] byteArray30 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.request.BaseRequest baseRequest33 = new com.jcabi.http.request.BaseRequest(wire0, "", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList9, "HTTP/1.1 GET huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK (null)\n\n<<empty>>", byteArray30, (int) (byte) 100, 0);
//            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.ClassNotFoundException: Provider for jakarta.ws.rs.ext.RuntimeDelegate cannot be found");
//        } catch (java.lang.RuntimeException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray15);
//        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray20);
//        org.junit.Assert.assertArrayEquals(byteArray20, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray26);
//        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray27);
//        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] {});
//    }
//
//    @Test
//    public void test162() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test162");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestBody requestBody4 = jdkRequest1.multipartBody();
//        java.lang.String str5 = jdkRequest1.toString();
//        com.jcabi.http.Request request7 = jdkRequest1.reset("HTTP/1.1 hi! hi! (null)\n\n\000d");
//        com.jcabi.http.Request request9 = jdkRequest1.method("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.RequestURI requestURI10 = jdkRequest1.uri();
//        com.jcabi.http.Request request12 = jdkRequest1.method("OPTIONS");
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestBody4);
//        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str5, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(request7);
//        org.junit.Assert.assertNotNull(request9);
//        org.junit.Assert.assertNotNull(requestURI10);
//        org.junit.Assert.assertNotNull(request12);
//    }
//
//    @Test
//    public void test163() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test163");
//        com.jcabi.http.request.Boundary boundary0 = new com.jcabi.http.request.Boundary();
//        java.lang.String str1 = boundary0.value();
//        java.lang.String str2 = boundary0.value();
//        java.lang.String str3 = boundary0.value();
//        java.lang.String str4 = boundary0.value();
//// flaky "1) test163(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "D2ULhscQyi9AJh6-9xHCDnkCFq1NRt" + "'", str1, "D2ULhscQyi9AJh6-9xHCDnkCFq1NRt");
//// flaky "1) test163(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "JKopmTzMi01l5gXy_tyc6r27e1uayHxltt" + "'", str2, "JKopmTzMi01l5gXy_tyc6r27e1uayHxltt");
//// flaky "1) test163(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "NW9xf4o37uDL2gUz43Z-RqlN1ks1jJu_" + "'", str3, "NW9xf4o37uDL2gUz43Z-RqlN1ks1jJu_");
//// flaky "1) test163(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "t84W4qoNDorMExJV4lZvjMFktdW1IYD7cbD_Qj2" + "'", str4, "t84W4qoNDorMExJV4lZvjMFktdW1IYD7cbD_Qj2");
//    }
//
//    @Test
//    public void test164() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test164");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.Request request5 = fakeRequest0.timeout((int) (byte) -1, (int) (short) 1);
//        java.lang.String str6 = fakeRequest0.toString();
//        com.jcabi.http.RequestBody requestBody7 = fakeRequest0.body();
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(request5);
//        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>" + "'", str6, "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        org.junit.Assert.assertNotNull(requestBody7);
//    }
//
//    @Test
//    public void test165() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test165");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest23 = fakeRequest2.withBody(byteArray19);
//        com.jcabi.http.RequestBody requestBody24 = fakeRequest2.multipartBody();
//        com.jcabi.http.Request request27 = fakeRequest2.timeout((int) (byte) 100, (int) 'a');
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest23);
//        org.junit.Assert.assertNotNull(requestBody24);
//        org.junit.Assert.assertNotNull(request27);
//    }
//
//    @Test
//    public void test166() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test166");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.request.FakeRequest fakeRequest4 = fakeRequest0.withReason("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.request.FakeRequest fakeRequest6 = fakeRequest0.withStatus((int) (short) 100);
//        java.io.InputStream inputStream7 = null;
//        com.jcabi.http.Response response8 = fakeRequest0.fetch(inputStream7);
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(fakeRequest4);
//        org.junit.Assert.assertNotNull(fakeRequest6);
//        org.junit.Assert.assertNotNull(response8);
//    }
//
//    @Test
//    public void test167() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test167");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest23 = fakeRequest2.withBody(byteArray19);
//        com.jcabi.http.request.FakeRequest fakeRequest25 = fakeRequest23.withBody("hi!");
//        java.lang.String str26 = fakeRequest23.toString();
//        com.jcabi.http.Request request28 = fakeRequest23.method("GET");
//        com.jcabi.http.request.FakeRequest fakeRequest31 = fakeRequest23.withHeader("HTTP/1.1 hi! hi! (null)\n\n\000d", "OPTIONS");
//        com.jcabi.http.Wire wire32 = null;
//        com.jcabi.http.Request request33 = fakeRequest31.through(wire32);
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest23);
//        org.junit.Assert.assertNotNull(fakeRequest25);
//        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>" + "'", str26, "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        org.junit.Assert.assertNotNull(request28);
//        org.junit.Assert.assertNotNull(fakeRequest31);
//        org.junit.Assert.assertNotNull(request33);
//    }
//
//    @Test
//    public void test168() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test168");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest23 = fakeRequest2.withBody(byteArray19);
//        com.jcabi.http.Wire wire24 = null;
//        com.jcabi.http.Request request25 = fakeRequest2.through(wire24);
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest23);
//        org.junit.Assert.assertNotNull(request25);
//    }
//
//    @Test
//    public void test169() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test169");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request21 = baseRequest19.method("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.Wire wire22 = null;
//        com.jcabi.http.Request request23 = baseRequest19.through(wire22);
//        com.jcabi.http.RequestURI requestURI24 = baseRequest19.uri();
//        com.jcabi.http.RequestBody requestBody25 = baseRequest19.body();
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request21);
//        org.junit.Assert.assertNotNull(request23);
//        org.junit.Assert.assertNotNull(requestURI24);
//        org.junit.Assert.assertNotNull(requestBody25);
//    }
//
//    @Test
//    public void test170() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test170");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        java.io.InputStream inputStream3 = null;
//        com.jcabi.http.Response response4 = fakeRequest0.fetch(inputStream3);
//        com.jcabi.http.request.FakeRequest fakeRequest6 = fakeRequest0.withStatus(100);
//        com.jcabi.http.Wire wire9 = null;
//        com.jcabi.http.Wire wire11 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest13 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse23 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest13, (-1), "OPTIONS", strEntryList16, byteArray22);
//        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest30 = new com.jcabi.http.request.BaseRequest(wire11, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList16, "hi!", byteArray27, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder32 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray33 = multipartBodyBuilder32.asBytes();
//        byte[] byteArray34 = multipartBodyBuilder32.asBytes();
//        com.jcabi.http.request.BaseRequest baseRequest35 = new com.jcabi.http.request.BaseRequest(wire9, "huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList16, "", byteArray34);
//        byte[] byteArray42 = new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 0 };
//        com.jcabi.http.request.DefaultResponse defaultResponse43 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest6, (int) (byte) 100, "", strEntryList16, byteArray42);
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(response4);
//        org.junit.Assert.assertNotNull(fakeRequest6);
//        org.junit.Assert.assertNotNull(byteArray22);
//        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray27);
//        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray33);
//        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray34);
//        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray42);
//        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] { (byte) 10, (byte) 100, (byte) -1, (byte) 0, (byte) 100, (byte) 0 });
//    }
//
//    @Test
//    public void test171() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test171");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.reason();
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = defaultResponse10.headers();
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = defaultResponse10.headers();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OPTIONS" + "'", str11, "OPTIONS");
//        org.junit.Assert.assertNotNull(strMap12);
//        org.junit.Assert.assertNotNull(strMap13);
//    }
//
//    @Test
//    public void test172() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test172");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        byte[] byteArray11 = defaultResponse10.binary();
//        java.lang.String str12 = defaultResponse10.body();
//        java.lang.String str13 = defaultResponse10.toString();
//        int int14 = defaultResponse10.status();
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap15 = defaultResponse10.headers();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d\001\nd\n" + "'", str12, "d\001\nd\n");
//        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n" + "'", str13, "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n");
//        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
//        org.junit.Assert.assertNotNull(strMap15);
//    }
//
//    @Test
//    public void test173() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test173");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.request.FakeRequest fakeRequest15 = fakeRequest0.withStatus((int) (byte) -1);
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(fakeRequest15);
//    }
//
//    @Test
//    public void test174() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test174");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        java.lang.String str3 = fakeRequest2.toString();
//        com.jcabi.http.Wire wire4 = null;
//        com.jcabi.http.Request request5 = fakeRequest2.through(wire4);
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>" + "'", str3, "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        org.junit.Assert.assertNotNull(request5);
//    }
//
//    @Test
//    public void test175() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test175");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.BaseRequest baseRequest2 = new com.jcabi.http.request.BaseRequest(wire0, "huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response3 = baseRequest2.fetch();
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//            // Expected exception.
//        }
//    }
//
//    @Test
//    public void test176() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test176");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.request.JdkRequest jdkRequest25 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request27 = jdkRequest25.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.Request request28 = baseRequest19.header("9UjAhLEd1uzegZSctHUhLVKa0jxnirx", (java.lang.Object) jdkRequest25);
//        java.lang.String str29 = jdkRequest25.toString();
//        com.jcabi.http.Request request31 = jdkRequest25.method("hi!");
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(request27);
//        org.junit.Assert.assertNotNull(request28);
//        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str29, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(request31);
//    }
//
//    @Test
//    public void test177() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test177");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request21 = baseRequest19.method("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.Request request23 = baseRequest19.method("GET");
//        com.jcabi.http.Request request25 = baseRequest19.method("HTTP/1.1 hi! hi! (null)\n\n\000d");
//        com.jcabi.http.RequestBody requestBody26 = baseRequest19.multipartBody();
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request21);
//        org.junit.Assert.assertNotNull(request23);
//        org.junit.Assert.assertNotNull(request25);
//        org.junit.Assert.assertNotNull(requestBody26);
//    }
//
//    @Test
//    public void test178() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test178");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestBody requestBody4 = jdkRequest1.multipartBody();
//        com.jcabi.http.Request request7 = jdkRequest1.timeout((int) (short) -1, (int) 'a');
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestBody4);
//        org.junit.Assert.assertNotNull(request7);
//    }
//
//    @Test
//    public void test179() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test179");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        java.lang.String str20 = baseRequest19.toString();
//        com.jcabi.http.RequestURI requestURI21 = baseRequest19.uri();
//        com.jcabi.http.request.JdkRequest jdkRequest23 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire24 = null;
//        com.jcabi.http.Request request25 = jdkRequest23.through(wire24);
//        boolean boolean26 = baseRequest19.equals((java.lang.Object) request25);
//        com.jcabi.http.RequestBody requestBody27 = baseRequest19.body();
//        com.jcabi.http.RequestURI requestURI28 = baseRequest19.uri();
//        com.jcabi.http.RequestBody requestBody29 = baseRequest19.multipartBody();
//        com.jcabi.http.Request request31 = baseRequest19.reset("HTTP/1.1 PUT OPTIONS (null)\n\n<<empty>>");
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str20, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//        org.junit.Assert.assertNotNull(requestURI21);
//        org.junit.Assert.assertNotNull(request25);
//        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
//        org.junit.Assert.assertNotNull(requestBody27);
//        org.junit.Assert.assertNotNull(requestURI28);
//        org.junit.Assert.assertNotNull(requestBody29);
//        org.junit.Assert.assertNotNull(request31);
//    }
//
//    @Test
//    public void test180() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test180");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestURI requestURI4 = jdkRequest1.uri();
//        com.jcabi.http.request.FakeRequest fakeRequest6 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse16 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest6, (-1), "OPTIONS", strEntryList9, byteArray15);
//        com.jcabi.http.Request request19 = fakeRequest6.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request21 = fakeRequest6.method("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.Request request22 = jdkRequest1.header("HTTP/1.1 hi! hi! (null)\n\n\000d", (java.lang.Object) "vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.Wire wire24 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest26 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire27 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest46 = new com.jcabi.http.request.BaseRequest(wire27, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, "hi!", byteArray43, 0, 100);
//        boolean boolean47 = fakeRequest26.equals((java.lang.Object) strEntryList32);
//        com.jcabi.http.request.FakeRequest fakeRequest53 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList56 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray62 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse63 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest53, (-1), "OPTIONS", strEntryList56, byteArray62);
//        com.jcabi.http.Wire wire64 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest66 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList69 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray75 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse76 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest66, (-1), "OPTIONS", strEntryList69, byteArray75);
//        byte[] byteArray80 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest83 = new com.jcabi.http.request.BaseRequest(wire64, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList69, "hi!", byteArray80, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder84 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray80);
//        com.jcabi.http.request.FakeRequest fakeRequest85 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList56, byteArray80);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder86 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray87 = multipartBodyBuilder86.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest88 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList56, byteArray87);
//        com.jcabi.http.request.BaseRequest baseRequest89 = new com.jcabi.http.request.BaseRequest(wire24, "OPTIONS", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, "PUT", byteArray87);
//        com.jcabi.http.Request request90 = jdkRequest1.header("0IllljFfduTj_3ljBBP8zIH6tn-WbXBXIneoG", (java.lang.Object) "PUT");
//        com.jcabi.http.Request request92 = jdkRequest1.reset("HTTP/1.1 GET huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK (null)\n\n<<empty>>");
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestURI4);
//        org.junit.Assert.assertNotNull(byteArray15);
//        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request19);
//        org.junit.Assert.assertNotNull(request21);
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray43);
//        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
//        org.junit.Assert.assertNotNull(byteArray62);
//        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray75);
//        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray80);
//        org.junit.Assert.assertArrayEquals(byteArray80, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray87);
//        org.junit.Assert.assertArrayEquals(byteArray87, new byte[] {});
//        org.junit.Assert.assertNotNull(request90);
//        org.junit.Assert.assertNotNull(request92);
//    }
//
//    @Test
//    public void test181() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test181");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestBody requestBody4 = jdkRequest1.multipartBody();
//        com.jcabi.http.RequestBody requestBody5 = jdkRequest1.multipartBody();
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestBody4);
//        org.junit.Assert.assertNotNull(requestBody5);
//    }
//
//    @Test
//    public void test182() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test182");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestURI requestURI4 = jdkRequest1.uri();
//        com.jcabi.http.RequestURI requestURI5 = jdkRequest1.uri();
//        com.jcabi.http.Request request8 = jdkRequest1.timeout((int) (byte) 100, 0);
//        com.jcabi.http.RequestBody requestBody9 = jdkRequest1.multipartBody();
//        com.jcabi.http.Request request11 = jdkRequest1.reset("d\001\nd\n");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder13 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray14 = multipartBodyBuilder13.asBytes();
//        byte[] byteArray15 = multipartBodyBuilder13.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest18 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList21 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse28 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest18, (-1), "OPTIONS", strEntryList21, byteArray27);
//        com.jcabi.http.Wire wire29 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest31 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList34 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray40 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse41 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest31, (-1), "OPTIONS", strEntryList34, byteArray40);
//        byte[] byteArray45 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest48 = new com.jcabi.http.request.BaseRequest(wire29, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList34, "hi!", byteArray45, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder49 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray45);
//        com.jcabi.http.request.FakeRequest fakeRequest50 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList21, byteArray45);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder51 = multipartBodyBuilder13.appendLine(byteArray45);
//        byte[] byteArray56 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder57 = multipartBodyBuilder51.appendLine(byteArray56);
//        com.jcabi.http.Wire wire58 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest60 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList63 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray69 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse70 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest60, (-1), "OPTIONS", strEntryList63, byteArray69);
//        byte[] byteArray74 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest77 = new com.jcabi.http.request.BaseRequest(wire58, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList63, "hi!", byteArray74, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder78 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray74);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder79 = multipartBodyBuilder51.append(byteArray74);
//        com.jcabi.http.Request request80 = jdkRequest1.header("DELETE", (java.lang.Object) multipartBodyBuilder51);
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestURI4);
//        org.junit.Assert.assertNotNull(requestURI5);
//        org.junit.Assert.assertNotNull(request8);
//        org.junit.Assert.assertNotNull(requestBody9);
//        org.junit.Assert.assertNotNull(request11);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray15);
//        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray27);
//        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray40);
//        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray45);
//        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder51);
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder57);
//        org.junit.Assert.assertNotNull(byteArray69);
//        org.junit.Assert.assertArrayEquals(byteArray69, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray74);
//        org.junit.Assert.assertArrayEquals(byteArray74, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder79);
//        org.junit.Assert.assertNotNull(request80);
//    }
//
//    @Test
//    public void test183() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test183");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.method("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.request.FakeRequest fakeRequest18 = fakeRequest0.withHeader("9U090yzM2PXs6aJeMMc1MJDiLebGjalZTTMp", "");
//        com.jcabi.http.request.FakeRequest fakeRequest20 = fakeRequest18.withStatus((int) ' ');
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(fakeRequest18);
//        org.junit.Assert.assertNotNull(fakeRequest20);
//    }
//
//    @Test
//    public void test184() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test184");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.reset("PATCH");
//        com.jcabi.http.request.FakeRequest fakeRequest17 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire18 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest20 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList23 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse30 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest20, (-1), "OPTIONS", strEntryList23, byteArray29);
//        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest37 = new com.jcabi.http.request.BaseRequest(wire18, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList23, "hi!", byteArray34, 0, 100);
//        boolean boolean38 = fakeRequest17.equals((java.lang.Object) strEntryList23);
//        com.jcabi.http.Request request39 = fakeRequest0.header("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk", (java.lang.Object) fakeRequest17);
//        com.jcabi.http.request.FakeRequest fakeRequest41 = fakeRequest0.withReason("JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        com.jcabi.http.Request request44 = fakeRequest41.timeout(1, (int) (byte) -1);
//        com.jcabi.http.request.FakeRequest fakeRequest47 = fakeRequest41.withHeader("HTTP/1.1 hi! hi! (null)\n\n\000d", "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n");
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(byteArray29);
//        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray34);
//        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
//        org.junit.Assert.assertNotNull(request39);
//        org.junit.Assert.assertNotNull(fakeRequest41);
//        org.junit.Assert.assertNotNull(request44);
//        org.junit.Assert.assertNotNull(fakeRequest47);
//    }
//
//    @Test
//    public void test185() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test185");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder0 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray1 = multipartBodyBuilder0.asBytes();
//        byte[] byteArray2 = multipartBodyBuilder0.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        com.jcabi.http.Wire wire16 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest18 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList21 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse28 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest18, (-1), "OPTIONS", strEntryList21, byteArray27);
//        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest35 = new com.jcabi.http.request.BaseRequest(wire16, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList21, "hi!", byteArray32, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder36 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray32);
//        com.jcabi.http.request.FakeRequest fakeRequest37 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, byteArray32);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder38 = multipartBodyBuilder0.appendLine(byteArray32);
//        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder44 = multipartBodyBuilder38.appendLine(byteArray43);
//        java.lang.Class<?> wildcardClass45 = multipartBodyBuilder44.getClass();
//        org.junit.Assert.assertNotNull(byteArray1);
//        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray2);
//        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray27);
//        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray32);
//        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder38);
//        org.junit.Assert.assertNotNull(byteArray43);
//        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder44);
//        org.junit.Assert.assertNotNull(wildcardClass45);
//    }
//
//    @Test
//    public void test186() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test186");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request3 = jdkRequest1.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.request.FakeRequest fakeRequest10 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse20 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest10, (-1), "OPTIONS", strEntryList13, byteArray19);
//        com.jcabi.http.Wire wire21 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest23 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList26 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse33 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest23, (-1), "OPTIONS", strEntryList26, byteArray32);
//        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest40 = new com.jcabi.http.request.BaseRequest(wire21, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList26, "hi!", byteArray37, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder41 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray37);
//        com.jcabi.http.request.FakeRequest fakeRequest42 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList13, byteArray37);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder43 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray44 = multipartBodyBuilder43.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest45 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList13, byteArray44);
//        com.jcabi.http.request.FakeRequest fakeRequest48 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList51 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray57 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse58 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest48, (-1), "OPTIONS", strEntryList51, byteArray57);
//        com.jcabi.http.request.FakeRequest fakeRequest59 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList62 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray68 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse69 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest59, (-1), "OPTIONS", strEntryList62, byteArray68);
//        com.jcabi.http.request.FakeRequest fakeRequest70 = new com.jcabi.http.request.FakeRequest(0, "V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList51, byteArray68);
//        com.jcabi.http.request.DefaultResponse defaultResponse71 = new com.jcabi.http.request.DefaultResponse(request3, (int) (short) 0, "d\001\nd\n", strEntryList13, byteArray68);
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap72 = defaultResponse71.headers();
//        java.lang.String str73 = defaultResponse71.reason();
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray32);
//        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray37);
//        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray44);
//        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray57);
//        org.junit.Assert.assertArrayEquals(byteArray57, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray68);
//        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(strMap72);
//        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "d\001\nd\n" + "'", str73, "d\001\nd\n");
//    }
//
//    @Test
//    public void test187() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test187");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.method("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.request.FakeRequest fakeRequest18 = fakeRequest0.withHeader("9U090yzM2PXs6aJeMMc1MJDiLebGjalZTTMp", "");
//        com.jcabi.http.request.FakeRequest fakeRequest20 = fakeRequest0.withReason("OPTIONS");
//        com.jcabi.http.request.JdkRequest jdkRequest22 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request24 = jdkRequest22.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.request.FakeRequest fakeRequest26 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList29 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray35 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse36 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest26, (-1), "OPTIONS", strEntryList29, byteArray35);
//        com.jcabi.http.Request request37 = jdkRequest22.header("-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n", (java.lang.Object) byteArray35);
//        com.jcabi.http.request.FakeRequest fakeRequest38 = fakeRequest20.withBody(byteArray35);
//        java.io.InputStream inputStream39 = null;
//        com.jcabi.http.Response response40 = fakeRequest20.fetch(inputStream39);
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(fakeRequest18);
//        org.junit.Assert.assertNotNull(fakeRequest20);
//        org.junit.Assert.assertNotNull(request24);
//        org.junit.Assert.assertNotNull(byteArray35);
//        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request37);
//        org.junit.Assert.assertNotNull(fakeRequest38);
//        org.junit.Assert.assertNotNull(response40);
//    }
//
//    @Test
//    public void test188() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test188");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        java.lang.String str3 = fakeRequest2.toString();
//        com.jcabi.http.Request request5 = fakeRequest2.reset("9UjAhLEd1uzegZSctHUhLVKa0jxnirx");
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>" + "'", str3, "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        org.junit.Assert.assertNotNull(request5);
//    }
//
//    @Test
//    public void test189() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test189");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        java.lang.String str20 = baseRequest19.toString();
//        com.jcabi.http.RequestURI requestURI21 = baseRequest19.uri();
//        com.jcabi.http.request.JdkRequest jdkRequest23 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire24 = null;
//        com.jcabi.http.Request request25 = jdkRequest23.through(wire24);
//        boolean boolean26 = baseRequest19.equals((java.lang.Object) request25);
//        com.jcabi.http.RequestBody requestBody27 = baseRequest19.body();
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        com.jcabi.http.Request request42 = fakeRequest29.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request44 = fakeRequest29.reset("PATCH");
//        com.jcabi.http.Request request45 = baseRequest19.header("0IllljFfduTj_3ljBBP8zIH6tn-WbXBXIneoG", (java.lang.Object) fakeRequest29);
//        com.jcabi.http.request.JdkRequest jdkRequest48 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire49 = null;
//        com.jcabi.http.Request request50 = jdkRequest48.through(wire49);
//        com.jcabi.http.RequestBody requestBody51 = jdkRequest48.multipartBody();
//        java.lang.String str52 = jdkRequest48.toString();
//        com.jcabi.http.request.FakeRequest fakeRequest54 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList57 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray63 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse64 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest54, (-1), "OPTIONS", strEntryList57, byteArray63);
//        java.lang.String str65 = defaultResponse64.body();
//        com.jcabi.http.Request request66 = jdkRequest48.header("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK", (java.lang.Object) defaultResponse64);
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Request request67 = baseRequest19.header("", (java.lang.Object) defaultResponse64);
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
//        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str20, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//        org.junit.Assert.assertNotNull(requestURI21);
//        org.junit.Assert.assertNotNull(request25);
//        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
//        org.junit.Assert.assertNotNull(requestBody27);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request42);
//        org.junit.Assert.assertNotNull(request44);
//        org.junit.Assert.assertNotNull(request45);
//        org.junit.Assert.assertNotNull(request50);
//        org.junit.Assert.assertNotNull(requestBody51);
//        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str52, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(byteArray63);
//        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "d\001\nd\n" + "'", str65, "d\001\nd\n");
//        org.junit.Assert.assertNotNull(request66);
//    }
//
//    @Test
//    public void test190() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test190");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request3 = jdkRequest1.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        com.jcabi.http.Request request16 = jdkRequest1.header("-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n", (java.lang.Object) byteArray14);
//        com.jcabi.http.Request request19 = jdkRequest1.timeout((int) (short) 1, (int) 'a');
//        com.jcabi.http.Request request22 = jdkRequest1.timeout((int) (byte) 10, (int) 'a');
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request16);
//        org.junit.Assert.assertNotNull(request19);
//        org.junit.Assert.assertNotNull(request22);
//    }
//
//    @Test
//    public void test191() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test191");
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        com.jcabi.http.Wire wire13 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest15 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList18 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray24 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse25 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest15, (-1), "OPTIONS", strEntryList18, byteArray24);
//        byte[] byteArray29 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest32 = new com.jcabi.http.request.BaseRequest(wire13, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList18, "hi!", byteArray29, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder33 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray29);
//        com.jcabi.http.request.FakeRequest fakeRequest34 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, byteArray29);
//        com.jcabi.http.request.FakeRequest fakeRequest37 = fakeRequest34.withHeader("HTTP/1.1 hi! hi! (null)\n\n\000d", "OPTIONS");
//        java.lang.String str38 = fakeRequest34.toString();
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray24);
//        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray29);
//        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest37);
//        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>" + "'", str38, "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//    }
//
//    @Test
//    public void test192() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test192");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest23 = fakeRequest2.withBody(byteArray19);
//        com.jcabi.http.RequestBody requestBody24 = fakeRequest2.multipartBody();
//        com.jcabi.http.request.FakeRequest fakeRequest26 = fakeRequest2.withStatus((int) (byte) 0);
//        java.lang.String str27 = fakeRequest2.toString();
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest23);
//        org.junit.Assert.assertNotNull(requestBody24);
//        org.junit.Assert.assertNotNull(fakeRequest26);
//        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>" + "'", str27, "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//    }
//
//    @Test
//    public void test193() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test193");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        java.io.InputStream inputStream3 = null;
//        com.jcabi.http.Response response4 = fakeRequest0.fetch(inputStream3);
//        com.jcabi.http.request.FakeRequest fakeRequest6 = fakeRequest0.withBody("");
//        com.jcabi.http.Request request8 = fakeRequest0.reset("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder9 = new com.jcabi.http.request.MultipartBodyBuilder();
//        com.jcabi.http.request.FakeRequest fakeRequest10 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse20 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest10, (-1), "OPTIONS", strEntryList13, byteArray19);
//        byte[] byteArray21 = defaultResponse20.binary();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder22 = multipartBodyBuilder9.append(byteArray21);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder23 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray24 = multipartBodyBuilder23.asBytes();
//        byte[] byteArray25 = multipartBodyBuilder23.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest28 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList31 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray37 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse38 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest28, (-1), "OPTIONS", strEntryList31, byteArray37);
//        com.jcabi.http.Wire wire39 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest41 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList44 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray50 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse51 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest41, (-1), "OPTIONS", strEntryList44, byteArray50);
//        byte[] byteArray55 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest58 = new com.jcabi.http.request.BaseRequest(wire39, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList44, "hi!", byteArray55, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder59 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray55);
//        com.jcabi.http.request.FakeRequest fakeRequest60 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList31, byteArray55);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder61 = multipartBodyBuilder23.appendLine(byteArray55);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder62 = multipartBodyBuilder9.appendLine(byteArray55);
//        com.jcabi.http.request.FakeRequest fakeRequest63 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList66 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray72 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse73 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest63, (-1), "OPTIONS", strEntryList66, byteArray72);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder74 = multipartBodyBuilder62.append(byteArray72);
//        com.jcabi.http.request.FakeRequest fakeRequest75 = fakeRequest0.withBody(byteArray72);
//        com.jcabi.http.Wire wire76 = null;
//        com.jcabi.http.Request request77 = fakeRequest0.through(wire76);
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(response4);
//        org.junit.Assert.assertNotNull(fakeRequest6);
//        org.junit.Assert.assertNotNull(request8);
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray21);
//        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder22);
//        org.junit.Assert.assertNotNull(byteArray24);
//        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray25);
//        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray37);
//        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray50);
//        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray55);
//        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder61);
//        org.junit.Assert.assertNotNull(multipartBodyBuilder62);
//        org.junit.Assert.assertNotNull(byteArray72);
//        org.junit.Assert.assertArrayEquals(byteArray72, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder74);
//        org.junit.Assert.assertNotNull(fakeRequest75);
//        org.junit.Assert.assertNotNull(request77);
//    }
//
//    @Test
//    public void test194() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test194");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((int) (byte) -1, (int) (short) 10);
//        com.jcabi.http.request.FakeRequest fakeRequest16 = fakeRequest0.withHeader("POST", "DELETE");
//        com.jcabi.http.RequestBody requestBody17 = fakeRequest16.multipartBody();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(fakeRequest16);
//        org.junit.Assert.assertNotNull(requestBody17);
//    }
//
//    @Test
//    public void test195() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test195");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.body();
//        java.lang.String str12 = defaultResponse10.body();
//        java.lang.String str13 = defaultResponse10.reason();
//        int int14 = defaultResponse10.status();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d\001\nd\n" + "'", str11, "d\001\nd\n");
//        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d\001\nd\n" + "'", str12, "d\001\nd\n");
//        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OPTIONS" + "'", str13, "OPTIONS");
//        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
//    }
//
//    @Test
//    public void test196() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test196");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request21 = baseRequest19.method("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.Wire wire22 = null;
//        com.jcabi.http.Request request23 = baseRequest19.through(wire22);
//        com.jcabi.http.RequestBody requestBody24 = baseRequest19.multipartBody();
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response25 = baseRequest19.fetch();
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request21);
//        org.junit.Assert.assertNotNull(request23);
//        org.junit.Assert.assertNotNull(requestBody24);
//    }
//
//    @Test
//    public void test197() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test197");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestURI requestURI4 = jdkRequest1.uri();
//        com.jcabi.http.Request request7 = jdkRequest1.timeout((int) (short) -1, 10);
//        com.jcabi.http.Request request9 = jdkRequest1.reset("d\001\nd\n");
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response10 = jdkRequest1.fetch();
//            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: 'OPTIONS' is incorrect");
//        } catch (java.io.IOException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestURI4);
//        org.junit.Assert.assertNotNull(request7);
//        org.junit.Assert.assertNotNull(request9);
//    }
//
//    @Test
//    public void test198() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test198");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.reset("PATCH");
//        java.io.InputStream inputStream16 = null;
//        com.jcabi.http.Response response17 = fakeRequest0.fetch(inputStream16);
//        com.jcabi.http.request.FakeRequest fakeRequest20 = fakeRequest0.withHeader("d\001\nd\n", "PUT");
//        com.jcabi.http.RequestBody requestBody21 = fakeRequest20.body();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(response17);
//        org.junit.Assert.assertNotNull(fakeRequest20);
//        org.junit.Assert.assertNotNull(requestBody21);
//    }
//
//    @Test
//    public void test199() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test199");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        java.lang.String str3 = fakeRequest2.toString();
//        java.lang.String str4 = fakeRequest2.toString();
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>" + "'", str3, "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>" + "'", str4, "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//    }
//
//    @Test
//    public void test200() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test200");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder0 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray1 = multipartBodyBuilder0.asBytes();
//        byte[] byteArray2 = multipartBodyBuilder0.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        com.jcabi.http.Wire wire16 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest18 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList21 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse28 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest18, (-1), "OPTIONS", strEntryList21, byteArray27);
//        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest35 = new com.jcabi.http.request.BaseRequest(wire16, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList21, "hi!", byteArray32, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder36 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray32);
//        com.jcabi.http.request.FakeRequest fakeRequest37 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, byteArray32);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder38 = multipartBodyBuilder0.appendLine(byteArray32);
//        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder44 = multipartBodyBuilder38.appendLine(byteArray43);
//        com.jcabi.http.Wire wire45 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest47 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList50 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray56 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse57 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest47, (-1), "OPTIONS", strEntryList50, byteArray56);
//        byte[] byteArray61 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest64 = new com.jcabi.http.request.BaseRequest(wire45, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList50, "hi!", byteArray61, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder65 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray61);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder66 = multipartBodyBuilder38.append(byteArray61);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder67 = new com.jcabi.http.request.MultipartBodyBuilder();
//        com.jcabi.http.request.FakeRequest fakeRequest68 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList71 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray77 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse78 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest68, (-1), "OPTIONS", strEntryList71, byteArray77);
//        byte[] byteArray79 = defaultResponse78.binary();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder80 = multipartBodyBuilder67.append(byteArray79);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder81 = multipartBodyBuilder38.append(byteArray79);
//        byte[] byteArray82 = multipartBodyBuilder81.asBytes();
//        org.junit.Assert.assertNotNull(byteArray1);
//        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray2);
//        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray27);
//        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray32);
//        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder38);
//        org.junit.Assert.assertNotNull(byteArray43);
//        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder44);
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray61);
//        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder66);
//        org.junit.Assert.assertNotNull(byteArray77);
//        org.junit.Assert.assertArrayEquals(byteArray77, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray79);
//        org.junit.Assert.assertArrayEquals(byteArray79, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder80);
//        org.junit.Assert.assertNotNull(multipartBodyBuilder81);
//        org.junit.Assert.assertNotNull(byteArray82);
//        org.junit.Assert.assertArrayEquals(byteArray82, new byte[] { (byte) 0, (byte) 100, (byte) 13, (byte) 10, (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//    }
//
//    @Test
//    public void test201() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test201");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        boolean boolean23 = fakeRequest2.equals((java.lang.Object) strEntryList8);
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        com.jcabi.http.Wire wire40 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest42 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList45 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse52 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest42, (-1), "OPTIONS", strEntryList45, byteArray51);
//        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest59 = new com.jcabi.http.request.BaseRequest(wire40, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList45, "hi!", byteArray56, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder60 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray56);
//        com.jcabi.http.request.FakeRequest fakeRequest61 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray56);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder62 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray63 = multipartBodyBuilder62.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest64 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray63);
//        com.jcabi.http.request.BaseRequest baseRequest65 = new com.jcabi.http.request.BaseRequest(wire0, "OPTIONS", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "PUT", byteArray63);
//        com.jcabi.http.Wire wire66 = null;
//        com.jcabi.http.Request request67 = baseRequest65.through(wire66);
//        com.jcabi.http.RequestBody requestBody68 = baseRequest65.body();
//        com.jcabi.http.request.JdkRequest jdkRequest70 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire71 = null;
//        com.jcabi.http.Request request72 = jdkRequest70.through(wire71);
//        com.jcabi.http.RequestURI requestURI73 = jdkRequest70.uri();
//        com.jcabi.http.RequestURI requestURI74 = jdkRequest70.uri();
//        com.jcabi.http.Request request77 = jdkRequest70.timeout((int) (byte) 100, 0);
//        boolean boolean78 = baseRequest65.equals((java.lang.Object) jdkRequest70);
//        java.io.InputStream inputStream79 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response80 = baseRequest65.fetch(inputStream79);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray51);
//        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray63);
//        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
//        org.junit.Assert.assertNotNull(request67);
//        org.junit.Assert.assertNotNull(requestBody68);
//        org.junit.Assert.assertNotNull(request72);
//        org.junit.Assert.assertNotNull(requestURI73);
//        org.junit.Assert.assertNotNull(requestURI74);
//        org.junit.Assert.assertNotNull(request77);
//        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
//    }
//
//    @Test
//    public void test202() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test202");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        boolean boolean23 = fakeRequest2.equals((java.lang.Object) strEntryList8);
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        com.jcabi.http.Wire wire40 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest42 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList45 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse52 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest42, (-1), "OPTIONS", strEntryList45, byteArray51);
//        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest59 = new com.jcabi.http.request.BaseRequest(wire40, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList45, "hi!", byteArray56, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder60 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray56);
//        com.jcabi.http.request.FakeRequest fakeRequest61 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray56);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder62 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray63 = multipartBodyBuilder62.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest64 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray63);
//        com.jcabi.http.request.BaseRequest baseRequest65 = new com.jcabi.http.request.BaseRequest(wire0, "OPTIONS", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "PUT", byteArray63);
//        com.jcabi.http.Wire wire66 = null;
//        com.jcabi.http.Request request67 = baseRequest65.through(wire66);
//        com.jcabi.http.RequestBody requestBody68 = baseRequest65.body();
//        com.jcabi.http.RequestBody requestBody69 = baseRequest65.body();
//        java.io.InputStream inputStream70 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response71 = baseRequest65.fetch(inputStream70);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray51);
//        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray63);
//        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
//        org.junit.Assert.assertNotNull(request67);
//        org.junit.Assert.assertNotNull(requestBody68);
//        org.junit.Assert.assertNotNull(requestBody69);
//    }
//
//    @Test
//    public void test203() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test203");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestURI requestURI4 = jdkRequest1.uri();
//        com.jcabi.http.RequestURI requestURI5 = jdkRequest1.uri();
//        com.jcabi.http.Wire wire6 = null;
//        com.jcabi.http.Request request7 = jdkRequest1.through(wire6);
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestURI4);
//        org.junit.Assert.assertNotNull(requestURI5);
//        org.junit.Assert.assertNotNull(request7);
//    }
//
//    @Test
//    public void test204() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test204");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        java.lang.String str20 = baseRequest19.toString();
//        com.jcabi.http.Request request23 = baseRequest19.timeout(0, (int) 'a');
//        com.jcabi.http.Request request26 = baseRequest19.timeout((int) ' ', (int) (short) -1);
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str20, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//        org.junit.Assert.assertNotNull(request23);
//        org.junit.Assert.assertNotNull(request26);
//    }
//
//    @Test
//    public void test205() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test205");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.reset("PATCH");
//        com.jcabi.http.request.FakeRequest fakeRequest17 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire18 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest20 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList23 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse30 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest20, (-1), "OPTIONS", strEntryList23, byteArray29);
//        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest37 = new com.jcabi.http.request.BaseRequest(wire18, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList23, "hi!", byteArray34, 0, 100);
//        boolean boolean38 = fakeRequest17.equals((java.lang.Object) strEntryList23);
//        com.jcabi.http.Request request39 = fakeRequest0.header("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk", (java.lang.Object) fakeRequest17);
//        com.jcabi.http.request.FakeRequest fakeRequest41 = fakeRequest0.withReason("JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        com.jcabi.http.Wire wire42 = null;
//        com.jcabi.http.Request request43 = fakeRequest41.through(wire42);
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(byteArray29);
//        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray34);
//        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
//        org.junit.Assert.assertNotNull(request39);
//        org.junit.Assert.assertNotNull(fakeRequest41);
//        org.junit.Assert.assertNotNull(request43);
//    }
//
//    @Test
//    public void test206() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test206");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.body();
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = defaultResponse10.headers();
//        int int13 = defaultResponse10.status();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d\001\nd\n" + "'", str11, "d\001\nd\n");
//        org.junit.Assert.assertNotNull(strMap12);
//        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
//    }
//
//    @Test
//    public void test207() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test207");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.reason();
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = defaultResponse10.headers();
//        com.jcabi.http.Request request13 = defaultResponse10.back();
//        java.lang.String str14 = defaultResponse10.toString();
//        byte[] byteArray15 = defaultResponse10.binary();
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap16 = defaultResponse10.headers();
//        int int17 = defaultResponse10.status();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OPTIONS" + "'", str11, "OPTIONS");
//        org.junit.Assert.assertNotNull(strMap12);
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n" + "'", str14, "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n");
//        org.junit.Assert.assertNotNull(byteArray15);
//        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(strMap16);
//        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
//    }
//
//    @Test
//    public void test208() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test208");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.body();
//        java.lang.String str12 = defaultResponse10.body();
//        java.lang.String str13 = defaultResponse10.reason();
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap14 = defaultResponse10.headers();
//        java.lang.String str15 = defaultResponse10.body();
//        java.lang.String str16 = defaultResponse10.reason();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d\001\nd\n" + "'", str11, "d\001\nd\n");
//        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d\001\nd\n" + "'", str12, "d\001\nd\n");
//        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OPTIONS" + "'", str13, "OPTIONS");
//        org.junit.Assert.assertNotNull(strMap14);
//        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "d\001\nd\n" + "'", str15, "d\001\nd\n");
//        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OPTIONS" + "'", str16, "OPTIONS");
//    }
//
//    @Test
//    public void test209() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test209");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        boolean boolean23 = fakeRequest2.equals((java.lang.Object) strEntryList8);
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        com.jcabi.http.Wire wire40 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest42 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList45 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse52 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest42, (-1), "OPTIONS", strEntryList45, byteArray51);
//        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest59 = new com.jcabi.http.request.BaseRequest(wire40, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList45, "hi!", byteArray56, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder60 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray56);
//        com.jcabi.http.request.FakeRequest fakeRequest61 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray56);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder62 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray63 = multipartBodyBuilder62.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest64 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray63);
//        com.jcabi.http.request.BaseRequest baseRequest65 = new com.jcabi.http.request.BaseRequest(wire0, "OPTIONS", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "PUT", byteArray63);
//        com.jcabi.http.Wire wire66 = null;
//        com.jcabi.http.Request request67 = baseRequest65.through(wire66);
//        com.jcabi.http.RequestBody requestBody68 = baseRequest65.body();
//        com.jcabi.http.Request request70 = baseRequest65.reset("HEAD");
//        com.jcabi.http.Request request72 = baseRequest65.reset("HTTP/1.1 hi! hi! (null)\n\n\000d");
//        com.jcabi.http.Request request75 = baseRequest65.timeout((int) '#', (int) (short) 1);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray51);
//        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray63);
//        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
//        org.junit.Assert.assertNotNull(request67);
//        org.junit.Assert.assertNotNull(requestBody68);
//        org.junit.Assert.assertNotNull(request70);
//        org.junit.Assert.assertNotNull(request72);
//        org.junit.Assert.assertNotNull(request75);
//    }
//
//    @Test
//    public void test210() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test210");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        java.io.InputStream inputStream3 = null;
//        com.jcabi.http.Response response4 = fakeRequest0.fetch(inputStream3);
//        com.jcabi.http.request.FakeRequest fakeRequest6 = fakeRequest0.withBody("");
//        com.jcabi.http.Request request8 = fakeRequest0.reset("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.Request request10 = fakeRequest0.method("9U090yzM2PXs6aJeMMc1MJDiLebGjalZTTMp");
//        com.jcabi.http.Wire wire12 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest14 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire15 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest17 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList20 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray26 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse27 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest17, (-1), "OPTIONS", strEntryList20, byteArray26);
//        byte[] byteArray31 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest34 = new com.jcabi.http.request.BaseRequest(wire15, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList20, "hi!", byteArray31, 0, 100);
//        boolean boolean35 = fakeRequest14.equals((java.lang.Object) strEntryList20);
//        com.jcabi.http.request.FakeRequest fakeRequest41 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList44 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray50 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse51 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest41, (-1), "OPTIONS", strEntryList44, byteArray50);
//        com.jcabi.http.Wire wire52 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest54 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList57 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray63 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse64 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest54, (-1), "OPTIONS", strEntryList57, byteArray63);
//        byte[] byteArray68 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest71 = new com.jcabi.http.request.BaseRequest(wire52, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList57, "hi!", byteArray68, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder72 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray68);
//        com.jcabi.http.request.FakeRequest fakeRequest73 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList44, byteArray68);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder74 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray75 = multipartBodyBuilder74.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest76 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList44, byteArray75);
//        com.jcabi.http.request.BaseRequest baseRequest77 = new com.jcabi.http.request.BaseRequest(wire12, "OPTIONS", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList20, "PUT", byteArray75);
//        com.jcabi.http.RequestBody requestBody78 = baseRequest77.multipartBody();
//        com.jcabi.http.Request request79 = fakeRequest0.header("0IllljFfduTj_3ljBBP8zIH6tn-WbXBXIneoG", (java.lang.Object) baseRequest77);
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(response4);
//        org.junit.Assert.assertNotNull(fakeRequest6);
//        org.junit.Assert.assertNotNull(request8);
//        org.junit.Assert.assertNotNull(request10);
//        org.junit.Assert.assertNotNull(byteArray26);
//        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray31);
//        org.junit.Assert.assertArrayEquals(byteArray31, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
//        org.junit.Assert.assertNotNull(byteArray50);
//        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray63);
//        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray68);
//        org.junit.Assert.assertArrayEquals(byteArray68, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray75);
//        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
//        org.junit.Assert.assertNotNull(requestBody78);
//        org.junit.Assert.assertNotNull(request79);
//    }
//
//    @Test
//    public void test211() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test211");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.Request request24 = baseRequest19.reset("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder25 = new com.jcabi.http.request.MultipartBodyBuilder();
//        com.jcabi.http.request.FakeRequest fakeRequest26 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList29 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray35 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse36 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest26, (-1), "OPTIONS", strEntryList29, byteArray35);
//        byte[] byteArray37 = defaultResponse36.binary();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder38 = multipartBodyBuilder25.append(byteArray37);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder39 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray40 = multipartBodyBuilder39.asBytes();
//        byte[] byteArray41 = multipartBodyBuilder39.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest44 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList47 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray53 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse54 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest44, (-1), "OPTIONS", strEntryList47, byteArray53);
//        com.jcabi.http.Wire wire55 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest57 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList60 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray66 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse67 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest57, (-1), "OPTIONS", strEntryList60, byteArray66);
//        byte[] byteArray71 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest74 = new com.jcabi.http.request.BaseRequest(wire55, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList60, "hi!", byteArray71, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder75 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray71);
//        com.jcabi.http.request.FakeRequest fakeRequest76 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList47, byteArray71);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder77 = multipartBodyBuilder39.appendLine(byteArray71);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder78 = multipartBodyBuilder25.appendLine(byteArray71);
//        com.jcabi.http.request.FakeRequest fakeRequest79 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList82 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray88 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse89 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest79, (-1), "OPTIONS", strEntryList82, byteArray88);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder90 = multipartBodyBuilder78.append(byteArray88);
//        boolean boolean91 = baseRequest19.equals((java.lang.Object) multipartBodyBuilder78);
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(request24);
//        org.junit.Assert.assertNotNull(byteArray35);
//        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray37);
//        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder38);
//        org.junit.Assert.assertNotNull(byteArray40);
//        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray41);
//        org.junit.Assert.assertArrayEquals(byteArray41, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray53);
//        org.junit.Assert.assertArrayEquals(byteArray53, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray66);
//        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray71);
//        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder77);
//        org.junit.Assert.assertNotNull(multipartBodyBuilder78);
//        org.junit.Assert.assertNotNull(byteArray88);
//        org.junit.Assert.assertArrayEquals(byteArray88, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder90);
//        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
//    }
//
//    @Test
//    public void test212() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test212");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder0 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray1 = multipartBodyBuilder0.asBytes();
//        byte[] byteArray2 = multipartBodyBuilder0.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        com.jcabi.http.Wire wire16 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest18 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList21 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray27 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse28 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest18, (-1), "OPTIONS", strEntryList21, byteArray27);
//        byte[] byteArray32 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest35 = new com.jcabi.http.request.BaseRequest(wire16, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList21, "hi!", byteArray32, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder36 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray32);
//        com.jcabi.http.request.FakeRequest fakeRequest37 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, byteArray32);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder38 = multipartBodyBuilder0.appendLine(byteArray32);
//        byte[] byteArray43 = new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 };
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder44 = multipartBodyBuilder38.appendLine(byteArray43);
//        com.jcabi.http.Wire wire45 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest47 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList50 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray56 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse57 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest47, (-1), "OPTIONS", strEntryList50, byteArray56);
//        byte[] byteArray61 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest64 = new com.jcabi.http.request.BaseRequest(wire45, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList50, "hi!", byteArray61, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder65 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray61);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder66 = multipartBodyBuilder38.append(byteArray61);
//        byte[] byteArray67 = multipartBodyBuilder66.asBytes();
//        org.junit.Assert.assertNotNull(byteArray1);
//        org.junit.Assert.assertArrayEquals(byteArray1, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray2);
//        org.junit.Assert.assertArrayEquals(byteArray2, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray27);
//        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray32);
//        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder38);
//        org.junit.Assert.assertNotNull(byteArray43);
//        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 10, (byte) 100, (byte) 0, (byte) 0 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder44);
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray61);
//        org.junit.Assert.assertArrayEquals(byteArray61, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder66);
//        org.junit.Assert.assertNotNull(byteArray67);
//        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 0, (byte) 100, (byte) 13, (byte) 10, (byte) 0, (byte) 100 });
//    }
//
//    @Test
//    public void test213() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test213");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        byte[] byteArray11 = defaultResponse10.binary();
//        com.jcabi.http.Request request12 = defaultResponse10.back();
//        java.lang.String str13 = defaultResponse10.body();
//        com.jcabi.http.Wire wire14 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest16 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList19 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray25 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse26 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest16, (-1), "OPTIONS", strEntryList19, byteArray25);
//        byte[] byteArray30 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest33 = new com.jcabi.http.request.BaseRequest(wire14, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList19, "hi!", byteArray30, 0, 100);
//        java.lang.String str34 = baseRequest33.toString();
//        com.jcabi.http.RequestURI requestURI35 = baseRequest33.uri();
//        com.jcabi.http.request.JdkRequest jdkRequest37 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire38 = null;
//        com.jcabi.http.Request request39 = jdkRequest37.through(wire38);
//        boolean boolean40 = baseRequest33.equals((java.lang.Object) request39);
//        com.jcabi.http.RequestBody requestBody41 = baseRequest33.body();
//        com.jcabi.http.RequestURI requestURI42 = baseRequest33.uri();
//        com.jcabi.http.Request request44 = baseRequest33.method("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.Request request46 = baseRequest33.reset("GET");
//        boolean boolean47 = defaultResponse10.equals((java.lang.Object) request46);
//        byte[] byteArray48 = defaultResponse10.binary();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request12);
//        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "d\001\nd\n" + "'", str13, "d\001\nd\n");
//        org.junit.Assert.assertNotNull(byteArray25);
//        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray30);
//        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str34, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//        org.junit.Assert.assertNotNull(requestURI35);
//        org.junit.Assert.assertNotNull(request39);
//        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
//        org.junit.Assert.assertNotNull(requestBody41);
//        org.junit.Assert.assertNotNull(requestURI42);
//        org.junit.Assert.assertNotNull(request44);
//        org.junit.Assert.assertNotNull(request46);
//        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
//        org.junit.Assert.assertNotNull(byteArray48);
//        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//    }
//
//    @Test
//    public void test214() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test214");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        boolean boolean23 = fakeRequest2.equals((java.lang.Object) strEntryList8);
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        com.jcabi.http.Wire wire40 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest42 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList45 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse52 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest42, (-1), "OPTIONS", strEntryList45, byteArray51);
//        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest59 = new com.jcabi.http.request.BaseRequest(wire40, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList45, "hi!", byteArray56, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder60 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray56);
//        com.jcabi.http.request.FakeRequest fakeRequest61 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray56);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder62 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray63 = multipartBodyBuilder62.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest64 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray63);
//        com.jcabi.http.request.BaseRequest baseRequest65 = new com.jcabi.http.request.BaseRequest(wire0, "OPTIONS", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "PUT", byteArray63);
//        com.jcabi.http.Wire wire66 = null;
//        com.jcabi.http.Request request67 = baseRequest65.through(wire66);
//        com.jcabi.http.Request request69 = baseRequest65.reset("POST");
//        com.jcabi.http.RequestBody requestBody70 = baseRequest65.multipartBody();
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray51);
//        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray63);
//        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
//        org.junit.Assert.assertNotNull(request67);
//        org.junit.Assert.assertNotNull(request69);
//        org.junit.Assert.assertNotNull(requestBody70);
//    }
//
//    @Test
//    public void test215() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test215");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestURI requestURI4 = jdkRequest1.uri();
//        com.jcabi.http.Request request7 = jdkRequest1.timeout((int) (short) -1, 10);
//        com.jcabi.http.Request request9 = jdkRequest1.reset("d\001\nd\n");
//        com.jcabi.http.RequestBody requestBody10 = jdkRequest1.multipartBody();
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestURI4);
//        org.junit.Assert.assertNotNull(request7);
//        org.junit.Assert.assertNotNull(request9);
//        org.junit.Assert.assertNotNull(requestBody10);
//    }
//
//    @Test
//    public void test216() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test216");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.request.FakeRequest fakeRequest4 = fakeRequest0.withReason("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.request.FakeRequest fakeRequest7 = fakeRequest0.withHeader("", "GET");
//            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
//        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(fakeRequest4);
//    }
//
//    @Test
//    public void test217() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test217");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.reason();
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = defaultResponse10.headers();
//        com.jcabi.http.Request request13 = defaultResponse10.back();
//        java.lang.String str14 = defaultResponse10.toString();
//        int int15 = defaultResponse10.status();
//        com.jcabi.http.Request request16 = defaultResponse10.back();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OPTIONS" + "'", str11, "OPTIONS");
//        org.junit.Assert.assertNotNull(strMap12);
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n" + "'", str14, "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n");
//        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
//        org.junit.Assert.assertNotNull(request16);
//    }
//
//    @Test
//    public void test218() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test218");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestBody requestBody4 = jdkRequest1.multipartBody();
//        java.lang.String str5 = jdkRequest1.toString();
//        com.jcabi.http.Request request7 = jdkRequest1.reset("HTTP/1.1 hi! hi! (null)\n\n\000d");
//        com.jcabi.http.Request request9 = jdkRequest1.method("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.Request request11 = jdkRequest1.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestBody4);
//        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str5, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(request7);
//        org.junit.Assert.assertNotNull(request9);
//        org.junit.Assert.assertNotNull(request11);
//    }
//
//    @Test
//    public void test219() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test219");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire1 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest3 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList6 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse13 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest3, (-1), "OPTIONS", strEntryList6, byteArray12);
//        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest20 = new com.jcabi.http.request.BaseRequest(wire1, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList6, "hi!", byteArray17, 0, 100);
//        boolean boolean21 = fakeRequest0.equals((java.lang.Object) strEntryList6);
//        com.jcabi.http.request.FakeRequest fakeRequest23 = fakeRequest0.withBody("d\001\nd\n");
//        org.junit.Assert.assertNotNull(byteArray12);
//        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray17);
//        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
//        org.junit.Assert.assertNotNull(fakeRequest23);
//    }
//
//    @Test
//    public void test220() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test220");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request3 = jdkRequest1.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.Wire wire4 = null;
//        com.jcabi.http.Request request5 = jdkRequest1.through(wire4);
//        com.jcabi.http.RequestURI requestURI6 = jdkRequest1.uri();
//        com.jcabi.http.Wire wire7 = null;
//        com.jcabi.http.Request request8 = jdkRequest1.through(wire7);
//        com.jcabi.http.RequestURI requestURI9 = jdkRequest1.uri();
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(request5);
//        org.junit.Assert.assertNotNull(requestURI6);
//        org.junit.Assert.assertNotNull(request8);
//        org.junit.Assert.assertNotNull(requestURI9);
//    }
//
//    @Test
//    public void test221() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test221");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestBody requestBody4 = jdkRequest1.multipartBody();
//        java.lang.String str5 = jdkRequest1.toString();
//        com.jcabi.http.Wire wire6 = null;
//        com.jcabi.http.Request request7 = jdkRequest1.through(wire6);
//        com.jcabi.http.Wire wire8 = null;
//        com.jcabi.http.Request request9 = jdkRequest1.through(wire8);
//        com.jcabi.http.request.FakeRequest fakeRequest10 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire11 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest13 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray22 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse23 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest13, (-1), "OPTIONS", strEntryList16, byteArray22);
//        byte[] byteArray27 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest30 = new com.jcabi.http.request.BaseRequest(wire11, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList16, "hi!", byteArray27, 0, 100);
//        boolean boolean31 = fakeRequest10.equals((java.lang.Object) strEntryList16);
//        com.jcabi.http.RequestBody requestBody32 = fakeRequest10.multipartBody();
//        com.jcabi.http.RequestURI requestURI33 = fakeRequest10.uri();
//        boolean boolean34 = jdkRequest1.equals((java.lang.Object) requestURI33);
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestBody4);
//        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str5, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(request7);
//        org.junit.Assert.assertNotNull(request9);
//        org.junit.Assert.assertNotNull(byteArray22);
//        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray27);
//        org.junit.Assert.assertArrayEquals(byteArray27, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
//        org.junit.Assert.assertNotNull(requestBody32);
//        org.junit.Assert.assertNotNull(requestURI33);
//        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
//    }
//
//    @Test
//    public void test222() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test222");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest23 = fakeRequest2.withBody(byteArray19);
//        com.jcabi.http.RequestBody requestBody24 = fakeRequest2.multipartBody();
//        com.jcabi.http.request.FakeRequest fakeRequest26 = fakeRequest2.withReason("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.Wire wire27 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest46 = new com.jcabi.http.request.BaseRequest(wire27, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, "hi!", byteArray43, 0, 100);
//        boolean boolean47 = fakeRequest2.equals((java.lang.Object) wire27);
//        java.lang.String str48 = fakeRequest2.toString();
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest23);
//        org.junit.Assert.assertNotNull(requestBody24);
//        org.junit.Assert.assertNotNull(fakeRequest26);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray43);
//        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
//        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>" + "'", str48, "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//    }
//
//    @Test
//    public void test223() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test223");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.request.JdkRequest jdkRequest25 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request27 = jdkRequest25.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.Request request28 = baseRequest19.header("9UjAhLEd1uzegZSctHUhLVKa0jxnirx", (java.lang.Object) jdkRequest25);
//        com.jcabi.http.Request request31 = jdkRequest25.header("9UjAhLEd1uzegZSctHUhLVKa0jxnirx", (java.lang.Object) (-1.0f));
//        java.io.InputStream inputStream32 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response33 = jdkRequest25.fetch(inputStream32);
//            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: 'OPTIONS' is incorrect");
//        } catch (java.io.IOException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(request27);
//        org.junit.Assert.assertNotNull(request28);
//        org.junit.Assert.assertNotNull(request31);
//    }
//
//    @Test
//    public void test224() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test224");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.reason();
//        java.lang.String str12 = defaultResponse10.body();
//        int int13 = defaultResponse10.status();
//        java.lang.String str14 = defaultResponse10.toString();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OPTIONS" + "'", str11, "OPTIONS");
//        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d\001\nd\n" + "'", str12, "d\001\nd\n");
//        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
//        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n" + "'", str14, "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n");
//    }
//
//    @Test
//    public void test225() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test225");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.reset("PATCH");
//        com.jcabi.http.request.FakeRequest fakeRequest17 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire18 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest20 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList23 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray29 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse30 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest20, (-1), "OPTIONS", strEntryList23, byteArray29);
//        byte[] byteArray34 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest37 = new com.jcabi.http.request.BaseRequest(wire18, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList23, "hi!", byteArray34, 0, 100);
//        boolean boolean38 = fakeRequest17.equals((java.lang.Object) strEntryList23);
//        com.jcabi.http.Request request39 = fakeRequest0.header("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk", (java.lang.Object) fakeRequest17);
//        com.jcabi.http.request.FakeRequest fakeRequest41 = fakeRequest0.withReason("JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        com.jcabi.http.Request request43 = fakeRequest0.method("HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        com.jcabi.http.request.FakeRequest fakeRequest45 = fakeRequest0.withReason("9U090yzM2PXs6aJeMMc1MJDiLebGjalZTTMp");
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(byteArray29);
//        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray34);
//        org.junit.Assert.assertArrayEquals(byteArray34, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
//        org.junit.Assert.assertNotNull(request39);
//        org.junit.Assert.assertNotNull(fakeRequest41);
//        org.junit.Assert.assertNotNull(request43);
//        org.junit.Assert.assertNotNull(fakeRequest45);
//    }
//
//    @Test
//    public void test226() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test226");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList7 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray13 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse14 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest4, (-1), "OPTIONS", strEntryList7, byteArray13);
//        byte[] byteArray18 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest21 = new com.jcabi.http.request.BaseRequest(wire2, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList7, "hi!", byteArray18, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder23 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray24 = multipartBodyBuilder23.asBytes();
//        byte[] byteArray25 = multipartBodyBuilder23.asBytes();
//        com.jcabi.http.request.BaseRequest baseRequest26 = new com.jcabi.http.request.BaseRequest(wire0, "huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList7, "", byteArray25);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder27 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray25);
//        org.junit.Assert.assertNotNull(byteArray13);
//        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray18);
//        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray24);
//        org.junit.Assert.assertArrayEquals(byteArray24, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray25);
//        org.junit.Assert.assertArrayEquals(byteArray25, new byte[] {});
//    }
//
//    @Test
//    public void test227() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test227");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request21 = baseRequest19.method("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.Wire wire22 = null;
//        com.jcabi.http.Request request23 = baseRequest19.through(wire22);
//        com.jcabi.http.request.FakeRequest fakeRequest24 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest26 = fakeRequest24.withReason("");
//        com.jcabi.http.Wire wire27 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        byte[] byteArray43 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest46 = new com.jcabi.http.request.BaseRequest(wire27, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, "hi!", byteArray43, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest47 = fakeRequest26.withBody(byteArray43);
//        com.jcabi.http.RequestBody requestBody48 = fakeRequest26.multipartBody();
//        com.jcabi.http.request.FakeRequest fakeRequest50 = fakeRequest26.withReason("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.Wire wire51 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest53 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList56 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray62 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse63 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest53, (-1), "OPTIONS", strEntryList56, byteArray62);
//        byte[] byteArray67 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest70 = new com.jcabi.http.request.BaseRequest(wire51, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList56, "hi!", byteArray67, 0, 100);
//        boolean boolean71 = fakeRequest26.equals((java.lang.Object) wire51);
//        boolean boolean72 = baseRequest19.equals((java.lang.Object) wire51);
//        com.jcabi.http.Request request75 = baseRequest19.timeout((int) ' ', (-1));
//        com.jcabi.http.Request request77 = baseRequest19.reset("PATCH");
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request21);
//        org.junit.Assert.assertNotNull(request23);
//        org.junit.Assert.assertNotNull(fakeRequest26);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray43);
//        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest47);
//        org.junit.Assert.assertNotNull(requestBody48);
//        org.junit.Assert.assertNotNull(fakeRequest50);
//        org.junit.Assert.assertNotNull(byteArray62);
//        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray67);
//        org.junit.Assert.assertArrayEquals(byteArray67, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
//        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
//        org.junit.Assert.assertNotNull(request75);
//        org.junit.Assert.assertNotNull(request77);
//    }
//
//    @Test
//    public void test228() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test228");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        boolean boolean23 = fakeRequest2.equals((java.lang.Object) strEntryList8);
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        com.jcabi.http.Wire wire40 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest42 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList45 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse52 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest42, (-1), "OPTIONS", strEntryList45, byteArray51);
//        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest59 = new com.jcabi.http.request.BaseRequest(wire40, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList45, "hi!", byteArray56, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder60 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray56);
//        com.jcabi.http.request.FakeRequest fakeRequest61 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray56);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder62 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray63 = multipartBodyBuilder62.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest64 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray63);
//        com.jcabi.http.request.BaseRequest baseRequest65 = new com.jcabi.http.request.BaseRequest(wire0, "OPTIONS", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "PUT", byteArray63);
//        com.jcabi.http.Wire wire66 = null;
//        com.jcabi.http.Request request67 = baseRequest65.through(wire66);
//        com.jcabi.http.RequestBody requestBody68 = baseRequest65.body();
//        com.jcabi.http.RequestBody requestBody69 = baseRequest65.multipartBody();
//        java.lang.String str70 = baseRequest65.toString();
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray51);
//        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray63);
//        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
//        org.junit.Assert.assertNotNull(request67);
//        org.junit.Assert.assertNotNull(requestBody68);
//        org.junit.Assert.assertNotNull(requestBody69);
//        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "HTTP/1.1 PUT OPTIONS (null)\n\n<<empty>>" + "'", str70, "HTTP/1.1 PUT OPTIONS (null)\n\n<<empty>>");
//    }
//
//    @Test
//    public void test229() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test229");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.reason();
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = defaultResponse10.headers();
//        com.jcabi.http.Request request13 = defaultResponse10.back();
//        java.lang.String str14 = defaultResponse10.toString();
//        byte[] byteArray15 = defaultResponse10.binary();
//        java.lang.String str16 = defaultResponse10.toString();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OPTIONS" + "'", str11, "OPTIONS");
//        org.junit.Assert.assertNotNull(strMap12);
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n" + "'", str14, "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n");
//        org.junit.Assert.assertNotNull(byteArray15);
//        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n" + "'", str16, "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n");
//    }
//
//    @Test
//    public void test230() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test230");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.Request request25 = baseRequest19.header("d\001\nd\n", (java.lang.Object) 'a');
//        com.jcabi.http.Request request27 = baseRequest19.reset("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.RequestBody requestBody28 = baseRequest19.body();
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(request25);
//        org.junit.Assert.assertNotNull(request27);
//        org.junit.Assert.assertNotNull(requestBody28);
//    }
//
//    @Test
//    public void test231() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test231");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request3 = jdkRequest1.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.Request request5 = jdkRequest1.method("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.Wire wire6 = null;
//        com.jcabi.http.Request request7 = jdkRequest1.through(wire6);
//        com.jcabi.http.RequestBody requestBody8 = jdkRequest1.body();
//        com.jcabi.http.Request request10 = jdkRequest1.method("PUT");
//        com.jcabi.http.RequestURI requestURI11 = jdkRequest1.uri();
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(request5);
//        org.junit.Assert.assertNotNull(request7);
//        org.junit.Assert.assertNotNull(requestBody8);
//        org.junit.Assert.assertNotNull(request10);
//        org.junit.Assert.assertNotNull(requestURI11);
//    }
//
//    @Test
//    public void test232() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test232");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        java.lang.String str20 = baseRequest19.toString();
//        com.jcabi.http.RequestURI requestURI21 = baseRequest19.uri();
//        com.jcabi.http.request.JdkRequest jdkRequest23 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire24 = null;
//        com.jcabi.http.Request request25 = jdkRequest23.through(wire24);
//        boolean boolean26 = baseRequest19.equals((java.lang.Object) request25);
//        com.jcabi.http.RequestBody requestBody27 = baseRequest19.body();
//        com.jcabi.http.RequestURI requestURI28 = baseRequest19.uri();
//        com.jcabi.http.RequestBody requestBody29 = baseRequest19.multipartBody();
//        com.jcabi.http.Request request32 = baseRequest19.timeout((int) 'a', 100);
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str20, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//        org.junit.Assert.assertNotNull(requestURI21);
//        org.junit.Assert.assertNotNull(request25);
//        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
//        org.junit.Assert.assertNotNull(requestBody27);
//        org.junit.Assert.assertNotNull(requestURI28);
//        org.junit.Assert.assertNotNull(requestBody29);
//        org.junit.Assert.assertNotNull(request32);
//    }
//
//    @Test
//    public void test233() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test233");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.BaseRequest baseRequest2 = new com.jcabi.http.request.BaseRequest(wire0, "D2ULhscQyi9AJh6-9xHCDnkCFq1NRt");
//    }
//
//    @Test
//    public void test234() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test234");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        java.io.InputStream inputStream3 = null;
//        com.jcabi.http.Response response4 = fakeRequest0.fetch(inputStream3);
//        com.jcabi.http.request.FakeRequest fakeRequest6 = fakeRequest0.withBody("");
//        com.jcabi.http.request.FakeRequest fakeRequest7 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest9 = fakeRequest7.withReason("");
//        com.jcabi.http.Wire wire10 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest12 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList15 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse22 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest12, (-1), "OPTIONS", strEntryList15, byteArray21);
//        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest29 = new com.jcabi.http.request.BaseRequest(wire10, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList15, "hi!", byteArray26, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest30 = fakeRequest9.withBody(byteArray26);
//        com.jcabi.http.RequestBody requestBody31 = fakeRequest9.multipartBody();
//        com.jcabi.http.request.FakeRequest fakeRequest33 = fakeRequest9.withReason("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.Wire wire34 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest36 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList39 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray45 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse46 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest36, (-1), "OPTIONS", strEntryList39, byteArray45);
//        byte[] byteArray50 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest53 = new com.jcabi.http.request.BaseRequest(wire34, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList39, "hi!", byteArray50, 0, 100);
//        boolean boolean54 = fakeRequest9.equals((java.lang.Object) wire34);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder55 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray56 = multipartBodyBuilder55.asBytes();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder57 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray56);
//        com.jcabi.http.request.FakeRequest fakeRequest58 = fakeRequest9.withBody(byteArray56);
//        com.jcabi.http.request.FakeRequest fakeRequest59 = fakeRequest0.withBody(byteArray56);
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(response4);
//        org.junit.Assert.assertNotNull(fakeRequest6);
//        org.junit.Assert.assertNotNull(fakeRequest9);
//        org.junit.Assert.assertNotNull(byteArray21);
//        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray26);
//        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest30);
//        org.junit.Assert.assertNotNull(requestBody31);
//        org.junit.Assert.assertNotNull(fakeRequest33);
//        org.junit.Assert.assertNotNull(byteArray45);
//        org.junit.Assert.assertArrayEquals(byteArray45, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray50);
//        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
//        org.junit.Assert.assertNotNull(fakeRequest58);
//        org.junit.Assert.assertNotNull(fakeRequest59);
//    }
//
//    @Test
//    public void test235() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test235");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request3 = jdkRequest1.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        com.jcabi.http.Request request16 = jdkRequest1.header("-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n", (java.lang.Object) byteArray14);
//        com.jcabi.http.Request request18 = jdkRequest1.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.RequestBody requestBody19 = jdkRequest1.multipartBody();
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request16);
//        org.junit.Assert.assertNotNull(request18);
//        org.junit.Assert.assertNotNull(requestBody19);
//    }
//
//    @Test
//    public void test236() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test236");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.body();
//        java.lang.String str12 = defaultResponse10.body();
//        java.lang.String str13 = defaultResponse10.reason();
//        java.lang.String str14 = defaultResponse10.reason();
//        java.lang.String str15 = defaultResponse10.body();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d\001\nd\n" + "'", str11, "d\001\nd\n");
//        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "d\001\nd\n" + "'", str12, "d\001\nd\n");
//        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OPTIONS" + "'", str13, "OPTIONS");
//        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OPTIONS" + "'", str14, "OPTIONS");
//        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "d\001\nd\n" + "'", str15, "d\001\nd\n");
//    }
//
//    @Test
//    public void test237() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test237");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestBody requestBody4 = jdkRequest1.multipartBody();
//        java.lang.String str5 = jdkRequest1.toString();
//        com.jcabi.http.request.FakeRequest fakeRequest7 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray16 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse17 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest7, (-1), "OPTIONS", strEntryList10, byteArray16);
//        java.lang.String str18 = defaultResponse17.body();
//        com.jcabi.http.Request request19 = jdkRequest1.header("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK", (java.lang.Object) defaultResponse17);
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response20 = jdkRequest1.fetch();
//            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: 'OPTIONS' is incorrect");
//        } catch (java.io.IOException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestBody4);
//        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str5, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "d\001\nd\n" + "'", str18, "d\001\nd\n");
//        org.junit.Assert.assertNotNull(request19);
//    }
//
//    @Test
//    public void test238() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test238");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request3 = jdkRequest1.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        java.lang.String str4 = jdkRequest1.toString();
//        com.jcabi.http.Request request7 = jdkRequest1.timeout((int) '#', (int) (byte) -1);
//        com.jcabi.http.Request request9 = jdkRequest1.method("GET");
//        com.jcabi.http.Request request11 = jdkRequest1.method("9UjAhLEd1uzegZSctHUhLVKa0jxnirx");
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str4, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(request7);
//        org.junit.Assert.assertNotNull(request9);
//        org.junit.Assert.assertNotNull(request11);
//    }
//
//    @Test
//    public void test239() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test239");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        com.jcabi.http.Request request22 = baseRequest19.timeout(0, (int) (short) 1);
//        com.jcabi.http.Request request24 = baseRequest19.reset("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.Request request26 = baseRequest19.method("huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK");
//        com.jcabi.http.RequestBody requestBody27 = baseRequest19.multipartBody();
//        java.io.InputStream inputStream28 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Response response29 = baseRequest19.fetch(inputStream28);
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Request Body is not empty, use fetch() instead");
//        } catch (java.lang.IllegalStateException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(request24);
//        org.junit.Assert.assertNotNull(request26);
//        org.junit.Assert.assertNotNull(requestBody27);
//    }
//
//    @Test
//    public void test240() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test240");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.body();
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = defaultResponse10.headers();
//        com.jcabi.http.Request request13 = defaultResponse10.back();
//        com.jcabi.http.request.JdkRequest jdkRequest15 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request17 = jdkRequest15.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        java.lang.String str18 = jdkRequest15.toString();
//        com.jcabi.http.Request request21 = jdkRequest15.timeout((int) '#', (int) (byte) -1);
//        com.jcabi.http.RequestBody requestBody22 = jdkRequest15.multipartBody();
//        boolean boolean23 = defaultResponse10.equals((java.lang.Object) jdkRequest15);
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d\001\nd\n" + "'", str11, "d\001\nd\n");
//        org.junit.Assert.assertNotNull(strMap12);
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request17);
//        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)" + "'", str18, "JdkRequest(base=HTTP/1.1 GET OPTIONS (null)\n\n<<empty>>)");
//        org.junit.Assert.assertNotNull(request21);
//        org.junit.Assert.assertNotNull(requestBody22);
//        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
//    }
//
//    @Test
//    public void test241() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test241");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        java.io.InputStream inputStream3 = null;
//        com.jcabi.http.Response response4 = fakeRequest0.fetch(inputStream3);
//        com.jcabi.http.RequestBody requestBody5 = fakeRequest0.body();
//        com.jcabi.http.Request request7 = fakeRequest0.reset("HEAD");
//        java.lang.String str8 = fakeRequest0.toString();
//        com.jcabi.http.Wire wire10 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest12 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList15 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray21 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse22 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest12, (-1), "OPTIONS", strEntryList15, byteArray21);
//        byte[] byteArray26 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest29 = new com.jcabi.http.request.BaseRequest(wire10, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList15, "hi!", byteArray26, 0, 100);
//        com.jcabi.http.Request request32 = baseRequest29.timeout(0, (int) (short) 1);
//        com.jcabi.http.RequestBody requestBody33 = baseRequest29.multipartBody();
//        com.jcabi.http.request.FakeRequest fakeRequest40 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList43 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray49 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse50 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest40, (-1), "OPTIONS", strEntryList43, byteArray49);
//        com.jcabi.http.request.FakeRequest fakeRequest51 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList54 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray60 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse61 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest51, (-1), "OPTIONS", strEntryList54, byteArray60);
//        com.jcabi.http.request.FakeRequest fakeRequest62 = new com.jcabi.http.request.FakeRequest(0, "V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList43, byteArray60);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder63 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray64 = multipartBodyBuilder63.asBytes();
//        byte[] byteArray65 = multipartBodyBuilder63.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest66 = new com.jcabi.http.request.FakeRequest(1, "vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList43, byteArray65);
//        com.jcabi.http.request.FakeRequest fakeRequest67 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList70 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray76 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse77 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest67, (-1), "OPTIONS", strEntryList70, byteArray76);
//        byte[] byteArray78 = defaultResponse77.binary();
//        java.lang.String str79 = defaultResponse77.body();
//        java.lang.String str80 = defaultResponse77.toString();
//        com.jcabi.http.request.FakeRequest fakeRequest81 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList84 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray90 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse91 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest81, (-1), "OPTIONS", strEntryList84, byteArray90);
//        java.lang.String str92 = defaultResponse91.body();
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap93 = defaultResponse91.headers();
//        com.jcabi.http.Request request94 = defaultResponse91.back();
//        boolean boolean95 = defaultResponse77.equals((java.lang.Object) defaultResponse91);
//        byte[] byteArray96 = defaultResponse91.binary();
//        com.jcabi.http.request.DefaultResponse defaultResponse97 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) baseRequest29, 0, "PUT", strEntryList43, byteArray96);
//        com.jcabi.http.Request request98 = fakeRequest0.header("JKopmTzMi01l5gXy_tyc6r27e1uayHxltt", (java.lang.Object) 0);
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(response4);
//        org.junit.Assert.assertNotNull(requestBody5);
//        org.junit.Assert.assertNotNull(request7);
//        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>" + "'", str8, "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        org.junit.Assert.assertNotNull(byteArray21);
//        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray26);
//        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request32);
//        org.junit.Assert.assertNotNull(requestBody33);
//        org.junit.Assert.assertNotNull(byteArray49);
//        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray60);
//        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray64);
//        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray65);
//        org.junit.Assert.assertArrayEquals(byteArray65, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray76);
//        org.junit.Assert.assertArrayEquals(byteArray76, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray78);
//        org.junit.Assert.assertArrayEquals(byteArray78, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "d\001\nd\n" + "'", str79, "d\001\nd\n");
//        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n" + "'", str80, "-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n");
//        org.junit.Assert.assertNotNull(byteArray90);
//        org.junit.Assert.assertArrayEquals(byteArray90, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "d\001\nd\n" + "'", str92, "d\001\nd\n");
//        org.junit.Assert.assertNotNull(strMap93);
//        org.junit.Assert.assertNotNull(request94);
//        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
//        org.junit.Assert.assertNotNull(byteArray96);
//        org.junit.Assert.assertArrayEquals(byteArray96, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request98);
//    }
//
//    @Test
//    public void test242() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test242");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire1 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest3 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList6 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray12 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse13 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest3, (-1), "OPTIONS", strEntryList6, byteArray12);
//        byte[] byteArray17 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest20 = new com.jcabi.http.request.BaseRequest(wire1, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList6, "hi!", byteArray17, 0, 100);
//        boolean boolean21 = fakeRequest0.equals((java.lang.Object) strEntryList6);
//        com.jcabi.http.RequestBody requestBody22 = fakeRequest0.multipartBody();
//        com.jcabi.http.RequestURI requestURI23 = fakeRequest0.uri();
//        com.jcabi.http.Wire wire24 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest26 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList29 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray35 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse36 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest26, (-1), "OPTIONS", strEntryList29, byteArray35);
//        byte[] byteArray40 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest43 = new com.jcabi.http.request.BaseRequest(wire24, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList29, "hi!", byteArray40, 0, 100);
//        com.jcabi.http.Request request46 = baseRequest43.timeout(0, (int) (short) 1);
//        com.jcabi.http.RequestBody requestBody47 = baseRequest43.multipartBody();
//        boolean boolean48 = fakeRequest0.equals((java.lang.Object) baseRequest43);
//        org.junit.Assert.assertNotNull(byteArray12);
//        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray17);
//        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
//        org.junit.Assert.assertNotNull(requestBody22);
//        org.junit.Assert.assertNotNull(requestURI23);
//        org.junit.Assert.assertNotNull(byteArray35);
//        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray40);
//        org.junit.Assert.assertArrayEquals(byteArray40, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request46);
//        org.junit.Assert.assertNotNull(requestBody47);
//        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
//    }
//
//    @Test
//    public void test243() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test243");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        java.lang.String str11 = defaultResponse10.body();
//        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap12 = defaultResponse10.headers();
//        java.lang.String str13 = defaultResponse10.body();
//        java.lang.String str14 = defaultResponse10.body();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "d\001\nd\n" + "'", str11, "d\001\nd\n");
//        org.junit.Assert.assertNotNull(strMap12);
//        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "d\001\nd\n" + "'", str13, "d\001\nd\n");
//        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "d\001\nd\n" + "'", str14, "d\001\nd\n");
//    }
//
//    @Test
//    public void test244() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test244");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.Request request5 = fakeRequest0.timeout((int) (byte) -1, (int) (short) 1);
//        com.jcabi.http.request.FakeRequest fakeRequest10 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray19 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse20 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest10, (-1), "OPTIONS", strEntryList13, byteArray19);
//        com.jcabi.http.Wire wire21 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest23 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList26 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray32 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse33 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest23, (-1), "OPTIONS", strEntryList26, byteArray32);
//        byte[] byteArray37 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest40 = new com.jcabi.http.request.BaseRequest(wire21, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList26, "hi!", byteArray37, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder41 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray37);
//        com.jcabi.http.request.FakeRequest fakeRequest42 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList13, byteArray37);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder43 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray44 = multipartBodyBuilder43.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest45 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList13, byteArray44);
//        com.jcabi.http.request.FakeRequest fakeRequest46 = fakeRequest0.withBody(byteArray44);
//        com.jcabi.http.request.FakeRequest fakeRequest49 = fakeRequest0.withHeader("HTTP/1.1 GET huEZy7gFmWQBz15HhfWZo6dN7XOp9m9gNK (null)\n\n<<empty>>", "");
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(request5);
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray32);
//        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray37);
//        org.junit.Assert.assertArrayEquals(byteArray37, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray44);
//        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
//        org.junit.Assert.assertNotNull(fakeRequest46);
//        org.junit.Assert.assertNotNull(fakeRequest49);
//    }
//
//    @Test
//    public void test245() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test245");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        boolean boolean23 = fakeRequest2.equals((java.lang.Object) strEntryList8);
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        com.jcabi.http.Wire wire40 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest42 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList45 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse52 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest42, (-1), "OPTIONS", strEntryList45, byteArray51);
//        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest59 = new com.jcabi.http.request.BaseRequest(wire40, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList45, "hi!", byteArray56, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder60 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray56);
//        com.jcabi.http.request.FakeRequest fakeRequest61 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray56);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder62 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray63 = multipartBodyBuilder62.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest64 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray63);
//        com.jcabi.http.request.BaseRequest baseRequest65 = new com.jcabi.http.request.BaseRequest(wire0, "OPTIONS", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "PUT", byteArray63);
//        com.jcabi.http.Wire wire66 = null;
//        com.jcabi.http.Request request67 = baseRequest65.through(wire66);
//        com.jcabi.http.RequestBody requestBody68 = baseRequest65.body();
//        com.jcabi.http.Wire wire70 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest72 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList75 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray81 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse82 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest72, (-1), "OPTIONS", strEntryList75, byteArray81);
//        byte[] byteArray86 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest89 = new com.jcabi.http.request.BaseRequest(wire70, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList75, "hi!", byteArray86, 0, 100);
//        com.jcabi.http.Request request92 = baseRequest89.timeout(0, (int) (short) 1);
//        com.jcabi.http.Request request94 = baseRequest89.reset("POST");
//        com.jcabi.http.Request request95 = baseRequest65.header("GET", (java.lang.Object) "POST");
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray51);
//        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray63);
//        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
//        org.junit.Assert.assertNotNull(request67);
//        org.junit.Assert.assertNotNull(requestBody68);
//        org.junit.Assert.assertNotNull(byteArray81);
//        org.junit.Assert.assertArrayEquals(byteArray81, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray86);
//        org.junit.Assert.assertArrayEquals(byteArray86, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(request92);
//        org.junit.Assert.assertNotNull(request94);
//        org.junit.Assert.assertNotNull(request95);
//    }
//
//    @Test
//    public void test246() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test246");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.method("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.request.FakeRequest fakeRequest18 = fakeRequest0.withHeader("9U090yzM2PXs6aJeMMc1MJDiLebGjalZTTMp", "");
//        com.jcabi.http.RequestBody requestBody19 = fakeRequest0.multipartBody();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(fakeRequest18);
//        org.junit.Assert.assertNotNull(requestBody19);
//    }
//
//    @Test
//    public void test247() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test247");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList3 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray9 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse10 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest0, (-1), "OPTIONS", strEntryList3, byteArray9);
//        com.jcabi.http.Request request13 = fakeRequest0.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request15 = fakeRequest0.reset("PATCH");
//        java.io.InputStream inputStream16 = null;
//        com.jcabi.http.Response response17 = fakeRequest0.fetch(inputStream16);
//        com.jcabi.http.request.FakeRequest fakeRequest20 = fakeRequest0.withHeader("d\001\nd\n", "PUT");
//        com.jcabi.http.RequestBody requestBody21 = fakeRequest20.multipartBody();
//        org.junit.Assert.assertNotNull(byteArray9);
//        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request13);
//        org.junit.Assert.assertNotNull(request15);
//        org.junit.Assert.assertNotNull(response17);
//        org.junit.Assert.assertNotNull(fakeRequest20);
//        org.junit.Assert.assertNotNull(requestBody21);
//    }
//
//    @Test
//    public void test248() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test248");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Wire wire2 = null;
//        com.jcabi.http.Request request3 = jdkRequest1.through(wire2);
//        com.jcabi.http.RequestURI requestURI4 = jdkRequest1.uri();
//        com.jcabi.http.request.FakeRequest fakeRequest6 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray15 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse16 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest6, (-1), "OPTIONS", strEntryList9, byteArray15);
//        com.jcabi.http.Request request19 = fakeRequest6.timeout((-1), (int) (byte) 10);
//        com.jcabi.http.Request request21 = fakeRequest6.method("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.Request request22 = jdkRequest1.header("HTTP/1.1 hi! hi! (null)\n\n\000d", (java.lang.Object) "vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.RequestURI requestURI23 = jdkRequest1.uri();
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(requestURI4);
//        org.junit.Assert.assertNotNull(byteArray15);
//        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request19);
//        org.junit.Assert.assertNotNull(request21);
//        org.junit.Assert.assertNotNull(request22);
//        org.junit.Assert.assertNotNull(requestURI23);
//    }
//
//    @Test
//    public void test249() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test249");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest23 = fakeRequest2.withBody(byteArray19);
//        com.jcabi.http.RequestBody requestBody24 = fakeRequest2.multipartBody();
//        com.jcabi.http.RequestBody requestBody25 = fakeRequest2.multipartBody();
//        com.jcabi.http.request.FakeRequest fakeRequest27 = fakeRequest2.withBody("-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n");
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest23);
//        org.junit.Assert.assertNotNull(requestBody24);
//        org.junit.Assert.assertNotNull(requestBody25);
//        org.junit.Assert.assertNotNull(fakeRequest27);
//    }
//
//    @Test
//    public void test250() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test250");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest23 = fakeRequest2.withBody(byteArray19);
//        com.jcabi.http.RequestBody requestBody24 = fakeRequest2.multipartBody();
//        com.jcabi.http.request.FakeRequest fakeRequest26 = fakeRequest2.withReason("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.Request request29 = fakeRequest26.timeout(0, 0);
//        com.jcabi.http.request.FakeRequest fakeRequest31 = fakeRequest26.withBody("POST");
//        com.jcabi.http.request.FakeRequest fakeRequest33 = fakeRequest26.withReason("PATCH");
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest23);
//        org.junit.Assert.assertNotNull(requestBody24);
//        org.junit.Assert.assertNotNull(fakeRequest26);
//        org.junit.Assert.assertNotNull(request29);
//        org.junit.Assert.assertNotNull(fakeRequest31);
//        org.junit.Assert.assertNotNull(fakeRequest33);
//    }
//
//    @Test
//    public void test251() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test251");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest23 = fakeRequest2.withBody(byteArray19);
//        com.jcabi.http.request.FakeRequest fakeRequest25 = fakeRequest2.withBody("HTTP/1.1 PUT OPTIONS (null)\n\n<<empty>>");
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest23);
//        org.junit.Assert.assertNotNull(fakeRequest25);
//    }
//
//    @Test
//    public void test252() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test252");
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder0 = new com.jcabi.http.request.MultipartBodyBuilder();
//        com.jcabi.http.request.FakeRequest fakeRequest1 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList4 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray10 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse11 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest1, (-1), "OPTIONS", strEntryList4, byteArray10);
//        byte[] byteArray12 = defaultResponse11.binary();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder13 = multipartBodyBuilder0.append(byteArray12);
//        byte[] byteArray14 = multipartBodyBuilder13.asBytes();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder15 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray16 = multipartBodyBuilder15.asBytes();
//        byte[] byteArray17 = multipartBodyBuilder15.asBytes();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder18 = multipartBodyBuilder13.append(byteArray17);
//        com.jcabi.http.request.FakeRequest fakeRequest19 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList22 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray28 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse29 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest19, (-1), "OPTIONS", strEntryList22, byteArray28);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder30 = multipartBodyBuilder13.appendLine(byteArray28);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder31 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray32 = multipartBodyBuilder31.asBytes();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder33 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray32);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder34 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray32);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder35 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray32);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder36 = multipartBodyBuilder13.append(byteArray32);
//        com.jcabi.http.request.FakeRequest fakeRequest37 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList40 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray46 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse47 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest37, (-1), "OPTIONS", strEntryList40, byteArray46);
//        byte[] byteArray48 = defaultResponse47.binary();
//        com.jcabi.http.Request request49 = defaultResponse47.back();
//        byte[] byteArray50 = defaultResponse47.binary();
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder51 = multipartBodyBuilder13.appendLine(byteArray50);
//        org.junit.Assert.assertNotNull(byteArray10);
//        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray12);
//        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder13);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
//        org.junit.Assert.assertNotNull(byteArray17);
//        org.junit.Assert.assertArrayEquals(byteArray17, new byte[] {});
//        org.junit.Assert.assertNotNull(multipartBodyBuilder18);
//        org.junit.Assert.assertNotNull(byteArray28);
//        org.junit.Assert.assertArrayEquals(byteArray28, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder30);
//        org.junit.Assert.assertNotNull(byteArray32);
//        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
//        org.junit.Assert.assertNotNull(multipartBodyBuilder36);
//        org.junit.Assert.assertNotNull(byteArray46);
//        org.junit.Assert.assertArrayEquals(byteArray46, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray48);
//        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(request49);
//        org.junit.Assert.assertNotNull(byteArray50);
//        org.junit.Assert.assertArrayEquals(byteArray50, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(multipartBodyBuilder51);
//    }
//
//    @Test
//    public void test253() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test253");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray11 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse12 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest2, (-1), "OPTIONS", strEntryList5, byteArray11);
//        byte[] byteArray16 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest19 = new com.jcabi.http.request.BaseRequest(wire0, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList5, "hi!", byteArray16, 0, 100);
//        java.lang.String str20 = baseRequest19.toString();
//        com.jcabi.http.RequestURI requestURI21 = baseRequest19.uri();
//        java.lang.Object obj23 = null;
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.Request request24 = baseRequest19.header("d\001\nd\n", obj23);
//            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
//        } catch (java.lang.NullPointerException e) {
//            // Expected exception.
//        }
//        org.junit.Assert.assertNotNull(byteArray11);
//        org.junit.Assert.assertArrayEquals(byteArray11, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray16);
//        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HTTP/1.1 hi! hi! (null)\n\n\000d" + "'", str20, "HTTP/1.1 hi! hi! (null)\n\n\000d");
//        org.junit.Assert.assertNotNull(requestURI21);
//    }
//
//    @Test
//    public void test254() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test254");
//        com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("OPTIONS");
//        com.jcabi.http.Request request3 = jdkRequest1.method("V0kgKR6TdJxOD6ArJKWjPIGJ7hWeRtrjX");
//        com.jcabi.http.Request request5 = jdkRequest1.method("vF36WdMsVFY0p9HmhX96kV2MrQnFh_2sk");
//        com.jcabi.http.Wire wire6 = null;
//        com.jcabi.http.Request request7 = jdkRequest1.through(wire6);
//        com.jcabi.http.RequestBody requestBody8 = jdkRequest1.multipartBody();
//        org.junit.Assert.assertNotNull(request3);
//        org.junit.Assert.assertNotNull(request5);
//        org.junit.Assert.assertNotNull(request7);
//        org.junit.Assert.assertNotNull(requestBody8);
//    }
//
//    @Test
//    public void test255() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test255");
//        // The following exception was thrown during execution in test generation
//        try {
//            com.jcabi.http.request.JdkRequest jdkRequest1 = new com.jcabi.http.request.JdkRequest("-1 OPTIONS [http://localhost:12345/see-FakeRequest-class]\n\nd\001\nd\n");
//            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal character in scheme name at index 0: -1 OPTIONS [http://localhost:12345/see-FakeRequest-class]??d??d?");
//        } catch (java.lang.IllegalArgumentException e) {
//            // Expected exception.
//        }
//    }
//
//    @Test
//    public void test256() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test256");
//        com.jcabi.http.Wire wire0 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest2 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        boolean boolean23 = fakeRequest2.equals((java.lang.Object) strEntryList8);
//        com.jcabi.http.request.FakeRequest fakeRequest29 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray38 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse39 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest29, (-1), "OPTIONS", strEntryList32, byteArray38);
//        com.jcabi.http.Wire wire40 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest42 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList45 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray51 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse52 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest42, (-1), "OPTIONS", strEntryList45, byteArray51);
//        byte[] byteArray56 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest59 = new com.jcabi.http.request.BaseRequest(wire40, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList45, "hi!", byteArray56, 0, 100);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder60 = new com.jcabi.http.request.MultipartBodyBuilder(byteArray56);
//        com.jcabi.http.request.FakeRequest fakeRequest61 = new com.jcabi.http.request.FakeRequest((int) (byte) 0, "OPTIONS", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray56);
//        com.jcabi.http.request.MultipartBodyBuilder multipartBodyBuilder62 = new com.jcabi.http.request.MultipartBodyBuilder();
//        byte[] byteArray63 = multipartBodyBuilder62.asBytes();
//        com.jcabi.http.request.FakeRequest fakeRequest64 = new com.jcabi.http.request.FakeRequest((int) '4', "GET", (java.util.Collection<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList32, byteArray63);
//        com.jcabi.http.request.BaseRequest baseRequest65 = new com.jcabi.http.request.BaseRequest(wire0, "OPTIONS", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "PUT", byteArray63);
//        com.jcabi.http.Wire wire66 = null;
//        com.jcabi.http.Request request67 = baseRequest65.through(wire66);
//        java.util.Random random68 = null;
//        com.jcabi.http.request.Boundary boundary69 = new com.jcabi.http.request.Boundary(random68);
//        boolean boolean70 = baseRequest65.equals((java.lang.Object) random68);
//        com.jcabi.http.Wire wire71 = null;
//        com.jcabi.http.Request request72 = baseRequest65.through(wire71);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
//        org.junit.Assert.assertNotNull(byteArray38);
//        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray51);
//        org.junit.Assert.assertArrayEquals(byteArray51, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray56);
//        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(byteArray63);
//        org.junit.Assert.assertArrayEquals(byteArray63, new byte[] {});
//        org.junit.Assert.assertNotNull(request67);
//        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
//        org.junit.Assert.assertNotNull(request72);
//    }
//
//    @Test
//    public void test257() throws Throwable {
//        if (debug)
//            System.out.format("%n%s%n", "RegressionTest0.test257");
//        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.http.request.FakeRequest fakeRequest2 = fakeRequest0.withReason("");
//        com.jcabi.http.Wire wire3 = null;
//        com.jcabi.http.request.FakeRequest fakeRequest5 = new com.jcabi.http.request.FakeRequest();
//        com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = new com.jcabi.immutable.Array<java.util.Map.Entry<java.lang.String, java.lang.String>>();
//        byte[] byteArray14 = new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 };
//        com.jcabi.http.request.DefaultResponse defaultResponse15 = new com.jcabi.http.request.DefaultResponse((com.jcabi.http.Request) fakeRequest5, (-1), "OPTIONS", strEntryList8, byteArray14);
//        byte[] byteArray19 = new byte[] { (byte) 0, (byte) 100 };
//        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest(wire3, "hi!", (java.lang.Iterable<java.util.Map.Entry<java.lang.String, java.lang.String>>) strEntryList8, "hi!", byteArray19, 0, 100);
//        com.jcabi.http.request.FakeRequest fakeRequest23 = fakeRequest2.withBody(byteArray19);
//        com.jcabi.http.RequestBody requestBody24 = fakeRequest2.multipartBody();
//        com.jcabi.http.request.FakeRequest fakeRequest26 = fakeRequest2.withReason("HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
//        com.jcabi.http.request.FakeRequest fakeRequest28 = fakeRequest26.withStatus((int) ' ');
//        com.jcabi.http.RequestBody requestBody29 = fakeRequest26.body();
//        org.junit.Assert.assertNotNull(fakeRequest2);
//        org.junit.Assert.assertNotNull(byteArray14);
//        org.junit.Assert.assertArrayEquals(byteArray14, new byte[] { (byte) 100, (byte) 1, (byte) 10, (byte) 100, (byte) 10 });
//        org.junit.Assert.assertNotNull(byteArray19);
//        org.junit.Assert.assertArrayEquals(byteArray19, new byte[] { (byte) 0, (byte) 100 });
//        org.junit.Assert.assertNotNull(fakeRequest23);
//        org.junit.Assert.assertNotNull(requestBody24);
//        org.junit.Assert.assertNotNull(fakeRequest26);
//        org.junit.Assert.assertNotNull(fakeRequest28);
//        org.junit.Assert.assertNotNull(requestBody29);
//    }
//}
