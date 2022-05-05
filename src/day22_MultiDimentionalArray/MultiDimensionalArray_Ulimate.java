package day22_MultiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArray_Ulimate {

    public static void main(String[] args) {

        String[][][] arrays = {{{"Fatih", "Mehmet", "Burak"}, {"Busra", "Fatma", "Sema"}}, {{"Kopek", "Kedi", "Tavuk"}}};

        System.out.println(Arrays.deepToString(arrays));
        System.out.println(Arrays.deepToString(arrays[0]));
        System.out.println(Arrays.deepToString(arrays[0][1]));
        System.out.println(arrays[0][0][1]);

        System.out.println("======================== Array 1 ===================================");

        for (String[][] array1 : arrays) {
            System.out.println(Arrays.deepToString(array1));
        }

        System.out.println("======================== Array 1 ===================================");

        for (String[][] array1 : arrays) {
            System.out.println(Arrays.deepToString(array1));
        }

        System.out.println("======================== Array 2 ===================================");

        for (String[][] array1 : arrays) {
            for (String[] array2 : array1) {
                System.out.print(Arrays.deepToString(array2) + " ");
            }
        }
        System.out.println();
        System.out.println("======================== Array 2+ ===================================");

        for (String[][] array1 : arrays) {
            for (String[] array2 : array1) {
                System.out.println(Arrays.deepToString(array2));
            }
        }

        System.out.println("======================== Array 3 ===================================");

        for (String[][] array1 : arrays) {
            for (String[] array2 : array1) {
                for (String each : array2) {
                    System.out.print(each + " ");
                }
            }
        }
        System.out.println();
        System.out.println("======================== Array 4 ===================================");
        String[][][][] arrays4 = {{{{"Fatih 1", "Mehmet 1", "Burak 1"}, {"Busra 1", "Fatma 1", "Sema 1"}}, {{"Kopek 1", "Kedi 1", "Tavuk 1"}}}, {{{"Fatih", "Mehmet", "Burak"}, {"Busra", "Fatma", "Sema"}}, {{"Kopek", "Kedi", "Tavuk"}}}};

        for (String[][][] strings : arrays4) {
            for (String[][] array1 : strings) {
                for (String[] array2 : array1) {
                    for (String each : array2) {
                        System.out.print(each + " ");
                    }
                }
            }
        }














    }

}
