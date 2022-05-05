package day17_Wile_DoWhile;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your Username:");
        String username = scan.nextLine();
        System.out.println("Please enter your Password:");
        String password = scan.nextLine();

        String userName = "Cydeo";
        String passWord = "Cydeo123";
        int attempt = 0;

        while (!(username.equals(userName) && password.equals(passWord))){
            attempt++;
            if (attempt ==3){
                System.out.println("Your account is blocked!");
            }else {
                System.out.println("Invalid username or password. Please reenter again!");
                System.out.println("Please enter your Username:");
                username = scan.nextLine();
                System.out.println("Please enter your Password:");
                password = scan.nextLine();
            }
        }




    }
}
