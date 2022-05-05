package day25_CustomMethodOverloading;

import java.util.Arrays;

public class SumOfNumbers {
    public static void main(String[] args) {

        double num1 = 1;
        double num2 = 2;
        double num3 = 3;
        double num4 = 4;
        sumOf2Numbers(num1, num2);
        sumOf3Numbers(num1, num2, num3);
        sumOf4Numbers(num1, num2, num3, num4);

        System.out.println(sumOf2Numbers(num1, num2) + "\n" + sumOf3Numbers(num1, num2, num3) + "\n" + sumOf4Numbers(num1, num2, num3, num4));

    }

    public static double sumOf2Numbers(double num1, double num2){
        return num1 + num2;
    }
    public static double sumOf3Numbers(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }
    public static double sumOf4Numbers(double num1, double num2, double num3, double num4){
        return num1 + num2 + num3 + num4;
    }

}
