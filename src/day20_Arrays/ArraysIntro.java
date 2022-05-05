package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        String[] names;
        names = new String[5];
        names[0] = "One";
        names[4] = "Five";
        System.out.println(Arrays.toString(names));

        String[] names2 = new String[0];
        System.out.println(Arrays.toString(names2));

        int[] number = new int[5]; // byte, short, int long -- default value is: 0;
        System.out.println(Arrays.toString(number));

        float[] fl = new float[5]; // float, double -- default value is: 0.0;
        System.out.println(Arrays.toString(fl));

        boolean[] bl = new boolean[5]; // boolean -- default value is: false;
        System.out.println(Arrays.toString(bl));


        System.out.println("==================================================================");

        String[] days = {"",       "","   ","One","Two","Three"};
        System.out.println(Arrays.toString(days));



    }

}
