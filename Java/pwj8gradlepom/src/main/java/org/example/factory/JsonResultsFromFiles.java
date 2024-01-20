package org.example.factory;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JsonResultsFromFiles {



    //System.out.println("\n------- Parsing JSON from a constant ------------------------");
    //System.out.println(EXPECTED_MAP_DISCARD.get("director"));
    private static final Map<String, String> EXPECTED_MAP_DISCARD = Stream.of(new String[][]{

            // Method to read from a JSON defined right here
            {"title", "The Lord of the Rings: The Return of the King"},
            {"director", "Peter Jackson"},
            {"actor", "Sean Astin"}
    }).collect(Collectors.toMap(data -> data[0], data -> data[1]));


    //System.out.println("\n---------- Reading JSON from file, fixed address -----------");
    //System.out.println(myMethodName().toString());
    public static HashMap<String, String> myMethodName() throws FileNotFoundException
    {
        String path = "C:\\Users\\lourd\\Documents\\Lenovo_D\\Lourdes\\practicando\\Practices\\Java\\pwj8gradlepom\\src\\main\\resources\\shortNestedJson.json";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        Gson gson = new Gson();
        HashMap<String, String> json = gson.fromJson(bufferedReader, HashMap.class);
        return json;
    }




}
