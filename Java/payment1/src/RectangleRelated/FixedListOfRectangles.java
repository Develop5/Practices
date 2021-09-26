package RectangleRelated;

public class FixedListOfRectangles {


    public static void main(String[] args) {
        Rectangle[] listOfHouses = {new Rectangle(3,4), new Rectangle(7,1), new Rectangle(5,2)};
        for ( Rectangle item : listOfHouses) {
            System.out.println(" -------------------------- ");
            System.out.println("The width of current base is : " + item.getWidth());
            System.out.println("The height of current base is " + item.getHeight());
            System.out.println("Area calculated for this base: : " + item.getArea());
            System.out.println("Perimeter calculated for this base: " + item.getPerimeter());
            System.out.println(" -------------------------- ");

        }
    }

}
