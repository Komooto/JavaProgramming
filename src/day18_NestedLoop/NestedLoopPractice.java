package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even number.");
            } else {
                System.out.println("Odd number.");
            }

            System.out.println("Would you like to enter another number? yes/no");
            String retry = scan.next();

            while (!(retry.equalsIgnoreCase("yes") || retry.equalsIgnoreCase("no"))) {
                System.err.println("Invalid comment, reenter again!");
                System.out.println("Would you like to enter another number? yes/no");
                retry = scan.next();

            }
            if (retry.equalsIgnoreCase("no")) {
                break;
            }

        }





    }

}
