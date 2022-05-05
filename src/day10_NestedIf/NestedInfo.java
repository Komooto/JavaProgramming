package day10_NestedIf;

import java.util.Scanner;

public class NestedInfo {

    public static void main(String[] args) {

        /*
        90~100: Excellent
        80~89:  Great
        70~79:  Good
        60~69:  Passed
        0~59:   Failed
         */

        Scanner scan = new Scanner(System.in);

        int score = scan.nextInt();
        String grade = "";

        if (score >= 0 && score <= 100){
            if (score >= 90 && score <= 100){
                grade = "Excellent!";
                System.out.println("asdasd");
            }else if (score >= 80){
                grade = "Great!";
                System.out.println("asddsfdsfdsfsdfff" );
            }else if (score >= 70){
                grade = "Good!";
            }else if (score >= 60){
                grade = "Passed!";
            }else{
                grade = "Failed!";
            }

            System.out.println("Your score is: " + score + ". You are " + grade);
        }else{
            System.out.println("Please, enter valid number!");
        }



    }



}
