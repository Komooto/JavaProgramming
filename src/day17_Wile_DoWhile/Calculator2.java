package day17_Wile_DoWhile;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = scan.nextInt();
        System.out.println("Enter a number:");
        int num2 = scan.nextInt();
        System.out.println("Enter a math operator:");
        char operator = scan.next().charAt(0);

        for (int i = 0; !(operator == '+' || operator == '-'); i++) {
            System.err.println("Invalid operator! Enter a math operator:");
            operator = scan.next().charAt(0);
        }

        System.out.println((operator == '+') ? num1 + num2 : num1 - num2);

    }
}
