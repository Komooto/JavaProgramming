package day10_NestedIf;

import java.util.Scanner;

public class IfStatementWithoutCurlyBraces {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        int score = scan.nextInt();
        String grade = "", whatToDo;

        if (score >= 0 && score <= 100){
            if (score >= 90 && score <= 100)
                grade = "Excellent!";
                //whatToDo = "Sleep"; or System.out.println("asdasd"); it does not support two statement
            else if (score >= 80)
                grade = "Great!";
                //System.out.println("asddsfdsfdsfsdfff" );
            else if (score >= 70)
                grade = "Good!";
            else if (score >= 60)
                grade = "Passed!";
            else
                grade = "Failed!";


            System.out.println("Your score is: " + score + ". You are " + grade);
        }else {
            System.out.println("Please, enter valid number!");


        }


    }
}
