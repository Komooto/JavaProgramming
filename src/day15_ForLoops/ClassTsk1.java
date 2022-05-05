package day15_ForLoops;

public class ClassTsk1 {

    public static void main(String[] args) {


        for (int c = 65; c <= 90; c++){

            System.out.print((char) c + " ");
        }

        System.out.println();
        for (char c = 'a'; c <= 'z'; c++){

            System.out.print(c + " ");
        }

        System.out.println();
        for (char c = 'A'; c <= 'Z'; c++){

            System.out.print(c + " ");
        }

        System.out.println();
        for (char c = 'z'; c >= 'a'; c--){

            System.out.print(c + " ");
        }

        System.out.println();
        for (char c = 'Z'; c >= 'A'; c--){

            System.out.print(c + " ");
        }

    }


}
