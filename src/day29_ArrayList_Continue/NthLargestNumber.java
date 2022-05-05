package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8,9,9,0));

        int grade = 3;
        for (int i = 1; i < grade; i++) {
            numbers.removeIf( p -> p == Collections.max(numbers));
        }

        int max = Collections.max(numbers);
        System.out.println(numbers);
        System.out.println(max);






    }
}
