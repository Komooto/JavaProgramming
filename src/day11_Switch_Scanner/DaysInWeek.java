package day11_Switch_Scanner;

import java.util.Scanner;

public class DaysInWeek {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        //int number = 5;

        switch (number) { // 1,2,3,4,5,6,7 ==

            case 1:
                System.out.println("Monday");
                break; // not mandatory but required. If not used, it will print coming statement.

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid!");
                break; // only gets executed if none of the case blocks are matching. We can put anywhere.
        }



    }

}