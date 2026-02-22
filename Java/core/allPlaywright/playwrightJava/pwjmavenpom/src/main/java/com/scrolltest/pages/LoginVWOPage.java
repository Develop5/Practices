package com.scrolltest.pages;

import com.microsoft.playwright.Page;

public class LoginVWOPage {

    private final Page page;

    String usernameBox = "#login-username";
    String passwordBox = "#login-password";
    String loginButton = "#js-login-btn";
    String welcomeProfileButton = "[data-qa='lufexuloga']";

    public LoginVWOPage(Page page) {
        this.page = page;
    }

    public boolean login(String username, String password) {
        System.out.println("***** username *******:  " + username);
        System.out.println("***** password *******:  " + password);
        boolean isLoginSuccess = false;
        page.fill(usernameBox, username);

        /*
        Should credentials be:      ?
        ***** username *******:  93npu2yyb0@esiix.com
        ***** password *******:  Wingify@123

         */
        page.fill(passwordBox, password);           // Issue here: check oiginal password
        page.click(loginButton);



        page.waitForSelector(welcomeProfileButton).isVisible();
        boolean isEnabled = page.isEnabled("input");
        if (isEnabled) {
            isLoginSuccess = true;
        }
        return isLoginSuccess;
    }
}
