package day20_Arrays;

import java.util.Scanner;

public class AppearedTwice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to compare?");
        int length = scan.nextInt();
        String[] input = new String[length];

        for (int i = 0; i < length ; i++) {
            System.out.println("Enter your input:");
            input[i] = scan.next();
        }

         for (int k = 0; k < input.length; k++) {
            String element = input[k];
            int frequency = 0;

            for (int j = 0; j < input.length; j++) {

                if (input[j].equals(element)) {
                    frequency ++;
                }
            }

            if (frequency == 2){
                System.out.println(element);
            }

        }


    }

}
