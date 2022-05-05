package day37_Inheritance.scrumTask;

public class Developer extends Employee{

    public Developer(String name, char gender, int age, String jobTitle, int id, double salary, boolean isFullTime, String companyName) {
        super(name, gender, age, jobTitle, id, salary, isFullTime, companyName);
    }

    public void fixBug(){
        System.out.println(jobTitle + " " + name + " is crying");
    }
}
