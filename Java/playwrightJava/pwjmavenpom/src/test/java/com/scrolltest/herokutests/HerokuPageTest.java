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
    HerokuPage herokuPage;
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
    public void abTestingTest(){
        System.out.println("object Page: " + page.waitForSelector("a[href='/abtest']"));

        // This object is null
        //System.out.println("object Page: " + herokuPage);


        //Assert.assertEquals(checkElementVisibility(herokuPage.abTesting), true);

        // The locator is correct. Then, the page is not reached as an object
        //Assert.assertEquals(checkElementVisibility("a[href='/abtest']"), true);
    }



    @AfterClass
    public void browserClose(){
        closePlaywright();
    }
}
