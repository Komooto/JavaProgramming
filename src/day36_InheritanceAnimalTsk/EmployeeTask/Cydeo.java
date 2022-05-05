package day36_InheritanceAnimalTsk.EmployeeTask;

public class Cydeo {
    public static void main(String[] args) {

        Developer developer = new Developer("Muhemmetjan", "SDET", 'M', 33, 1234, 12500);
        developer.name = "Muhtar";
        developer.develop();

        Teacher teacher = new Teacher("Muhemmetjan", "SDET", 'M', 33, 1234, 12500, "Soft Skill");
        teacher.name = "Asiye";
        teacher.teach();
        teacher.drink();
        teacher.work();


        Tester tester = new Tester("Muhemmetjan", "SDET", 'M', 33, 1234, 12500);
        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);







    }
}
