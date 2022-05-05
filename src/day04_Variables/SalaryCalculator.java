package day04_Variables;

public class SalaryCalculator {

    //hourly rate, weekly hours
    public static void main(String[] args) {
        int hourlyRate = 50;
        int weeklyHours = 40;
        int numberOfWeeks = 52;

        int salary = hourlyRate * weeklyHours * numberOfWeeks;

       // System.out.println(salary );
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRate = $" + hourlyRate);

        System.out.println("salary = $" + salary);


    }


}
