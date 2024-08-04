package org.qa.testproject.base;

import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Report;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.microsoft.playwright.Page;
import org.qa.testproject.factory.PlaywrightFactory;
import org.qa.testproject.pages.HomePage;
import org.qa.testproject.pages.LoginPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;


public class BaseTest {

    static PlaywrightFactory pf;

    static Page page;
    protected static Properties prop;

    protected static Report report;

    protected static HomePage homePage;
    protected LoginPage loginPage;

    static ExtentSparkReporter extentSparkReporter;
    static ExtentReports extentReports;
    ExtentTest extentTest;


    @BeforeAll
    public static void setup() {

        pf = new PlaywrightFactory();
        prop = pf.read_properties();

        page = pf.initBrowser(prop);
        homePage = new HomePage(page);


        extentSparkReporter  = new ExtentSparkReporter(System.getProperty("user.dir") + "/test-output/extentReport.html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);


        //configuration items to change the look and feel
        //add content, manage tests etc
        extentSparkReporter.config().setDocumentTitle("Simple Automation Report");
        extentSparkReporter.config().setReportName("Test Report");
        extentSparkReporter.config().setTheme(Theme.STANDARD);
        extentSparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

    }

    @AfterAll
    public static void tearDown() {
        page.context().browser().close();
        extentReports.flush();
    }

}
