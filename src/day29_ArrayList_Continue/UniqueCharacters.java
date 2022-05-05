package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "aasssdfghjk";
        // String[] array = str.split("");  This turns String to Array.

        ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println(list);

        String unique = "";
        for (String each : list) {
            int frequency = Collections.frequency(list, each);
            if (frequency == 1 ){
                unique += each;
            }
        }

        System.out.println(unique);












    }
}
