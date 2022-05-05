package Utilites;

import java.util.Arrays;

public class StringUtility {

    public static void printEachChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public static String reverse(String str){
        String reversedString = "";
        for (int i = 0; i < str.length(); i++) {
            reversedString += str.charAt(str.length() -1 -i);
        }
        return reversedString;
    }

    public static boolean palindrome(String str){

        boolean isPalindrome = reverse(str).equalsIgnoreCase(str);
    return isPalindrome;
    }

    public static boolean anagram(String str1, String str2){

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str1.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        boolean isAnagram = Arrays.equals(charArray1,charArray2);

        return isAnagram;
    }

    public static String removeDuplicater(String str){
            String output = "";
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                if (!output.contains("" + each)){
                    output += each;
                }
            }
            return output;
        }


    }

