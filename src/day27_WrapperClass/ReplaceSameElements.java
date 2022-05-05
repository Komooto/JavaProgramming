package day27_WrapperClass;

import java.util.Arrays;

public class ReplaceSameElements {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,5,7,8};
        String[] stringArray = {"AA","BB","CC","DD","EE"};

        stringArray= replace(stringArray, "CC", "00");
        System.out.println(Arrays.toString(stringArray));
        intArray= replace(intArray, 5, 0);
        System.out.println(Arrays.toString(intArray));
    }

    public static int[] replace(int[] array, int oldElement, int newElement){
            for (int index = 0; index < array.length; index++) {
                if (array[index] == oldElement){
                    array[index] = newElement;
                }
            }
        return array;
    }
    public static double[] replace(double[] array, double oldElement, double newElement){
            for (int index = 0; index < array.length; index++) {
                if (array[index] == oldElement){
                    array[index] = newElement;
                }
            }
        return array;
    }
    public static char[] replace(char[] array, char oldElement, char newElement){
            for (int index = 0; index < array.length; index++) {
                if (array[index] == oldElement){
                    array[index] = newElement;
                }
            }
        return array;
    }
    public static String[] replace(String[] array, String oldElement, String newElement){
            for (int index = 0; index < array.length; index++) {
                if (array[index] == oldElement){
                    array[index] = newElement;
                }
            }
        return array;
    }
}
