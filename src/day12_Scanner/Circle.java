package day12_Scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circe.");
        double radius = input.nextDouble();

        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;

        System.out.println(" Area is = " + area + "\n" + " Perimeter is = " + perimeter);

        input.close();





    }
}
