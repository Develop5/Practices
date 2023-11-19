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
    public JSONObject getProperties() throws IOException, URISyntaxException, ParseException, org.json.simple.parser.ParseException {
        System.out.println("Starting Heroku Test ...");
        URL url = getClass().getClassLoader().getResource(String.format("commons.json"));
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(url.getPath()));
        JSONObject jsonObject = (JSONObject)obj;
        return jsonObject;

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
