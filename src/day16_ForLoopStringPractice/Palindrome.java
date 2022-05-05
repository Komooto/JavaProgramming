package day16_ForLoopStringPractice;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        // "Java"----"avaJ" ---- not Palindrome.
        // "Level"---"Level"-----is a Palindrome.
        
        Scanner scan = new Scanner(System.in);
        String original = scan.nextLine();
        String reversed = "";

        for (int i = original.length() -1; i >= 0 ; i--) {
            reversed += original.charAt(i);
            
        }
        System.out.println(reversed);
        if (original.equalsIgnoreCase(reversed.toUpperCase())){
        //if (original.toUpperCase().equals(reversed.toUpperCase())){
            // OR: boolean isPalindrome = original.equalsIgnoreCase(reversed);
            System.out.println("Palindrome.");
        }else{
            System.out.println("Not a Palindrome.");
        }

    }
}
