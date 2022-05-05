package day28_ArrayList;

import java.util.ArrayList;

public class Max_Min_AverageNumber {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);

        int max = number.get(0);
        int min = number.get(0);
        int sum = 0;

        for (Integer each : number) {
            if (each > max){
                max = each;
            }
            sum += each;
        }
        for (Integer each : number) {
            if (each < min){
                min = each;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum / number.size());
    }
}
