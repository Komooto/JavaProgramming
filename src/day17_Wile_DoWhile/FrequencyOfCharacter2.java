package day17_Wile_DoWhile;

import java.util.Scanner;

public class FrequencyOfCharacter2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String word = scan.nextLine();


        int frequency = 0;

        for (int i = 0; i < str.length() - word.length(); i++) {

            String eachSub = str.substring(i, i + word.length());
            // System.out.println(eachSub);

            if (word.equals(eachSub)) {
                frequency++;
            }
        }

        System.out.println(frequency);


    }

}
