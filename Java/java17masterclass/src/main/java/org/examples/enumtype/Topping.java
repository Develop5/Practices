package org.examples.enumtype;

public enum Topping {
    MUSTARD,
    PICKLES,
    BACON,
    CHEDDAR,
    TOMATO;         // Semicolon is needed if you are going to customize the enum type
                    // for example, by adding methods, like hee. Otherwise, it is not needed.
    public double getPrice() {
        return switch (this) {
            case BACON -> 1.5;
            case CHEDDAR -> 1.0;
            default -> 0.0;
        };

    }

}
