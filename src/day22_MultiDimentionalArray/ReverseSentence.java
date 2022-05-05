package day22_MultiDimentionalArray;

import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {

        String input = "My name is Muhemmetjan";

        String[] split = input.split(" ");

        String output = "";

        for (int i = split.length -1; i >= 0 ; i--) {
            output += split[i] + " ";
        }

        System.out.println(input);
        System.out.println(output);






    }





}
