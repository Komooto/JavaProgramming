package day12_Scanner;

import java.util.Scanner;

public class GradeLevel {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean valid = number >= 1 || number <= 18;

        if (valid){

            switch (number){

                case 1: case 2: case 3: case 4: case 5:
                    System.out.println("Elementary School");
                    break;

                case 6: case 7: case 8:
                    System.out.println("Middle School");
                    break;

                case 9: case 10: case 11: case 12:
                    System.out.println("High School");
                    break;

                case 13: case 14: case 15: case 16:
                    System.out.println("Collage");
                    break;

                default:
                    System.out.println("Grad School");
                    break;
            }

        }else{
            System.out.println("Invalid Grade Level Given");
        }





    }
}
