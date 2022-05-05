package day31_Constructor.scrumTask;

public class Developer {
    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name + " is smoke coding.");
    }

    public void creatingTicket(){
        System.out.println(name + " is unitTesting.");
    }

    public void fixingBug(){
        System.out.println(name + " is fixingBug.");
    }



}
