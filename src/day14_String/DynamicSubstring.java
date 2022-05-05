package day14_String;

public class DynamicSubstring {

    public static void main(String[] args) {

        String str = "My name is: Muhammetjan";

        System.out.println(str.substring(str.indexOf(":") + 1).trim());

        String str1 = "result count:123456";

        System.out.println(str1.indexOf(":"));

        System.out.println("=============================================================");

        String str2 = "My name is: Muhammetjan Carrier: QA  Company: Apple";

        System.out.println(str2.substring(str2.indexOf(":") + 1).trim());
        int firstColon = str2.indexOf(":");
        int seconColon = str2.indexOf(":", firstColon + 1);
        System.out.println(str2.indexOf(":"));
        System.out.println("seconColon = " + seconColon);
        int thirdColon = str2.indexOf(":", seconColon +1 );
        System.out.println("thirdColon = " + thirdColon);
        System.out.println(str2.substring(seconColon + 1, thirdColon).trim());
                                         // seconColon: beginning index.
                                         // thirdColon: ending index.

/*
        1: lastName = lastName.substring(0,1).toUpperCase() + lastname.substring(1).toLowerCase();
        2: lastName = lastName.toUpperCase().charAt(0) + lastname.substring(1).toLowerCase();
        3: lastName = ("" + lastName.charAt(0)) + lastname.substring(1).toLowerCase();


 */








    }
}
