package day15_ForLoops.day21_ForEachLoop;

public class Initials {

    public static void main(String[] args) {

        String[] students = {"Elif Su", "Burak Yilmaz", "Ozan Tufan", "Arda Turan", "Hakan Calhanoglu", "Cengiz Under"};

        for (String student : students) {
            System.out.println(student.charAt(0) + " " + student.charAt(student.indexOf(" ") +1));
        }





    }
}
