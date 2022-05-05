package day36_InheritanceAnimalTsk.EmployeeTask;

public class Developer extends Employee{

    public Developer(String name, String jobTitle, char gender, int age, int id, double salary){
        super(name, jobTitle, gender, age, id, salary);
    }

    public void develop(){
        System.out.println(name + " is developing.");
    }
}
