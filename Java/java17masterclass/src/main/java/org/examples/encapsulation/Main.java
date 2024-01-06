package main.java.org.examples.encapsulation;

public class Main {
    public static void main(String[] args) {
        // With this, the initial health is 100
        //EnhancedPlayer tim = new EnhancedPlayer("tim");

        // Due to encapsulation, initial health here is still 100
        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200, "Sword");

        System.out.println("Initial health is " + tim.healthRemaining());

    }
}
