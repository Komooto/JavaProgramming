package day25_CustomMethodOverloading;

import java.util.Arrays;

public class AddElementToArray_Overloading {
    public static void main(String[] args) {
        String[] arrayString = {"My ", " name", "is "};
        arrayString = addElements(arrayString, "Muhemmetjan");
        char[] charArray = {'A','B','C','D'};
        charArray = addElements(charArray, 'E');
        int[] arrayInt = {1, 2, 3};
        arrayInt = addElements(arrayInt, 4);
        double[] arrayDouble = {1.03, 6.55, 9.8};
        arrayDouble = addElements(arrayDouble, 2.01);
        

        System.out.println(Arrays.toString(arrayString));
        System.out.println(Arrays.toString(charArray));
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayDouble));
        
    }

    public static String[] addElements(String[] array, String str){
        String[] newArray = new String[array.length +1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = str;
        return newArray;

    }
    public static char[] addElements(char[] array, char str){
        char[] newArray = new char[array.length +1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = str;
        return newArray;

    }
    public static int[] addElements(int[] array, int str){
        int[] newArray = new int[array.length +1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = str;
        return newArray;

    }
    public static double[] addElements(double[] array, double str){
        double[] newArray = new double[array.length +1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = str;
        return newArray;

    }

}
