package org.suggs.loggerevaluation;

import org.junit.Before;

public class Slf4jLog4j2Evaluation extends AbstractLoggerEvaluationTest {
    @Before
    public void setup() {
        System.setProperty("Log4jContextSelector", "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");
    }
}
