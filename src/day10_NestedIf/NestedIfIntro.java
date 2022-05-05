package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {


        int score = 150;

        if (score >= 0 && score <= 100){

            if (score >= 60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }



        }else if (score >100 && score <= 200){
            System.out.println("Are you kidding me?");
        }else{
            System.out.println("Invalid Score!");
        }
        System.out.println("---------------------------------------------------------");



        boolean hasId= false;
        int age = 25;

        if (hasId == true){
            if (age >= 18){
                System.out.println("Eligible to vote.");
            }else{
                System.out.println("Not eligible to vote.");
            }

        }else{
            System.out.println("You must have an ID to buy alcohol!");
        }



    }




}
