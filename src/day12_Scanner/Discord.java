package day12_Scanner;

import java.util.Scanner;

public class Discord {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String a = s.nextLine();
        String result="";
        if(a.equals("b")){
            result= " is correct";
        }else if(a.equals("a")||a.equals("c")){
            result= " is wrong";
        }else{
            result = " is not a valid answer";
        }
        System.out.println(a+" "+result);




    }
}
