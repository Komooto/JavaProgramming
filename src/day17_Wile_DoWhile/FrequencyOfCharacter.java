package day17_Wile_DoWhile;

import day04_Variables.SalaryCalculator;

import java.util.Scanner;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "AAABBCLSJLDKFJSJHDSLKJFHSDKLJFHSLDSFJSDL;KFJSL;DKFJS;LFKJSL;DFKJSL;DKFJSL;DKFJSL;DKFJS;LDFKJ";

        char ch = 'A';
        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            char eachChar = str.charAt(i);

            if(ch == eachChar) {
                frequency += 1; // or: frequency ++;
            }
            }

        System.out.println(frequency);

        System.out.println("================================================================");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter target text:");
        String str1 = scan.nextLine();
        System.out.println("Enter word you want to search:");
        String word = scan.nextLine();

        int frequency1 = 0;

        for (int i = 0; i < str1.length() - word.length(); i++) {

            String eachWord = str1.substring(i, i + word.length());

            if (word.equals(eachWord)){
                frequency1 ++;
            }

        }
        System.out.println(frequency1);

    }
}
