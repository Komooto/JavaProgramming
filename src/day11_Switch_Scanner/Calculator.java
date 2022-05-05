package day11_Switch_Scanner;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        double number1 = scan.nextDouble(),
                number2 = scan.nextDouble();
        char operator = scan.next().charAt(0);
        boolean valid = operator == '/' || operator == '*' || operator == '-' || operator =='+';

        //if (operator == '/' || operator == '*' || operator == '-' || operator =='+') {  * We can do like this either
        if (valid) {
            switch (operator) {

                case '/':
                    System.out.println(number1 / number2);
                    break;
                case '*':
                    System.out.println(number1 * number2);
                    break;
                case '-':
                    System.out.println(number1 - number2);
                    break;
                default:
                    System.out.println(number1 + number2);
                    break;
            }
        }else{
            System.out.println("Invalid Operator! " + operator);

        }




    }
}
