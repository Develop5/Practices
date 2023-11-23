package com.scrolltest.pages;

import com.microsoft.playwright.Page;

public class ABTestingPage {

    private final Page page;

    public ABTestingPage(Page page) {
        this.page = page;
    }

    String abTestingTitle = "A/B Test Control";
    String abTestingURL = "http://the-internet.herokuapp.com/abtest";


}
