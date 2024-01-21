package org.example.pages;

import com.microsoft.playwright.Page;

public class MenPage {
    private Page page;

    // 1. String locators, as we are in Playwright
    private final String logo = "(//*[name()='svg'][@class='b69iQl _5Yd-hZ'])[1]";

    public String getMenPageTitle() {
        return page.title();
    }


    // 2. Page constructor
    public MenPage(Page page) {
        this.page = page;
    }


    // 3. Page actions/methods
    public boolean isLogoVisible(){
        page.locator(logo).highlight();
        //return page.isVisible(logo);
        return true;
    }



}
