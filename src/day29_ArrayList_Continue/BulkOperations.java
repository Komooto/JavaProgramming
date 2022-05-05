package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A","B","B","C","C","D","E"));

        System.out.println(list);

        list.removeAll(Arrays.asList("B","D"));
        System.out.println(list);

        System.out.println("======================================================");

        ArrayList<Integer> number = new ArrayList<>();
        number.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0));
        number.retainAll(Arrays.asList(1,2,3));

        System.out.println(number);

        System.out.println("======================================================");

        list = new ArrayList<>();
        list.addAll(Arrays.asList("QA","SDET","Developer","Scrum Master","BA","SDET","Developer","Scrum Master","BA"));

        list.retainAll(Arrays.asList("QA","SDET"));

        System.out.println(list);

        System.out.println("======================================================");
        number = new ArrayList<>();
        number.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0));

        boolean b = number.contains(0);
        System.out.println(b);

        b =  number.containsAll(Arrays.asList(00,1,2,3));
        System.out.println(b);

        System.out.println("======================================================");

        list = new ArrayList<>();
        String[] names = {"QA","SDET","Developer","Scrum Master","BA","SDET","Developer","Scrum Master","BA"};

        list.addAll(Arrays.asList(names));
        System.out.println(list);

        ArrayList<String> newList = new ArrayList<>(Arrays.asList(names));
        System.out.println(newList);

        number = new ArrayList<>();
        number.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0));

        int[] numbers = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0};

        // number.addAll(Arrays.asList(numbers));  It gives compile error, because we couldn't directly add primitive types to Array List.
        Integer[] nums = {1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0};
        number.addAll(Arrays.asList(nums));
        System.out.println(number);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        ArrayList<Integer> numbersList = new ArrayList<>(convertArrayToArrayList(numbers));
        System.out.println(numbersList);


    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> numbersList = new ArrayList<>();
        for (int each : array) {
            numbersList.add(each);
        }
        return numbersList;
    }



}
