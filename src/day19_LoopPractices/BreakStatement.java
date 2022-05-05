package day19_LoopPractices;

import java.util.Scanner;

public class BreakStatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        int frequency = 0;

        while (!str.equalsIgnoreCase("yes")){

            System.out.println("Enter Again!");
            str = scan.nextLine();
            frequency ++;

            if (frequency == 2 && (!str.equalsIgnoreCase("yes"))){
                System.out.println("This is last!");
            }

            if (frequency == 3){
                break;
            }
        }

        System.out.println("You welcome");
    }
}
