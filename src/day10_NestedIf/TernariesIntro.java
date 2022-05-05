package day10_NestedIf;

import java.util.Scanner;

public class TernariesIntro {

    public static void main(String[] args) {


        int n = 100;

       String result =  (n % 2 == 0)? "Even" : "Odd";

        System.out.println("result = " + result);


        System.out.println("----------------------------------------");
        Scanner scan = new Scanner(System.in);
        int n1;
        n1 = scan.nextInt();
        //int a = 100;


        String result1 = ( n1 > 0 )? n1 + " is positive number." : (n1 < 0)? n1 + " is negative number." : n1 + " is equal to zero";

        System.out.println(result1);
    }
}
