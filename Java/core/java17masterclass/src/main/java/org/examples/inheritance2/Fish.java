package org.examples.inheritance2;

public class Fish extends Animal2{
    private int gills;
    private int fins;

    public Fish(String type, double weight, int gills, int fins) {
        super(type, "small", weight);
        this.gills = gills;
        this.fins = fins;
    }

    private void moveMuscles(){
        System.out.println("muscles moving ");
    }
     private void moveBackFin(){
        System.out.println("backfin moving ");
    }

    @Override
    public void move(String speed) {
        super.move(speed);          // Calls the method in the superclass Animal2. But it was enhanced by Dog2

        moveMuscles();
        if(speed == "fast") {       //If we need the fish to move faster, the backfin needs to move
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "gills=" + gills +
                ", fins=" + fins +
                "} " + super.toString();
    }
}
