package day37_Inheritance.scrumTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, char gender, int age, int id, double salary, boolean isFullTime, String companyName) {
        super(name, gender, age, "Business Analyst", id, salary, isFullTime, companyName);
    }
}
