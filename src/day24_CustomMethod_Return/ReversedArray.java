package day24_CustomMethod_Return;

import java.util.Arrays;
import java.util.Scanner;

public class ReversedArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Array length:");
        int size = scan.nextInt();
        int[] input = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter a integer number:");
            input[i] = scan.nextInt();
        }

        int[] a = reverse(input);
        System.out.println(Arrays.toString(a));
    }

    public static int[] reverse(int[] input){

        int[] reversed = new int[input.length];
        for (int i = 0, j = input.length -1; i < input.length ; i++, j--) {
            reversed[i] = input[j];
        }
        return reversed;
    }
}
