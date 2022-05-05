package day18_NestedLoop;

import java.util.Scanner;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int divide = 0;

        while (num1 > num2){
            num1 -= num2;
            divide ++;

        }
        System.out.println("Divide = " + divide);
        System.out.println("Left = " + num1);





    }
}
