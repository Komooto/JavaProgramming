package day08_IfStatement;

public class SalaryCalculator {


    public static void main(String[] args) {
        int hourlyRate = 50,
                weeklyHours = 45;

        double stateTaxRate = 6.5,
                federalTax = 26.2;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;

        double stateTax = salaryBeforeTax*stateTaxRate/100;
        double salaryAfterTax = salaryBeforeTax - salaryBeforeTax*stateTaxRate/100 - salaryBeforeTax*federalTax/100;

        System.out.println(salaryAfterTax);
    }


}