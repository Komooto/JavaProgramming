package day25_CustomMethodOverloading;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4};
        int number = 5;
        int[] newArray = addInteger(array, number);

        System.out.println(Arrays.toString(newArray));

        String[] array2 = {"a", "b", "c"};
        String str = "d";

        array2 =  addString(array2, str);
        str = "e";
        array2 =  addString(array2, str);
        System.out.println(Arrays.toString(array2));

        char[] array3 = {'A', 'B', 'C'};
        char ch = 'D';
        array3 = addChar(array3, ch);
        System.out.println(Arrays.toString(array3));

    }

    public static int[] addInteger(int[] array, int number){
        int[] newArray = new int[array.length +1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = number;
        return newArray;

    }

    public static String[] addString(String[] array2, String str){
        String[] newArray2 = new String[array2.length +1];
        for (int i = 0; i < array2.length; i++) {
            newArray2[i] = array2[i];
        }
        newArray2[array2.length] = str;
        return newArray2;

    }
    
    public static char[] addChar(char[] array3, char ch){
        char[] newArray3 = new char[array3.length +1];
        for (int i = 0; i < array3.length; i++) {
            newArray3[i] = array3[i];
        }
        newArray3[array3.length] = ch;
        return newArray3;

    }


}
