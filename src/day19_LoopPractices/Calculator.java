package day19_LoopPractices;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        while (!(number == 1)){
            System.out.println("Please: ");
            number = scan.nextInt();
        }

        System.out.println("number = " + number);




    }
}
