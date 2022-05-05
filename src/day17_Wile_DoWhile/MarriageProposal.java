package day17_Wile_DoWhile;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String marry = scan.next();
        int frequency = 3;

        while (!(marry.equalsIgnoreCase("yes") || marry.equalsIgnoreCase("no")) && frequency > 0){
            System.out.println("Invalid answer, please re-enter:");
            marry = scan.next();
            frequency--;
        }
        if (marry.equalsIgnoreCase("yes")){
            System.out.println("Congrats!");
        }else if (marry.equalsIgnoreCase("no")){
            System.out.println("Goodbye!");
        }else{
            System.out.println("Get out!");
        }








    }
}
