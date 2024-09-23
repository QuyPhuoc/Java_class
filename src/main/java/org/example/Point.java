package org.example;

public class Point {
    private double x, y;


    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point() {

    }

    public double getDistance(Point orther){
        return Math.sqrt((x - orther.x) * (x - orther.x) + (y - orther.y) * (y - orther.y));
    }
}
