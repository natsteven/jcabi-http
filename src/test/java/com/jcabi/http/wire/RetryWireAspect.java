package com.jcabi.http.wire;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class RetryWireAspect {
    private boolean entry = false;
    private int numWireSend = 0;

    @Pointcut("execution (* RetryWire.send(..))")
    public void retryWireSend() {}

    @Pointcut("execution (* send(..))")
    public void wireSend() {}

    @Before("retryWireSend()")
    public void trackRetryWireSend() {
        entry = true; // Stop other tests from seeing this aspect's prints.
        numWireSend--; // Don't count the Retry send, only the internal one.
    }

    @Before("wireSend()")
    public void trackWireSend() {
        if (numWireSend >= 4 && entry) {
            System.err.println("Too many calls to Wire.send()");
        }
        numWireSend++;
    }

    @Pointcut("execution (* reset(..))")
    public void testEnd() {}

    @After("testEnd()")
    public void trackTestEnd() {
        System.err.println("End of test.");
        System.err.print("Retry calls (expect 1-4 if test passed, 4 if test threw exception): ");
        System.err.println(numWireSend);

        numWireSend = 0;
    }
}
