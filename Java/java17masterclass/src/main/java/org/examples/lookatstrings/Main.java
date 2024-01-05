package main.java.org.examples.lookatstrings;

public class Main {
    public static void main(String[] args) {

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");          // The string is immutable
        printInformation(helloWorld);

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");
        printInformation(helloWorldBuilder);    // String has been changed

        StringBuilder emptyStart = new StringBuilder();
        StringBuilder emptyStart32 = new StringBuilder(32);     // An integer
        printInformation(emptyStart);
        printInformation(emptyStart32);         // As a string, length is 0

    }

    private static void printInformation(StringBuilder builder) {
        // This is the method particularly for the StringBuilder object
        // instead of using value.of() method
        System.out.println("String = " + builder);
        System.out.println("length = " + builder.length());
        System.out.println("capacity = " + builder.capacity());
    }


    public static void printInformation(String builder) {
        System.out.println("String = " + builder);
        System.out.println("length = " + builder.length());
    }



}
