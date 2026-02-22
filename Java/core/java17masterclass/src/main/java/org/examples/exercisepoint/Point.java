package org.examples.exercisepoint;


import java.lang.Math;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        // Distance to 0,0
        double squareXdiff = x*x;
        double squareYdiff = y * y;
        return (Math.sqrt(squareXdiff + squareYdiff));
    }

    public double distance(Point finalPoint) {
        // Distance to another point, given the point object
        Point thisPoint = new Point(x, y);

        double squareXdiff = (finalPoint.getX() - thisPoint.getX()) * (finalPoint.getX() - thisPoint.getX());
        double squareYdiff = (finalPoint.getY() - thisPoint.getY()) * (finalPoint.getY() - thisPoint.getY());
        return (Math.sqrt(squareXdiff + squareYdiff));
    }

    public double distance(int finalX, int finalY) {
        // Distance to another point, given its coordinates
        double squareXdiff = (finalX - x) * (finalX - x);
        double squareYdiff = (finalY - y) * (finalY - y);
        return (Math.sqrt(squareXdiff + squareYdiff));
    }

}
