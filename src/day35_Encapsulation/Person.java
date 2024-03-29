package day35_Encapsulation;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    public Person(String name, int age, char gender, String language){
        this.age = age;
        this.gender = gender;
        this.name = name;
        this.language = language;
    }

    static {
        planet = "Earth";
        isHuman = true;
        hasNose = true;
    }

}
