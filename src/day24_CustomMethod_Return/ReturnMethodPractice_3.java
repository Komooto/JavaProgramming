package day24_CustomMethod_Return;

import java.util.Scanner;

public class ReturnMethodPractice_3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = scan.nextLine();
        unique(input);

        String str = unique(input); //How to use it?

    }

    public static String unique(String input){

            for (int i = 0; i < input.length(); i++) {
                int frequency = 0;
                for (int j = 0; j < input.length(); j++) {
                    if (input.charAt(i) == input.charAt(j)){
                        frequency ++;
                    }
                }
                if (frequency == 1){
                    System.out.print(input.charAt(i) + " ");
                }
            }
            return input;
        }

    }
