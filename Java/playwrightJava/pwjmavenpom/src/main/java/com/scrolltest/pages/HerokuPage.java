package com.scrolltest.pages;

import com.microsoft.playwright.Page;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class HerokuPage {

    private final Page page;

    // All Selectors of this page must be here

    public HerokuPage(Page page) {
        this.page = page;
    }

    // All locators fo HerokuPage here:
    String headWelcomeToTheInternet = "h1.heading";
    String availableExamples = "h2";



}
