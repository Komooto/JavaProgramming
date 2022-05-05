package day09_IfElseStatement;

import java.util.Scanner;

public class NameOfDay {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        //int n = 7; // 1~7
        String day, whatToDo;

        if (n >= 1 && n <= 7){
            if (n == 1){
            //System.out.println("Monday");
            day = "Monday";
            whatToDo = "Go toSchool";

        } else if (n == 2){
            //System.out.println("Tuesday");
            day = "Tuesday";
            whatToDo = "Go sleep";

        }else if (n == 3){
            //System.out.println("Thursday");
            day = "Thursday";
            whatToDo = "Go fishing";

        }else if (n == 4){
            //System.out.println("Wednesday");
            day = "Wednesday";
            whatToDo = "Go playing";

        }else if (n == 5){
            //System.out.println("Friday");
            day = "Friday";
            whatToDo = "Go swimming";

        }else if (n == 6){
            //System.out.println("Saturday");
            day = "Saturday";
            whatToDo = "Go shopping";

        }else {
            //System.out.println("Sunday");
            day = "Sunday";
            whatToDo = "Go sleep";

        }
            System.out.println("Day : " + day + ". " + whatToDo);

        }else{
            System.out.println("Enter valid number!");
        }










    }
}
