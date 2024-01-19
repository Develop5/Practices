package org.example.factory;

import com.google.gson.Gson;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static <ObjectMapper> void main(String[] args) throws IOException {
        System.out.println("\n------- Parsing JSON from a constant ------------------------");
        System.out.println(EXPECTED_MAP_DISCARD.get("director"));

        System.out.println("\n---------- Reading JSON from file, fixed address -----------");
        System.out.println(myMethodName().toString());

        System.out.println("\n---------- Reading file from resource folcer ---------------");
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
    private static final Map<String, String> EXPECTED_MAP_DISCARD = Stream.of(new String[][]{
            // Method to read from a JSON defined right here
            {"title", "The Lord of the Rings: The Return of the King"},
            {"director", "Peter Jackson"},
            {"actor", "Sean Astin"}
    }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

    public static HashMap<String, String> myMethodName() throws FileNotFoundException
    {
        String path = "C:\\Users\\lourd\\Documents\\Lenovo_D\\Lourdes\\practicando\\Practices\\Java\\pwj8gradlepom\\src\\main\\resources\\shortNestedJson.json";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        Gson gson = new Gson();
        HashMap<String, String> json = gson.fromJson(bufferedReader, HashMap.class);
        return json;
    }


}
