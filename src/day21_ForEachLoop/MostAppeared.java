package day15_ForLoops.day21_ForEachLoop;

public class MostAppeared {

    public static void main(String[] args) {

        String[] input = {"Muhammet","Rahime","Kamile","Havagul","Havagul","Kamile","Kim?","Havagul"};

        int mostAppeared = 0;
        String mostAppearedWord = "";
        for (String unique : input) {
            int frequency = 0;

            for (String name : input) {

                if (unique.contains(name)) {
                    frequency++;
                }
            }
            if (mostAppeared < frequency){
                mostAppeared = frequency;
            }
            if (frequency == mostAppeared){
                mostAppearedWord = unique;
            }

        }
        System.out.println(mostAppearedWord);



    }

}
