package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int a = 5;
        ++a;
        ++a;

        int b = a;

        System.out.println(b);

        System.out.println("-----------------------------------------------------");

        int x = 100;
        int y = 200;

        System.out.println(x--);
        System.out.println(x);
        System.out.println(x++);
        System.out.println(x);

        //System.out.println(++x);
        //System.out.println(y);

        System.out.println("-----------------------------------------------------");

        int z = 100;
        System.out.println(--z);
        System.out.println(z--);
        System.out.println(z);
        System.out.println(z);
        System.out.println(z--);
        System.out.println(z--);
        System.out.println(z);

        System.out.println("-------------------------------");

        int m = 10;
        int n = 0;

        //n++;
        ++m;
        //n++;
        //n++;
        //n++;


        System.out.println("m = " + m);
        System.out.println("n = " + n);

        System.out.println("------------------------------------");

        int k = 0;
        k++;

        System.out.println("k = " + k);
        System.out.println("k = " + k++);
        System.out.println("k = " + k);
        System.out.println(" ");

        if (++k < 3){
            System.out.println("k1 = " + ++k);
        }else if (++k < 4){
            System.out.println("k2 = " + k++);
        }else{
            System.out.println("k3 = " + ++k);
        }
        System.out.println(" ");
        int j = 0;
        ++j;

        System.out.println("j = " + j);
        System.out.println("j = " + ++j);
        System.out.println("j = " + j);


        if (j++ < 3){
            System.out.println("j1 = " + k);
        }else{
            System.out.println("j2 = " + k);
        }








    }




}
