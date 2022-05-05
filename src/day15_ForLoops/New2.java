package day15_ForLoops;

import java.util.Locale;

public class New2 {

    public static void main(String[] args) {

        String firstName = "cydeo",
                lastName = "school";
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        // firstName = ("" + firstName.charAt()).toUpperCase() + firstName.substring(1).toLowerCase();
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullNmae = firstName + " " + lastName;
        System.out.println(fullNmae);
    }
}
