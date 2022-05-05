package day36_InheritanceAnimalTsk.EmployeeTask;

public class Teacher extends Employee{

    public String branch;
    public Teacher(String name, String jobTitle, char gender, int age, int id, double salary, String branch){
        super(name, jobTitle, gender, age, id, salary);
        this.branch = branch;
    }
    public void teach(){
        System.out.println(name + " is teaching.");
    }

    public String toString() {
        return "Teacher{" +
                "branch='" + branch + '\'' +
                '}';
    }
}
