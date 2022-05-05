package day17_Wile_DoWhile;

public class EvenOddNumbers {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {

            if (i % 2 != 0){
                continue;
            }

            System.out.println(i);

        }

        for (int i = 0; i <= 100; i++) {

            if ((i +1) % 2 == 0){
                continue;
            }

            System.out.println(i);

        }


    }
}
