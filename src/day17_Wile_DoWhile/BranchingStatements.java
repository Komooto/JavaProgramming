package day17_Wile_DoWhile;

import java.util.Scanner;

public class BranchingStatements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println();
            int number = scan.nextInt();

            if (number < 0){
                break;
            }
        }


    }
}
