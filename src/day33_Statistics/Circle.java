package day33_Statistics;

import java.util.ArrayList;

public class Circle {
    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers;

    public Circle(double radius){
        this.radius = radius;
    }
    static {
        pi = 3.14;
        name = "Circle";

        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }


}
