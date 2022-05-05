package day35_Encapsulation;

public class Circle {

    private double radius;
    public static double pi = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            System.err.println("Invalid");
        }
        this.radius = radius;
    }

    public double area(double radius){
        return 2 * pi * radius;
    }
}
