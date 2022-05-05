package day30_CostumClass;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        System.out.println("+++++++++++++++++++++++++++ String ArrayList to Array +++++++++++++++++++++++++++++++");
        ArrayList<String> listString = new ArrayList<>(Arrays.asList("Muhammet","Rehime","Kamile","Kamalet","Kamiljan","Heliwulla","Nefise"));

        System.out.println(listString);
        String[] arrayString = listString.toArray(new String[0]);

        System.out.println(Arrays.toString(arrayString));

        System.out.println("+++++++++++++++++++++++++++ Char ArrayList to Array +++++++++++++++++++++++++++++++");
        ArrayList<Character> listChar = new ArrayList<>();
        listChar.addAll(Arrays.asList('A','B','C','D','E','F','G','H'));

        Character[] arrayChar = listChar.toArray(new Character[0]);

        System.out.println(Arrays.toString(arrayChar));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0));



    }
}
