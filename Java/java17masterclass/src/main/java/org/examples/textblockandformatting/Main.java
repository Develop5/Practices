package main.java.org.examples.textblockandformatting;

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

    }
}
