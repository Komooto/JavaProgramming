package day11_Switch_Scanner;

import java.util.Scanner;

public class CrewAndPassengers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        //int crew, passenger;
        String totalNumber;

        if(number == 50 || number == 75 || number == 100) {
            if (number == 50) {
                totalNumber = "Total Number is 50, crew 20 and passenger 30";
            } else if (number == 75) {
                totalNumber = "Total Number is 75, crew 25 and passenger 50";
            } else {
                totalNumber = "Total Number is 30, crew 30 and passenger 70";
            }

        }else{
            totalNumber = " Invalid Number!";
        }

        System.out.println(totalNumber);



    }
}
