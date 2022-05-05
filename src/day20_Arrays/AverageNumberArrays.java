package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumberArrays {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();
        int[] numbers = new int[length];

        double sum = 0;

        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number:");
            numbers[i] = scan.nextInt();
            sum += numbers[i];
        }
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Average number is: " + sum / length);

    }
}
