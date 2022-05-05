package day26_CustomMEthodsPractice;

import Utilites.ArrayUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[] intArray = {1,1,2,3,4,5,5,6,6,};
        double[] doubleArray = {1.1,2.2,3.3,1.1,2.2,4.4};
        char[] charArray = {'A','B','C','D','E','E'};
        String[] stringArray = {"AA", "BB", "CC", "AA", "BB"};

        int[] newIntArray = uniqueElements(intArray);
        double[] newDoubleArray = uniqueElements(doubleArray);
        char[] newCharArray = uniqueElements(charArray);
        String[] newStringArray = uniqueElements(stringArray);


        System.out.println(Arrays.toString(newIntArray));
        System.out.println(Arrays.toString(newDoubleArray));
        System.out.println(Arrays.toString(newCharArray));
        System.out.println(Arrays.toString(newStringArray));


    }
    public static int[] uniqueElements(int[] array){

        int[] uniqueElements = {};
        for (int each : array) {
            if (ArrayUtility.frequencyOfElement(array, each) == 1){
                uniqueElements = ArrayUtility.addElements(uniqueElements, each);
            }
        }
        return uniqueElements;
    }
    public static double[] uniqueElements(double[] array){

        double[] uniqueElements = {};
        for (double each : array) {
            if (ArrayUtility.frequencyOfElement(array, each) == 1){
                uniqueElements = ArrayUtility.addElements(uniqueElements, each);
            }
        }
        return uniqueElements;
    }
    public static char[] uniqueElements(char[] array){

        char[] uniqueElements = {};
        for (char each : array) {
            if (ArrayUtility.frequencyOfElement(array, each) == 1){
                uniqueElements = ArrayUtility.addElements(uniqueElements, each);
            }
        }
        return uniqueElements;
    }
    public static String[] uniqueElements(String[] array){

        String[] uniqueElements = {};
        for (String each : array) {
            if (ArrayUtility.frequencyOfElement(array, each) == 1){
                uniqueElements = ArrayUtility.addElements(uniqueElements, each);
            }
        }
        return uniqueElements;
    }
}
