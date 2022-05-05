package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaObjects {
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('M', 3, 2);
        pizza1.calcCost2();

        Pizza pizza2 = new Pizza('L', 3, 1);
        pizza2.calcCost2();

        Pizza pizza3 = new Pizza('L', 3, 0);
        pizza3.calcCost2();

        pizza3.calcCost();
        System.out.println(pizza3.calcCost());

        System.out.println("============================= Pizza Arrays =========================================");

        ArrayList<Pizza> pizzaArrayList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Pizza pizzaSmall = new Pizza('S' , 2, 3);
            Pizza pizzaMedium = new Pizza('M' , 3, 4);
            Pizza pizzaLarge = new Pizza('L' , 4, 5);
            pizzaArrayList.addAll(Arrays.asList(pizzaSmall, pizzaMedium, pizzaLarge));
        }
        System.out.println("Total number of pizza is " + pizzaArrayList.size());

        double totalPrice = 0;
        for (Pizza pizza : pizzaArrayList) {
            totalPrice += pizza.calcCost();
        }

        System.out.println("Total price is $" + totalPrice );




    }
}
