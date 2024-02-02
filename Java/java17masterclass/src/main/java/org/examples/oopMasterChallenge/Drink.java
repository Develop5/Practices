package org.examples.oopMasterChallenge;

import main.java.org.examples.polymorphism1.Adventure;
import main.java.org.examples.polymorphism1.Comedy;
import main.java.org.examples.polymorphism1.Movie;
import main.java.org.examples.polymorphism1.ScienceFiction;

public class Drink {
    private String type;
    private String size;
    private double price;

    public Drink(String type, String size) {
        this.type = type;
        this.size = size;
    }

    public double getDrinkPrice() {
        // Drinks can be Small, Medium or Big
        return switch (size.toUpperCase().charAt(0)) {
            case 'S' -> 1.00;
            case 'M' -> 1.40;
            case 'B' -> 1.80;
            default -> 1.80;                // For being so fool
        };
    }

    public String getType() {
        return type;
    }

    public String getSize() {
        return size;
    }
}
