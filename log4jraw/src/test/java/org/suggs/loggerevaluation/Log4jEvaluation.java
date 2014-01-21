package org.suggs.loggerevaluation;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.Date;

public class Log4jEvaluation {

    private static final Logger LOG = LogManager.getLogger(Log4jEvaluation.class);
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
            LOG.trace(String.format("A trace string with date %s", NOW));
            LOG.debug(String.format("A debug string with integer %d", INT));
            LOG.info(String.format("An info string with double %f", DOUBLE));
            LOG.warn(String.format("A warn string with boolean %s", BOOL));
            LOG.error(String.format("A error string with float %f", FLOAT));
        }
        long end = System.currentTimeMillis();
        LOG.error(String.format("Test execution time was [%d]", end - start));

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
        }
    }
}
