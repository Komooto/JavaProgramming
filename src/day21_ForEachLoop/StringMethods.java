package day15_ForLoops.day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Java";

        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for (char each : chars) {
            System.out.println(each);
        }




    }
}