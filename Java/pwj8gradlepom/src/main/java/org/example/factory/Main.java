package org.example.factory;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static <ObjectMapper> void main(String[] args) throws IOException {




        System.out.println("\n---------- Reading file from resource folder ---------------");
        File file2 = new File(Main.class.getClassLoader().getResource("shortNestedJson.json").getFile());
        Object ob = null;
        try {
            ob = new JSONParser().parse(new FileReader(file2));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        // typecasting ob to JSONObject
        JSONObject js = (JSONObject) ob;
        String firstName = (String) js.get("name");
        System.out.println("First name is: " + firstName);
        String status = (String) js.get("status");
        System.out.println("Status is: " + status);
        JSONObject detail = (JSONObject) js.get("detail");
        String another = (String) detail.get("first_name");
        System.out.println("Detail is: " + another);

    }




}
