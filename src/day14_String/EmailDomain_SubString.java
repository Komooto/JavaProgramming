package day14_String;

public class EmailDomain_SubString {

    public static void main(String[] args) {

        String s = "muhemmetjan@hotmial.com";


        String s1 = s.substring(s.indexOf("@") + 1, s.lastIndexOf("."));

        System.out.println(s1);
    }
}
