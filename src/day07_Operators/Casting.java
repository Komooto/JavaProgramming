package day07_Operators;

public class Casting {

    public static void main(String[] args) {

        float averageScore = 20.5f;
        int num0 = 20;

        double numD = (double) num0;

        System.out.println("numD = " + numD);

        byte num1 = (byte) averageScore;
        short num2 = (short) averageScore;
        int num3 = (int) averageScore;
        long num4 = (long) averageScore;
        float num5 = averageScore;
        double num6 = averageScore;



        System.out.println("averageScore = " + averageScore);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);






    }








}
