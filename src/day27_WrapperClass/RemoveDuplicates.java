package day27_WrapperClass;

import Utilites.ArrayUtility;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,5,6,7,8,3,4,5,5,6,7,8};
        String[] stringArray = {"A","B","C","D","B","C","D"};
        stringArray = removeDuplicate(stringArray);
        intArray = removeDuplicate(intArray);

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(stringArray));
    }
    public static int[] removeDuplicate(int[] array){
        int[] newArray ={};
        for (int each : array) {
            if (!(ArrayUtility.contains(newArray, each))){
                newArray = ArrayUtility.addElements(newArray,each);
            }
        }
        return newArray;
    }
    public static double[] removeDuplicate(double[] array){
        double[] newArray ={};
        for (double each : array) {
            if (!(ArrayUtility.contains(newArray, each))){
                newArray = ArrayUtility.addElements(newArray,each);
            }
        }
        return newArray;
    }
    public static char[] removeDuplicate(char[] array){
        char[] newArray ={};
        for (char each : array) {
            if (!(ArrayUtility.contains(newArray, each))){
                newArray = ArrayUtility.addElements(newArray,each);
            }
        }
        return newArray;
    }
    public static String[] removeDuplicate(String[] array){
        String[] newArray ={};
        for (String each : array) {
            if (!(ArrayUtility.contains(newArray, each))){
                newArray = ArrayUtility.addElements(newArray,each);
            }
        }
        return newArray;
    }
}
