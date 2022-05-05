package Utilites;

import java.util.ArrayList;
import java.util.Arrays;

public class AllTypeArrays {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("A","B","C","D","E","F","G","H"));

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList("Muhammet","Rehime","Kamile","Kamalet","Kamiljan","Heliwulla","Nefise"));

        ArrayList<Character> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList('A','B','C','D','E','F','G','H'));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0));

        ArrayList<Integer> numbersReversed = new ArrayList<>();
        numbersReversed.addAll(Arrays.asList(0,9,8,7,6,5,4,3,2,1));

        System.out.println(numbers);
        System.out.println(numbersReversed);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);









    }
}
