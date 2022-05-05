package day24_CustomMethod_Return;

import java.util.Scanner;

public class Money_Exchange_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int amount = scan.nextInt();
        System.out.println(amount + " Dollar equals: " + moneyExchange(amount) + "$" );
    }

    public static double moneyExchange(double amount){

        double tl = amount * 14.83;
        return tl;
    }
}
