package day09_IfElseStatement;

import java.util.Scanner;

public class ReplitPhoneNumber {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int areaCode=scan.nextInt();
        int localNumber=scan.nextInt();

        String phoneNumber;
        //WRITE YOUT CODE HERE:

        phoneNumber = "(" + areaCode + ")-" + localNumber;

        System.out.println("Calling number " + phoneNumber);
    }
}
