package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name.");
        String fullName = input.nextLine();

        System.out.println("Enter your building name.");
        String buildingNumber = input.next();
        input.nextLine();

        System.out.println("Enter your street name.");
        String streetName = input.nextLine();

        System.out.println("Enter your city name.");
        String cityName = input.nextLine();

        System.out.println("Enter your state.");
        String state = input.next();

        System.out.println("Enter your zip code.");
        String zipCode = input.next();

        System.out.println(fullName);
        System.out.println(buildingNumber);
        System.out.println(streetName);
        System.out.println(cityName);
        System.out.println(state);
        System.out.println(zipCode);

    }
}
