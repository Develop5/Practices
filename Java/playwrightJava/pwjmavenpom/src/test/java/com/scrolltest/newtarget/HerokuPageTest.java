package com.scrolltest.newtarget;

import com.scrolltest.pages.HerokuPage;
import org.testng.annotations.BeforeClass;

public class HerokuPageTest extends BaseTestClass2{
    HerokuPage herokuPage;
    @BeforeClass
    public void doAnything() {
        System.out.println("This is a test");
    }
}
