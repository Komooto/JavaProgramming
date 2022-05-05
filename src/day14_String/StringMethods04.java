package day14_String;

public class StringMethods04 {

    public static void main(String[] args) {

        String me = "I love you!";

        String me2 = me.repeat(4);

        System.out.println(me2);

        System.out.println("repeat" . repeat(15));
        System.out.println(me + "\nrepeat\n" . repeat(15));
    }
}
