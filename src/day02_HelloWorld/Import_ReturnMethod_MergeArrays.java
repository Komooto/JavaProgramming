package day02_HelloWorld;

import day24_CustomMethod_Return.MergeArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Import_ReturnMethod_MergeArrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of \"array1\":");
        int length1 = scan.nextInt();
        int[] array1 = new int[length1];
        for (int i = 0; i < length1; i++) {
            System.out.println("Enter a number for array1[" + i + "]:");
            int num1 = scan.nextInt();
            array1[i] = num1;
        }

        System.out.println("Enter length of \"array2\":");
        int length2 = scan.nextInt();
        int[] array2 = new int[length2];
        for (int j = 0; j < length2; j++) {
            System.out.println("Enter a number for array1[" + j + "]:");
            int num2 = scan.nextInt();
            array2[j] = num2;
        }
        System.out.println("\"array1\" is:");
        System.out.println(Arrays.toString(array1));
        System.out.println("\"array2\" is:");
        System.out.println(Arrays.toString(array2));

        int[] merge = MergeArrays.merge(array1, array2);
        System.out.println("Merged new Array is: " + "\n" + Arrays.toString(merge));

    }
}
