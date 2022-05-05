package day20_Arrays;

import java.util.Scanner;

public class NameOfTheMonth {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        //        index:     0           1        2       3      4      5      6       7         8           9         10         11
        // we can change exist value:
        month[7] = "not August";
        // but, we can't change or add not existing value:
        // if we add another extra value it will be give error:
        // month[12] = "JavaDay";   -- false, because the number of value is fixed.

        while (true) {

            int number = scan.nextInt();
            int frequency = 0;

            if (!(number >= 1 && number <= 12)) {
                System.err.println("Invalid number! Please enter again.");
                number = scan.nextInt();
                frequency++;

                if (frequency == 3) {
                    System.exit(0);
                }

            }

            System.out.println(month[number - 1]);

        }






    }
}
