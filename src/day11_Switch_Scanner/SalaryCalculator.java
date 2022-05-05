package day11_Switch_Scanner;

import java.util.Scanner ;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int salary = scan.nextInt();
        boolean isMarried = scan.nextBoolean();

        double taxRate = (salary >= 130000)? .35
        : (salary >= 100000)? .30
                : (salary >= 80000)? .30
                : .20;

       //taxRate = (isMarried)? taxRate-= 0.05 : taxRate *= 1;    Why this doesn't work????


        if (isMarried){
            taxRate -= 0.05;
        }else{
            taxRate *= 1;
        }   // we could not to use this "else" part.

        /* Why this doesn't work????
        taxRate = (isMarried == true)? taxRate -= 0.05
                : *= 1;
         */


        double salaryAfterTax = salary - (salary * taxRate);
        System.out.println("Salary After Tax is = " + salaryAfterTax);













            }

        }




