package day09_IfElseStatement;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10,
                b = 30,
                c = 20;

        boolean p1 = b>a && a>c || b<a && a<c;
        boolean p2 = a>b && b>c || a<b && b<c;
        boolean p3 = !p1 && !p2;

        if (p1){
            System.out.println("p1 = " + a);
        }else if (p2){
            System.out.println("p2 = " + b);
        }else{
            System.out.println("p3 = " + c);
        }





    }






}
