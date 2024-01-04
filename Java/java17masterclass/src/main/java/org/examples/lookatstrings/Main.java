package main.java.org.examples.lookatstrings;

public class Main {
    public static void main(String[] args) {

        String helloWorld = "Hello" + " World";
        helloWorld.concat(" and Goodbye");          // The string is immutable
        printInformation(helloWorld);

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" and Goodbye");
        printInformation(helloWorldBuilder);    // String has been changed


        /*
        Conclusion:
        String methods create a new object in memory, and return a reference to this new object.
        StringBuilder methods return a StringBuilder reference, but it's really a self-reference.
         */


    }

    private static void printInformation(StringBuilder string) {
        // This method is specifically for the StringBuilder object
        // instead of using value.of() method
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }


    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("length = " + string.length());
    }



}
