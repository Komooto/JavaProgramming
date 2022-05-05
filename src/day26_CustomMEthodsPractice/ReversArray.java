package day26_CustomMEthodsPractice;

import java.util.Arrays;

public class ReversArray {
    public static void main(String[] args) {
        int[] intArray = {1,1,2,3,4,5,5,6,6,};
        int[] reversed = reverse(intArray);
        System.out.println(Arrays.toString(reversed));
        char[] charArray = {'A','B','C','D','E','E'};
        charArray = reverse(charArray);
        System.out.println(Arrays.toString(charArray));
    }

    public static int[] reverse(int[] array){
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length -1 -i] = array[i];
        }
        return reversed;
    }
    public static double[] reverse(double[] array){
        double[] reversed = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length -1 -i] = array[i];
        }
        return reversed;
    }
    public static char[] reverse(char[] array){
        char[] reversed = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length -1 -i] = array[i];
        }
        return reversed;
    }
    public static String[] reverse(String[] array){
        String[] reversed = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length -1 -i] = array[i];
        }
        return reversed;
    }
}
