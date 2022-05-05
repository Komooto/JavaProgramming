package day15_ForLoops.day21_ForEachLoop;

public class Items {

    public static void main(String[] args) {

        String[] items = {"Pepper", "Garlic", "Onion", "Carrot", "Potato", "Tomato"};
        Double[] prices = {15.5, 55.0, 16.0, 8.0, 6.0, 18.0};
        int[] itemCode = {1234, 12345, 123456, 1234567, 12345678, 123456789};

        for (int i = 0; i < items.length; i++) {
            System.out.println("Price of " + items[i] +" is: " + prices[i] + "$, code is: " + itemCode[i]);
        }









    }
}
