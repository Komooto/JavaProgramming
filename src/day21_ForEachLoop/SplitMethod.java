package day15_ForLoops.day21_ForEachLoop;

import java.util.Arrays;

public class SplitMethod {

    public static void main(String[] args) {

        String input = "Muhammet is my name, Ilham is my last name.";

        String[] split =  input.split(" ");

        System.out.println(Arrays.toString(split));

        System.out.println("==================================================");

        String email = "muhemmetjan@hotmail.com";

        String[] split1 = email.split("@");

        System.out.println(Arrays.toString(split1));

        System.out.println("==================================================");

        String str2 = "Today is nice day. Today is Monday. Today we learn Java";
        String[] split2 = str2.split("\\. ");
        System.out.println(Arrays.toString(split2));







    }
}
