import java.util.Scanner;

public class Quizz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = s.nextLine();

        //your code here


        //boolean valid = a == "a" || a == "b" || a == "c";

        switch(a){
            case "a":
                System.out.println("a is correct" );
                break;

            case "b":
                System.out.println("b is wrong" );
                break;

            case "c":
                System.out.println("c is wrong" );
                break;


                default:
                    System.out.println(a + " is not a valid answer" );
                    break;
            }
        }
    }


