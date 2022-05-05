package day15_ForLoops;

public class ForLoopPractice {

    public static void main(String[] args) {

        for (int i = 15; i <= 45; i++) {
            System.out.println(i);
        }

        int int2;
        for (int2 = 2; int2 <= 20; int2++){
            System.out.print(int2 + " ");
        }

        System.out.println();

        for (int int1 = 1; int1 <= 20; int1++){
            System.out.println("Hello World!");
            System.out.println("Hello Morld!");
        }
        System.out.println("Hello Torld!");

        for (int int1 = 100; int1 <= 1000; int1 += 100){
            System.out.println(int1);
        }

        for (int int1 = 99; int1 == 99; int1 += 1){
            System.out.println(int1);
        }

        System.out.println("====================================================================");

        for (int i = 1; i <= 55; i += 2){

            if (i > 1){
                System.out.print(i - 1 + " ");
            }

        }

        System.out.println("\n====================================================================");

        for (int i = 1; i <= 55; i += 1){

            if (i %2 == 0){
                System.out.print(i + " ");
            }
        }

        System.out.println("\n====================================================================");

        for (int i = 2; i <= 55; i += 2){

                System.out.print(i + " ");
        }






    }
}
