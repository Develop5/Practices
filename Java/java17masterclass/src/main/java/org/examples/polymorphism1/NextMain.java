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

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");

        // 1st try
        //comedy.watchMovie();
        // The compiler cannot find any watchMovie method in the Object class
        // We are now going to add a method to each of the subclasses
        // and we will make each method unique to the class

        // 2nd try
        //comedy.watchComedy();           // Does not compile. This is still an Object

        // 3rd try
        //Movie comedyMovie = (Movie) comedy;
        //comedyMovie.watchComedy();          // Does not compile. This is a Movie reference
                                            // watchComedy is not in the Movie class

        // 4th try
        Comedy comedyMovie = (Comedy) comedy;       // This does work
        comedyMovie.watchComedy();


    }
}
