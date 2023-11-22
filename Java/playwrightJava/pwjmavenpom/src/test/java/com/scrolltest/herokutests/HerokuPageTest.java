package com.scrolltest.herokutests;

import com.scrolltest.pages.HerokuPage;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;


public class HerokuPageTest extends BaseTestClass2{
    //HerokuPage herokuPage;

    HerokuPage testPage = new HerokuPage(page);

    public JSONObject configuration  = this.getAllFromCommons();

    public HerokuPageTest() throws IOException, URISyntaxException, ParseException {
    }

    public static JSONObject getAllFromCommons() throws IOException, URISyntaxException, ParseException, org.json.simple.parser.ParseException {
        // This is a utility method where all parameters are loaded from commons.json
        // Consider to take it to the base page and let this class only for tests
        URL url = HerokuPageTest.class.getClassLoader().getResource(String.format("commons.json"));
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(url.getPath()));
        JSONObject jsonObject = (JSONObject)obj;
        return jsonObject;
    }

    @BeforeClass
    // Browser, url and other conditions are loaded from commons.json
    public void browserStart() {
        launchPlaywright(configuration.get("browser").toString(), configuration.get("headless").toString());
        launchApplication((String)configuration.get("herokuapp_url"));

        System.out.println("\nThe browser is : " +  configuration.get("browser"));
        System.out.println("The headless condition is : " +  configuration.get("headless"));
        System.out.println("url is : " +  configuration.get("herokuapp_url"));
    }

    @Test
    public void allElementsVisible(){
        Assert.assertEquals(checkElementVisibility(testPage.abTesting), true);
        Assert.assertEquals(checkElementVisibility(testPage.addRemoveElements), true);
        Assert.assertEquals(checkElementVisibility(testPage.basicAuth), true);
        Assert.assertEquals(checkElementVisibility(testPage.brokenImages), true);
        Assert.assertEquals(checkElementVisibility(testPage.challengingDOM), true);
        Assert.assertEquals(checkElementVisibility(testPage.checkboxes), true);
        Assert.assertEquals(checkElementVisibility(testPage.contextMenu), true);
        Assert.assertEquals(checkElementVisibility(testPage.digestAuthentication), true);
        Assert.assertEquals(checkElementVisibility(testPage.disappearingElements), true);
        Assert.assertEquals(checkElementVisibility(testPage.dragAndDrop), true);
        Assert.assertEquals(checkElementVisibility(testPage.dropdown), true);
        Assert.assertEquals(checkElementVisibility(testPage.dynamicContent), true);
        Assert.assertEquals(checkElementVisibility(testPage.dynamicControls), true);
        Assert.assertEquals(checkElementVisibility(testPage.dynamicLoading), true);
        Assert.assertEquals(checkElementVisibility(testPage.entryAd), true);
        Assert.assertEquals(checkElementVisibility(testPage.exitIntent), true);
        Assert.assertEquals(checkElementVisibility(testPage.fileDownload), true);
        Assert.assertEquals(checkElementVisibility(testPage.fileUpload), true);
        Assert.assertEquals(checkElementVisibility(testPage.floatingMenu), true);
        Assert.assertEquals(checkElementVisibility(testPage.forgotPassword), true);
        Assert.assertEquals(checkElementVisibility(testPage.formAuthentication), true);
        Assert.assertEquals(checkElementVisibility(testPage.frames), true);
        Assert.assertEquals(checkElementVisibility(testPage.geolocation), true);
        Assert.assertEquals(checkElementVisibility(testPage.horizontalSlider), true);
        Assert.assertEquals(checkElementVisibility(testPage.hovers), true);
        Assert.assertEquals(checkElementVisibility(testPage.infiniteScroll), true);
        Assert.assertEquals(checkElementVisibility(testPage.inputs), true);
        Assert.assertEquals(checkElementVisibility(testPage.JQueryUIMenus), true);
        Assert.assertEquals(checkElementVisibility(testPage.javaScriptAlerts), true);
        Assert.assertEquals(checkElementVisibility(testPage.javaScriptOnloadEventError), true);
        Assert.assertEquals(checkElementVisibility(testPage.keyPresses), true);
        Assert.assertEquals(checkElementVisibility(testPage.largeAndDeepDOM), true);
        Assert.assertEquals(checkElementVisibility(testPage.multipleWindows), true);
        Assert.assertEquals(checkElementVisibility(testPage.nestedFrames), true);
        Assert.assertEquals(checkElementVisibility(testPage.notificationMessages), true);
        Assert.assertEquals(checkElementVisibility(testPage.redirectLink), true);
        Assert.assertEquals(checkElementVisibility(testPage.secureFileDownload), true);
        Assert.assertEquals(checkElementVisibility(testPage.shadowDOM), true);
        Assert.assertEquals(checkElementVisibility(testPage.shiftingContent), true);
        Assert.assertEquals(checkElementVisibility(testPage.slowResources), true);
        Assert.assertEquals(checkElementVisibility(testPage.sortableDataTables), true);
        Assert.assertEquals(checkElementVisibility(testPage.statusCodes), true);
        Assert.assertEquals(checkElementVisibility(testPage.typos), true);
        Assert.assertEquals(checkElementVisibility(testPage.wYSIWYGEditor), true);

    }






    @AfterClass
    public void browserClose(){
        closePlaywright();
    }
}
