package day16_ForLoopStringPractice;

import java.util.Scanner;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String digits ="";
        String letters ="";
        String specialCharacters ="";

        for (int i = 0; i <= str.length() - 1; i++) {
            char a = str.charAt(i);
            if (a >= '0' && a <= '9'){
                digits += a;
            }else if (a >= 'a' && a <= 'z'){
                letters += a;
            } else if (a >= 'A' && a <= 'Z'){
                letters += a;
            }else{
                if(a != ' ')
                specialCharacters += a;
            }
        }
        System.out.println("Digits: " + digits);
        System.out.println("Letters: " + letters);
        System.out.println("Special Characters: " + specialCharacters);
    }

}
