package main.java.RectangleRelated;

public class Calculating {
    public static void main(String[] args) {
        Rectangle houseBase = new Rectangle();
        houseBase.setHeight(200);
        houseBase.setWidth(200);

        System.out.println("Base area : " + houseBase.getArea());
        System.out.print("Perimeter : " + houseBase.getPerimeter());
    }
}
