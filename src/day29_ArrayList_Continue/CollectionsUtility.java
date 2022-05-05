package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,0};
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(0,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);

        System.out.println(list);

        System.out.println("^^^^^^^^^^^^^^^^^^^^ reverse ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        ArrayList<String> str = new ArrayList<>();
        str.addAll(Arrays.asList("A","B","C","D","E","F","G","H"));

        System.out.println(str);

        Collections.reverse(str);

        System.out.println(str);

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^ swap ^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        Collections.swap(list, 4, 2);

        System.out.println(list);

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^ max ^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        int max = Collections.max(list);

        System.out.println(max);

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^ min ^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        int min = Collections.min(list);

        System.out.println(min);

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^ Replace All ^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        list.addAll(Arrays.asList(0,0,8,0,6,5,4,3,2,1));
        Collections.replaceAll(list, 0, 10);
        System.out.println(list);

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^ Frequency ^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        int frequency = Collections.frequency(list, 10);
        System.out.println(frequency);

        frequency = Collections.frequency(str, "A");

        System.out.println(frequency);

    }
}
