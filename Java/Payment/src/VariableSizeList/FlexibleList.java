package VariableSizeList;

import java.util.ArrayList;
import java.util.Scanner;

public class FlexibleList {

    public static void main(String[] args) {
        ArrayList<Rectangle> everyRectangle = new ArrayList<>();
        createRectangles(everyRectangle);
        System.out.println("Rectangles created = " + everyRectangle.size());
        showAllRectangles(everyRectangle);
    }

    private static void createRectangles(ArrayList<Rectangle> initiallyEmpty) {
        double individualWidth;
        double individualHeight;
        Scanner input = new Scanner(System.in);
        String inputLine = new String();
        do {
            System.out.print("Enter width and height separated by space :  ");
            inputLine = input.nextLine();
            if (!(inputLine.isEmpty())) {
                individualWidth = Double.parseDouble(inputLine.split(" ")[0]);
                individualHeight = Double.parseDouble(inputLine.split(" ")[1]);
                initiallyEmpty.add(new Rectangle(individualWidth, individualHeight));
            }
        } while (!(inputLine.isEmpty())) ;
    }

    private static void showAllRectangles(ArrayList<Rectangle> allRectangles) {
        int i =0;
        for (Rectangle item : allRectangles) {
            System.out.println("\n\n -------   Rectangle No.  " + (i+1) + "  --------- ");
            System.out.println("\tWidth = " + item.getWidth());
            System.out.println("\tHeight = " + item.getHeight());
            System.out.println("\tArea = " + String.format("%.1f", item.getArea()));
            System.out.println("\tPerimeter = " + String.format("%.1f", item.getPerimeter()));
            i++;
        }
    }

}
