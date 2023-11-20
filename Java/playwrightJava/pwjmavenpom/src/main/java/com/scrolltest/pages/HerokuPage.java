package com.scrolltest.pages;

import com.microsoft.playwright.Page;

public class HerokuPage {

    private final Page page;

    // All Selectors of this page must be here

    public HerokuPage(Page page) {
        this.page = page;
    }

    // All locators fo HerokuPage here:
    String headWelcomeToTheInternet = "h1.heading";
    String availableExamples = "h2";
    public String abTesting = "a[href='/abtest']";



}
