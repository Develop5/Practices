package com.scrolltest.herokutests;

import com.scrolltest.pages.HerokuPage;
import org.apache.commons.io.IOUtils;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class HerokuPageTest extends BaseTestClass2{
    HerokuPage herokuPage;
    @BeforeClass
    public void doSomething() throws IOException {
        System.out.println("Starting Heroku Test ...");

        String myResources;
        myResources = IOUtils.toString( getClass().getClassLoader().getResourceAsStream("commons.txt"), StandardCharsets.UTF_8);
        System.out.println("My Resources: " + myResources);


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
