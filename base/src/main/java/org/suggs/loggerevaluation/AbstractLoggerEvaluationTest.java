package org.suggs.loggerevaluation;


import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public abstract class AbstractLoggerEvaluationTest {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractLoggerEvaluationTest.class);
    private static final int loggerIterations = 10000;
    private static final Date NOW = new Date();
    private static final Double DOUBLE = 1.12d;
    private static final Boolean BOOL = true;
    private static final Integer INT = 1234;
    private static final Float FLOAT = 1.2f;

    @Test
    public void loggerSpeedShouldBeReallyFast() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < loggerIterations; i++) {
            LOG.trace("A trace string with date {}", NOW);
            LOG.debug("A debug string with integer {}", INT);
            LOG.info("An info string with double {}", DOUBLE);
            LOG.warn("A warn string with boolean {}", BOOL);
            LOG.error("A error string with float {}", FLOAT);
        }
        long end = System.currentTimeMillis();
        LOG.error("Test execution time was [{}]", end - start);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
        }
    }

}
