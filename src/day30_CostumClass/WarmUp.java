package day30_CostumClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUp {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0));
        System.out.println(numbers);

        Collections.swap(numbers, 0, numbers.size() -1);

        System.out.println(numbers);





    }
}
