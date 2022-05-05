package day28_ArrayList;

import java.util.Scanner;

public class Ultimate_StrongPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please create your password:");
        String password = scan.nextLine();
        if (password.length() < 8){
            System.err.println("Invalid! Password length should be at least 8 character!");
            System.exit(0);
        }
        if (password.contains(" ")){
            System.err.println("Invalid! Password should not contain space!");
            System.exit(0);
        }
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
        if (upperCase <= 0){
            System.err.println("Invalid! Password should have at least one uppercase latter!");
            System.exit(0);
        }
        if (lowerCase <= 0){
            System.err.println("Invalid! Password should have at least one lowercase latter!");
            System.exit(0);
        }
        if (specialCharacter <= 0){
            System.err.println("Invalid! Password should have at least one special Character!");
            System.exit(0);
        }
        if (digit <= 0){
            System.err.println("Invalid! Password should have at least one digit!");
            System.exit(0);
        }
        System.out.println("Congratulations! Your password has been successfully created.");


    }


}
