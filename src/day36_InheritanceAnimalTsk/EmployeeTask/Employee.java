package day36_InheritanceAnimalTsk.EmployeeTask;

public class Employee {

    public String name, jobTitle;
    public char gender;
    public int age, id;
    public double salary;
    public static String companyName = "Cydeo";

    public Employee(String name, String jobTitle, char gender, int age, int id, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " is working.");
    }
    public void drink(){
        System.out.println(name + " is drinking.");
    }
    public void meeting(){
        System.out.println(name + " is in the meeting.");
    }
    public void code(){
        System.out.println(name + " is coding.");
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary=" + salary +
                ", companyName=" + companyName +
                '}';
    }
}
