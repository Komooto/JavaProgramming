package day15_ForLoops.day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility_02 {

    public static void main(String[] args) {

        String[] students = {"Elif","Busra","Burak","Fatih","Mehmet","Ozan"};

        String[] earlyBirds = {students[0],students[1],students[4] };
        System.out.println(Arrays.toString(earlyBirds));

        String[] earlyBirds1 = Arrays.copyOf(students, 3);
        System.out.println(Arrays.toString(earlyBirds1));

        String[] earlyBirds2 = Arrays.copyOfRange(students, 3, students.length);
        System.out.println(Arrays.toString(earlyBirds2));

        earlyBirds = Arrays.copyOf(students, 3);
        System.out.println(Arrays.toString(earlyBirds));

        earlyBirds = Arrays.copyOf(students, 11);
        System.out.println(Arrays.toString(earlyBirds));








    }
}
