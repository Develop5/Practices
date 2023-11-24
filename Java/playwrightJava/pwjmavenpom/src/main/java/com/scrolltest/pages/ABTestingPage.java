package com.scrolltest.pages;

import com.microsoft.playwright.Page;

public class ABTestingPage {

    private final Page page;

    public ABTestingPage(Page page) {
        this.page = page;
    }

    // IT looks this should not be like this but a class per page

    String abTestingTitle = "A/B Test Control";
    String abTestingURL = "http://the-internet.herokuapp.com/abtest";


}
