package day31_Constructor.scrumTask;

import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Muhemmetjan", 123456789, "QA", 56200);
        Tester tester2 = new Tester("Ehmetjan", 321456789, "SDET", 88000);
        Tester tester3 = new Tester("Adiljan", 132654789, "QA", 73000);
        Tester tester4 = new Tester("Koresh", 123654987, "SE", 72000);
        Tester[] testers = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Muhter", 1123456789, "Java Developer", 150000);
        Developer developer2 = new Developer("Mahire", 1123456781, "Java Developer", 1250000);
        Developer developer3 = new Developer("Burhaniddin", 1123456782, "Java Developer", 120000);
        Developer developer4 = new Developer("Busare", 1123456783, "Java Developer", 115000);
        Developer[] developers = {developer1, developer2, developer3, developer4};

        ScrumTeam scrumTeam = new ScrumTeam("Asiye", "Oscar", "Mirshat", 14);

        scrumTeam.addTesters(testers);
        scrumTeam.addDevelopers(developers);

        System.out.println(scrumTeam);

        System.out.println("====================================== Each Name =========================================");

        for (Tester tester : testers) {
            System.out.println(tester.name + " : " + tester.salary);
        }
        for (Developer developer : developers) {
            System.out.println(developer.name + " : " + developer.salary);
        }

        System.out.println("====================================== Remove =========================================");

        scrumTeam.removeTester(123456789);
        scrumTeam.removeDeveloper(1123456789);

        System.out.println(scrumTeam);











    }
}
