package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice_2 {

    public static void main(String[] args) {

        char[] latter = new char[26];
        String result = "";
        char[] latter2 = new char[26];
        char[] latter3 = new char[26];


        for (char i = 'A', j = 0; i <= 'Z' && j < latter.length ; i++, j++) {
            latter[j] = i;
            result += i + " ";
        }
        System.out.println(result);
        System.out.println("===========================================================");
        System.out.println(Arrays.toString(latter));
        System.out.println("===========================================================");

        for (int k = 0, l = 'A'; k < latter.length && l <= 'Z'; k++,l++ ) {
            latter2[k] = (char) l;
        }
        System.out.println(Arrays.toString(latter2));
        System.out.println("===========================================================");

        char ch = 'A';
        for (int a = 0; a < latter3.length; a++) {
            latter3[a] = ch++;
        }
        System.out.println(Arrays.toString(latter3));









    }
}
