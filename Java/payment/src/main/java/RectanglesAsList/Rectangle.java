package main.java.RectanglesAsList;

public class Rectangle {

    private double height ;
    private double width ;

    public Rectangle() {
        this(1.0, 1.0);
     }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return ( 2 * (this.height + this.width) );
    }


    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
}
