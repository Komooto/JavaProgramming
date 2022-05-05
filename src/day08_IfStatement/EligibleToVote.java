package day08_IfStatement;

public class EligibleToVote {

    public static void main(String[] args){

        String name = "Josh";
        int age = 38;
        String citizen = "USA";

        boolean isEligible = age >= 21 && citizen == "USA";

        // Eligible

        if (isEligible == true){
            System.out.println("Josh is eligible to vote.");
        }

        //Not eligible
        if (!isEligible == true){
            System.out.println("not eligible");
        }






    }



}
