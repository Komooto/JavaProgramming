package day22_MultiDimentionalArray;

public class IterationMultiDimensionalArray_Reverse {

    public static void main(String[] args) {

        String[][] arrays = {{"Fatih", "Mehmet", "Burak"}, {"Busra", "Fatma", "Sema"}, {"Kopek", "Kedi", "Tavuk"}};
        System.out.println("============================ Solution 1 ============================");

        for (int i = arrays.length -1; i >= 0 ; i--) {

            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("============================ Solution 2 ============================");

        for (int i = arrays.length -1; i >= 0 ; i--) {

            for (int j = arrays[i].length -1; j >= 0 ; j--) {
                System.out.print(arrays[i][j] + " ");
            }
            System.out.println();
        }



    }

}
