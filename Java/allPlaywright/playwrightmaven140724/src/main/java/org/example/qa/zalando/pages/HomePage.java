package org.example.qa.zalando.pages;

import com.microsoft.playwright.Keyboard;
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

    private String locator_searchbar = "#header-search-input";

    private String selected_category = ".FxZV-M.HlZ_Tf.CzGCn5";

    private String images_category = ".L5YdXz._0xLoFW._7ckuOK.mROyo1";

    public String[][] getAllLocators(){
        String[][] allLocators = {
                {"title",this.title},
                {"Hombre_Button", this.Hombre_Button},
                {"Mujer_Button", this.Mujer_Button},
                {"Ninnos_Button", this.Ninnos_Button},
                {"search_bar", this.search_bar},
                {"locator_searchbar", this.locator_searchbar},
                {"selected_category", this.selected_category},
                {"images_category", this.images_category}};
        return allLocators;
    }


    // 2. Page constructor
    public HomePage(Page page){
        this.page = page;
    }


    // 3. Page actions/methods
    public String getHomePageTitle(){
        return page.title();
    }

    public void clickGroupMujer(){
        page.click(Mujer_Button);
    }
    public void clickGroupHombre(){
        page.click(Hombre_Button);
    }
    public void clickGroupNinnos(){
        page.click(Ninnos_Button);
    }

    public String getHomePageURL(){
        String url =  page.url();
        return page.url();
    }



    public void highlightElement(String elementName){

        switch (elementName.toLowerCase()) {
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
        String auxiliar_ClassName = "Class: " + getClass().getName() + ": ";
        if(barLocator.equalsIgnoreCase("Search Bar") ) {
            page.locator(locator_searchbar).click();
            page.locator(locator_searchbar).type(inputText);
            logger.info("enterTextInBar -> URL: " + page.url());
            page.locator(locator_searchbar).highlight();
            Keyboard.PressOptions pressOptions = new Keyboard.PressOptions();
            pressOptions.setDelay(1000);
            page.keyboard().press("Enter");
            page.waitForLoadState();
            logger.info(auxiliar_ClassName + "Search bar filled up");
        }
        else logger.info(auxiliar_ClassName + " Nothing written...");
    }

    public boolean elementVisibility(String elementName){
        if(elementName.equalsIgnoreCase("Category")){
            highlightElement("Category");
            page.locator(selected_category).waitFor();
            return (page.locator(selected_category).isVisible());
        }
        else return false;
    }

    public boolean containText(String elementName, String textToBecontained){
        if (elementName.equals("Category")) {
            logger.info("Class: " + getClass().getName() + " : " + textToBecontained);
            String temp = page.locator(selected_category).innerText();
            return (temp.contains(textToBecontained));
        }
        else return false;

    }

    public void pauseHomePage(){
        page.pause();
    }






}
