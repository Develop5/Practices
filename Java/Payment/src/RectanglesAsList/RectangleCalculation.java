package RectanglesAsList;

import java.util.Scanner;

public class RectangleCalculation {

    private static final int MAX_NUMBER_OF_RECTANGLES = 2;
    public static void main(String[] args) {

        // Pide en bucle width and height de rectángulos y los mete en un arreglo. Termina cuando no se entra nada
        double[][] myList = new double[3][2];

        double[] dimensions = new double[2];
        for (int order= 1; order <= MAX_NUMBER_OF_RECTANGLES; order++) {
            dimensions = askForDimensions();
            myList[order-1][0] = dimensions[0];
            myList[order-1][1] = dimensions[1];
        }

        // Create array of rectangles
        Rectangle[] baseRectangle = new Rectangle[MAX_NUMBER_OF_RECTANGLES];
        for (int i = 0; i <= MAX_NUMBER_OF_RECTANGLES -1 ; i++) {
            baseRectangle[i] = new Rectangle(myList[i][0], myList[i][0]);
        }

        for (int i = 0; i <= MAX_NUMBER_OF_RECTANGLES -1 ; i++) {
            System.out.println("-------   Rectangle Number : " + i + "    ---------");
            System.out.println("Width of current Rectangle = " + baseRectangle[i].getWidth());
            System.out.println("Height of current Rectangle = " + baseRectangle[i].getHeight());
            System.out.println("Area of current Rectangle = " + String.format("%.1f", baseRectangle[i].getArea()));
            System.out.println("Perimeter of current Rectangle = " + String.format("%.1f", baseRectangle[i].getPerimeter()));
        }



    }

    private static double[] askForDimensions() {
        System.out.println("Enter width and height of current rectangle (space delimited, decimal comma) : ");
        Scanner input = new Scanner(System.in);
        return new double[] {input.nextDouble(), input.nextDouble()};
    }
}
