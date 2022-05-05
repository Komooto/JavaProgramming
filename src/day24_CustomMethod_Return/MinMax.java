package day24_CustomMethod_Return;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to compare?");
        int size = scan.nextInt();
        int[] input = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a integer number:");
            input[i] = scan.nextInt();
        }
        minMax(input);
    }

    public static void minMax(int[] input){
        int max = input[0];
        int min = input[0];

        for (int i : input) {

            if (max < i){
                max = i;
            }
            if (min > i){
                min = i;
            }

        }
        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }

}
