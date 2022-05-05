package day09_IfElseStatement;

import java.util.Scanner;

public class NameOfTheMonth {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int month = scan.nextInt();
        String nameOfTheMonth;


        if (month == 1){
            nameOfTheMonth = "January";
        }else if (month == 2){
            nameOfTheMonth = "February";
        }else if (month == 3){
            nameOfTheMonth = "March";
        }else if (month == 4){
            nameOfTheMonth = "April";
        }else if (month == 5){
            nameOfTheMonth = "May";
        }else if (month == 6){
            nameOfTheMonth = "June";
        }else if (month == 7){
            nameOfTheMonth = "July";
        }else if (month == 8){
            nameOfTheMonth = "August";
        }else if (month == 9){
            nameOfTheMonth = "September";
        }else if (month == 10){
            nameOfTheMonth = "October";
        }else if (month == 11){
            nameOfTheMonth = "November";
        }else{
            nameOfTheMonth = "December";
        }

        System.out.println("nameOfTheMonth is: " + nameOfTheMonth);








    }
}
