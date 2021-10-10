package com.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class NumbersExceptionHandling {
    public static void main(String[] args) {
        numbersExceptionHandling();
    }

    private static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");
        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }

    }

    private static void createFile() {
        File file = new File("resources/numbers.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Directory does not exist");
            e.printStackTrace();
        }
    }


}
