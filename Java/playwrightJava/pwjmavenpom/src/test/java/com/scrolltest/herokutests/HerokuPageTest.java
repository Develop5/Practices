package com.scrolltest.herokutests;

import com.scrolltest.pages.HerokuPage;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URISyntaxException;


public class HerokuPageTest extends BaseTestClass2{
    HerokuPage herokuPage;
    public JSONObject configuration  = herokuPage.getAllFromCommons();

    public HerokuPageTest() throws IOException, URISyntaxException, ParseException {
    }


    @Test
    public void theTest(){
        System.out.println("The browser is : " +  configuration.get("browser"));
        System.out.println("The headless condition is : " +  configuration.get("headless"));
    }



    @AfterClass
    public void goingOut(){
        System.out.printf("...Getting out of Heroku Test");
    }
}
