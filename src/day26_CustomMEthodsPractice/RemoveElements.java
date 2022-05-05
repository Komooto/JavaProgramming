package day26_CustomMEthodsPractice;

import Utilites.ArrayUtility;

import java.util.Arrays;

public class RemoveElements {

    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 0, 5, 6, 7};
        int[] newArray = removeElements(intArray, 5);

        System.out.println(Arrays.toString(newArray));
    }

    public static int[] removeElements(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.err.println("Invalid index!");
            System.exit(0);
        }
        int[] newArray = {};
        for (int each = 0; each < array.length; each++) {
            if (each != index) {
                newArray = ArrayUtility.addElements(newArray, array[each]);
            }
        }
        return newArray;
    }
    public static int[] removeElements2(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        int j = 0;
        for (int each = 0; each < array.length; each++) {
            if (each == index) {
                continue;
            }
            newArray[j++] = each;
        }
        return newArray;
    }
    public static double[] removeElements(double[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.err.println("Invalid index!");
            System.exit(0);
        }
        double[] newArray = {};
        for (int each = 0; each < array.length; each++) {
            if (each != index) {
                newArray = ArrayUtility.addElements(newArray, array[each]);
            }
        }
        return newArray;
    }
    public static char[] removeElements(char[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.err.println("Invalid index!");
            System.exit(0);
        }
        char[] newArray = {};
        for (int each = 0; each < array.length; each++) {
            if (each != index) {
                newArray = ArrayUtility.addElements(newArray, array[each]);
            }
        }
        return newArray;
    }
    public static String[] removeElements(String[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.err.println("Invalid index!");
            System.exit(0);
        }
        String[] newArray = {};
        for (int each = 0; each < array.length; each++) {
            if (each != index) {
                newArray = ArrayUtility.addElements(newArray, array[each]);
            }
        }
        return newArray;
    }
}