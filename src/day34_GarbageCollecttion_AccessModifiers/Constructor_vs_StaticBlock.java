package day34_GarbageCollecttion_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static {
        System.out.println("Static");
    }

    //this will not be executed. because execution of constructor only depends on object.
    public Constructor_vs_StaticBlock(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }












}
