package com.scrolltest.herokutests;

import com.scrolltest.pages.HerokuMainPage;
import com.scrolltest.utilities.UtilitiesHerokuSite;
import org.json.simple.*;
import org.json.simple.parser.ParseException;
import org.testng.annotations.*;

import java.io.IOException;
import java.net.URISyntaxException;

import static com.scrolltest.pages.ABTestingPage.*;
import static org.testng.Assert.*;


public class HerokuMainPageTest extends BaseTestHerokuClass {
    HerokuMainPage HerokuPage;

    public JSONObject configuration  = UtilitiesHerokuSite.getAllFromCommons();

    public HerokuMainPageTest() throws IOException, URISyntaxException, ParseException {
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
        assertEquals(checkElementVisibility(HerokuPage.addRemoveElements), true);
        assertEquals(checkElementVisibility(HerokuPage.basicAuth), true);
        assertEquals(checkElementVisibility(HerokuPage.brokenImages), true);
        assertEquals(checkElementVisibility(HerokuPage.challengingDOM), true);
        assertEquals(checkElementVisibility(HerokuPage.checkboxes), true);
        assertEquals(checkElementVisibility(HerokuPage.contextMenu), true);
        assertEquals(checkElementVisibility(HerokuPage.digestAuthentication), true);
        assertEquals(checkElementVisibility(HerokuPage.disappearingElements), true);
        assertEquals(checkElementVisibility(HerokuPage.dragAndDrop), true);
        assertEquals(checkElementVisibility(HerokuPage.dropdown), true);
        assertEquals(checkElementVisibility(HerokuPage.dynamicContent), true);
        assertEquals(checkElementVisibility(HerokuPage.dynamicControls), true);
        assertEquals(checkElementVisibility(HerokuPage.dynamicLoading), true);
        assertEquals(checkElementVisibility(HerokuPage.entryAd), true);
        assertEquals(checkElementVisibility(HerokuPage.exitIntent), true);
        assertEquals(checkElementVisibility(HerokuPage.fileDownload), true);
        assertEquals(checkElementVisibility(HerokuPage.fileUpload), true);
        assertEquals(checkElementVisibility(HerokuPage.floatingMenu), true);
        assertEquals(checkElementVisibility(HerokuPage.forgotPassword), true);
        assertEquals(checkElementVisibility(HerokuPage.formAuthentication), true);
        assertEquals(checkElementVisibility(HerokuPage.frames), true);
        assertEquals(checkElementVisibility(HerokuPage.geolocation), true);
        assertEquals(checkElementVisibility(HerokuPage.horizontalSlider), true);
        assertEquals(checkElementVisibility(HerokuPage.hovers), true);
        assertEquals(checkElementVisibility(HerokuPage.infiniteScroll), true);
        assertEquals(checkElementVisibility(HerokuPage.inputs), true);
        assertEquals(checkElementVisibility(HerokuPage.JQueryUIMenus), true);
        assertEquals(checkElementVisibility(HerokuPage.javaScriptAlerts), true);
        assertEquals(checkElementVisibility(HerokuPage.javaScriptOnloadEventError), true);
        assertEquals(checkElementVisibility(HerokuPage.keyPresses), true);
        assertEquals(checkElementVisibility(HerokuPage.largeAndDeepDOM), true);
        assertEquals(checkElementVisibility(HerokuPage.multipleWindows), true);
        assertEquals(checkElementVisibility(HerokuPage.nestedFrames), true);
        assertEquals(checkElementVisibility(HerokuPage.notificationMessages), true);
        assertEquals(checkElementVisibility(HerokuPage.redirectLink), true);
        assertEquals(checkElementVisibility(HerokuPage.secureFileDownload), true);
        assertEquals(checkElementVisibility(HerokuPage.shadowDOM), true);
        assertEquals(checkElementVisibility(HerokuPage.shiftingContent), true);
        assertEquals(checkElementVisibility(HerokuPage.slowResources), true);
        assertEquals(checkElementVisibility(HerokuPage.sortableDataTables), true);
        assertEquals(checkElementVisibility(HerokuPage.statusCodes), true);
        assertEquals(checkElementVisibility(HerokuPage.typos), true);
        assertEquals(checkElementVisibility(HerokuPage.wYSIWYGEditor), true);

    }

    @Test
    public void navigateToABTestingPage(){
        page.click(HerokuPage.abTesting);
        assertEquals(checkElementVisibility(abTestingTitle), true);
        assertEquals(currentUrl(), abTestingURL);
    }



    @AfterClass
    public void browserClose(){
        closePlaywright();
    }
}
