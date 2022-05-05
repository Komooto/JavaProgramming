package day24_CustomMethod_Return;

import java.util.Scanner;

public class ReturnMaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to compare?");
        int size = scan.nextInt();
        int[] input = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a integer number:");
            input[i] = scan.nextInt();
        }

        int max = max(input);
        System.out.println("Maximum number is: " + max);
    }

    public static int max(int[] input){
        int max = input[0];
        for (int i : input) {

            if (max < i){
                max = i;
            }
        }
        return max;
    }
}
