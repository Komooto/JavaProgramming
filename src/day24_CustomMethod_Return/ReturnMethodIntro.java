package day24_CustomMethod_Return;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        String str = "Java";

        System.out.println("======================== Solution 1 =============================");
        String result = reverse(str);
        System.out.println(result);

        System.out.println("======================== Solution 2 =============================");
        String result2 = reverse2(str);
        System.out.println(result2);

        System.out.println("======================== Solution 2 =============================");
        if (str.equalsIgnoreCase(result2)){
            System.out.println(str + " is palindrome.");
        }else{
            System.out.println(str + " is not palindrome.");
        }
    }

    public static String reverse(String str){

        String reverse = "";
        for (int i = str.length() -1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        return "Hello";
    }

    public static String reverse2(String str){

        String reverse2 = "";
        for (int i = str.length() -1; i >= 0 ; i--) {
            reverse2 += str.charAt(i);
        }
        return reverse2;
    }

}


