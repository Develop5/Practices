package api.utilities;

/*
Review here,to fix when tests are failing
https://stackoverflow.com/questions/51502168/extent-reports-tests-always-reporting-pass

 */
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.launcher.TestIdentifier;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 Usage:
 Test class should be annotated with @ExtendWith(ExtentReportManager.class)

 From:
 https://github.com/extent-framework/extentreports-java

 HTML report here, ready to be visualized in a browser:
 Java/restassuredsample/target/report/TestReport.html

 */
public class ExtentReportManager implements BeforeAllCallback, BeforeTestExecutionCallback, AfterTestExecutionCallback {
    private static ExtentReports extent = new ExtentReports();
    private ExtentTest test;
    String reportName;
    private int successTests;
    private int failTests;
    private int skipTests;

    @Override
    public void beforeAll(ExtensionContext context) {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss")
                .format(new Date());
        reportName = "TestReport-" + timestamp + ".html";
        ExtentSparkReporter spark = new ExtentSparkReporter("target\\reports\\" + reportName);

        extent.attachReporter(spark);
        extent.setSystemInfo("Application", "Pet Store Users API");
        extent.setSystemInfo("Operating System", System.getProperty("os.name"));
        extent.setSystemInfo("User name", System.getProperty("user.name"));
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("User", "Lourdes");

        spark.config().setDocumentTitle("RestAssured_Automation_Project");
        spark.config().setReportName("Pet Store Users API");
        spark.config().setTheme(Theme.DARK);
        context.getStore(ExtensionContext.Namespace.GLOBAL).put("TestReport", new CustomAfterSuite());
        test = extent.createTest(context.getDisplayName());

    }


    public void onTestSuccess(TestIdentifier testIdentifier,
                              TestExecutionResult testExecutionResult ) {
        //test = extent.createTest(testIdentifier.getDisplayName());
                //.log(Status.PASS, "Test Passed");
    }

    public void onTestFail(TestIdentifier testIdentifier,
                              TestExecutionResult testExecutionResult ) {
        //test = extent.createTest(testIdentifier.getDisplayName());
                //.log(Status.FAIL, "Test Failed");
    }
    public void onTestSkip(TestIdentifier testIdentifier,
                              TestExecutionResult testExecutionResult ) {
        //test = extent.createTest(testIdentifier.getDisplayName());
                //.log(Status.SKIP, "Test Skipped");
    }


    @Override
    public void beforeTestExecution(ExtensionContext context) {
        //test.createNode(context.getDisplayName());            // No needed, as it is only 1 level
    }

    @Override
    public void afterTestExecution(ExtensionContext context) {
        if (!context.getExecutionException().isPresent()) {
            test.pass(context.getParent().get().getDisplayName()+ " "
                    + context.getDisplayName()
                    + "        >> passed");

        } else {
            test.fail(context.getParent().get().getDisplayName()+ " "
                    + context.getDisplayName()
                    + "        >> passed");
            test.addScreenCaptureFromPath("../../" + ScreenshotUtil.takeScreenshot().getPath(), context.getDisplayName());
        }
    }

    private static class CustomAfterSuite implements ExtensionContext.Store.CloseableResource {
        @Override
        public void close() {
            extent.flush();
        }
    }


}