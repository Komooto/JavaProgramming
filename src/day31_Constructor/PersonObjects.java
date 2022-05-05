package day31_Constructor;

public class PersonObjects {
    public static void main(String[] args) {

        Person person1 = new Person("Muhemmetjan", 'M', 33);
        System.out.println(person1);

        Person person2 = new Person("Kamile", 'F', 34);
        System.out.println(person2);

        Person person3 = new Person("Kamalet", 'F', 33);
        System.out.println(person3);

        Person person4 = new Person("Kamiljan", 'M', 32);
        System.out.println(person4);

        Person person5 = new Person("Rehime", 'F', 24);
        System.out.println(person5);

        person5.name = "Yimgul";
        System.out.println(person5);






    }
}
