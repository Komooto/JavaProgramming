package day10_NestedIf;

import java.util.Scanner;

public class DaysInWeek123 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("111111111111111111111111111111111111111111111111111111");

        int number1 = scan.nextInt();

        String n1 = (number1 == 1) ? "Monday" : (number1 == 2) ? "Tuesday" : (number1 == 3) ? "Wednesday" : (number1 == 4) ? "Thursday" : (number1 == 5) ? "Friday" : (number1 == 6) ? "Saturday" : (number1 == 7)? "Sunday" : "Invalid Number";
        System.out.println(n1);

        //we can also not to use Parentheses:
        //String n1 = number1 == 1 ? "Monday" : number1 == 2 ? "Tuesday" : number1 == 3 ? "Wednesday" : number1 == 4 ? "Thursday" : number1 == 5 ? "Friday" : number1 == 6 ? "Saturday" : number1 == 7? "Sunday" : "Invalid Number";
        //        System.out.println(n1);


        System.out.println("2222222222222222222222222222222222222222222222222222222");

        int number2 = scan.nextInt();

        //String n2 = (number2 > 7 || number2 < 1)? "Invalid Number" :(number2 == 1) ? "Monday" : (number2 == 2) ? "Tuesday" : (number2 == 3) ? "Wednesday" : (number2 == 4) ? "Thursday" : (number2 == 5) ? "Friday" : (number2 == 6) ? "Saturday" : (number2 == 7)? "Sunday" : "Invalid Number";
        //System.out.println(n2);

        //or:
        String n2 = number2 <= 7 && number2 >= 1? number2 == 1 ? "Monday" : number2 == 2 ? "Tuesday" : number2 == 3 ? "Wednesday" : number2 == 4 ? "Thursday" : number2 == 5 ? "Friday" : number2 == 6 ? "Saturday" : "Sunday" : "Invalid Number2";
                System.out.println(n2);

        System.out.println("333333333333333333333333333333333333333333333333333333");

        int number3 = scan.nextInt();

        if (number3 <= 7 && number3 >= 1) {
            String n3 = (number3 == 1) ? "Monday" : (number3 == 2) ? "Tuesday" : (number3 == 3) ? "Wednesday" : (number3 == 4) ? "Thursday" : (number3 == 5) ? "Friday" : (number3 == 6) ? "Saturday" : "Sunday";// : "Invalid Number"; ---This will not useful here.
            System.out.println(n3);
        }else{
           System.out.println("Invalid Number!");
        }
    }

}