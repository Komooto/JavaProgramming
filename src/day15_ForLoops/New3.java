package day15_ForLoops;

import java.util.Scanner;

public class New3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char a = scan.next().charAt(0);
        String b = "";

        if(a >= '0' && a <= '9'){
        b ="it is a number.";
        }else if (a >= 'a' && a <= 'z'){
            b = "it is a lowercase latter";
        }else if (a >= 'A' && a <= 'Z'){
            b = "it is a uppercase latter";
        }
        System.out.println(b);


    }
}
