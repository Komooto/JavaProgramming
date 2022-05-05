package day11_Switch_Scanner;

import java.util.Scanner;

public class DaysOfMonth2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int year = scan.nextInt();
        String result;

        if (number >= 1 && number <= 12){
            switch (number){

                case 2:
                   result = (year %4 == 0)?
                        "29 Days" : "28 Days";
                    break;

                case 4: case 6: case 9: case 11:
                    result = "30 Days";


                default:
                    result = "31 Days";


            }

        }else{
            result = "Invalid Number!";

        }

        System.out.println(result);




    }



}
