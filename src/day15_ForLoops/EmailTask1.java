package day15_ForLoops;

import java.util.Scanner;

public class EmailTask1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();
        String firstName = email.substring(0,email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        String rest = email.substring(email.indexOf("@"));
        String fullName = "0";
        int index = email.indexOf("_");
//muhemmetjan_ilham@gmail.com
        if (index > 0){
           // fullName = lastName + "_" + firstName + rest;
            fullName = firstName + "_" + lastName + rest;
        }else{
            fullName = "asasas";
        }

        System.out.println(fullName);
    }
}
