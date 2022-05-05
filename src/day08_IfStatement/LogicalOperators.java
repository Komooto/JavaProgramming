package day08_IfStatement;

import jdk.swing.interop.SwingInterOpUtils;

public class LogicalOperators {

    public static void main(String[] args){

    int age = 20;

   int income = 5000;
   int credit = 850;

   char gender = 'F';

    boolean vote = age >= 18 && income >= 4250 && credit >= 800 && gender == 'M' || gender == 'F';

        System.out.println(vote);

        System.out.println("----------------------------------------------");


        String tYer = "Amerka";
        String toy = "Qazaq";
        String milliti = "Uyghur";

        boolean dTurkistanliq = tYer == "DT" || toy == "Uyghur" || milliti == "Uyghur";

        System.out.println(dTurkistanliq);





    }



}
