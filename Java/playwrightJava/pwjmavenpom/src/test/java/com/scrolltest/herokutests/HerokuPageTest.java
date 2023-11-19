package com.scrolltest.herokutests;

import com.google.gson.*;
import com.scrolltest.pages.HerokuPage;
import org.apache.commons.io.Charsets;
import org.json.JSONObject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;

import org.json.simple.parser.JSONParser;


public class HerokuPageTest extends BaseTestClass2{
    HerokuPage herokuPage;

    @BeforeClass
    public void doSomething() throws IOException, URISyntaxException {
        System.out.println("Starting Heroku Test ...");

        URL url = getClass().getClassLoader().getResource(String.format("commons.json"));

        System.out.println("File Name: " + url);

        Object obj;
        obj = parser.parse(new FileReader(url));
        JSONObject jsonObject = (JSONObject)obj;
        String name = (String)jsonObject.get("browser");
        String course = (String)jsonObject.get("headless");
        /*
        JSONObject obj= new JSONObject(url);
        String browserName = obj.getString("browser");
        String headlessCondition = obj.getString("headless");

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(" Browser: " + browserName);
        System.out.println(" headlessCondition: " + headlessCondition);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
         */

        // To make use of the following block, I need to be able to read the URL from resources
        /*
        public void browserStart(@Optional("https://app.vwo.com/#/login") String url,
                @Optional("chrome") String browserName, @Optional("false") String headless) {
            launchPlaywright(browserName, headless);
            launchApplication(url);
        }
         */
    }


    @Test
    public void theTest(){
        System.out.println("This is the test: " + this.getClass().getSimpleName());
    }
    @AfterClass
    public void goingOut(){
        System.out.printf("...Getting out of Heroku Test");
    }
}
