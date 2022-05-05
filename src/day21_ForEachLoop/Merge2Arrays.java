package day15_ForLoops.day21_ForEachLoop;

import java.util.Arrays;

public class Merge2Arrays {

    public static void main(String[] args) {

        System.out.println("======================== First Solution ===========================");

        int[] num1 = {1,2,3,4,5};
        int[] num2 = {4,5,6,7,8,9,0};

        int[] merge = new int[num1.length + num2.length];

        int index = 0;

        for (int i : num1) {
            merge[index ++] = i;
        }

        for (int j : num2) {
            merge[index ++] = j;
        }

        System.out.println(Arrays.toString(merge));


        System.out.println("======================== Second Solution ===========================");

        for (int i = 0; i < num1.length; i++) {
            merge[i] = num1[i];
        }

        for (int j = 0; j < num2.length; j++) {
            merge[num1.length + j] = num2[j];
        }

        System.out.println(Arrays.toString(merge));

    }
}
