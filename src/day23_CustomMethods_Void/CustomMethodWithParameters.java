package day23_CustomMethods_Void;

import java.util.Scanner;

public class CustomMethodWithParameters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int birthYear = scan.nextInt();
        oddOrEven(10);

        ageOfThePerson(birthYear);
    }

    public static void oddOrEven(int number){

        if (number % 2 == 0){
            System.out.println(number + " is a even number");
        }else{
            System.out.println(number + " is a odd number");
        }
    }

    public static void ageOfThePerson(int birthYear){
        System.out.println("Age of the prson is: " + (2022 - birthYear));
    }
}
