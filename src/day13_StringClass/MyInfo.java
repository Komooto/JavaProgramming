package day13_StringClass;

import java.util.Scanner;

public class MyInfo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = input.nextInt();

        System.out.println("Enter your gender:");
        char gender = input.next().charAt(0);

        input.nextLine();
        System.out.println("Enter your full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your phone number:");
        long phoneNumber = input.nextLong();

        System.out.println("Enter your zip code:");
        int zipCode = input.nextInt();

        input.nextLine();
        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();


        System.out.println("Enter your city name:");
        String cityName = input.next();

        System.out.println("Enter your state name:");
        String stateName = input.next();

        System.out.println("Enter your building number:");
        int buildingNumber = input.nextInt();

        input.nextLine();
        System.out.println("Enter your street name:");
        String streetName = input.nextLine();

        input.close();

        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Address: \n\t" + buildingNumber + " " + schoolName + "\n \t" + cityName + ", " + stateName
         + " " + zipCode);
        System.out.println("School name: " + schoolName);



    }
}
