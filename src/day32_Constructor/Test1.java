package day32_Constructor;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {

        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("Muhemmetjan");
        ArrayList<String> strings2 = new ArrayList<>();
       strings2 = strings1;

       strings2.add("Rehime");

        System.out.println(strings1);
        System.out.println(strings2);










    }
}
