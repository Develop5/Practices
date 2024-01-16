package org.example.factory;

import com.google.gson.JsonObject;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        try {
            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("book.json"));

            // read JSON from a file
            JsonObject jsonObject = (JsonObject) Jsoner.deserialize(reader);

            // create a Dozer mapper
            Mapper mapper = DozerBeanMapperBuilder.buildDefault();

            // convert JsonObject to Book
            Book book = mapper.map(jsonObject, Book.class);

            // print the book
            System.out.println(book);

            // close the reader
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
