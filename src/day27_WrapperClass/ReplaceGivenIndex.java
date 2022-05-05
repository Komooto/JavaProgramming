package day27_WrapperClass;

import java.util.Arrays;

public class ReplaceGivenIndex {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5,5,7,8};
        String[] stringArray = {"AA","BB","CC","DD","EE"};

        stringArray = replaceNewElement(stringArray, 2, "FF" );
        intArray = replaceNewElement(intArray, 5, 6 );
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(stringArray));
    }

    public static int[] replaceNewElement(int[] array, int index, int newElement){
        if (index < 0 || index >= array.length){
            System.err.println("Invalid Index!");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    public static double[] replaceNewElement(double[] array, int index, double newElement){
        if (index < 0 || index >= array.length){
            System.err.println("Invalid Index!");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    public static char[] replaceNewElement(char[] array, int index, char newElement){
        if (index < 0 || index >= array.length){
            System.err.println("Invalid Index!");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    public static String[] replaceNewElement(String[] array, int index, String newElement){
        if (index < 0 || index >= array.length){
            System.err.println("Invalid Index!");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
}
