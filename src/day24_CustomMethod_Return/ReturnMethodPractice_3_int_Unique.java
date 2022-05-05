package day24_CustomMethod_Return;

import java.util.Scanner;

public class ReturnMethodPractice_3_int_Unique {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = scan.nextLine();
        System.out.println("Unique characters of \"" + input + "\" are: ");

        for (int i = 0; i < input.length(); i++) {
            int frequency = frequency(input, input.charAt(i));
            if (frequency == 1){
                System.out.print(input.charAt(i) + " ");
            }
        }

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
