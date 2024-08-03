package e2e;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
<<<<<<< HEAD:Java/allPlaywright/Borrar/playwright-cucumber-jvm-main/playwright-cucumber-jvm-main/src/test/java/e2e/RunCucumberTest.java
@SelectClasspathResource("e2e")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "e2e")
public class RunCucumberTest {
}
=======
@SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "qa.zalando.stepdefinitions")

public class TestRunner {
}
>>>>>>> origin/playwrightbdd260724:Java/allPlaywright/playwrightbdd260724/src/test/java/TestRunner.java
