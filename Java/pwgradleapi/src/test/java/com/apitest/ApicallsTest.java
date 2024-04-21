package com.apitest;

import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.Playwright;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Map;


public class ApicallsTest {
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
    public void getAllPosts() {
        APIResponse apiResponse = requestContext.get("https://jsonplaceholder.typicode.com/posts");

        System.out.println("\n----  api url  ---------");
        System.out.println(apiResponse.url());

        System.out.println("Response status: " + apiResponse.status());
        Assertions.assertEquals(apiResponse.status(), 200);
        Assertions.assertTrue(apiResponse.ok());

        /*
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonresponse = objectMapper.readTree(apiResponse.body());
        System.out.println(" ----------- api response  ---------");
        System.out.println(jsonresponse.toPrettyString());
         */

        // I prefer this format
        System.out.println("\n----  response text  ---------");
        System.out.println(apiResponse.text());

        System.out.println("\n----  api response headers  ---------");
        Map<String, String> headersMap = apiResponse.headers();
        System.out.println(headersMap);

        Assertions.assertEquals(headersMap.get("content-type"),
                "application/json; charset=utf-8");
        Assertions.assertEquals(headersMap.get("transfer-encoding"),
                "chunked");
    }


    @Test
    public void getUserWithId1(){
        APIResponse apiResponse = requestContext.get("https://jsonplaceholder.typicode.com/posts/1");

        System.out.println("\n----  api url  ---------");
        System.out.println(apiResponse.url());

        System.out.println("Response status: " + apiResponse.status());
        Assertions.assertEquals(apiResponse.status(), 200);
        Assertions.assertTrue(apiResponse.ok());

        System.out.println("\n----  response text  ---------");
        System.out.println(apiResponse.text());

    }

}
