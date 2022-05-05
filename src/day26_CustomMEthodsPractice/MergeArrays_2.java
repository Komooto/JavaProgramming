package day26_CustomMEthodsPractice;

import java.util.Arrays;

public class MergeArrays_2 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {11,22,33,44,55};
        int[] newArray = merge(array1, array2);
        System.out.println(Arrays.toString(newArray));
    }
    public static int[] merge(int[] array1, int[] array2){
        int[] newArray = new int[array1.length + array2.length];
        int j = 0;
        for (int each : array1) {
            newArray[j++] = each;
        }
        for (int each : array2) {
            newArray[j++] = each;
        }
        return newArray;
    }
    public static double[] merge(double[] array1, double[] array2){
        double[] newArray = new double[array1.length + array2.length];
        int j = 0;
        for (double each : array1) {
            newArray[j++] = each;
        }
        for (double each : array2) {
            newArray[j++] = each;
        }
        return newArray;
    }
    public static char[] merge(char[] array1, char[] array2){
        char[] newArray = new char[array1.length + array2.length];
        int j = 0;
        for (char each : array1) {
            newArray[j++] = each;
        }
        for (char each : array2) {
            newArray[j++] = each;
        }
        return newArray;
    }
    public static String[] merge(String[] array1, String[] array2){
        String[] newArray = new String[array1.length + array2.length];
        int j = 0;
        for (String each : array1) {
            newArray[j++] = each;
        }
        for (String each : array2) {
            newArray[j++] = each;
        }
        return newArray;
    }


}
