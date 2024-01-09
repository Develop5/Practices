package main.java.org.examples.polymorphism1;

public class Comedy extends Movie{
    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        // It calls the superclass method, but we are going to add an extra functionality

        System.out.printf(".. %s%n".repeat(2),
                "Something funny happens",
                "Happy Ending");
    }
    public void watchComedy(){
        System.out.println("Watching a Comedy");
    }

}
