package day24_CustomMethod_Return;

import java.util.Scanner;

public class RemoveDuplicate {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your text:");
        String input = scan.nextLine();
        String output = removeDuplicate(input);

        System.out.println("Text after removing duplicated characters is:");
        System.out.println(output);
    }

    public static String removeDuplicate(String input){

        String output = "";
        for (int i = 0; i < input.length(); i++) {
            char each = input.charAt(i);

            if (!output.contains("" + each)){
                output += each;
            }
        }
        return output;
    }
}

