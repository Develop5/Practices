package main.java.org.examples.lookatstrings;

public class Main {
    public static void main(String[] args) {

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");          // The string is immutable
        printInformation(helloWorld);

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");
        printInformation(helloWorldBuilder);    // capacity = 27

        StringBuilder emptyStart = new StringBuilder();     //capacity 16 by default
        emptyStart.append("a".repeat(17));      // capacity: 16 + 17 = 34

        StringBuilder emptyStart32 = new StringBuilder(32);     // capacity = 32
        emptyStart32.append("a".repeat(17));    // capacity: 32 + needed of 17 = 32

        printInformation(emptyStart);
        printInformation(emptyStart32);

    }

    private static void printInformation(StringBuilder builder) {
        // This is the method particularly for the StringBuilder object
        // instead of using value.of() method
        System.out.println("\n-----------------------");
        System.out.println("String = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }


    public static void printInformation(String builder) {
        System.out.println("String = " + builder);
        System.out.println("length = " + builder.length());
    }



}
