package com.apitest;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.playwright.APIRequest;
import com.microsoft.playwright.APIRequestContext;
import com.microsoft.playwright.APIResponse;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.RequestOptions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
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
    public void createUser() throws IOException {

        Map<String, Object> data = new HashMap<>();
        String randomGeneratedName = new SimpleDateFormat("ddMMyyyy_HHmmss").format(Calendar.getInstance().getTime());
        data.put("name", getClass().getSimpleName());
        data.put("email", randomGeneratedName + "@terra.es");
        data.put("gender", "female");
        data.put("status", "active");

        System.out.printf("%-30s %-50s %n", "generated name:", randomGeneratedName );

        APIResponse postResponse = requestContext.post("https://gorest.co.in/public/v2/users",
                RequestOptions.create()
                        .setHeader("Content-type", "application/json")
                        .setHeader("Authorization", "Bearer 935b47ee8d353a86849cf99104a8971757366654c3f8419b71f0afe1ab682564")
                        .setData(data)
        );

        System.out.printf("%-30s %-50s %n", "api url:", postResponse.url() );
        System.out.printf("%-30s %-50s %n", "response status:", postResponse.status() );
        System.out.printf("%-30s %-50s %n", "response status text:", postResponse.statusText() );
        System.out.printf("%-30s %-50s %n", "response text:", postResponse.text() );

        Assertions.assertEquals(201, postResponse.status());
        Assertions.assertTrue(postResponse.ok());
        Assertions.assertEquals("Created", postResponse.statusText());

        // Validating. Search the same user by id
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode postJsonrsponse = objectMapper.readTree(postResponse.body());
        String id = postJsonrsponse.get("id").asText();

        APIResponse getResponse = requestContext.get("https://gorest.co.in/public/v2/users/" + id,
                RequestOptions.create()
                        .setHeader("Authorization", "Bearer 935b47ee8d353a86849cf99104a8971757366654c3f8419b71f0afe1ab682564")
        );

        System.out.println("\n---------  Validating POST action with a GET  -----------");
        System.out.printf("%-30s %-50s %n", "api url:", getResponse.url() );
        System.out.printf("%-30s %-50s %n", "response status:", getResponse.status() );
        System.out.printf("%-30s %-50s %n", "response status text:", getResponse.statusText() );
        System.out.printf("%-30s %-50s %n", "response text:", getResponse.text() );

        Assertions.assertEquals(getResponse.status(), 200);
        Assertions.assertTrue(getResponse.ok());
        Assertions.assertTrue(getResponse.text().contains(randomGeneratedName));

        JsonNode getJsonrsponse = new ObjectMapper().readTree(getResponse.body());
        System.out.println(getJsonrsponse.toPrettyString());

    }


    @AfterAll
    public static void tearDown() {
        requestContext.dispose();
        playwright.close();
    }
}
