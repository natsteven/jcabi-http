package com.jcabi.http;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RandoopRegressionTest {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        String str0 = Request.POST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "POST" + "'", str0, "POST");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        String str0 = Request.PATCH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PATCH" + "'", str0, "PATCH");
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList4 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray5 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest6 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList4, byteArray5);
        boolean boolean8 = fakeRequest6.equals((Object) 10.0f);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList11 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        java.io.InputStream inputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            Response response15 = retryWire1.send((Request) fakeRequest6, "POST", "hi!", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList11, inputStream12, (int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertArrayEquals(byteArray5, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        String str0 = Request.PUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PUT" + "'", str0, "PUT");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList5 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray6 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest7 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList5, byteArray6);
        boolean boolean9 = fakeRequest7.equals((Object) 10.0f);
        java.util.Collection<java.util.Map.Entry<String, String>> strEntryCollection12 = null;
        java.io.InputStream inputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            Response response16 = eTagCachingWire2.send((Request) fakeRequest7, "", "hi!", strEntryCollection12, inputStream13, (int) (short) 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertArrayEquals(byteArray6, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        java.io.InputStream inputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            Response response6 = baseRequest4.fetch(inputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        Request request7 = baseRequest4.header("PUT", (Object) (byte) 10);
        Class<?> wildcardClass8 = baseRequest4.getClass();
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire5 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire2);
        // The following exception was thrown during execution in test generation
        try {
            com.jcabi.http.request.BaseRequest baseRequest7 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire5, "");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.ClassNotFoundException: Provider for jakarta.ws.rs.ext.RuntimeDelegate cannot be found");
        } catch (RuntimeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList2 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray3 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList2, byteArray3);
        com.jcabi.http.request.FakeRequest fakeRequest6 = fakeRequest4.withStatus((-1));
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(fakeRequest6);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        String str0 = Request.OPTIONS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "OPTIONS" + "'", str0, "OPTIONS");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        String str0 = Request.DELETE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "DELETE" + "'", str0, "DELETE");
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        // The following exception was thrown during execution in test generation
        try {
            Response response5 = baseRequest4.fetch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire5 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire2);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList9 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray10 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest11 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList9, byteArray10);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList15 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray16 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest17 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList15, byteArray16);
        com.jcabi.http.request.BaseRequest baseRequest20 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList9, "PUT", byteArray16, (int) ' ', (int) '4');
        com.jcabi.http.wire.LastModifiedCachingWire lastModifiedCachingWire21 = new com.jcabi.http.wire.LastModifiedCachingWire((Wire) eTagCachingWire2);
        com.jcabi.http.wire.OneMinuteWire oneMinuteWire22 = new com.jcabi.http.wire.OneMinuteWire((Wire) lastModifiedCachingWire21);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList25 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray26 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest27 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList25, byteArray26);
        boolean boolean29 = fakeRequest27.equals((Object) 10.0f);
        RequestURI requestURI30 = fakeRequest27.uri();
        RequestBody requestBody31 = fakeRequest27.body();
        Wire wire34 = null;
        com.jcabi.http.wire.RetryWire retryWire35 = new com.jcabi.http.wire.RetryWire(wire34);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire36 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire35);
        com.jcabi.http.wire.BasicAuthWire basicAuthWire37 = new com.jcabi.http.wire.BasicAuthWire((Wire) retryWire35);
        Wire wire39 = null;
        com.jcabi.http.wire.RetryWire retryWire40 = new com.jcabi.http.wire.RetryWire(wire39);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire41 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire40);
        com.jcabi.http.request.BaseRequest baseRequest43 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire41, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire44 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire41);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList48 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray49 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest50 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList48, byteArray49);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList54 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray55 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest56 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList54, byteArray55);
        com.jcabi.http.request.BaseRequest baseRequest59 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire41, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList48, "PUT", byteArray55, (int) ' ', (int) '4');
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList63 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray64 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest65 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList63, byteArray64);
        com.jcabi.http.request.BaseRequest baseRequest66 = new com.jcabi.http.request.BaseRequest((Wire) retryWire35, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList48, "", byteArray64);
        java.io.InputStream inputStream67 = null;
        // The following exception was thrown during execution in test generation
        try {
            Response response70 = oneMinuteWire22.send((Request) fakeRequest27, "DELETE", "hi!", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList48, inputStream67, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray26);
        org.junit.Assert.assertArrayEquals(byteArray26, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(requestURI30);
        org.junit.Assert.assertNotNull(requestBody31);
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray55);
        org.junit.Assert.assertArrayEquals(byteArray55, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray64);
        org.junit.Assert.assertArrayEquals(byteArray64, new byte[] {});
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.RetryWire retryWire2 = new com.jcabi.http.wire.RetryWire((Wire) retryWire1);
        Class<?> wildcardClass3 = retryWire2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire5 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire2);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList9 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray10 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest11 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList9, byteArray10);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList15 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray16 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest17 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList15, byteArray16);
        com.jcabi.http.request.BaseRequest baseRequest20 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList9, "PUT", byteArray16, (int) ' ', (int) '4');
        com.jcabi.http.wire.LastModifiedCachingWire lastModifiedCachingWire21 = new com.jcabi.http.wire.LastModifiedCachingWire((Wire) eTagCachingWire2);
        Wire wire23 = null;
        com.jcabi.http.wire.RetryWire retryWire24 = new com.jcabi.http.wire.RetryWire(wire23);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire25 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire24);
        com.jcabi.http.request.BaseRequest baseRequest27 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire25, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire28 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire25);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList32 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray33 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest34 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList32, byteArray33);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList38 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray39 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest40 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList38, byteArray39);
        com.jcabi.http.request.BaseRequest baseRequest43 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire25, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList32, "PUT", byteArray39, (int) ' ', (int) '4');
        Wire wire45 = null;
        com.jcabi.http.wire.RetryWire retryWire46 = new com.jcabi.http.wire.RetryWire(wire45);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire47 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire46);
        com.jcabi.http.wire.BasicAuthWire basicAuthWire48 = new com.jcabi.http.wire.BasicAuthWire((Wire) retryWire46);
        Wire wire50 = null;
        com.jcabi.http.wire.RetryWire retryWire51 = new com.jcabi.http.wire.RetryWire(wire50);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire52 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire51);
        com.jcabi.http.request.BaseRequest baseRequest54 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire52, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire55 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire52);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList59 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray60 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest61 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList59, byteArray60);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList65 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray66 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest67 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList65, byteArray66);
        com.jcabi.http.request.BaseRequest baseRequest70 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire52, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList59, "PUT", byteArray66, (int) ' ', (int) '4');
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList74 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray75 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest76 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList74, byteArray75);
        com.jcabi.http.request.BaseRequest baseRequest77 = new com.jcabi.http.request.BaseRequest((Wire) retryWire46, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList59, "", byteArray75);
        // The following exception was thrown during execution in test generation
        try {
            com.jcabi.http.request.BaseRequest baseRequest80 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "", (Iterable<java.util.Map.Entry<String, String>>) strEntryList32, "", byteArray75, 1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.ClassNotFoundException: Provider for jakarta.ws.rs.ext.RuntimeDelegate cannot be found");
        } catch (RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray33);
        org.junit.Assert.assertArrayEquals(byteArray33, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray39);
        org.junit.Assert.assertArrayEquals(byteArray39, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray60);
        org.junit.Assert.assertArrayEquals(byteArray60, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray66);
        org.junit.Assert.assertArrayEquals(byteArray66, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray75);
        org.junit.Assert.assertArrayEquals(byteArray75, new byte[] {});
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        String str0 = Request.HEAD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "HEAD" + "'", str0, "HEAD");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire5 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire2);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList9 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray10 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest11 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList9, byteArray10);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList15 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray16 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest17 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList15, byteArray16);
        com.jcabi.http.request.BaseRequest baseRequest20 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList9, "PUT", byteArray16, (int) ' ', (int) '4');
        com.jcabi.http.wire.LastModifiedCachingWire lastModifiedCachingWire21 = new com.jcabi.http.wire.LastModifiedCachingWire((Wire) eTagCachingWire2);
        com.jcabi.http.wire.OneMinuteWire oneMinuteWire22 = new com.jcabi.http.wire.OneMinuteWire((Wire) lastModifiedCachingWire21);
        String str23 = lastModifiedCachingWire21.toString();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "LastModifiedCachingWire()" + "'", str23, "LastModifiedCachingWire()");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList2 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray3 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList2, byteArray3);
        boolean boolean6 = fakeRequest4.equals((Object) 10.0f);
        Request request9 = fakeRequest4.timeout((int) (short) -1, (int) (short) 1);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(request9);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.wire.BasicAuthWire basicAuthWire3 = new com.jcabi.http.wire.BasicAuthWire((Wire) retryWire1);
        com.jcabi.http.wire.RetryWire retryWire4 = new com.jcabi.http.wire.RetryWire((Wire) basicAuthWire3);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList7 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray8 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest9 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList7, byteArray8);
        Request request11 = fakeRequest9.method("PATCH");
        Wire wire14 = null;
        com.jcabi.http.wire.RetryWire retryWire15 = new com.jcabi.http.wire.RetryWire(wire14);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire16 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire15);
        com.jcabi.http.wire.BasicAuthWire basicAuthWire17 = new com.jcabi.http.wire.BasicAuthWire((Wire) retryWire15);
        Wire wire19 = null;
        com.jcabi.http.wire.RetryWire retryWire20 = new com.jcabi.http.wire.RetryWire(wire19);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire21 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire20);
        com.jcabi.http.request.BaseRequest baseRequest23 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire21, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire24 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire21);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList28 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray29 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest30 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList28, byteArray29);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList34 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray35 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest36 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList34, byteArray35);
        com.jcabi.http.request.BaseRequest baseRequest39 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire21, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList28, "PUT", byteArray35, (int) ' ', (int) '4');
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList43 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray44 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest45 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList43, byteArray44);
        com.jcabi.http.request.BaseRequest baseRequest46 = new com.jcabi.http.request.BaseRequest((Wire) retryWire15, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList28, "", byteArray44);
        java.io.InputStream inputStream47 = null;
        // The following exception was thrown during execution in test generation
        try {
            Response response50 = basicAuthWire3.send((Request) fakeRequest9, "ETagCachingWire()", "PUT", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList28, inputStream47, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.ClassNotFoundException: Provider for jakarta.ws.rs.ext.RuntimeDelegate cannot be found");
        } catch (RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray44);
        org.junit.Assert.assertArrayEquals(byteArray44, new byte[] {});
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire5 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire2);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList9 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray10 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest11 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList9, byteArray10);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList15 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray16 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest17 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList15, byteArray16);
        com.jcabi.http.request.BaseRequest baseRequest20 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList9, "PUT", byteArray16, (int) ' ', (int) '4');
        com.jcabi.http.wire.LastModifiedCachingWire lastModifiedCachingWire21 = new com.jcabi.http.wire.LastModifiedCachingWire((Wire) eTagCachingWire2);
        com.jcabi.http.wire.OneMinuteWire oneMinuteWire22 = new com.jcabi.http.wire.OneMinuteWire((Wire) lastModifiedCachingWire21);
        Wire wire23 = null;
        com.jcabi.http.wire.RetryWire retryWire24 = new com.jcabi.http.wire.RetryWire(wire23);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire25 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire24);
        com.jcabi.http.request.BaseRequest baseRequest27 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire25, "PUT");
        RequestBody requestBody28 = baseRequest27.multipartBody();
        boolean boolean30 = baseRequest27.equals((Object) (-1.0f));
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList35 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray36 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest37 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList35, byteArray36);
        java.io.InputStream inputStream38 = null;
        // The following exception was thrown during execution in test generation
        try {
            Response response41 = oneMinuteWire22.send((Request) baseRequest27, "PATCH", "PATCH", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList35, inputStream38, (int) (byte) 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(requestBody28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(byteArray36);
        org.junit.Assert.assertArrayEquals(byteArray36, new byte[] {});
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList2 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray3 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList2, byteArray3);
        RequestURI requestURI5 = fakeRequest4.uri();
        Response response6 = fakeRequest4.fetch();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(requestURI5);
        org.junit.Assert.assertNotNull(response6);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList2 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray3 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList2, byteArray3);
        Request request7 = fakeRequest4.header("hi!", (Object) (-1.0f));
        java.io.InputStream inputStream8 = null;
        Response response9 = fakeRequest4.fetch(inputStream8);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList12 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray13 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest14 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList12, byteArray13);
        com.jcabi.http.request.FakeRequest fakeRequest15 = fakeRequest4.withBody(byteArray13);
        RequestURI requestURI16 = fakeRequest4.uri();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(response9);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertArrayEquals(byteArray13, new byte[] {});
        org.junit.Assert.assertNotNull(fakeRequest15);
        org.junit.Assert.assertNotNull(requestURI16);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.RetryWire retryWire2 = new com.jcabi.http.wire.RetryWire((Wire) retryWire1);
        com.jcabi.http.wire.BasicAuthWire basicAuthWire3 = new com.jcabi.http.wire.BasicAuthWire((Wire) retryWire2);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire5 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire2);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList9 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray10 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest11 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList9, byteArray10);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList15 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray16 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest17 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList15, byteArray16);
        com.jcabi.http.request.BaseRequest baseRequest20 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList9, "PUT", byteArray16, (int) ' ', (int) '4');
        com.jcabi.http.wire.LastModifiedCachingWire lastModifiedCachingWire21 = new com.jcabi.http.wire.LastModifiedCachingWire((Wire) eTagCachingWire2);
        com.jcabi.http.wire.OneMinuteWire oneMinuteWire22 = new com.jcabi.http.wire.OneMinuteWire((Wire) lastModifiedCachingWire21);
        Wire wire23 = null;
        com.jcabi.http.wire.RetryWire retryWire24 = new com.jcabi.http.wire.RetryWire(wire23);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire25 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire24);
        com.jcabi.http.request.BaseRequest baseRequest27 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire25, "PUT");
        Request request30 = baseRequest27.header("PUT", (Object) (byte) 10);
        boolean boolean31 = oneMinuteWire22.equals((Object) "PUT");
        Wire wire32 = null;
        com.jcabi.http.wire.RetryWire retryWire33 = new com.jcabi.http.wire.RetryWire(wire32);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire34 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire33);
        com.jcabi.http.request.BaseRequest baseRequest36 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire34, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire37 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire34);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList41 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray42 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest43 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList41, byteArray42);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList47 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray48 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest49 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList47, byteArray48);
        com.jcabi.http.request.BaseRequest baseRequest52 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire34, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList41, "PUT", byteArray48, (int) ' ', (int) '4');
        boolean boolean53 = oneMinuteWire22.equals((Object) "PUT");
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(request30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(byteArray42);
        org.junit.Assert.assertArrayEquals(byteArray42, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray48);
        org.junit.Assert.assertArrayEquals(byteArray48, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.wire.BasicAuthWire basicAuthWire3 = new com.jcabi.http.wire.BasicAuthWire((Wire) retryWire1);
        com.jcabi.http.wire.RetryWire retryWire4 = new com.jcabi.http.wire.RetryWire((Wire) basicAuthWire3);
        com.jcabi.http.wire.BasicAuthWire basicAuthWire5 = new com.jcabi.http.wire.BasicAuthWire((Wire) retryWire4);
        String str6 = retryWire4.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RetryWire(origin=BasicAuthWire(origin=RetryWire(origin=null)))" + "'", str6, "RetryWire(origin=BasicAuthWire(origin=RetryWire(origin=null)))");
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList2 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray3 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList2, byteArray3);
        boolean boolean6 = fakeRequest4.equals((Object) 10.0f);
        com.jcabi.http.request.FakeRequest fakeRequest9 = fakeRequest4.withHeader("HEAD", "hi!");
        com.jcabi.http.request.FakeRequest fakeRequest11 = fakeRequest9.withReason("hi!");
        // The following exception was thrown during execution in test generation
        try {
            com.jcabi.http.request.FakeRequest fakeRequest14 = fakeRequest11.withHeader("", "LastModifiedCachingWire()");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(fakeRequest9);
        org.junit.Assert.assertNotNull(fakeRequest11);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList2 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray3 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList2, byteArray3);
        boolean boolean6 = fakeRequest4.equals((Object) 10.0f);
        com.jcabi.http.request.FakeRequest fakeRequest9 = fakeRequest4.withHeader("HEAD", "hi!");
        Request request12 = fakeRequest9.timeout((int) (byte) 10, 0);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(fakeRequest9);
        org.junit.Assert.assertNotNull(request12);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire5 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire2);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList9 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray10 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest11 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList9, byteArray10);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList15 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray16 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest17 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList15, byteArray16);
        com.jcabi.http.request.BaseRequest baseRequest20 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList9, "PUT", byteArray16, (int) ' ', (int) '4');
        com.jcabi.http.wire.LastModifiedCachingWire lastModifiedCachingWire21 = new com.jcabi.http.wire.LastModifiedCachingWire((Wire) eTagCachingWire2);
        com.jcabi.http.wire.OneMinuteWire oneMinuteWire22 = new com.jcabi.http.wire.OneMinuteWire((Wire) lastModifiedCachingWire21);
        com.jcabi.http.wire.TrustedWire trustedWire23 = new com.jcabi.http.wire.TrustedWire((Wire) oneMinuteWire22);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire5 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire2);
        com.jcabi.http.wire.BasicAuthWire basicAuthWire6 = new com.jcabi.http.wire.BasicAuthWire((Wire) eTagCachingWire2);
        com.jcabi.http.wire.LastModifiedCachingWire lastModifiedCachingWire7 = new com.jcabi.http.wire.LastModifiedCachingWire((Wire) basicAuthWire6);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList2 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray3 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList2, byteArray3);
        Request request7 = fakeRequest4.header("hi!", (Object) (-1.0f));
        Request request9 = fakeRequest4.method("hi!");
        com.jcabi.http.request.FakeRequest fakeRequest12 = fakeRequest4.withHeader("DELETE", "PATCH");
        com.jcabi.http.request.FakeRequest fakeRequest14 = fakeRequest4.withStatus((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(fakeRequest12);
        org.junit.Assert.assertNotNull(fakeRequest14);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.wire.BasicAuthWire basicAuthWire3 = new com.jcabi.http.wire.BasicAuthWire((Wire) retryWire1);
        Wire wire5 = null;
        com.jcabi.http.wire.RetryWire retryWire6 = new com.jcabi.http.wire.RetryWire(wire5);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire7 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire6);
        com.jcabi.http.request.BaseRequest baseRequest9 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire7, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire10 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire7);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList14 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray15 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest16 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList14, byteArray15);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList20 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray21 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest22 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList20, byteArray21);
        com.jcabi.http.request.BaseRequest baseRequest25 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire7, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList14, "PUT", byteArray21, (int) ' ', (int) '4');
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList29 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray30 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest31 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList29, byteArray30);
        com.jcabi.http.request.BaseRequest baseRequest32 = new com.jcabi.http.request.BaseRequest((Wire) retryWire1, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList14, "", byteArray30);
        // The following exception was thrown during execution in test generation
        try {
            Response response33 = baseRequest32.fetch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray15);
        org.junit.Assert.assertArrayEquals(byteArray15, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray21);
        org.junit.Assert.assertArrayEquals(byteArray21, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray30);
        org.junit.Assert.assertArrayEquals(byteArray30, new byte[] {});
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList2 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray3 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList2, byteArray3);
        Request request6 = fakeRequest4.method("PATCH");
        String str7 = fakeRequest4.toString();
        Request request9 = fakeRequest4.method("PUT");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>" + "'", str7, "HTTP/1.1 GET /see-FakeRequest-class (localhost)\n\n<<empty>>");
        org.junit.Assert.assertNotNull(request9);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList2 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray3 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList2, byteArray3);
        Request request7 = fakeRequest4.header("hi!", (Object) (-1.0f));
        Request request9 = fakeRequest4.method("hi!");
        com.jcabi.http.request.FakeRequest fakeRequest12 = fakeRequest4.withHeader("DELETE", "PATCH");
        RequestURI requestURI13 = fakeRequest12.uri();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(fakeRequest12);
        org.junit.Assert.assertNotNull(requestURI13);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList2 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray3 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList2, byteArray3);
        boolean boolean6 = fakeRequest4.equals((Object) 10.0f);
        RequestURI requestURI7 = fakeRequest4.uri();
        RequestBody requestBody8 = fakeRequest4.body();
        com.jcabi.http.request.FakeRequest fakeRequest11 = fakeRequest4.withHeader("ETagCachingWire()", "PUT");
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(requestURI7);
        org.junit.Assert.assertNotNull(requestBody8);
        org.junit.Assert.assertNotNull(fakeRequest11);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList2 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray3 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList2, byteArray3);
        java.io.InputStream inputStream5 = null;
        Response response6 = fakeRequest4.fetch(inputStream5);
        com.jcabi.http.response.WebLinkingResponse webLinkingResponse7 = new com.jcabi.http.response.WebLinkingResponse(response6);
        byte[] byteArray8 = webLinkingResponse7.binary();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertArrayEquals(byteArray8, new byte[] {});
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.RetryWire retryWire2 = new com.jcabi.http.wire.RetryWire((Wire) retryWire1);
        Wire wire4 = null;
        com.jcabi.http.wire.RetryWire retryWire5 = new com.jcabi.http.wire.RetryWire(wire4);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire6 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire5);
        com.jcabi.http.request.BaseRequest baseRequest8 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire6, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire9 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire6);
        com.jcabi.http.wire.BasicAuthWire basicAuthWire10 = new com.jcabi.http.wire.BasicAuthWire((Wire) eTagCachingWire6);
        String str11 = basicAuthWire10.toString();
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList15 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray16 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest17 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList15, byteArray16);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList21 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray22 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest23 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList21, byteArray22);
        com.jcabi.http.request.BaseRequest baseRequest26 = new com.jcabi.http.request.BaseRequest((Wire) basicAuthWire10, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList15, "OPTIONS", byteArray22, (int) '4', (int) (short) -1);
        Wire wire28 = null;
        com.jcabi.http.wire.RetryWire retryWire29 = new com.jcabi.http.wire.RetryWire(wire28);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire30 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire29);
        com.jcabi.http.wire.BasicAuthWire basicAuthWire31 = new com.jcabi.http.wire.BasicAuthWire((Wire) retryWire29);
        Wire wire33 = null;
        com.jcabi.http.wire.RetryWire retryWire34 = new com.jcabi.http.wire.RetryWire(wire33);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire35 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire34);
        com.jcabi.http.request.BaseRequest baseRequest37 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire35, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire38 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire35);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList42 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray43 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest44 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList42, byteArray43);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList48 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray49 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest50 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList48, byteArray49);
        com.jcabi.http.request.BaseRequest baseRequest53 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire35, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList42, "PUT", byteArray49, (int) ' ', (int) '4');
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList57 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray58 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest59 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList57, byteArray58);
        com.jcabi.http.request.BaseRequest baseRequest60 = new com.jcabi.http.request.BaseRequest((Wire) retryWire29, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList42, "", byteArray58);
        com.jcabi.http.request.BaseRequest baseRequest63 = new com.jcabi.http.request.BaseRequest((Wire) retryWire2, "POST", (Iterable<java.util.Map.Entry<String, String>>) strEntryList15, "", byteArray58, 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            Response response64 = baseRequest63.fetch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "BasicAuthWire(origin=ETagCachingWire())" + "'", str11, "BasicAuthWire(origin=ETagCachingWire())");
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray43);
        org.junit.Assert.assertArrayEquals(byteArray43, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray49);
        org.junit.Assert.assertArrayEquals(byteArray49, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray58);
        org.junit.Assert.assertArrayEquals(byteArray58, new byte[] {});
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList2 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray3 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList2, byteArray3);
        boolean boolean6 = fakeRequest4.equals((Object) 10.0f);
        com.jcabi.http.request.FakeRequest fakeRequest9 = fakeRequest4.withHeader("HEAD", "hi!");
        com.jcabi.http.request.FakeRequest fakeRequest11 = fakeRequest9.withReason("hi!");
        Response response12 = fakeRequest9.fetch();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(fakeRequest9);
        org.junit.Assert.assertNotNull(fakeRequest11);
        org.junit.Assert.assertNotNull(response12);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        RequestBody requestBody5 = baseRequest4.multipartBody();
        boolean boolean7 = baseRequest4.equals((Object) (-1.0f));
        Wire wire8 = null;
        com.jcabi.http.wire.RetryWire retryWire9 = new com.jcabi.http.wire.RetryWire(wire8);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire10 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire9);
        com.jcabi.http.request.BaseRequest baseRequest12 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire10, "PUT");
        Request request13 = baseRequest4.through((Wire) eTagCachingWire10);
        // The following exception was thrown during execution in test generation
        try {
            com.jcabi.http.request.BaseRequest baseRequest15 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.ClassNotFoundException: Provider for jakarta.ws.rs.ext.RuntimeDelegate cannot be found");
        } catch (RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBody5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(request13);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.wire.BasicAuthWire basicAuthWire3 = new com.jcabi.http.wire.BasicAuthWire((Wire) retryWire1);
        com.jcabi.http.wire.RetryWire retryWire4 = new com.jcabi.http.wire.RetryWire((Wire) basicAuthWire3);
        com.jcabi.http.wire.TrustedWire trustedWire5 = new com.jcabi.http.wire.TrustedWire((Wire) retryWire4);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        String str0 = Request.GET;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "GET" + "'", str0, "GET");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList2 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray3 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList2, byteArray3);
        boolean boolean6 = fakeRequest4.equals((Object) 10.0f);
        com.jcabi.http.request.FakeRequest fakeRequest9 = fakeRequest4.withHeader("HEAD", "hi!");
        Request request11 = fakeRequest9.method("BasicAuthWire(origin=ETagCachingWire())");
        Request request14 = fakeRequest9.header("OPTIONS", (Object) 0.0f);
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(fakeRequest9);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(request14);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        RequestBody requestBody5 = baseRequest4.multipartBody();
        boolean boolean7 = baseRequest4.equals((Object) (-1.0f));
        Wire wire8 = null;
        com.jcabi.http.wire.RetryWire retryWire9 = new com.jcabi.http.wire.RetryWire(wire8);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire10 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire9);
        com.jcabi.http.request.BaseRequest baseRequest12 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire10, "PUT");
        Request request13 = baseRequest4.through((Wire) eTagCachingWire10);
        Request request16 = baseRequest4.timeout((int) (short) 1, (int) ' ');
        org.junit.Assert.assertNotNull(requestBody5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(request13);
        org.junit.Assert.assertNotNull(request16);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        com.jcabi.http.wire.TrustedWire trustedWire5 = new com.jcabi.http.wire.TrustedWire((Wire) eTagCachingWire2);
        com.jcabi.http.request.BaseRequest baseRequest7 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "BasicAuthWire(origin=ETagCachingWire())");
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList2 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray3 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList2, byteArray3);
        Request request7 = fakeRequest4.header("hi!", (Object) (-1.0f));
        Request request9 = fakeRequest4.method("hi!");
        com.jcabi.http.request.FakeRequest fakeRequest12 = fakeRequest4.withHeader("DELETE", "PATCH");
        Class<?> wildcardClass13 = fakeRequest12.getClass();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(request9);
        org.junit.Assert.assertNotNull(fakeRequest12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList2 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray3 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList2, byteArray3);
        boolean boolean6 = fakeRequest4.equals((Object) 10.0f);
        com.jcabi.http.request.FakeRequest fakeRequest9 = fakeRequest4.withHeader("HEAD", "hi!");
        RequestURI requestURI10 = fakeRequest9.uri();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(fakeRequest9);
        org.junit.Assert.assertNotNull(requestURI10);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        String str3 = eTagCachingWire2.toString();
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList6 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray7 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest8 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList6, byteArray7);
        Request request10 = fakeRequest8.method("PATCH");
        Wire wire13 = null;
        com.jcabi.http.wire.RetryWire retryWire14 = new com.jcabi.http.wire.RetryWire(wire13);
        com.jcabi.http.wire.RetryWire retryWire15 = new com.jcabi.http.wire.RetryWire((Wire) retryWire14);
        Wire wire17 = null;
        com.jcabi.http.wire.RetryWire retryWire18 = new com.jcabi.http.wire.RetryWire(wire17);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire19 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire18);
        com.jcabi.http.request.BaseRequest baseRequest21 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire19, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire22 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire19);
        com.jcabi.http.wire.BasicAuthWire basicAuthWire23 = new com.jcabi.http.wire.BasicAuthWire((Wire) eTagCachingWire19);
        String str24 = basicAuthWire23.toString();
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList28 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray29 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest30 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList28, byteArray29);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList34 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray35 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest36 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList34, byteArray35);
        com.jcabi.http.request.BaseRequest baseRequest39 = new com.jcabi.http.request.BaseRequest((Wire) basicAuthWire23, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList28, "OPTIONS", byteArray35, (int) '4', (int) (short) -1);
        Wire wire41 = null;
        com.jcabi.http.wire.RetryWire retryWire42 = new com.jcabi.http.wire.RetryWire(wire41);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire43 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire42);
        com.jcabi.http.wire.BasicAuthWire basicAuthWire44 = new com.jcabi.http.wire.BasicAuthWire((Wire) retryWire42);
        Wire wire46 = null;
        com.jcabi.http.wire.RetryWire retryWire47 = new com.jcabi.http.wire.RetryWire(wire46);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire48 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire47);
        com.jcabi.http.request.BaseRequest baseRequest50 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire48, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire51 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire48);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList55 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray56 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest57 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList55, byteArray56);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList61 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray62 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest63 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList61, byteArray62);
        com.jcabi.http.request.BaseRequest baseRequest66 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire48, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList55, "PUT", byteArray62, (int) ' ', (int) '4');
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList70 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray71 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest72 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList70, byteArray71);
        com.jcabi.http.request.BaseRequest baseRequest73 = new com.jcabi.http.request.BaseRequest((Wire) retryWire42, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList55, "", byteArray71);
        com.jcabi.http.request.BaseRequest baseRequest76 = new com.jcabi.http.request.BaseRequest((Wire) retryWire15, "POST", (Iterable<java.util.Map.Entry<String, String>>) strEntryList28, "", byteArray71, 10, (int) ' ');
        java.io.InputStream inputStream77 = null;
        // The following exception was thrown during execution in test generation
        try {
            Response response80 = eTagCachingWire2.send((Request) fakeRequest8, "LastModifiedCachingWire()", "BasicAuthWire(origin=ETagCachingWire())", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList28, inputStream77, (int) ' ', 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ETagCachingWire()" + "'", str3, "ETagCachingWire()");
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertArrayEquals(byteArray7, new byte[] {});
        org.junit.Assert.assertNotNull(request10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "BasicAuthWire(origin=ETagCachingWire())" + "'", str24, "BasicAuthWire(origin=ETagCachingWire())");
        org.junit.Assert.assertNotNull(byteArray29);
        org.junit.Assert.assertArrayEquals(byteArray29, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray35);
        org.junit.Assert.assertArrayEquals(byteArray35, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray56);
        org.junit.Assert.assertArrayEquals(byteArray56, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray62);
        org.junit.Assert.assertArrayEquals(byteArray62, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray71);
        org.junit.Assert.assertArrayEquals(byteArray71, new byte[] {});
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList2 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray3 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList2, byteArray3);
        java.io.InputStream inputStream5 = null;
        Response response6 = fakeRequest4.fetch(inputStream5);
        com.jcabi.http.response.WebLinkingResponse webLinkingResponse7 = new com.jcabi.http.response.WebLinkingResponse(response6);
        Request request8 = webLinkingResponse7.back();
        java.util.Map<String, com.jcabi.http.response.WebLinkingResponse.Link> strMap9 = webLinkingResponse7.links();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertNotNull(request8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        com.jcabi.http.wire.TrustedWire trustedWire5 = new com.jcabi.http.wire.TrustedWire((Wire) eTagCachingWire2);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList8 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray9 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest10 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList8, byteArray9);
        boolean boolean12 = fakeRequest10.equals((Object) 10.0f);
        com.jcabi.http.request.FakeRequest fakeRequest15 = fakeRequest10.withHeader("HEAD", "hi!");
        Request request17 = fakeRequest15.method("BasicAuthWire(origin=ETagCachingWire())");
        Wire wire20 = null;
        com.jcabi.http.wire.RetryWire retryWire21 = new com.jcabi.http.wire.RetryWire(wire20);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire22 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire21);
        com.jcabi.http.request.BaseRequest baseRequest24 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire22, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire25 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire22);
        com.jcabi.http.wire.BasicAuthWire basicAuthWire26 = new com.jcabi.http.wire.BasicAuthWire((Wire) eTagCachingWire22);
        String str27 = basicAuthWire26.toString();
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList31 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray32 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest33 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList31, byteArray32);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList37 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray38 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest39 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList37, byteArray38);
        com.jcabi.http.request.BaseRequest baseRequest42 = new com.jcabi.http.request.BaseRequest((Wire) basicAuthWire26, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList31, "OPTIONS", byteArray38, (int) '4', (int) (short) -1);
        java.io.InputStream inputStream43 = null;
        // The following exception was thrown during execution in test generation
        try {
            Response response46 = trustedWire5.send(request17, "LastModifiedCachingWire()", "HEAD", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList31, inputStream43, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertArrayEquals(byteArray9, new byte[] {});
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(fakeRequest15);
        org.junit.Assert.assertNotNull(request17);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "BasicAuthWire(origin=ETagCachingWire())" + "'", str27, "BasicAuthWire(origin=ETagCachingWire())");
        org.junit.Assert.assertNotNull(byteArray32);
        org.junit.Assert.assertArrayEquals(byteArray32, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray38);
        org.junit.Assert.assertArrayEquals(byteArray38, new byte[] {});
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire5 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire2);
        com.jcabi.http.wire.BasicAuthWire basicAuthWire6 = new com.jcabi.http.wire.BasicAuthWire((Wire) eTagCachingWire2);
        String str7 = basicAuthWire6.toString();
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList11 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray12 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest13 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList11, byteArray12);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList17 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray18 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest19 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList17, byteArray18);
        com.jcabi.http.request.BaseRequest baseRequest22 = new com.jcabi.http.request.BaseRequest((Wire) basicAuthWire6, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList11, "OPTIONS", byteArray18, (int) '4', (int) (short) -1);
        Request request24 = baseRequest22.method("");
        Request request26 = baseRequest22.method("HEAD");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "BasicAuthWire(origin=ETagCachingWire())" + "'", str7, "BasicAuthWire(origin=ETagCachingWire())");
        org.junit.Assert.assertNotNull(byteArray12);
        org.junit.Assert.assertArrayEquals(byteArray12, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray18);
        org.junit.Assert.assertArrayEquals(byteArray18, new byte[] {});
        org.junit.Assert.assertNotNull(request24);
        org.junit.Assert.assertNotNull(request26);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.wire.BasicAuthWire basicAuthWire3 = new com.jcabi.http.wire.BasicAuthWire((Wire) retryWire1);
        com.jcabi.http.wire.RetryWire retryWire4 = new com.jcabi.http.wire.RetryWire((Wire) basicAuthWire3);
        com.jcabi.http.wire.BasicAuthWire basicAuthWire5 = new com.jcabi.http.wire.BasicAuthWire((Wire) retryWire4);
        Wire wire6 = null;
        com.jcabi.http.wire.RetryWire retryWire7 = new com.jcabi.http.wire.RetryWire(wire6);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire8 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire7);
        com.jcabi.http.request.BaseRequest baseRequest10 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire8, "PUT");
        RequestBody requestBody11 = baseRequest10.multipartBody();
        boolean boolean13 = baseRequest10.equals((Object) (-1.0f));
        Request request16 = baseRequest10.timeout((-1), (int) ' ');
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList21 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray22 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest23 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList21, byteArray22);
        java.io.InputStream inputStream24 = null;
        // The following exception was thrown during execution in test generation
        try {
            Response response27 = basicAuthWire5.send(request16, "PATCH", "BasicAuthWire(origin=ETagCachingWire())", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList21, inputStream24, 0, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException; message: java.lang.ClassNotFoundException: Provider for jakarta.ws.rs.ext.RuntimeDelegate cannot be found");
        } catch (RuntimeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBody11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(request16);
        org.junit.Assert.assertNotNull(byteArray22);
        org.junit.Assert.assertArrayEquals(byteArray22, new byte[] {});
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList2 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray3 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest4 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList2, byteArray3);
        java.io.InputStream inputStream5 = null;
        Response response6 = fakeRequest4.fetch(inputStream5);
        com.jcabi.http.response.WebLinkingResponse webLinkingResponse7 = new com.jcabi.http.response.WebLinkingResponse(response6);
        String str8 = webLinkingResponse7.reason();
        org.junit.Assert.assertNotNull(byteArray3);
        org.junit.Assert.assertArrayEquals(byteArray3, new byte[] {});
        org.junit.Assert.assertNotNull(response6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire5 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire2);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList9 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray10 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest11 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList9, byteArray10);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList15 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray16 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest17 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList15, byteArray16);
        com.jcabi.http.request.BaseRequest baseRequest20 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList9, "PUT", byteArray16, (int) ' ', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            Response response21 = baseRequest20.fetch();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        RequestBody requestBody5 = baseRequest4.multipartBody();
        Wire wire6 = null;
        com.jcabi.http.wire.RetryWire retryWire7 = new com.jcabi.http.wire.RetryWire(wire6);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire8 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire7);
        com.jcabi.http.request.BaseRequest baseRequest10 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire8, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire11 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire8);
        Request request12 = baseRequest4.through((Wire) eTagCachingWire11);
        String str13 = eTagCachingWire11.toString();
        org.junit.Assert.assertNotNull(requestBody5);
        org.junit.Assert.assertNotNull(request12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ETagCachingWire()" + "'", str13, "ETagCachingWire()");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        com.jcabi.http.request.FakeRequest fakeRequest0 = new com.jcabi.http.request.FakeRequest();
        java.io.InputStream inputStream1 = null;
        Response response2 = fakeRequest0.fetch(inputStream1);
        org.junit.Assert.assertNotNull(response2);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        Wire wire0 = null;
        com.jcabi.http.wire.RetryWire retryWire1 = new com.jcabi.http.wire.RetryWire(wire0);
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire2 = new com.jcabi.http.wire.ETagCachingWire((Wire) retryWire1);
        com.jcabi.http.request.BaseRequest baseRequest4 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PUT");
        com.jcabi.http.wire.ETagCachingWire eTagCachingWire5 = new com.jcabi.http.wire.ETagCachingWire((Wire) eTagCachingWire2);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList9 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray10 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest11 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList9, byteArray10);
        java.util.ArrayList<java.util.Map.Entry<String, String>> strEntryList15 = new java.util.ArrayList<java.util.Map.Entry<String, String>>();
        byte[] byteArray16 = new byte[] {};
        com.jcabi.http.request.FakeRequest fakeRequest17 = new com.jcabi.http.request.FakeRequest((int) 'a', "", (java.util.Collection<java.util.Map.Entry<String, String>>) strEntryList15, byteArray16);
        com.jcabi.http.request.BaseRequest baseRequest20 = new com.jcabi.http.request.BaseRequest((Wire) eTagCachingWire2, "PATCH", (Iterable<java.util.Map.Entry<String, String>>) strEntryList9, "PUT", byteArray16, (int) ' ', (int) '4');
        RequestBody requestBody21 = baseRequest20.multipartBody();
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertArrayEquals(byteArray10, new byte[] {});
        org.junit.Assert.assertNotNull(byteArray16);
        org.junit.Assert.assertArrayEquals(byteArray16, new byte[] {});
        org.junit.Assert.assertNotNull(requestBody21);
    }
}

