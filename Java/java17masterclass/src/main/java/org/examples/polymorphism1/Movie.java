package org.examples.polymorphism1;

public class Movie {
    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie(){

        String instanceType = this.getClass().getSimpleName();
        // This gets in top information about this class
        // Here, the info is about the class Movie
        // but when we implement its subclasses
        // we will get information about the class of that object

        System.out.println("\n------------------------");
        System.out.println(title + " is a " + instanceType + " film");
    }

    public static Movie getMovie(String type, String title) {
        // We are using the Factory pattern
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);

            default -> new Movie(title);
        };
    }
}
