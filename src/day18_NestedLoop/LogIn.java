package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String userName = scan.nextLine();
        System.out.println("Enter your password:");
        String passWord = scan.nextLine();
        int frequency = 0;

        while (frequency < 2 && !(userName.equalsIgnoreCase("Cydeo") && passWord.equalsIgnoreCase("Cydeo123"))){
            System.out.println("Invalid username or password. Please reenter again:");
            System.out.println("Enter your username:");
            userName = scan.nextLine();
            System.out.println("Enter your password:");
            passWord = scan.nextLine();

            frequency++;
        }

        if (userName.equalsIgnoreCase("Cydeo") && passWord.equalsIgnoreCase("Cydeo123")){
            System.out.println("Loged in!");
        }else{
            System.err.println("Your account is blocked!");
        }



    }
}
