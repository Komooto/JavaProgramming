package day29_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {


        ArrayList<Integer> score= new ArrayList<>();
        score.addAll(Arrays.asList(100,90,76,45,88,76,98,76,45,76));

        ArrayList<Integer> gradeOfA= new ArrayList<>();
        gradeOfA.removeIf(p -> p >= 90 && p <= 100);
        ArrayList<Integer> gradeOfB= new ArrayList<>();
        gradeOfB.removeIf(p -> p >= 80 && p < 90);

        ArrayList<Integer> gradeOfC= new ArrayList<>();
        gradeOfC.removeIf(p -> p >= 70 && p < 80);

        ArrayList<Integer> gradeOfD= new ArrayList<>();
        gradeOfD.removeIf(p -> p >= 60 && p < 70);

        ArrayList<Integer> gradeOfF= new ArrayList<>();
        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);

        System.out.println("Total number of grade A is: " + gradeOfA);
        System.out.println("Total number of grade B is: " + gradeOfB);
        System.out.println("Total number of grade C is: " + gradeOfC);
        System.out.println("Total number of grade D is: " + gradeOfD);
        System.out.println("Total number of grade F is: " + gradeOfF);







    }
}
