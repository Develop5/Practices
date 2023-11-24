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
    public static String abTesting = "a[href='/abtest']";
    public static String addRemoveElements = "a[href='/add_remove_elements/']";

    public static String basicAuth = "a[href='/basic_auth']";
    public static String brokenImages = "a[href='/broken_images']";
    public static String challengingDOM = "a[href='/challenging_dom']";
    public static String checkboxes = "a[href='/checkboxes']";
    public static String contextMenu = "a[href='/context_menu']";
    public static String digestAuthentication = "a[href='/digest_auth']";
    public static String disappearingElements = "a[href='/disappearing_elements']";
    public static String dragAndDrop = "a[href='/drag_and_drop']";
    public static String dropdown = "a[href='/dropdown']";
    public static String dynamicContent = "a[href='/dynamic_content']";
    public static String dynamicControls = "a[href='/dynamic_controls']";
    public static String dynamicLoading = "a[href='/dynamic_loading']";
    public static String entryAd = "a[href='/entry_ad']";
    public static String exitIntent = "a[href='/exit_intent']";
    public static String fileDownload = "a[href='/download']";
    public static String fileUpload = "a[href='/upload']";
    public static String floatingMenu = "a[href='/floating_menu']";
    public static String forgotPassword = "a[href='/forgot_password']";
    public static String formAuthentication = "a[href='/login']";
    public static String frames = "a[href='/frames']";
    public static String geolocation = "a[href='/frames']";
    public static String horizontalSlider = "a[href='/horizontal_slider']";
    public static String hovers = "a[href='/hovers']";
    public static String infiniteScroll = "a[href='/infinite_scroll']";
    public static String inputs = "a[href='/inputs']";
    public static String JQueryUIMenus = "a[href='/jqueryui/menu']";
    public static String javaScriptAlerts = "a[href='/javascript_alerts']";
    public static String javaScriptOnloadEventError = "a[href='/javascript_error']";
    public static String keyPresses = "a[href='/key_presses']";
    public static String largeAndDeepDOM = "a[href='/large']";
    public static String multipleWindows = "a[href='/large']";
    public static String nestedFrames = "a[href='/nested_frames']";
    public static String notificationMessages = "a[href='/notification_message']";
    public static String redirectLink = "a[href='/redirector']";
    public static String secureFileDownload = "a[href='/download_secure']";
    public static String shadowDOM = "a[href='/shadowdom']";
    public static String shiftingContent = "a[href='/shifting_content']";
    public static String slowResources = "a[href='/slow']";
    public static String sortableDataTables = "a[href='/tables']";
    public static String statusCodes = "a[href='/status_codes']";
    public static String typos = "a[href='/typos']";
    public static String wYSIWYGEditor = "a[href='/tinymce']";

}
