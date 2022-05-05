package Assassment;

import javax.swing.*;
import java.util.SplittableRandom;

public class asa {

    public static void main(String[] args) {

        String str = "";
        int check = 132;
        if (check %2  == 0) {
            str += check;
            if (check % 5 == 0) {
                str += "132";
            } else {
                str = "500";
            }
        }else{
            str += "132";

        }


        System.out.println(str);



    }


}
