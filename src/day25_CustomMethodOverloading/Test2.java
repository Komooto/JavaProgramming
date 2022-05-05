package day25_CustomMethodOverloading;

import Utilites.ArrayUtility;

public class Test2 {
    public static void main(String[] args) {

        int[] arrayInt = {1, 2, 3, 4, 5};
        double[] arrayDouble = {1.1, 2.2, 3.3, 4.4, 5.5};
        char[] arrayChar = {'A', 'B', 'C', 'D', 'E'};
        String[] arrayString = {"Memetjan", "Rehime", "Kamile", "Kamalet", "Kamaljan"};

        ArrayUtility.printEachElementElement(arrayInt);
        ArrayUtility.printEachElementElement(arrayDouble);
        ArrayUtility.printEachElementElement(arrayChar);
        ArrayUtility.printEachElementElement(arrayString);

        System.out.println("=================================================");
        int[] numbers1 = {1,2,3,4,5,6,7,8};
        int max1 = ArrayUtility.max1(numbers1);
        System.out.println(max1);
        max1 = ArrayUtility.max2(numbers1);
        System.out.println(max1);
        double[] numbers2 = {1.1,2.1,3.1,4.1,5.1,6.1,7.1,8.1};
        double max2 = ArrayUtility.max1(numbers2);
        System.out.println(max2);
        max2 = ArrayUtility.max2(numbers2);
        System.out.println(max2);

        System.out.println("========================================");

        boolean contains = ArrayUtility.contains(numbers1, 1);
        System.out.println(contains);

        contains = ArrayUtility.contains(arrayString, "Kim");
        System.out.println(contains);




    }
}
