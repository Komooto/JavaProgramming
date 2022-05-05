package day13_StringClass;

public class New {

    public static void main(String[] args) {

        String a = "Java";
        String b = "Java";
        String c = "Java";

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);

        System.out.println("====================================================");

        String a1 = new String("Java");
        String b1 = new String("Java");
        String c1 = new String("Java");

        System.out.println(a1 == b1);
        System.out.println(b1 == c1);
        System.out.println(a1 == c1);

        System.out.println("===================================================");

        System.out.println(a1.equals(b1));
        System.out.println(a1.equals(c1));
        System.out.println(c1.equals(b1));


    }
}
