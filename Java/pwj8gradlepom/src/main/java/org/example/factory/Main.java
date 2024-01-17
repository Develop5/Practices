package org.example.factory;


import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("------- Resultado -------------");
        System.out.println(EXPECTED_MAP_DISCARD.get("director"));

        System.out.println("Ver aquí");




    }
    private static final Map<String, String> EXPECTED_MAP_DISCARD = Stream.of(new String[][]{
            {"title", "The Lord of the Rings: The Return of the King"},
            {"director", "Peter Jackson"},
            {"actor", "Sean Astin"}
    }).collect(Collectors.toMap(data -> data[0], data -> data[1]));

    public void getJson() {
        try (Reader reader = new InputStreamReader(this.getClass()
                .getResourceAsStream("/foo.json"))) {

            MyResults result = new Gson().fromJson(reader, MyResults.class);
            System.out.println("\n -----------------" + result.getBar());  // prints "bat"
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
