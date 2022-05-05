package day11_Switch_Scanner;

import java.util.Scanner;

public class Grade2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char grade = scan.next().charAt(0);
        String result;

        switch (grade){

            //case 'A' || 'B' || 'C' || 'D':  This is not allowed, every time there is or || it will be recognised as boolean.

            case 'A': case 'B': case 'C': case 'D':
                result = "Passed";
                break;

            case 'F':
                result = "Failed";

                break;

            default:
                result = "Invalid";



        }

        System.out.println(result);






    }
}
