package day26_CustomMEthodsPractice;





import Utilites.ArrayUtility;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {11,22,33,44,55};
        String[] array3 = {"A","B","C","D","E"};
        String[] array4 = {"AA","BB","CC","DD","EE"};

        String[] newArray2 = merge(array3, array4);
        int[] newArray = merge(array1, array2);
        System.out.println(Arrays.toString(newArray));
        System.out.println(Arrays.toString(newArray2));
    }

    public static int[] merge(int[] array1, int[] array2){
        int[] newArray = {};
        for (int each : array1) {
            newArray = ArrayUtility.addElements(newArray, each);
        }
        for (int each : array2) {
            newArray = ArrayUtility.addElements(newArray, each);
        }
        return newArray;
    }
    public static double[] merge(double[] array1, double[] array2){
        double[] newArray = {};
        for (double each : array1) {
            newArray = ArrayUtility.addElements(newArray, each);
        }
        for (double each : array2) {
            newArray = ArrayUtility.addElements(newArray, each);
        }
        return newArray;
    }
    public static char[] merge(char[] array1, char[] array2){
        char[] newArray = {};
        for (char each : array1) {
            newArray = ArrayUtility.addElements(newArray, each);
        }
        for (char each : array2) {
            newArray = ArrayUtility.addElements(newArray, each);
        }
        return newArray;
    }
    public static String[] merge(String[] array1, String[] array2){
        String[] newArray = {};
        for (String each : array1) {
            newArray = ArrayUtility.addElements(newArray, each);
        }
        for (String each : array2) {
            newArray = ArrayUtility.addElements(newArray, each);
        }
        return newArray;
    }
}
