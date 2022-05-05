package day14_String;

public class StringMethods03_SubString {

    public static void main(String[] args) {

        String s = "My name is Muhemmetjan.";
        String s1 = s.substring(s.lastIndexOf("M"), s.indexOf("."));
        // or:         String s1 = s.substring(s.indexOf(" M") + 1, s.indexOf("."));

        System.out.println(s1);



    }
}
