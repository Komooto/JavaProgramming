package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod_2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("C");

        for (String each : list) {
            if (list.indexOf(each) == list.lastIndexOf(each)){
                System.out.println(each);
            }
        }

        System.out.println(list);
        list.remove(list.lastIndexOf("C"));
        System.out.println(list);




        boolean b = list.remove("C");
        System.out.println(b);
        System.out.println(list);

        list.clear();
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("C");

        int num1 = list.indexOf("C");
        int num2 = list.lastIndexOf("C");
        System.out.println(num1 + " " + num2);

        b = list.contains("A");
        System.out.println(b);

        System.out.println("*******************************************************************");

        ArrayList<String> newList = new ArrayList<>();
        newList.add("A");
        newList.add("B");
        newList.add("C");
        newList.add("D");
        newList.add("E");
        newList.add("C");

        b = list.equals(newList);
        System.out.println(list == newList); // False, because they are 2 different objects.
        System.out.println(b);               // True, because they have same elements.

        newList.remove("C");
        b = list.equals(newList);
        System.out.println(b);

        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        list.clear();
        b = list.isEmpty();

        System.out.println(b);

        System.out.println("##############################################################################");

        list.addAll(Arrays.asList("A","B","C","D","E"));

        System.out.println(list);







    }

}
