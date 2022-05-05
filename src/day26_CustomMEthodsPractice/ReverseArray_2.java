package day26_CustomMEthodsPractice;

import java.util.Arrays;

public class ReverseArray_2 {
    public static void main(String[] args) {
        int[] intArray = {1,1,2,3,4,5,5,6,6,};
        int[] reversed = reverse(intArray);
        System.out.println(Arrays.toString(reversed));
    }
    public static int[] reverse(int[] array){
        int[] reversed = new int[array.length];
        int j = 0;
        for (int i = array.length -1; i >= 0; i--){
            reversed[j++] = array[i];
        }
        return reversed;
    }


}
