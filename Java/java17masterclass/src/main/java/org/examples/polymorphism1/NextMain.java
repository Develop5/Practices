package main.java.org.examples.polymorphism1;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        //Adventure jaws = Movie.getMovie("A", "Jaws");
        // This code does not compile
        // The compiler ask if we can create a Movie and assigne it to a Adventure variable
        // and the answer is "no"
        // Because eventually we could have created any other kind of movie
        // for example, a Comedy, and assign it to the Adventure variable.
        // We need to cast:

        Adventure jaws = (Adventure) Movie.getMovie("C", "Jaws");
        jaws.watchMovie();




    }
}
