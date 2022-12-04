package myorganization;

import java.awt.*;

public class PassingArguments {

    public static void main(String[] args) {
        Point pt1 = new Point();
        pt1.x = 20;
        pt1.y = 10;
        System.out.println("In Main originally, X = " + pt1.x + ", and Y = " + pt1.y);
        changeCoordinates(pt1);
        System.out.println("After method, X = " + pt1.x + ", and Y = " + pt1.y);
    }


    private static void changeCoordinates( Point p ) {
        Point auxiliar = p;
        p.x = auxiliar.y;
        p.y = auxiliar.x;
        System.out.println(" Inside the method X = " + p.x + ", and Y = " + p.y);
    }
}
