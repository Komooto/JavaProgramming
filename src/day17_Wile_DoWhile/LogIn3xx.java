package day17_Wile_DoWhile;

import java.util.Scanner;

public class LogIn3xx {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username:");
        String userName= scan.nextLine();

        System.out.println("Enter your password:");
        String passWord = scan.nextLine();

        for (int i = 1; i <=3 ; i++) {

            if (userName.equals("Muhemmetjan") && passWord.equals("Ilham")){
                System.out.println("Logged in!");
                break;
            }else if (i == 3){
                System.err.println("Your account is blocked!");

            }else{
                System.out.println("Invalid username or password. Please re-enter again:");
                System.out.println("Enter your username:");
                 userName= scan.nextLine();

                System.out.println("Enter your password:");
                 passWord = scan.nextLine();

            }



        }




    }
}
