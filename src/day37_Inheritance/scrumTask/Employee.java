package day37_Inheritance.scrumTask;

public class Employee extends Person{
    public String jobTitle;
    public int id;
    public double salary;
    boolean isFullTime;
    public String companyName;

    public Employee(String name, char gender, int age, String jobTitle, int id, double salary, boolean isFullTime, String companyName) {
        super(name, gender, age);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(jobTitle + " " + name + " is working.");
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                "jobTitle='" + jobTitle + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
