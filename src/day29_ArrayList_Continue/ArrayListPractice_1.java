package day29_ArrayList_Continue;

import Utilites.ArrayUtility;

import java.util.*;

public class ArrayListPractice_1 {
    public static void main(String[] args) {

        System.out.println("=========================== Remove Element 1 ===========================");

        String[] array = {"Muhammet","Rehime","Kamile","Kamalet","Kamiljan","Heliwulla","Nefise"};
        System.out.println(Arrays.toString(array));
        String[] arrayNew = {};
        for (String each : array) {
            if (each.length() > 6){
                continue;
            }
            arrayNew = ArrayUtility.addElements(arrayNew, each);
        }

        System.out.println(Arrays.toString(arrayNew));

        System.out.println("=========================== Remove Element 2 ===========================");

        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
        list.removeIf(each -> each.length() > 6);
        System.out.println(list);

        // Or:
        String newString = list.toString();
        String[] newArray = list.toArray(new String[0]);

        System.out.println(newString);
        System.out.println(Arrays.toString(newArray));












    }
}
