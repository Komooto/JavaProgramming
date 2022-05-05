package day17_Wile_DoWhile;

import java.util.Scanner;

public class Calculator3 {

    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = scan.nextInt();
        System.out.println("Enter a number:");
        int num2 = scan.nextInt();
        System.out.println("Enter a math operator:");

        System.out.println(num1 + num2);

        System.out.println("Do you want to continue? yes/no:");
        String again = scan.next();

        while (again.equals("yes")){
            System.out.println("Enter a number:");
             num1 = scan.nextInt();
            System.out.println("Enter a number:");
             num2 = scan.nextInt();
            System.out.println("Enter a math operator:");

            System.out.println(num1 + num2);

            System.out.println("Do you want to continue? yes/no:");
             again = scan.next();
        }


    }
}
