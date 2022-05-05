package day32_Constructor;

public class Test {

    public Test() {
        System.out.println("A");
    }

    public Test(int a) {
        this();
        System.out.println("B");
    }

    public Test(double c) {
        this(10);
        System.out.println("C");
    }

    public Test(String string) {
        this(10.2);
        System.out.println("D");
    }

    public static void main(String[] args) {

        new Test("Java");


    }
}