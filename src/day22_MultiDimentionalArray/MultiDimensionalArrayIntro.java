package day22_MultiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        String[] array1 = {"Fatih", "Mehmet", "Burak"};
        String[] array2 = {"Busra", "Fatma", "Sema"};
        String[] array3 = {"Kopek", "Kedi", "Tavuk"};

        String[][] arrays = new String[3][];
        arrays[0] = array1;
        arrays[1] = array2;
        arrays[2] = array3;

        System.out.println(Arrays.deepToString(arrays));

        System.out.println("======================= Solution 2 ================================");

       String[][] arrays1 = {array1, array2, array3};
       
        System.out.println(Arrays.deepToString(arrays1));








    }

}
