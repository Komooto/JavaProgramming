package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        System.out.println(number);

        for (int i = 0; i < number.size(); i++) {
            number.set(i, number.get(i) * 2);
        }
        System.out.println(number);

        number.remove(0);
        System.out.println(number);
        number.remove(0);
        number.remove(0);
        System.out.println(number);
        number.remove(number.indexOf(100));
        System.out.println(number);
        Integer remove = 80;
        number.remove(remove);
        System.out.println(number);

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("A");
        list.add("A");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println(list);

        list.remove("A");
        list.remove(list.size() -1);
        System.out.println(list);

        boolean b = list.remove("A");
        System.out.println(b);

    }
}
