package org.examples.referenceVsValueTypes;

public class Man2 {
    public static void main(String... args) {

        System.out.println("Hello world again");
        String[] splitStrings = "Hello world again".split(" ");
        printText(splitStrings);
        printTextDots(splitStrings);

        /* None of the following is possible
        printText("Hello", "World", "Again");
        printText("Hello");
        printText("");
         */

        // This is perfectly doable
        printTextDots("Hello", "World", "Again");
        printTextDots("Hello");
        printTextDots("");

        String[] sArray = {"first", "second", "third", "fourth", "fifth"};
        System.out.println("\n----- Printing as usual, not by using any printText methods");
        System.out.println(String.join(", ", sArray));

    }

    private static void printText(String[] textList) {
        System.out.println("\n---------- Printing array in argument");
        for (String t : textList) {
            System.out.println(t);
        }
    }
    private static void printTextDots(String... textList) {
        System.out.println("\n---------- Printing array in argument in dots");
        for (String t : textList) {
            System.out.println(t);
        }
    }

}
