package org.qa.testproject.pages;

import com.microsoft.playwright.Page;

import static org.qa.testproject.factory.PlaywrightFactory.logger;

public class HomePage {

    Page page;

    // 1. String locators - OR

    private final String title = "//a[@class='dangerousLogoWidthBelowMobile']//*[name()='svg']";
    private final String Hombre_Button = "//span[@class='sDq_FX _2kjxJ6 dgII7d HlZ_Tf'][normalize-space()='Hombre']";

    private final String Mujer_Button = "//span[contains(text(),'Mujer')]";

    private final String Ninnos_Button = "//span[@class='sDq_FX _2kjxJ6 dgII7d HlZ_Tf'][normalize-space()='Niños']";

    private final String search_bar = "id='header-search-input'";

    private final String locator_searchbar_placeholder = "Busca aquí";

    private final String locator_searchbar = "#header-search-input";

    private final String selected_category = ".FxZV-M.HlZ_Tf.CzGCn5";

    private final String images_category = ".L5YdXz._0xLoFW._7ckuOK.mROyo1";


    // 2. Page constructor
    public HomePage(Page page) {
        this.page = page;
    }


    // 3. Page actions/methods
    public String getHomePageTitle() {
        return page.title();
    }

    public void clickGroupMujer() {
        page.click(Mujer_Button);
    }

    public void clickGroupHombre() {
        page.click(Hombre_Button);
    }

    public void clickGroupNinnos() {
        page.click(Ninnos_Button);
    }

    public void goToPage(String newUrl) {
        logger.info("----> Navigating to another url...");
        logger.info("----> Initial url: " + page.url());
        page.navigate(newUrl);
        page.waitForLoadState();
        logger.info("----> Final url: " + page.url());
    }


    public String getHomePageCurrentURL() {
        String url = page.url();
        return page.url();
    }

    public void enterTextInBar(String barLocator, String inputText) {
        page.locator(locator_searchbar).waitFor();
        page.locator(locator_searchbar).click();
        page.locator(locator_searchbar).type(inputText);
        page.locator(locator_searchbar).highlight();
        page.keyboard().press("Enter");
        page.locator(locator_searchbar).waitFor();
        page.locator(locator_searchbar).highlight();
        page.waitForURL("**/?q=Bolsos");
        logger.info("----> Search bar filled up");
    }


    public boolean categoryVisible() {
        highlightElement(selected_category);
        page.locator(selected_category).waitFor();
        page.locator(selected_category).focus();
        return (page.locator(selected_category).isVisible());
    }

    public boolean categoryContainsText(String textToBecontained) {
        String categoryText = page.locator(selected_category).innerText();
        return (categoryText.contains(textToBecontained));
    }

    public void pauseHomePage() {
        page.pause();
    }

    public void enterTextSearchBar(String textToInput) {
        enterTextInBar(locator_searchbar, textToInput);
        page.locator(selected_category).waitFor();      // Needs to wait until new page is ready
        highlightElement(selected_category);
    }

    public void highlightElement(String locator) {
        page.locator(locator).highlight();
        page.locator(locator).focus();
    }

    public void highlightSearchBar() {
        page.locator(search_bar).focus();
        page.locator(search_bar).highlight();
    }


    public void highlightCategory() {
        page.locator(selected_category).focus();
        page.locator(selected_category).highlight();
    }

    public void highlightHomeTitle() {
        page.locator(title).focus();
        page.locator(title).highlight();
    }


}
