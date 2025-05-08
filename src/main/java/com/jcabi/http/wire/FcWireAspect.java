package com.jcabi.http.wire;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class FcWireAspect {
    int numFcWireSend = 0;
    int numFcCacheGet = 0;
    int numFcCacheSaved = 0;
    int numFcCacheResponse = 0;

    @Pointcut("execution (* FcWire.send(..))")
    public void FcWireSend() {}

    @Before("FcWireSend()")
    public void trackFcWireSend() {
        numFcWireSend++;
    }

    @Pointcut("execution (* FcCache.get(..))")
    public void FcCacheGet() {}

    @Before("FcCacheGet()")
    public void trackFcCacheGet() {
        if (numFcWireSend < 1) {
            System.err.println("Call to get() before send()");
        }
        numFcCacheGet++;
        if (numFcWireSend != numFcCacheGet) {
            System.err.println("Mismatch between calls to send() and get()");
        }
    }

    @Pointcut("execution (* FcCache.saved(..))")
    public void FcCacheSaved() {}

    @Before("FcCacheSaved()")
    public void trackFcCacheSaved() {
        if (numFcCacheSaved >= 1) {
            System.err.println("Too many calls to FcCache.saved()");
        }
        if (numFcCacheGet < 1) {
            System.err.println("Call to saved() before get()");
        }
        numFcCacheSaved++;
    }

    @Pointcut("execution (* FcCache.response(..))")
    public void FcCacheResponse() {}

    @Before("FcCacheResponse()")
    public void trackFcCacheResponse() {
        if (numFcCacheSaved < 1) {
            System.err.println("Did not see cache save.");
        }
        numFcCacheResponse++;
        if ((numFcCacheResponse != (numFcWireSend - 1)) || (numFcCacheResponse != (numFcCacheGet - 1))) {
            System.err.println("Mismatch between calls to CacheResponse() and preceding functions.");
        }
    }

    @Pointcut("execution (* method(..))")
    public void endTest() {}

    @After("endTest()")
    public void trackTestEnd() {
        System.err.println("End of test.");

        System.err.print("Number of send calls: ");
        System.err.println(numFcWireSend);
        System.err.print("Number of cache get calls: ");
        System.err.println(numFcCacheGet);
        System.err.print("Number of cache save calls: ");
        System.err.println(numFcCacheSaved);
        System.err.print("Number of cache response calls: ");
        System.err.println(numFcCacheResponse);

        numFcWireSend = 0;
        numFcCacheGet = 0;
        numFcCacheSaved = 0;
        numFcCacheResponse = 0;
    }
}
