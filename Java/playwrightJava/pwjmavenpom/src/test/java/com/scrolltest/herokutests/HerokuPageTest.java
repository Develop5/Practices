package com.scrolltest.herokutests;

import com.scrolltest.pages.HerokuPage;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
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
        URL url = HerokuPageTest.class.getClassLoader().getResource(String.format("commons.json"));
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(url.getPath()));
        JSONObject jsonObject = (JSONObject)obj;
        return jsonObject;
    }

    @BeforeClass
   // @Parameters({ "url", "browserName" , "headless"})

    // Here we need to change the URL to point to the new site, as this is not working
    // It is better to have a variable in the resources folder or any other POM proposal
    public void browserStart() {

        launchPlaywright(configuration.get("browser").toString(), configuration.get("headless").toString());
        launchApplication((String)configuration.get("herokuapp_url"));
    }

    @Test
    public void theTest(){
        System.out.println("\nThe browser is : " +  configuration.get("browser"));
        System.out.println("The headless condition is : " +  configuration.get("headless"));
        System.out.println("url is : " +  configuration.get("herokuapp_url"));


    }



    @AfterClass
    public void browserClose(){
        closePlaywright();
    }
}
