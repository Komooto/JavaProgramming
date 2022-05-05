package day19_LoopPractices;

import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your text:");
        String text = scan.nextLine();

        String character = "";
        int number = 0;

        for (int i = 1; i < text.length() - 1; i++) {
            character += "" + text.indexOf(i);
            if (text.contains("" + text.indexOf(i))){
                number ++;
                continue;

            }

            System.out.println(character + number);
        }



    }
}
