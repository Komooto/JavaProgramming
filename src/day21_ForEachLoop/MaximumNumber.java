package day15_ForLoops.day21_ForEachLoop;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        int[] numbers2 = {1,2,3,4,5};
        int maxNumber =numbers2[0];
        for (int number : numbers2) {
            if (number > maxNumber){
                maxNumber = number;
            }

        }
        System.out.println(maxNumber);


    }
}
