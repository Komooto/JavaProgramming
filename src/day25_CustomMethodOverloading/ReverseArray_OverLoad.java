package day25_CustomMethodOverloading;

import java.util.Arrays;

public class ReverseArray_OverLoad {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};
        double[] doubleArray = {1.1,1.2,1.3,1.4,1.5};
        char[] charArray = {'A','B','C', 'D', 'E'};
        String[] stringArray = {"my ", "name ","is ", "muhemmetjan"};

        int[] reverseInt = reverse(intArray);
        double[] reverseDouble = reverse(doubleArray);
        char[] reverseChar = reverse(charArray);
        String[] reverseString = reverse(stringArray);

        System.out.println(Arrays.toString(reverseInt));
        System.out.println(Arrays.toString(reverseDouble));
        System.out.println(Arrays.toString(reverseChar));
        System.out.println(Arrays.toString(reverseString));


    }
    public static int[] reverse(int[] input){

        int[] reversed = new int[input.length];
        for (int i = 0, j = input.length -1; i < input.length ; i++, j--) {
            reversed[i] = input[j];
        }
        return reversed;
    }
    public static double[] reverse(double[] input){

        double[] reversed = new double[input.length];
        for (int i = 0, j = input.length -1; i < input.length ; i++, j--) {
            reversed[i] = input[j];
        }
        return reversed;
    }
    public static char[] reverse(char[] input){

        char[] reversed = new char[input.length];
        for (int i = 0, j = input.length -1; i < input.length ; i++, j--) {
            reversed[i] = input[j];
        }
        return reversed;
    }
    public static String[] reverse(String[] input){

        String[] reversed = new String[input.length];
        for (int i = 0, j = input.length -1; i < input.length ; i++, j--) {
            reversed[i] = input[j];
        }
        return reversed;
    }

}
