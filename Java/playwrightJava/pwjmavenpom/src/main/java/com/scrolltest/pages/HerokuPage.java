package com.scrolltest.pages;

import com.microsoft.playwright.Page;

public class HerokuPage {

    private final Page page;

    public HerokuPage(Page page) {
        this.page = page;
    }

    // All locators fo HerokuPage here
    String headWelcomeToTheInternet = "h1.heading";
    String availableExamples = "h2";
    public String abTesting = "a[href='/abtest']";
    public String addRemoveElements = "a[href='/add_remove_elements/']";

    public String basicAuth = "a[href='/basic_auth']";
    public String brokenImages = "a[href='/broken_images']";
    public String challengingDOM = "a[href='/challenging_dom']";
    public String checkboxes = "a[href='/checkboxes']";
    public String contextMenu = "a[href='/context_menu']";
    public String digestAuthentication = "a[href='/digest_auth']";
    public String disappearingElements = "a[href='/disappearing_elements']";
    public String dragAndDrop = "a[href='/drag_and_drop']";
    public String dropdown = "a[href='/dropdown']";
    public String dynamicContent = "a[href='/dynamic_content']";
    public String dynamicControls = "a[href='/dynamic_controls']";
    public String dynamicLoading = "a[href='/dynamic_loading']";
    public String entryAd = "a[href='/entry_ad']";
    public String exitIntent = "a[href='/exit_intent']";
    public String fileDownload = "a[href='/download']";
    public String fileUpload = "a[href='/upload']";
    public String floatingMenu = "a[href='/floating_menu']";
    public String forgotPassword = "a[href='/forgot_password']";
    public String formAuthentication = "a[href='/login']";
    public String frames = "a[href='/frames']";
    public String geolocation = "a[href='/frames']";
    public String horizontalSlider = "a[href='/horizontal_slider']";
    public String hovers = "a[href='/hovers']";
    public String infiniteScroll = "a[href='/infinite_scroll']";
    public String inputs = "a[href='/inputs']";
    public String JQueryUIMenus = "a[href='/jqueryui/menu']";
    public String javaScriptAlerts = "a[href='/javascript_alerts']";
    public String javaScriptOnloadEventError = "a[href='/javascript_error']";
    public String keyPresses = "a[href='/key_presses']";
    public String largeAndDeepDOM = "a[href='/large']";
    public String multipleWindows = "a[href='/large']";
    public String nestedFrames = "a[href='/nested_frames']";
    public String notificationMessages = "a[href='/notification_message']";
    public String redirectLink = "a[href='/redirector']";
    public String secureFileDownload = "a[href='/download_secure']";
    public String shadowDOM = "a[href='/shadowdom']";
    public String shiftingContent = "a[href='/shifting_content']";
    public String slowResources = "a[href='/slow']";
    public String sortableDataTables = "a[href='/tables']";
    public String statusCodes = "a[href='/status_codes']";
    public String typos = "a[href='/typos']";
    public String wYSIWYGEditor = "a[href='/tinymce']";




}
