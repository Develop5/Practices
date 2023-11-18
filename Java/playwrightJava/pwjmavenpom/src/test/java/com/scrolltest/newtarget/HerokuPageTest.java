package com.scrolltest.newtarget;

import com.scrolltest.pages.HerokuPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HerokuPageTest extends BaseTestClass2{
    HerokuPage herokuPage;
    @BeforeClass
    public void doAnything() {
        System.out.println("Starting Heroku Test ...");
    }

    @Test
    public void theTest(){
        System.out.println("This is the test: " + this.getClass().getSimpleName());
    }
    @AfterClass
    public void goingOut(){
        System.out.printf("...etting out of Heroku Test");
    }
}
