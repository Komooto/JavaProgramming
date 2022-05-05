package day37_Inheritance.scrumTask;

public class ProductOwner extends Employee{

    public ProductOwner(String name, char gender, int age, int id, double salary, boolean isFullTime, String companyName) {
        super(name, gender, age, "ProductOwner", id, salary, isFullTime, companyName);
    }
}
