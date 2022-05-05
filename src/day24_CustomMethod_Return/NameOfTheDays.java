package day24_CustomMethod_Return;

import java.util.Scanner;

public class NameOfTheDays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");

        int number = scan.nextInt();
        String day = day(number);

        if (day.equals("Monday")){
            System.out.println("Go to work!");
        }else if (day.equals("Tuesday")){
            System.out.println("Go to shop!");
        }else if (day.equals("Wednesday")){
            System.out.println("Go to workout!");
        }else if (day.equals("Thursday")){
            System.out.println("Go to visit!");
        }else if (day.equals("Friday")){
            System.out.println("Go to course!");
        }else if (day.equals("Saturday")){
            System.out.println("Go to play football!");
        }else if (day.equals("Sunday")){
            System.out.println("Go to breakfast!");
        }else{
            System.err.println("Try again!");
        }

    }

    public static String day(int number){
        String name = "";
        if (number >= 1 && number <= 7) {
            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
            name = days[number - 1];
            System.out.println("It is " + name);
        }else{
            System.err.println("Invalid!");
            //return; //Exits "day" method.
        }
        return name;
    }
}
