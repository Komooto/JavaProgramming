package day17_Wile_DoWhile;

import java.util.Scanner;

public class LogIn2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Username:");
        String username = scan.nextLine();
        System.out.println("Please enter your Password:");
        String password = scan.nextLine();

        String userName = "Cydeo";
        String passWord = "Cydeo123";

        if (username.equals(userName) && password.equals(passWord)){
            System.out.println("Logged in");
        }else {
            int attempt = 3;
            while (!(username.equals(userName) && password.equals(passWord)) && attempt > 0) {
                System.out.println("Please reenter again!");
                System.out.println("Please enter your Username:");
                username = scan.nextLine();
                System.out.println("Please enter your Password:");
                password = scan.nextLine();
                attempt--;
            }

                if (username.equals(userName) && password.equals(passWord)){
                    System.out.println("Logged in");
                } else{
                    System.err.println("Your account is blocked!");
                }



        }
    }

}
