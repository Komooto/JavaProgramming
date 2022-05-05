package day15_ForLoops.day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        System.out.println("=================== Solution 1 =========================");

        int[] numbers = {1, 2, 3, 4, 5};
        int[] reversed = new int[numbers.length];

        for (int i = 0; i < numbers.length ; i++) {
            reversed[i] = numbers[numbers.length -1 -i];
        }

        System.out.println(Arrays.toString(reversed));

        System.out.println("=================== Solution 2 =========================");

        for (int i = 0, j = numbers.length -1; i < numbers.length ; i++, j --) {
            reversed[i] = numbers[j];
        }

        System.out.println(Arrays.toString(reversed));






    }
}
