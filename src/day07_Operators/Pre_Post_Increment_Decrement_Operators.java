package day07_Operators;

public class Pre_Post_Increment_Decrement_Operators {

    public static void main(String[] args) {

        int x = 0;
        int y = 0;

        x++;//0

        System.out.println(x);//1
        System.out.println(x++);//1
        System.out.println(x);//2

        if (++x < 0){
            System.out.println("x1 = " + x);//x1=3
        }else if (y++ > 100){
            System.out.println("x2 = " + y);//x2=3
        }else if (x >0){
            System.out.println("x3 = " + x);//x3=4
        }




    }



}
