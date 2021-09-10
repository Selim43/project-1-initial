package com.csc205.project1;


public class Point {

    //creates private variables
    private double x;
    private double y;

    //method with parameters
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //Blank Point Method
    public Point() {
        x = 0;
        y = 0;
    }

    //get x method that returns the value of x
    public double getX() {
        return x;
    }

    //get y method that returns the value of y
    public double getY() {
        return y;
    }

    //set x method
    public void setX(double dx) {

        x = dx;
    }

    //set y method
    public void setY(double dy) {

        y = dy;
    }


    //rotate point method
    public void rotate(double angle) {

        angle = Math.PI / 2.0;


        x = x * Math.cos(angle) - y * Math.sin(angle);
        y = x * Math.sin(angle) + y * Math.cos(angle);


    }

    //set point method
    public void setPoint(double dx, double dy) {

        x = dx;
        y = dy;
    }

    //method to shift x
    public void shiftX(double dx) {

        x += dx;

    }

    //method to shift y
    public void shiftY(double dy) {

        y += dy;
    }

    //to string method
    public String toString() {

        return "Point {x = " + this.getX() + ", y = " + this.getY() + "}";
    }

    //calculates distance method
    public double distance(Point b) {

        double x1, y1, x2, y2;
        double distance;
        x1 = getX();
        y1 = getY();
        x2 = b.getX();
        y2 = b.getY();
        distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        return distance;
    }
}
