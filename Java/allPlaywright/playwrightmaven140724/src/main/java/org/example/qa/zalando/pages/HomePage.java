package org.example.qa.zalando.pages;

import com.microsoft.playwright.Keyboard;
import com.microsoft.playwright.Page;

import static org.example.qa.zalando.factory.PlaywrightFactory.logger;
import static org.example.qa.zalando.factory.PlaywrightFactory.takeScreenshotLocator;

public class HomePage {

    Page page;

    // 1. String locators - OR

    private String title = "//a[@class='dangerousLogoWidthBelowMobile']//*[name()='svg']";
    private String Hombre_Button = "//span[@class='sDq_FX _2kjxJ6 dgII7d HlZ_Tf'][normalize-space()='Hombre']";

    private String Mujer_Button = "//span[contains(text(),'Mujer')]";

    private String Ninnos_Button = "//span[@class='sDq_FX _2kjxJ6 dgII7d HlZ_Tf'][normalize-space()='Niños']";

    private String search_bar = "id='header-search-input'";

    private String locator_searchbar_placeholder = "Busca aquí";

    private String locator_searchbar = "#header-search-input";

    private String selected_category = ".sDq_FX.qQ75Zg.FxZV-M.HlZ_Tf.CzGCn5";

    private String images_category = ".L5YdXz._0xLoFW._7ckuOK.mROyo1";



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


    public void highlightElement(String locator){

        switch (locator.toLowerCase()) {
            case "search bar":
                page.getByPlaceholder(locator_searchbar_placeholder).highlight();
                logger.info("Search bar highlighted...");
                break;

            case "category":
                page.locator(selected_category).highlight();
                logger.info("Category highlighted...");
                break;

            case "title":
                page.locator(title).highlight();
                logger.info("Title highlighted...");
                break;

            default:
                logger.error("Locator not identified. No actions to be done......");
                break;
        }
    }

    public void enterTextInBar(String barLocator, String inputText){
        if(barLocator.equalsIgnoreCase("Search Bar") ) {
            //page.getByPlaceholder(locator_searchbar_placeholder).click();
            page.locator(locator_searchbar).click();

            //page.getByPlaceholder(locator_searchbar_placeholder).fill(inputText);
            page.locator(locator_searchbar).type(inputText);

            logger.info("enterTextInBar -> URL: " + page.url());

            //page.getByPlaceholder(locator_searchbar_placeholder).highlight();
            page.locator(locator_searchbar).highlight();


            Keyboard.PressOptions pressOptions = new Keyboard.PressOptions();
            pressOptions.setDelay(2000);
            //page.keyboard().press("Enter", pressOptions);


            page.keyboard().press("Enter");
            page.keyboard().press("Enter");
            page.keyboard().press("Enter");
            page.waitForLoadState();

            takeScreenshotLocator();


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

    public void waitUntilLoad(){
        page.locator(selected_category).waitFor();
        page.locator(selected_category).isVisible();
    }




}
