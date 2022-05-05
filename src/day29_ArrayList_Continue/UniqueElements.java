package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Character> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList('A','B','C','D','E','F','G','H','C','D','E','F'));

        System.out.println("========================== Solution 1 ====================================");

        ArrayList<Character> unique = new ArrayList<>();
        int frequency = 0;
        for (Character each : list3) {
            frequency = Collections.frequency(list3, each);
            if (frequency == 1){
                unique.add(each);
            }
        }

        System.out.println(unique);

        System.out.println("========================== Solution 2 ====================================");

        list3.removeIf( p -> list3.indexOf(p) != list3.lastIndexOf(p));

        System.out.println(list3);

        System.out.println("========================== Solution 3 ====================================");

        list3.removeIf( p -> Collections.frequency(list3, p) != 1);
        System.out.println(list3);

        System.out.println("========================== Solution 4 ====================================");

        list3.removeIf( p -> Collections.frequency(list3, p) > 1);
        System.out.println(list3);

        System.out.println("========================== Solution 5 ====================================");


        frequency = 0;
        for (Character each : list3) {
            frequency = Collections.frequency(list3, each);
            if (frequency == 1){
                System.out.print(each + " ");
            }
        }


    }
}
