package day24_CustomMethod_Return;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        int[] array1 = {0,1,2,3,4,4,4,4,4,4,4,4,4,4,4,4};
        int[] array2 = {6,7,8,9,10,11,12,13,1,1,1,1,1,1,1,1,1,11,};
        int[] merged = merge(array1, array2);

        System.out.println(Arrays.toString(merged));

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
}
