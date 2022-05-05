package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariable {

    public static void main(String[] args) {


        int a = 10;
        int b = 15;
        int c = b;

        b = a;
        a = c;


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);



    }




}
