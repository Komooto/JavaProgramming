package day30_CostumClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {
    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~ Remove 0 ~~~~~~~~~~~~~~~~~~~~~~~~");

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0,5,0,6,0,7,0,8,0,9,0));
        System.out.println(numbers);
        int length1 = numbers.size();
        numbers.removeIf(p -> p == 0);
        System.out.println(numbers);
        int length2 = numbers.size();
        int number = length1 - length2;

        for (int i = 0; i < number; i++) {
            numbers.add(0);
        }

        System.out.println(numbers);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~ Remove Digits and Special Characters ~~~~~~~~~~~~~~~~~~~~~~~~");

        String str = "asdfgh1234567!@#$%^&*";
        ArrayList<Character> chars = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        ArrayList<Character> letters = new ArrayList<>(chars);
        letters.removeIf( p -> !Character.isLetter(p));
        System.out.println(letters);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~ Remove Letters and Special Characters ~~~~~~~~~~~~~~~~~~~~~~~~");

        ArrayList<Character> digits = new ArrayList<>(chars);
        digits.removeIf( p -> !Character.isDigit(p));
        System.out.println(digits);

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~ Remove Digits and Special Characters ~~~~~~~~~~~~~~~~~~~~~~~~");

        ArrayList<Character> specialCharacter = new ArrayList<>(chars);
        specialCharacter.removeAll(digits);
        specialCharacter.removeAll(letters);
        System.out.println(specialCharacter);


    }
}
