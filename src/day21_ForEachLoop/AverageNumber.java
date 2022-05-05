package day15_ForLoops.day21_ForEachLoop;

public class AverageNumber {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 21,};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println(sum / numbers.length);

    }
}