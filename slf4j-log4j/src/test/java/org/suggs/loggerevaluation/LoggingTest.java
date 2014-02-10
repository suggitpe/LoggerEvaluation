package org.suggs.loggerevaluation;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingTest {
    private static final Logger LOG = LoggerFactory.getLogger(LoggingTest.class);

    @Test
    public void foo() {
        try {
            throw new IllegalStateException("This is bad");
        } catch (RuntimeException e) {
            LOG.debug("Foo [{}]", "with a string", e);
        }
    }
}
