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

import java.util.Map;


public class TestApicalls {
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
    public void getSpecificPostByParameter() {
        APIResponse apiResponse = requestContext.get("https://jsonplaceholder.typicode.com/comments",
                RequestOptions.create()
                        .setQueryParam("postId", 3)
                        .setQueryParam("id", 12)
        );

        System.out.printf("%-20s %-50s %n", "api url", apiResponse.url() );
        System.out.printf("%-20s %-50s %n", "response status", apiResponse.status() );
        System.out.printf("%-20s %-50s %n", "response text", apiResponse.text() );

        Assertions.assertEquals(apiResponse.status(), 200);
        Assertions.assertTrue(apiResponse.ok());

    }

    @Test
    public void getAllPosts() {
        APIResponse apiResponse = requestContext.get("https://jsonplaceholder.typicode.com/posts");

        System.out.printf("%-20s %-50s %n", "api url", apiResponse.url() );
        System.out.printf("%-20s %-50s %n", "response status", apiResponse.status() );

        // Temporary commented, to avoid long responses
        //System.out.printf("%-20s %-50s %n", "response text", apiResponse.text() );

        Assertions.assertEquals(apiResponse.status(), 200);
        Assertions.assertTrue(apiResponse.ok());

        Map<String, String> headersMap = apiResponse.headers();
        System.out.printf("%-20s %-50s %n", "api response headers", headersMap );

        System.out.println(headersMap);

        Assertions.assertEquals(headersMap.get("content-type"),
                "application/json; charset=utf-8");
        Assertions.assertEquals(headersMap.get("transfer-encoding"),
                "chunked");
    }


    @Test
    public void getUserWithId1(){
        APIResponse apiResponse = requestContext.get("https://jsonplaceholder.typicode.com/posts/1");

        System.out.printf("%-20s %-50s %n", "api url", apiResponse.url() );
        System.out.printf("%-20s %-50s %n", "response status", apiResponse.status() );
        System.out.printf("%-20s %-50s %n", "response text", apiResponse.text() );

        Assertions.assertEquals(apiResponse.status(), 200);
        Assertions.assertTrue(apiResponse.ok());

    }

    @AfterAll
    public static void tearDown() {
        requestContext.dispose();
        playwright.close();
    }

}
