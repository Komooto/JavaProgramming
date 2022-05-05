package day16_ForLoopStringPractice;

import java.util.Scanner;

public class RemovingDuplicate {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String removed = "";

        // solution1:
        for (int i = 0; i <= str.length() - 1; i++) {
            String after = "" + str.charAt(i);
            if (!removed.contains(after)) {
                removed += after;
            }
        }
        System.out.println(removed);

        // solution2:
        for (int i = 0; i <= str.length() - 1; i++) {
            if (!removed.contains("" + str.charAt(i))) {
                removed += "" + str.charAt(i);
            }
        }
        System.out.println(removed);
    }
}