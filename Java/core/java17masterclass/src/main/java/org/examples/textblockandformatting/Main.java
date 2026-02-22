package org.examples.textblockandformatting;

public class Main {
    public static void main(String[] args) {

        // First,without Textblock
        String bulletIt = "Print a bulleted list:\n" +
                    "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub Point";
        System.out.println(bulletIt);

        // Now, with a Textblock
        String textBlock = """
                Print a bulleted list:
                    \u2022 First Point
                        \u2022 Sub Point
                """;
        System.out.println(textBlock);

        int age = 35;
        System.out.printf("Your age is %d%n", age);

        int yearOfBirth = 2024 - age;
        System.out.printf("Age = %d, Birth year = %d%n", age, yearOfBirth);

        System.out.printf("Your age is %.2f%n", (float) age);
        // The same value, now with 2 decimal places

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %d %n", i);
        // Prints integers aligned to the left
        }
        System.out.println("-- -- -- --");

        for (int i = 1; i <= 100000; i *= 10) {
            System.out.printf("Printing %6d %n", i);
        // Prints integers aligned to the right by using 6 spaces
        }

        System.out.println("-- -- -- --");
        String formattedString = String.format("Your age is %d", age);
        // String.format created in JDK 15
        System.out.println(formattedString);

        System.out.println("-- -- -- --");
        formattedString = "Your age is %d".formatted(age);
        System.out.println(formattedString);

    }
}
