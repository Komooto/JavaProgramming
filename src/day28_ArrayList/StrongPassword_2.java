package day28_ArrayList;

import java.util.Scanner;

public class StrongPassword_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please create your password:");
        String password = scan.nextLine();

        char[] chars = password.toCharArray();
        int upperCase = 0;
        int lowerCase = 0;
        int specialCharacter = 0;
        int digit = 0;
        for (char each : chars) {
            if (Character.isUpperCase(each)){
                upperCase ++;
            }
            if (Character.isLowerCase(each)){
                lowerCase ++;
            }
            if (!Character.isLetterOrDigit(each)){
                specialCharacter ++;
            }
            if (!Character.isDigit(each)){
                digit ++;
            }
        }
        boolean b1 = password.length() >= 8 && !password.contains(" ");
        boolean b2 =  upperCase > 0;
        boolean b3 =  lowerCase > 0;
        boolean b4 =  specialCharacter > 0;
        boolean b5 =  digit > 0;

        boolean isStrongPassword = b1 && b2 && b3 && b4 && b5;
        System.out.println("Is strong password: " + isStrongPassword);
    }
}
