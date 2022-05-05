package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice_2 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Muhammet","Rehime","Kamile","Kamalet","Kamiljan","Heliwulla","Nefise"));

        list.removeIf(p -> !(p.equals("Muhammet") || p.equals("Rehime")));

        System.out.println(list);


        list.addAll(Arrays.asList("Kamalet","Kamiljan","Heliwulla","Nefise"));
        list.retainAll(Arrays.asList("Muhammet", "Rehime"));
        System.out.println(list);

        System.out.println("===================================================================================");

        String[] names = {"Muhammet","Rehime","Kamile","Kamalet","Kamiljan","Heliwulla","Nefise"};
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList(names));
        list1.removeIf( p -> p.charAt(0) == 'K');
        names = list1.toArray(new String[0]);

        System.out.println(Arrays.toString(names));




    }
}
