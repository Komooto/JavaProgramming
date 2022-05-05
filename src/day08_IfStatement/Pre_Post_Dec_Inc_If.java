package day08_IfStatement;

public class Pre_Post_Dec_Inc_If {

    public static void main(String[] args) {

        int a = 10;

        if (a++ == 10){
            System.out.println("a = " + ++a);
        }

        if (++a < 15){
            System.out.println("a = " + a++);
        }
        if (a > 9 ){
            System.out.println("a = " + a);
        }






    }





}
