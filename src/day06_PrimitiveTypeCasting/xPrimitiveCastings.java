package day06_PrimitiveTypeCasting;

public class xPrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        // short b = (short) a;


        int c = b;
        // int c = (int) b;

        long d = c;
        // long d = (long)c;

        float e = d;
        // float e = (dloat)d;

        double f = e;
        // double f = (double)e;

        long x = 1000;
        int y = (int)x;
        long z = y;

        long v = 1000;
        byte k = (byte)v;

        System.out.println(v + " : " + k);

        double n = 10.8     ;
        int m = (int)       n       ;
        System.out.println(m);

        System.out.println(a + " : " + b + " : " + c + " : " + d + " : " + e + " : " + f + " : " + x +" : " + y + " : " +z);













    }








}
