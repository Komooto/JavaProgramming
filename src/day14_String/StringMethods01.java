package day14_String;

public class StringMethods01 {

    public static void main(String[] args) {

        String name = "    my name is ：  ";
                name = name.trim();

        System.out.println(name);

        String s1 = "Cydeo School";

        int s2 = s1.indexOf("o ");
        System.out.println(s2);

        int int1 = s1.lastIndexOf("o");
        System.out.println(int1);



    }
}
