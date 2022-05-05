package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] items = new String[5];
        int[] prices = new int[5];
        int totalPrice = 0;
        int index = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter item name:");
            items[i] = scan.next();
            System.out.println("Enter item price:");
            prices[i] = scan.nextInt();
            totalPrice += prices[i];
            index = i;
        }

        System.out.println("Items: " + Arrays.toString(items));
        System.out.println("Prices: " + "$" + Arrays.toString(prices));
        System.out.println("Total price: " + "$" + totalPrice);







    }
}
