package main.java.firsttopics.exceptionhandling;

import java.io.File;
import java.io.IOException;

public class FileExceptionHandling {
    public static void main(String[] args) {
        createFile();
        numbersExceptionHandling();


    }

    private static void numbersExceptionHandling() {

    }

    private static void createFile() {
        File file = new File("resources/numbers.txt");
        try {
            boolean fileCanBeCreated = file.createNewFile();
        } catch (IOException e) {
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }


}
