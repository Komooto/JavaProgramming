package day11_Switch_Scanner;

import java.util.Scanner;

public class KimeOyVereceiz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String cumhurBaskanlikAdayi = scan.next();

        String karar = cumhurBaskanlikAdayi.equals("Erdoğan")? "Yanlış Seçim!" : "Yine de Yanlış Seçim!";

        System.out.println(karar);









    }
}
