package main.java.RectangleRelated;

import java.util.Scanner;

public class RectanglesIntroducedByUser {

    private static final int MAX_NUMBER_OF_RECTANGLES = 3;

    public static void main(String[] args) {
        double[] dimensions;
        for ( int rectangleOrder = 1; rectangleOrder <= MAX_NUMBER_OF_RECTANGLES; rectangleOrder++) {
            dimensions = getBase();
            Rectangle oneRectangle = new Rectangle(dimensions[0], dimensions[1]);
            System.out.println("Width : " + oneRectangle.getWidth());
            System.out.println("Height : " + oneRectangle.getHeight());
            System.out.println("Area calculated : " + oneRectangle.getArea());
            System.out.println("Perimeter calculated : " + oneRectangle.getPerimeter());
        }
    }

    private static double[] getBase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n------------------------------------------------------ ");
        System.out.println("Please enter the width and height of the current base (decimal comma): ");
        double[] baseInArray = {scanner.nextDouble(), scanner.nextDouble()};
        return baseInArray;
    }

    private static double getArea(double widthForCalculating, double heightForCalculating) {
        return widthForCalculating * heightForCalculating;
    }

    private static double getPerimeter(double widthForCalculating, double heightForCalculating) {
        return (2 * (widthForCalculating + heightForCalculating) );
    }

}
