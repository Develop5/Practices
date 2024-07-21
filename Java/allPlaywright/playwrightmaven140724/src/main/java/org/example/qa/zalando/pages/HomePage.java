package org.example.qa.zalando.pages;

import com.microsoft.playwright.Page;

import static org.example.qa.zalando.factory.PlaywrightFactory.logger;

public class HomePage {

    Page page;

    // 1. String locators - OR
    private String Hombre = "//span[@class='sDq_FX _2kjxJ6 dgII7d HlZ_Tf'][normalize-space()='Hombre']";
    private String Mujer = "//span[@class='sDq_FX _2kjxJ6 dgII7d HlZ_Tf'][normalize-space()='Mujer']";
    private String Ninnos = "//span[@class='sDq_FX _2kjxJ6 dgII7d HlZ_Tf'][normalize-space()='Niños']";


    // 2. Page constructor
    public HomePage(Page page){
        this.page = page;
    }


    // 3. Page actions/methods
    public String getHomePageTitle(){
        return page.title();
    }

    public String getHomePageURL(){
        String url =  page.url();
        logger.trace("page url : " + url);
        return page.url();
    }

}
