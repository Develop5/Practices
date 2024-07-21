package org.example.qa.zalando.pages;

import com.microsoft.playwright.Page;

import static org.example.qa.zalando.factory.PlaywrightFactory.logger;

public class HomePage {

    Page page;

    // 1. String locators - OR
    private String Hombre_Button = "//span[@class='sDq_FX _2kjxJ6 dgII7d HlZ_Tf'][normalize-space()='Hombre']";

    //private String Mujer_Button = "//span[@class='sDq_FX _2kjxJ6 dgII7d HlZ_Tf'][normalize-space()='Mujer']";

    private String Mujer_Button = "//span[contains(text(),'Mujer')]";

    private String Ninnos_Button = "//span[@class='sDq_FX _2kjxJ6 dgII7d HlZ_Tf'][normalize-space()='Niños']";


    // 2. Page constructor
    public HomePage(Page page){
        this.page = page;
    }


    // 3. Page actions/methods
    public String getHomePageTitle(){
        return page.title();
    }

    public void clickGroup(String whichGroup){
        switch (whichGroup.toLowerCase()) {
            case "mujer":
                page.click(Mujer_Button);
                break;
            case "hombre":
                page.click(Hombre_Button);
                break;
            case "ninnos":
                page.click(Ninnos_Button);
                break;

            default:
                logger.error("A non-existing group has been entered. No actions to be done......");
                break;
        }
    }

    public String getHomePageURL(){
        String url =  page.url();
        logger.trace("page url : " + url);
        return page.url();
    }

}
