package day15_ForLoops;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < 101 ; i++) {
            sum += i;
        }
        System.out.print(sum);

        System.out.println("==============================================");

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int total = 0;
        total += scan.nextInt();

        for (int i = 1; i < 6; i++) {
            total += total;
        }
        System.out.println(total);

        System.out.println("=======================================================");

        int total2 = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println("Enter a number:");
            total2 += scan.nextInt();
        }
        System.out.println(total2);

        scan.close();






    }
}
