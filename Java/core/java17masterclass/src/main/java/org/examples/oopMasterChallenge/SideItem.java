package org.examples.oopMasterChallenge;

public class SideItem {
    private String type;
    private String price;

    public SideItem(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public double getSidePrice() {
        // side types can be: fries, potatoes, nuggets, spicy nuggets
        return switch (type.toUpperCase().charAt(0)) {
            case 'F' -> 0.8;
            case 'P' -> 0.9;
            case 'N' -> 1.1;
            case 'S' -> 1.2;
            default -> 1.0;
        };
    }
}
