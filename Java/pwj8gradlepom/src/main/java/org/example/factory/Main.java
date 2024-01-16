package org.example.factory;

import com.google.gson.JsonObject;
import org.json.simple.JSONObject;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("------- Resultado -------------");
        System.out.println(EXPECTED_MAP_DISCARD.get("director"));

    }
    private static final Map<String, String> EXPECTED_MAP_DISCARD = Stream.of(new String[][]{
            {"title", "The Lord of the Rings: The Return of the King"},
            {"director", "Peter Jackson"},
            {"actor", "Sean Astin"}
    }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

}
