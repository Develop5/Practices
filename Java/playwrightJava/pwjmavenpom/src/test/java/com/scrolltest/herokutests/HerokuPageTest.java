package com.scrolltest.herokutests;

import com.scrolltest.pages.HerokuPage;
import com.scrolltest.utilities.UtilitiesHerokuSite;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.IOException;
import java.net.URISyntaxException;

import static com.scrolltest.utilities.UtilitiesHerokuSite.*;
import static org.testng.Assert.*;


public class HerokuPageTest extends BaseTestClass2{
    HerokuPage HerokuPage;

    public JSONObject configuration  = UtilitiesHerokuSite.getAllFromCommons();

    public HerokuPageTest() throws IOException, URISyntaxException, ParseException {
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
        assertEquals(checkElementVisibility(HerokuPage.abTesting), true);

        Assert.assertEquals(checkElementVisibility(HerokuPage.addRemoveElements), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.basicAuth), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.brokenImages), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.challengingDOM), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.checkboxes), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.contextMenu), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.digestAuthentication), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.disappearingElements), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.dragAndDrop), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.dropdown), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.dynamicContent), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.dynamicControls), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.dynamicLoading), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.entryAd), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.exitIntent), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.fileDownload), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.fileUpload), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.floatingMenu), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.forgotPassword), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.formAuthentication), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.frames), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.geolocation), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.horizontalSlider), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.hovers), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.infiniteScroll), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.inputs), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.JQueryUIMenus), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.javaScriptAlerts), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.javaScriptOnloadEventError), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.keyPresses), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.largeAndDeepDOM), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.multipleWindows), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.nestedFrames), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.notificationMessages), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.redirectLink), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.secureFileDownload), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.shadowDOM), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.shiftingContent), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.slowResources), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.sortableDataTables), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.statusCodes), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.typos), true);
        Assert.assertEquals(checkElementVisibility(HerokuPage.wYSIWYGEditor), true);

    }

    @Test
    public void abTestingNavigation(){


    }




    @AfterClass
    public void browserClose(){
        closePlaywright();
    }
}
