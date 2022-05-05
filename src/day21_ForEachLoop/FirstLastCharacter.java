package day15_ForLoops.day21_ForEachLoop;

public class FirstLastCharacter {

    public static void main(String[] args) {

        String[] input = {"Muhammet","Rahime","Kamile","Havagul"};

        for (String name : input) {
            char first = name.charAt(0);
            char last = name.charAt(name.length() -1);
            System.out.println("First character of " + name + " is " + first);
            System.out.println("Last character of " + name + " is " + last);
        }

        System.out.println("========================================================");

        for (int i = 0; i < input.length; i++) {
            String word = input[i];

            char first1 = word.charAt(0);
            char last1 = word.charAt(word.length() -1);

            System.out.println("First character of " + word + " is " + first1);
            System.out.println("Last character of " + word + " is " + last1);
        }






    }
}
