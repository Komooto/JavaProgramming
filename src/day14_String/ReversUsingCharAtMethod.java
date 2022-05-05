package day14_String;

public class ReversUsingCharAtMethod {

    public static void main(String[] args) {

        String str = "abcde";
        String reverse = "";

        reverse += str.charAt(4);
        reverse += str.charAt(3);
        reverse += str.charAt(2);
        reverse += str.charAt(1);
        reverse += str.charAt(0);

        System.out.println("reverse = " + reverse);


    }
}
