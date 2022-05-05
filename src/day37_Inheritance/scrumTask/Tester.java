package day37_Inheritance.scrumTask;

public class Tester extends Employee{

    public Tester(String name, char gender, int age, String jobTitle, int id, double salary, boolean isFullTime, String companyName) {
        super(name, gender, age, jobTitle, id, salary, isFullTime, companyName);
    }

    public void createTicket(){
        System.out.println(jobTitle + " " + name + " is creating ticket.");
    }

    @Override
    public String toString() {
        return "Tester{" +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", id=" + id +
                ", age=" + age +
                "jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
