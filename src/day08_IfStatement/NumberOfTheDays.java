package day08_IfStatement;

public class NumberOfTheDays {

    public static void main(String[] args) {

        int number = 12;

        //boolean has31Days = number == 1 || number == 3 || number == 5 || number == 7 || number == 8 || number == 10 || number == 12;
        boolean has30Days = number == 4 || number == 6 || number == 9 || number == 11;
        boolean has28Days = number == 2;
        boolean has31Days = !has30Days && !has28Days && number >=1 && number <= 12;

        if (has28Days){ //if the month has 28 days
            System.out.println("28 days");
        }else if (has30Days){ // if the month has 30 days
            System.out.println("30 days");
        }else if (has31Days){ // if the days has 31 days
            System.out.println("31 days");
        }else {
            System.out.println("not a month.");
        }











    }
}
