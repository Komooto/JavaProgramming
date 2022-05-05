package day15_ForLoops.day21_ForEachLoop;

public class Reverse {

    public static void main(String[] args) {

        String[] students = {"Elif Su", "Burak Yilmaz", "Ozan Tufan", "Arda Turan", "Hakan Calhanoglu", "Cengiz Under"};

        for (String student : students) {

            String reversedName = "";
            for (int i = student.length() -1 ; i >= 0 ; i--) {
                reversedName += student.charAt(i);
            }
            System.out.println(reversedName);
        }





    }

}
