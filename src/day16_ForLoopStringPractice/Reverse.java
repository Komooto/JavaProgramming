package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String result= "";




        for (  int i = str.length() -1; i >= 0 ; i--) {
            result += str.charAt(i);
        }

        System.out.println(result);


    }
}
