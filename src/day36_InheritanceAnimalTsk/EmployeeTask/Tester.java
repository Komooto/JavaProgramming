package day36_InheritanceAnimalTsk.EmployeeTask;

public class Tester extends Employee{
    public void test(){
        System.out.println(name + " is testing.");
    }
    public Tester(String name, String jobTitle, char gender, int age, int id, double salary){
        super(name, jobTitle, gender, age, id, salary);
    }
}
