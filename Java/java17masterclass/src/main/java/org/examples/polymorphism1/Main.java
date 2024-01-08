package main.java.org.examples.polymorphism1;

public class Main {
    public static void main(String[] args) {

        Movie theMovie1 = new Movie("Star Wars");
        theMovie1.watchMovie();

        Movie theMovie2 = new Adventure("Star Wars");           // Polymorphism
        theMovie2.watchMovie();
        // Here we have created a variable type Movie and assigned an object type Adventure to it
        // When it gets the tim to run watchMovie, the variable was already an object Adventure
        // And even though it runs the watchMovie from the super class, because of "super"
        // this is applied to the variable, that at this time has already an Adventure object assigned

        // Because which method is being called is determined in runtime, not compile time.

        Movie theMovie3 = new Comedy("What Did Your Uncle do?");
        theMovie3.watchMovie();

        Movie theMovie4 = new ScienceFiction("The Infinite");
        theMovie4.watchMovie();

        Movie theMovie5 = Movie.getMovie("Adventure", "Star Wars2");
        theMovie5.watchMovie();
    }
}
