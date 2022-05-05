package day25_CustomMethodOverloading;

import Utilites.StringUtility;

public class Test {
    public static void main(String[] args) {

        String  str = "ABCDEFG";
        str = StringUtility.reverse(str);
        StringUtility.printEachChar(str);
        System.out.println(str);
        System.out.println("==============================================");
        String str1 = "Level";
        boolean isPalindrome = StringUtility.palindrome(str1);
        System.out.println(isPalindrome);
        System.out.println("==============================================");
        String[] strs = {"Anna", "Java", "Python", "racecar", "Mom", "Cydeo"};
        int frequency = 0;

        for (String each : strs) {
            if (isPalindrome = StringUtility.palindrome(each)){
                frequency ++;
            }
        }
        System.out.println(frequency);

        System.out.println("==============================================");

        str = "aaaaaaaassssssdfghjkjhgfdfgfdsfghjkl";

        str = StringUtility.removeDuplicater(str);
        System.out.println(str);




    }
}
