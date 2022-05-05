package day15_ForLoops.day21_ForEachLoop;

import java.util.Arrays;

public class ForEachIntro {

    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};

        for (int each: numbers) {
            System.out.println(each);
        }

        System.out.println("===========================================================");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("===========================================================");
        String[] students = {"Elif","Busra","Burak","Fatih","Mehmet","Ozan"};

        for (String earlyBirds: Arrays.copyOf(students, 3)) {
            System.out.println(earlyBirds);
        }

        System.out.println("===========================================================");
        for (String earlyBirds: Arrays.copyOfRange(students, 3, 5)) {
            System.out.println(earlyBirds);
        }






    }
}
