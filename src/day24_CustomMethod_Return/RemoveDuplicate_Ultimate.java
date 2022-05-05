package day24_CustomMethod_Return;

import java.util.Scanner;

public class RemoveDuplicate_Ultimate {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = scan.nextLine();
        System.out.println("New text after removing duplicated characters is:");

        String output = "";
        for (int i = 0; i < input.length(); i++) {
            int frequency = frequency(input, input.charAt(i));
            if (frequency != 2){
                output += input.charAt(i);
            }
        }
        System.out.println(output);
    }

    public static int frequency(String input, char ch){

        int frequency = 0;
        for (char each : input.toCharArray()) {

            if (each == ch){
                frequency ++;
            }
        }
        return frequency;
    }

}
