package main.java.org.examples.polymorphism1;

public class ScienceFiction extends Movie{
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        // It calls the superclass method, but we are going to add an extra functionality

        System.out.printf(".. %s%n".repeat(4),
                "Bad Aliens do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planets Blows Up",
                "But there is a Happy Ending");
    }

    public void watchScienceFiction(){
        System.out.println("Watching a Science Fiction Thriller");
    }
}
