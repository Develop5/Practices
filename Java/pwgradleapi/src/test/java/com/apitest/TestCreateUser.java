package com.apitest;

import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.RequestOptions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;


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

        Map<String, Object> data = new HashMap<>();
        String randomName = new SimpleDateFormat("ddMMyyyy_HHmmss").format(Calendar.getInstance().getTime());
        data.put("name", randomName);
        data.put("email", randomName + "@terra.es");
        data.put("gender", "female");
        data.put("status", "active");

        System.out.printf("%-30s %-50s %n", "generated name:", randomName );

        APIResponse apiResponse = requestContext.post("https://gorest.co.in/public/v2/users",
                RequestOptions.create()
                        .setHeader("Content-type", "application/json")
                        .setHeader("Authorization", "Bearer 935b47ee8d353a86849cf99104a8971757366654c3f8419b71f0afe1ab682564")
                        .setData(data)
        );

        System.out.printf("%-30s %-50s %n", "api url:", apiResponse.url() );
        System.out.printf("%-30s %-50s %n", "response status:", apiResponse.status() );
        System.out.printf("%-30s %-50s %n", "response status text:", apiResponse.statusText() );
        System.out.printf("%-30s %-50s %n", "response text:", apiResponse.text() );

        Assertions.assertEquals(201, apiResponse.status());
        Assertions.assertTrue(apiResponse.ok());
        Assertions.assertEquals("Created", apiResponse.statusText());

    }


    @AfterAll
    public static void tearDown() {
        requestContext.dispose();
        playwright.close();
    }
}
