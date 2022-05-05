package week02;

import java.util.Scanner;

public class UserInputIntro {

    public static void main(String[] args) {

        // output goes to console --- print or println

        String name = ""; // hard coded way

        // how can I receive inout from my JAVA class

        // 1. create your scanner object. Object name can be anything.
        Scanner input = new Scanner(System.in);

        //2. prompt the user for putting input
        System.out.println("Put your name : ");

        // 3. Get the input

        name  = input.next(); // reads the date from console and assigns the value from my variable.

        // 4. use the value that I read.

        System.out.println("name = " + name);

        // Step 1 and 3 is MUST, but steps 2 and 4 depends on the situation.
        // we need to import scanner class from JAVA utilities
        // import java.util.Scanner; you put this statement at the top of your page before class.









    }



}
