package day29_ArrayList_Continue;

import java.util.ArrayList;

public class FirstUniqueElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("C");

        for (Object each : list.toArray()) {
            int frequency = 0;
            for (Object i : list.toArray()) {
                if (each.equals(i)){
                    frequency ++;
                }
            }
            if (frequency == 1){
                System.out.println(each);
                break;
            }
        }








    }
}
