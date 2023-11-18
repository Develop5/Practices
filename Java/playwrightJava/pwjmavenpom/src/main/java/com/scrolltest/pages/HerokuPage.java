package com.scrolltest.pages;

import com.microsoft.playwright.Page;

public class HerokuPage {

    private final Page page;

    public HerokuPage(Page page) {
        this.page = page;
    }

    public boolean tellMeItIsTrue() {
        return true;
    }
}
