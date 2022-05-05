package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinNumberOfArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to compare?");
        int length = scan.nextInt();
        int[] numbers = new int[length];
        int min = numbers[0];

        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scan.nextInt();

            if (numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Minimum number is: " + min);




    }
}
