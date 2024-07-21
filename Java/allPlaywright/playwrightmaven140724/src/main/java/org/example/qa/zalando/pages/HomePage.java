package org.example.qa.zalando.pages;

import com.microsoft.playwright.Page;

import static org.example.qa.zalando.factory.PlaywrightFactory.logger;

public class HomePage {

    Page page;

    // 1. String locators - OR

    private String title = "//a[@class='dangerousLogoWidthBelowMobile']//*[name()='svg']";
    private String Hombre_Button = "//span[@class='sDq_FX _2kjxJ6 dgII7d HlZ_Tf'][normalize-space()='Hombre']";

    private String Mujer_Button = "//span[contains(text(),'Mujer')]";

    private String Ninnos_Button = "//span[@class='sDq_FX _2kjxJ6 dgII7d HlZ_Tf'][normalize-space()='Niños']";

    private String search_bar = "id='header-search-input'";

    private String locator_searchbar_placeholder = "Busca aquí";

    private String selected_category = ".sDq_FX.qQ75Zg.FxZV-M.HlZ_Tf.CzGCn5";



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
        return page.url();
    }

    public void hightlightTitle() {
        page.locator(title).highlight();
    }

    public void highlightElement(String locator){
        if (locator.equalsIgnoreCase("search bar")) {
            page.getByPlaceholder(locator_searchbar_placeholder).highlight();
            logger.info("Search bar highlighted...");
        } else if (locator.equalsIgnoreCase("Category")) {
            page.locator(selected_category).highlight();
            logger.info("Search bar highlighted...");
        } else {logger.info("Search bar not found...");}
    }

    public void enterTextInBar(String barLocator, String inputText){
        if(barLocator.equalsIgnoreCase("Search Bar") ) {
            page.getByPlaceholder(locator_searchbar_placeholder).click();
            page.getByPlaceholder(locator_searchbar_placeholder).fill(inputText);
            page.keyboard().press("Enter");
            logger.info("Search bar filled up");
        }
        else logger.info("Nothing written...");
    }

    public boolean elementVisibility(String locator){
        if(locator.equalsIgnoreCase("Category")){
            highlightElement("Category");
            return (page.locator(selected_category).isVisible());
        }
        else return false;
    }

    public void pauseHomePage(){
        page.pause();
    }



}
