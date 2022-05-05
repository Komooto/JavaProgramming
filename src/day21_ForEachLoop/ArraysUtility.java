package day15_ForLoops.day21_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysUtility {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to compare?");
        int length = scan.nextInt();

        int[] number = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number:");
            number[i] = scan.nextInt();
        }

        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        System.out.println("Min number: " + number[0]);
        System.out.println("Max number: " + number[number.length-1]);





    }
}
