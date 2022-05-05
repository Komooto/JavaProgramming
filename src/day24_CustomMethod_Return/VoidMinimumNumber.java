package day24_CustomMethod_Return;

import java.util.Scanner;

public class VoidMinimumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers would you like to compare?");
        int size = scan.nextInt();
        int[] input = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a integer number:");
            input[i] = scan.nextInt();
        }
        min(input);
    }

    public static void min(int[] input){
        int min = input[0];
        for (int i : input) {
            if (min > i){
                min = i;
            }
        }
    }

}
