package day25_CustomMethodOverloading;

import java.util.Arrays;

public class MergeArraysOverLoading {
    public static void main(String[] args) {
        int[] intArray1 = {1,2,3,4,5};
        int[] intArray2 = {6,7,8,9,10};
        double[] doubleArray1 = {1.1,1.2,1.3,1.4,1.5};
        double[] doubleArray2 = {1.6,1.7,1.8,1.9,1.0};
        String[] stringArray1 = {"my ", "name "};
        String[] stringArray2 = {"is ", "muhemmetjan "};

        int[] mergeInt = merge(intArray1, intArray2);
        double[] mergeDouble = merge(doubleArray1, doubleArray2);
        String[] mergeString = merge(stringArray1, stringArray2);

        System.out.println(Arrays.toString(mergeInt));
        System.out.println(Arrays.toString(mergeDouble));
        System.out.println(Arrays.toString(mergeString));
    }

    public static int[] merge(int[] array1, int[] array2){
        int[] merged = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            merged[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            merged[array1.length+j] = array2[j];
        }
        return merged;
    }
    public static double[] merge(double[] array1, double[] array2){
        double[] merged = new double[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            merged[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            merged[array1.length+j] = array2[j];
        }
        return merged;
    }
    public static char[] merge(char[] array1, char[] array2){
        char[] merged = new char[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            merged[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            merged[array1.length+j] = array2[j];
        }
        return merged;
    }
    public static String[] merge(String[] array1, String[] array2){
        String[] merged = new String[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            merged[i] = array1[i];
        }
        for (int j = 0; j < array2.length; j++) {
            merged[array1.length+j] = array2[j];
        }
        return merged;
    }

}
