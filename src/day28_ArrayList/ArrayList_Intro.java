package day28_ArrayList;

import Utilites.ArrayUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Intro {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(2,25 );
        number.add(30);
        number.add(40);
        number.add(50);

        int lastIndex = number.size()-1;
        int num = number.get(3);

        System.out.println(number);
        System.out.println(number.size());
        System.out.println("Last indax is: " + lastIndex);
        System.out.println("num = " + num);

        System.out.println("=========================================================");

        int[] numbers = {};
        for (int each = 0; each < number.size(); each++) {
            System.out.println((number.get(each)));
        }

        for (int each = 0; each < number.size(); each++) {
            num = number.get(each);
            numbers = ArrayUtility.addElements(numbers, num);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("=========================================================");

        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);
        list.set(2, "CC");
        System.out.println(list);






    }
}
