package day13_StringClass;

import java.util.Locale;
import java.util.Scanner;

public class StringMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String word = "Cydeo";
        int tNumber = word.length();
        System.out.println(tNumber);

        int lCharacter = tNumber - 1;
        char lCh = word.charAt(lCharacter); // char lCh = word.charAt(tNumber - 1);
        String toL = word.toLowerCase(Locale.ROOT);
        String toA = word.toUpperCase(Locale.ROOT);
        System.out.println(toL);
        System.out.println(toA);

        System.out.println(lCh);

        String fName = input.next();
        String lName = input.next();


        char a = word.charAt(3);

        char b = fName.charAt(0);
        char c = lName.charAt(0);

        System.out.println(b + "." + c);

        System.out.println(a);

        input.close();

    }
}
