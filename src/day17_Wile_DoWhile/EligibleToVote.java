package day17_Wile_DoWhile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        System.out.println("Enter your age:");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();

        while (age < 1 || age > 150){
            System.err.println("Invalid entry!, Please reenter!");
            System.out.println("Enter your age:");
            age = scan.nextInt();
        }

        System.out.println("Are you a US citizen? yes/no:");
        String citizen = scan.next();

        while (!(citizen.equals("yes") || citizen.equals("no"))){
            System.err.println("Invalid entry!, Please reenter!");
            System.out.println("Are you a US citizen? yes/no:");
            citizen = scan.next();
        }

        if (age >= 18 && citizen.equals("yes")){
            System.out.println("You are eligible to vote!");
        }else{
            System.out.println("You are not eligible to vote!");
        }


    }
}
