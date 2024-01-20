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

public class JsonRetrieveFromFiles {

    private static Object ob = null;

    public static void allJSONMethods() throws FileNotFoundException {

        System.out.println("\n------- Parsing JSON from a constant in a class ------------");
        System.out.println(EXPECTED_MAP_DISCARD.get("actor"));

        System.out.println("\n---------- Reading complete JSON from fixed path -----------");
        System.out.println(myMethodName());

        System.out.println("\n---------- Reading file from resource folder ---------------");
        File fileInResourcesFolder = new File(Main.class.getClassLoader().getResource("shortNestedJson.json").getFile());
        String fieldName = "name";
        System.out.println(getFieldFromJsonInResources(fileInResourcesFolder, fieldName));
        String status = "status";
        System.out.println(getFieldFromJsonInResources(fileInResourcesFolder, status));
        String topLevel = "detail";
        String lowerLevel = "last_name";
        System.out.println(get2ndLevelFieldFromJsonInResources(fileInResourcesFolder,
                topLevel,
                lowerLevel));

    }

    public static Map<String, String> EXPECTED_MAP_DISCARD = Stream.of(new String[][]{
            // A constant is retrieved with the value of the field required in the JSON constant
            {"title", "The Lord of the Rings: The Return of the King"},
            {"director", "Peter Jackson"},
            {"actor", "Sean Astin"}
    }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

    public static HashMap<String, String> myMethodName() throws FileNotFoundException {
        // Read json file in fixed folder and retrieve the json object
        String path = "C:\\Users\\lourd\\Documents\\Lenovo_D\\Lourdes\\practicando\\Practices\\Java\\pwj8gradlepom\\src\\main\\resources\\shortNestedJson.json";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        Gson gson = new Gson();
        HashMap<String, String> json = gson.fromJson(bufferedReader, HashMap.class);
        return json;
    }

    public static String getFieldFromJsonInResources(File filename, String fieldName) {
        // Read json file in Resources folder and retrieve value from given key
        try {
            try {
                ob = new JSONParser().parse(new FileReader(filename));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (
                ParseException e) {
            throw new RuntimeException(e);
        }
        // typecasting ob to JSONObject
        JSONObject js = (JSONObject) ob;
        return (String) js.get(fieldName);
    }

    public static String get2ndLevelFieldFromJsonInResources(File filename,
                                                             String topLevelField,
                                                             String lowerLevelField) {
        // Read json file in Resources folder and retrieve value from given nested key. 2 levels
        try {
            try {
                ob = new JSONParser().parse(new FileReader(filename));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (
                ParseException e) {
            throw new RuntimeException(e);
        }
        // typecasting ob to JSONObject
        JSONObject js = (JSONObject) ob;
        JSONObject topLevel = (JSONObject) js.get(topLevelField);
        String lowerLevel = (String) topLevel.get(lowerLevelField);
        return lowerLevel;

    }

}