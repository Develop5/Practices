package com.scrolltest.tests;

import com.scrolltest.pages.LoginVWOPage;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginVWOTest extends BaseTestClass {
    LoginVWOPage loginPage;

    @BeforeClass
    @Parameters({ "url", "browserName" , "headless"})

    // Here we need to change the URL to point to the new site, as this is not working
    // It is better to have a variable in the resources folder or any other POM proposal
    public void browserStart(@Optional("https://app.vwo.com/#/login") String url,
                                  @Optional("chrome") String browserName, @Optional("false") String headless) {
        launchPlaywright(browserName, headless);
        launchApplication(url);
    }

    @Test(priority = 1)
    @Parameters({ "username", "password" })
    public void loginTest(@Optional("93npu2yyb0@esiix.com") String username, @Optional("Wingify@123") String password) {
        loginPage = new LoginVWOPage(page);
        boolean isLoginSuccess = loginPage.login(username, password);
        Assert.assertEquals(isLoginSuccess, true);
        //Assert.assertEquals(isLoginSuccess, true);
    }

    @AfterClass
    public void browserClose() {
        closePlaywright();
    }
}
