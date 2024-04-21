package com.apitest;

import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TestCreateUser {

    static Playwright playwright;
    static APIRequest request;
    static APIRequestContext requestContext;

    @BeforeAll
    public static void setup(){
        playwright = Playwright.create();
        request = playwright.request();
        requestContext = request.newContext();
    }

    @Test
    public void createUser(){

    }


    @AfterAll
    public static void tearDown() {
        requestContext.dispose();
        playwright.close();
    }
}
