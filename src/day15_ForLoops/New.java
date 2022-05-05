package day15_ForLoops;

import java.util.Scanner;

public class New {

    public static void main(String[] args) {


        String str = new Scanner(System.in).nextLine();

        if (str.charAt(0) == 'x'){
            str = str.replaceFirst("x","a");
        }

        System.out.println(str);


    }

}
