package day10_NestedIf;

import java.util.Scanner;

public class NameOfMonth {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String result = "";

        int number = scan.nextInt();

        if (number >= 1 && number <= 12){
            if (number == 1) {
                result = "January";
            } else if (number == 2){
                result = "February";
            }else if (number == 3){
                result = "March";
            }else if (number == 4){
                result = "April";
            }else if (number == 5){
                result = "May";
            }else if (number == 6){
                result = "June";
            }else if (number == 7){
                result = "July";
            }else if (number == 8){
                result = "August";
            }else if (number == 9){
                result = "September";
            }else if (number == 10){
                result = "October";
            }else if (number == 11){
                result = "November";
            }else{
                result = "December";
            }
            System.out.println("Name of the month is = " + result);

        }else{
            System.out.println(" Invalid Number!");
        }




    }
}
