package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ReversArrayAndArrayList {

    public static void main(String[] args) {

        System.out.println("============================== Revers Array ===================================");
        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        int[] newList1 = new int[numbers1.length];

        int j = 0;
        for (int each1 = numbers1.length - 1; each1 >= 0; each1--) {
            newList1[j ++] = numbers1[each1];
        }
        System.out.println(Arrays.toString(newList1));

        System.out.println("=========================== Revers Array List =================================");
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));

        ArrayList<Integer> newList2 = new ArrayList<>();
        for (int each2 = numbers2.size() - 1; each2 >= 0; each2--) {
            newList2.add(numbers2.get(each2));
        }
        System.out.println(newList2);













    }
}