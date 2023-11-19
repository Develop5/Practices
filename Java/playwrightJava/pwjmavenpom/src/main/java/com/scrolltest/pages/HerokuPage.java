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

    public HerokuPage(Page page) {
        this.page = page;
    }

    public boolean tellMeItIsTrue() {
        return true;
    }


}
