package day12_Scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your score.");

        int score = input.nextInt();
        //char grade = input.next().charAt(0);

        boolean valid = score >= 0 && score <= 100;

        String result = (valid)?
                (score >= 90)? " Excellent!"
                        : (score >= 80)? "Great!"
                        : (score >= 70)? "Good!"
                        : " Passed!"

        : "Invalid Score!";

        System.out.println(result);

        input.close();

        }



    }
