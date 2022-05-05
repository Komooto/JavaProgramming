package day22_MultiDimentionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro_02{

    public static void main(String[] args) {

        String[][] arrays = {{"Fatih", "Mehmet", "Burak"}, {"Busra", "Fatma", "Sema"}, {"Kopek", "Kedi", "Tavuk"}};
        String[] array1 = arrays[1];
        String element = array1[1];

        System.out.println(Arrays.toString(array1));
        System.out.println(element);

        System.out.println("=========== Solution 2 ============");

        System.out.println(arrays[1][1]);

        System.out.println(Arrays.deepToString(arrays[1]));

        System.out.println("============================================================");

        element = array1[0];

        for (String each : array1) {
            element = each + " ";
            System.out.print(element);
        }

    }
}
