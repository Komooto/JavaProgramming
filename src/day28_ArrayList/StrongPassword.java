package day28_ArrayList;

import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please create your password:");
        String password = scan.nextLine();

        boolean b1 = password.length() >= 8 && !password.contains(" ");
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        boolean b5 = false;

        char[] chars = password.toCharArray();
        for (char each : chars) {
            if (Character.isUpperCase(each)){
                b2 = true;
            } else if (Character.isLowerCase(each)){
                b3 = true;
            } else if (Character.isDigit(each)){
                b5 = true;
            }else {
                b4 = true;
            }
        }

        boolean isStrongPassword = b1 && b2 && b3 && b4 && b5;
        System.out.println("Is strong password: " + isStrongPassword);

    }

    public static boolean isStrongPassword(String password){
        boolean b1 = password.length() >= 8 && !password.contains(" ");
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        boolean b5 = false;

        char[] chars = password.toCharArray();
        for (char each : chars) {
            if (Character.isUpperCase(each)){
                b2 = true;
            } else if (Character.isLowerCase(each)){
                b3 = true;
            } else if (Character.isDigit(each)){
                b5 = true;
            }else {
                b4 = true;
            }
            if (b2 && b3 && b4 && b5){
                break;
            }
        }

        boolean isStrongPassword = b1 && b2 && b3 && b4 && b5;
        return isStrongPassword;
    }
}
