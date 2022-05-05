package day09_IfElseStatement;

public class MinNumber {

    public static void main(String[] args) {

        int n1 = 100, n2 = 200;

        boolean possibility1 = n1 < n2;
        boolean possibility2 = n1 > n2;
        boolean possibility3 = n1 == n2;

        if (possibility1){
            System.out.println("The minimum number is = " +n1);
        }else if (possibility2){
            System.out.println("The minimum number is = " +n2);
        }else if (n1 == n2){
            System.out.println(n1 + " and " + n2 + " are equal.");
        }







    }
}
