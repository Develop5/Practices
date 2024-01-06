package main.java.org.examples.exerciseCircleAndCylinder;

public class Circle {
    // write code here
    private double radius;



    public Circle(double radius) {
        this.radius = radius < 0 ? 0 : radius;

    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double PI = 3.14159;
        return (radius * radius * PI);
    }
}
