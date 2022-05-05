package day16_ForLoopStringPractice;

import java.util.Scanner;

public class ReturnUniqueCharacters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String removed = "";

        // solution1:
        for (int i = 0; i <= str.length() - 1; i++) {
            String after = "" + str.charAt(i);
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                removed += after;
            }
        }
        System.out.println(removed);


    }
}
