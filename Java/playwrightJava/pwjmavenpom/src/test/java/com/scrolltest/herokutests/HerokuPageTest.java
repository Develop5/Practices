package com.scrolltest.herokutests;

import com.scrolltest.pages.HerokuPage;
import net.minidev.json.parser.ParseException;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;



public class HerokuPageTest extends BaseTestClass2{
    HerokuPage herokuPage;

    @BeforeClass
    public void doSomething() throws IOException, URISyntaxException, ParseException, org.json.simple.parser.ParseException {
        System.out.println("Starting Heroku Test ...");
        URL url = getClass().getClassLoader().getResource(String.format("commons.json"));
        //System.out.println("\n Filename" + url.getPath());
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(url.getPath()));
        //System.out.println("\nObjeto: " + obj.toString());
        JSONObject jsonObject = (JSONObject)obj;
        System.out.println("Browser: " + jsonObject.get("browser"));
        System.out.println("headless condition: " + jsonObject.get("headless"));
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
