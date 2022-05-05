package day08_IfStatement;

public class SingleIfStatementsIntro {

    public static void main(String[] args) {

        int number = 300;

        //System.out.println("Odd Number");

        //System.out.println("Even Number");

         boolean evenNumber = number % 2 == 0;
         boolean oddNumber = !evenNumber;

        //System.out.println("oddNumber = " + oddNumber);
        //System.out.println("evenNumber = " + evenNumber);

        if (evenNumber){
            System.out.println(number + " is even number");
        }

        if (oddNumber){
            System.out.println(number + " is odd number");
        }

        System.out.println("----------------------------------------");

        //positive
        //negative
        //zero

        int a = 300;

        if (a>0){
            System.out.println(a + " is a positive number.");
        }

        if (a<0){
            System.out.println(a + " is a negative number.");
        }

        if (a==0){
            System.out.println(a + " is  zero.");
        }


    }


}
