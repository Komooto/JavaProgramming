package day17_Wile_DoWhile;

import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String print= "";
        String notPrint = "";

        for (int i = 0; i < str.length(); i++) {
            String remove = "" + str.charAt(i);

            if (print.contains(remove)){
                notPrint += remove;
                continue;
            }

            print += remove;

            }
        System.out.println("print = " + print);
        System.out.println("notPrint = " + (notPrint.length() - 1) + " " + notPrint);

    }









    }
