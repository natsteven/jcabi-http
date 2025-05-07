package com.jcabi.http.wire;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AbstractResponseHeaderCacheAspect {
    int numSend = 0;
    int numConsult = 0;
    int numValidate = 0;

    @Pointcut("execution (* send(..))")
    public void wireSend() {}

    @Before("wireSend()")
    public void trackWireSend() {
        numSend++;
    }

    @Pointcut("execution (* consultCache(..))")
    public void consultCache() {}

    @Before("consultCache()")
    public void trackConsultCache() {
        if (numSend % 2 == 0) {
            System.err.println("Incorrect number of send calls before consultCache.");
        }
        numConsult++;
        if (numConsult > 2 && numValidate != (numConsult - 1)) {
            System.err.println("Incorrect number of validateCache and consultCache calls.");
        }
    }

    @Pointcut("execution (* validateCacheWithServer(..))")
    public void validateCache() {}

    @Before("validateCache()")
    public void trackValidateCache() {
        numValidate++;
        if (numValidate != (numConsult - 1)) {
            System.err.println("Incorrect number of consultCache calls before validateCache.");
        }
    }

    @Pointcut("execution (* uri(..))")
    public void endTest() {}

    @After("endTest()")
    public void trackTestEnd() {
        System.err.println("End of test.");

        System.err.print("Number of send calls: ");
        System.err.println(numSend);
        System.err.print("Number of consult calls: ");
        System.err.println(numConsult);
        System.err.print("Number of validate calls: ");
        System.err.println(numValidate);

        numSend = 0;
        numConsult = 0;
        numValidate = 0;
    }
}
