package day22_MultiDimentionalArray;

import java.util.Arrays;

public class ReverseSecondWord {

    public static void main(String[] args) {

        String input = "My name is Muhemmetjan";

        String[] split = input.split(" ");

        String word = split[1];
        String output = "";

        for (int i = word.length() -1; i >=0  ; i--) {
            output += word.charAt(i);
        }

        System.out.println(split[1]);
        System.out.println(output);

        System.out.println("==================================================");

        split[1] = output;
        System.out.println(Arrays.toString(split));
        String result = "";
        for (String each : split) {
            result = each;
            System.out.print(result + " ");
        }
        System.out.println();
        System.out.println("===================================================");
        System.out.println(Arrays.toString(split));
        for (String each : split) {
            String reverse = "";
            for (int i = each.length() -1; i >= 0 ; i--) {
                reverse += each.charAt(i);
            }
            System.out.println(reverse);
        }







    }

}
