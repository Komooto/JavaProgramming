package day22_MultiDimentionalArray;

import java.util.Arrays;

public class IterationMultiDimensionalArray {

    public static void main(String[] args) {

        String[][] arrays = {{"Fatih", "Mehmet", "Burak"}, {"Busra", "Fatma", "Sema"}, {"Kopek", "Kedi", "Tavuk"}};
        System.out.println("============================ Solution 1 ============================");

        for (String[] array : arrays) {
            for (String each : array) {
                System.out.print(each + " ");
            }
        }
        System.out.println();

        System.out.println("============================ Solution 1+ ============================");

        for (int i = 0; i < arrays.length; i++) {

            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }
        }
        System.out.println();

        System.out.println("============================ Solution 2 ============================");

        for (String[] array : arrays) {
            String output = "";

            for (String each : array) {
                output +=each + " ";
            }
            System.out.println(output);
        }

        System.out.println("============================ Solution 2+ ============================");

        for (int i = 0; i < arrays.length; i++) {

            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }

    }

}
