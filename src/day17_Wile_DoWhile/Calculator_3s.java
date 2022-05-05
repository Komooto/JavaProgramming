package day17_Wile_DoWhile;

import java.util.Scanner;

public class Calculator_3s {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = scan.nextInt();
        System.out.println("Enter a number:");
        int num2 = scan.nextInt();
        System.out.println("Enter a math operator:");

        System.out.println(num1 + num2);

        System.out.println("Do you want to continue? yes/no:");
        String again = scan.next();
        int frequency = 0;

        if (again.equals("yes")) {

            for (int i = 1; i < 3; i++) {
                frequency++;
                System.out.println("Enter a number:");
                num1 = scan.nextInt();
                System.out.println("Enter a number:");
                num2 = scan.nextInt();

                System.out.println(num1 + num2);

                if (frequency == 2) {
                    System.out.println("It is enough for today!");
                }else {
                    System.out.println("Do you want to continue? yes/no:");
                    again = scan.next();
                }
            }
        }

        if (again.equals("no")){
            System.out.println("Thank you!");
        }
    }
}