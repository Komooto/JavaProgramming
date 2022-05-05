package day23_CustomMethods_Void;

public class MethodPracticeTwo {

    public static void main(String[] args) {

        helloWorld5Times();

        for (int i = 0; i < 5; i++) {
            cydeo5Times();
        }

        evenNumbers();
    }

    public static void helloWorld5Times(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }
    }

    public static void cydeo5Times(){

            System.out.println("Cydeo!");
    }

    public  static  void  evenNumbers(){

        for (int i = 2; i < 11; i += 2) {
                System.out.print(i + " ");
        }
    }

}
