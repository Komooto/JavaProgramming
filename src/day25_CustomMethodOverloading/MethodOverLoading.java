package day25_CustomMethodOverloading;

import java.util.Arrays;

public class MethodOverLoading {
    public static void main(String[] args) {

        int[] intArray = {5, 6, 0 , -1, 3, 4};
        Arrays.sort(intArray);
        double[] doubleArray = {1.2, 2.0, 6.3, 8.9};
        Arrays.sort(doubleArray);
        char[] charArray = {'A', 'B', 'C'};
        Arrays.sort(charArray);

        int sum1 = sumOfNumbers(1, 2);
        System.out.println(sum1);
        double sum2 = sumOfNumbers(2.3, 6.5, 3.02);
        System.out.println(sum2);
        String sum3 = sumOfNumbers("My ", "name ", "is ", "Muhemmetjan");
        System.out.println(sum3);
    }

    public static double sumOfNumbers(double num1, double num2){
        return num1 + num2;
    }
    public static int sumOfNumbers(int num1, int num2){
        return num1 + num2;
    }
    public static String sumOfNumbers(String num1, String num2){
        return num1 + num2;
    }
    public static double sumOfNumbers(double num1, double num2, double num3){
        return num1 + num2 + num3;
    }
    public static int sumOfNumbers(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    public static String sumOfNumbers(String num1, String num2, String num3){
        return num1 + num2 + num3;
    }
    public static double sumOfNumbers(double num1, double num2, double num3, double num4){
        return num1 + num2 + num3 + num4;
    }
    public static int sumOfNumbers(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }
    public static String sumOfNumbers(String num1, String num2, String num3, String num4){
        return num1 + num2 + num3 + num4;
    }



}
