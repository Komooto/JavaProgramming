package day15_ForLoops.day21_ForEachLoop;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class ArraysUtility_01 {

    public static void main(String[] args) {

        char[] ch1 = {'A','B','C'};
        char[] ch2 = {'C','B','A'};

        System.out.println(Arrays.equals(ch1,ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println(anagram);









    }
}
