package day24_CustomMethod_Return;

import java.util.Scanner;

public class ReturnMethodPractice_3_int_Ultimate {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = scan.nextLine();
        System.out.println("Enter a character:");
        char ch = scan.next().charAt(0);

        int frequency = frequency(input, ch);

        if (frequency == 1){
            System.out.println(ch + " is a unique character.");
        }else if (frequency > 1){
            System.out.println("Character \"" + ch + "\" is appeared " + frequency + " times. It is not a unique character.");
        }else{
            System.out.println( ch + " is not contained in th text.");
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
