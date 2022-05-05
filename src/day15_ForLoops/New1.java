package day15_ForLoops;

import java.util.Scanner;

public class New1 {

    public static void main(String[] args) {


        String str = new Scanner(System.in).nextLine();

         str = str.replace("x","a").replace("X","a");

        System.out.println(str);


    }
}
