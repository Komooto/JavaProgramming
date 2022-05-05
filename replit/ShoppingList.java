import java.util.Scanner;

public class ShoppingList {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String item1 = scan.next();
        double price1 = scan.nextDouble();

        String item2 = scan.next();
        double price2 = scan.nextDouble();

        String item3 = scan.next();
        double price3 = scan.nextDouble();

        //String item4 = scan.next();

        double totalPrice = price1 + price2 + price3;

        //Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
       // Total price: 15.3

        System.out.println("Enter Item1 and its price:");
        //System.out.println(item1);
        //System.out.println(price1);
        System.out.println("Enter Item2 and its price:");
        //System.out.println(item2);
        //System.out.println(price2);
        System.out.println("Enter Item3 and its price:");
        //System.out.println(item3);
        //System.out.println(price3);
        //System.out.println(item4);
        System.out.println("Item1: " + item1 + " Price: " + price1 + ", Item2: " + item2 + " Price: " + price2 + ", Item3: " + item3 + " Price: " + price3);
        System.out.println("Total price: " + totalPrice);




    }
}
