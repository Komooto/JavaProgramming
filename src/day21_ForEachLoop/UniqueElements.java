package day15_ForLoops.day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] input = {"Muhammet","Rahime","Kamile","Havagul","Havagul","Kamile","Kim?"};

        for (String unique : input) {
            int frequency = 0;

            for (String name : input) {

                if (unique.contains(name)) {
                    frequency++;
                }
            }
            if (frequency == 1){
                System.out.println(unique);
            }
        }







    }
}
