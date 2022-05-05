package day10_NestedIf;

import java.util.Scanner;

public class FieldTrip {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int grade = scan.nextInt();
                //numberOfGroups = scan.nextInt();

        //String location = scan.nextLine(),
                //teacherInCharge = scan.nextLine();

        String output = grade >= 1 && grade <= 6? grade ==1? "grade - " + grade + "\n" + "location - Apple Orchard" + "\n" + "number of groups - 3" + "teacher in charge - Mr. Smith"
                : grade == 2? "grade - " + grade + "\n" + "location - Zoo" + "\n" + "number of groups - 7" + "\n" + "teacher in charge - Mr. Lee"
                : grade == 3? "grade - " + grade + "\n" + "location - Aquarium" + "\n" + "number of groups - 5" + "\n" + "teacher in charge - Mr. Wilson"
                : grade == 4? "grade - " + grade + "\n" + "location - Movie Theater" + "\n" + "number of groups - 2" + "\n" + "teacher in charge - Mr. Reyes"
                : grade == 5? "grade - " + grade + "\n" + "location - Apple Orchard" + "\n" + "number of groups - 1" + "\n" + "teacher in charge - Mr. Lela"
                : "grade - " + grade + "\n" + "location - Six Flags" + "\n" + "number of groups - 8" + "\n" + "teacher in charge - Mr. Watt"
                : "Invalid Number!";

        System.out.println(output);

        //if (grade == 1){
            //System.out.println("grade - " + grade + "\n" + "");
        }








    }
