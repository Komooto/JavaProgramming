package day15_ForLoops;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        System.out.println("Enter a word.");
        String scan  = new Scanner(System.in).next();

        if (scan.charAt(0) == 'x'){
             scan = scan.replaceFirst("x", "a");
        }

        System.out.println(scan);




    }
}
