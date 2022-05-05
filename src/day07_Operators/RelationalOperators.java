package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {


        boolean result1 = 20 > 40;
        System.out.println("result1 = " + result1);

        boolean result2 = 20 >= 19;
        boolean result3 = 20 >= 20;
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

        System.out.println("----------------------------------");

        int a = 100;
        int b = 200;

        boolean x = a == b;

        System.out.println("x = " + x);

        System.out.println("-----------------------------------");

        boolean result4 = "Muhammet" != "Muhammet";

        System.out.println("result4 = " + result4);

        System.out.println("--------------------------------------");

        String EastTurkistan = " is occupied land";
        boolean what = EastTurkistan == " is occupied land";

        System.out.println("what = " + what);




    }






}
