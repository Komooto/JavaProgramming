package day30_CostumClass;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentObject {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Muhemmetjan", 'M', 33, 2001, 'F');

        Student student2 = new Student();
        student2.setInfo("Kamaljan", 'M', 32, 1224, 'A');

        Student student3 = new Student();
        student3.setInfo("Kamile", 'F', 34, 1027, 'A');

        Student student4 = new Student();
        student4.setInfo("Kamalet", 'F', 33, 8013, 'B');

Student student5 = new Student();
        student5.setInfo("Rehime", 'F', 24, 1025, 'B');

         Student[] students = {student1, student2,student3,student4,student5};
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("=============================- Early & Angry Birds -==================================================");

        ArrayList<Student> earlyBirds = new ArrayList<>();
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {
            if (student.grade == 'A'){
                earlyBirds.add(student);
            }else {
                angryBirds.add(student);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);

    }
}
