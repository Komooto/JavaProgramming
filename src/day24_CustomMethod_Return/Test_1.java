package day24_CustomMethod_Return;

import java.util.Scanner;

public class Test_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        for (int i = 0; i < input.length(); i++) {
            int frequency = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)){
                    frequency ++;
                }
            }
            if (frequency == 1){
                System.out.println(input.charAt(i));
            }
        }
    }

}
