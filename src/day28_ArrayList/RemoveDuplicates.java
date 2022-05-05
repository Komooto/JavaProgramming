package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("E");
        list.add("C");
        System.out.println(list);

        ArrayList<String> newList = new ArrayList<>();

        for (String each : list) {
            if (!newList.contains(each)){
                newList.add(each);
            }
        }

        System.out.println(newList);





    }
}
