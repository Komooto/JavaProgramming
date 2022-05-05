package day37_Inheritance.scrumTask;

import java.util.Arrays;

public class AmazonInc {
    public static void main(String[] args) {

        ProductOwner po = new ProductOwner(" Memeteli", 'M', 31, 123456, 170500, true, "Cydeo");
        BusinessAnalyst ba = new BusinessAnalyst(" Muhemmetjan", 'M', 31, 123456, 170500, true, "Cydeo");
        ScrumMaster sm = new ScrumMaster(" Ehmetjan", 'M', 31, 123456, 170500, true, "Cydeo");

        Tester tester1 = new Tester(" Adiljan", 'M', 31, "QA", 1234456, 125000, true, "Cydeo");
        Tester tester2 = new Tester(" Koresh", 'M', 33, "QE", 1234566, 125000, true, "Cydeo");
        Tester tester3 = new Tester(" Abdushukur", 'M', 31, "SDET", 12345656, 125000, true, "Cydeo");
        Tester tester4 = new Tester(" Muhemmet", 'M', 34, "QA", 12123456, 125000, true, "Cydeo");

        Tester[] testers = {tester1, tester2, tester3, tester4};

        Developer developer = new Developer("Bilal", 'M', 34, "Java Developer", 11223456, 160000, true, "Cydeo");

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);

        System.out.println(scrumTeam);

        scrumTeam.addTesters(testers);
        scrumTeam.addDeveloper(developer);
        System.out.println(scrumTeam);

        for (Tester tester : scrumTeam.testers) {
            System.out.println(tester.name + ": " + tester.salary);
        }






    }
}