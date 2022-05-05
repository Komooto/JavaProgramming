package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Muhammet ";
        String lastName = "Ilham";
        int age = 33;
        String companyName = "Cydeo";
        String jobTitle = "Full Stack SDET";
        double salary = 100000.58;
        //String fullName = "firstName" +" " +"lastName";
        String fullName = firstName + lastName;


        System.out.println(fullName);
        System.out.println(firstName + " " + lastName);

        System.out.println("Full name of the person is: " + fullName);
        System.out.println(fullName + " is " + age + " years old.");
        System.out.println(fullName + " is " + jobTitle + ", he works at " + companyName + "." + " Salary is " + salary + "$.");





    }







}
