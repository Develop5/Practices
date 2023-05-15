package api.utilities;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

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
    ExtentSparkReporter spark = new ExtentSparkReporter("target\\report\\TestReport.html");

    private ExtentTest test;
    String reportName;


    @Override
    public void beforeAll(ExtensionContext context) {
        // To be used to generate new names in reports
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss")
                .format(new Date());
        reportName = "TestReport-" + timestamp + ".html";

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

    @Override
    public void beforeTestExecution(ExtensionContext context) {
        test.log(Status.INFO, context.getDisplayName() + " - started");
        test.createNode(context.getDisplayName());
    }

    @Override
    public void afterTestExecution(ExtensionContext context) {
        if (!context.getExecutionException().isPresent()) {
            test.pass(context.getDisplayName() + " - passed");
        } else {
            test.fail(context.getExecutionException().get().getLocalizedMessage());
            test.addScreenCaptureFromPath("../../" + ScreenshotUtil.takeScreenshot().getPath(), context.getDisplayName());
        }
    }

    //Used as no AfterSuite annotation available in Junit5 (as of 5.8.2 version)
    private static class CustomAfterSuite implements ExtensionContext.Store.CloseableResource {
        @Override
        public void close() {
            extent.flush();
        }
    }


}