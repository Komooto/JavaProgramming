package day36_InheritanceAnimalTsk.AnimalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Tayghan", "Alyaska", 'F', 1, "Big", "White");
        dog.eat();
        dog.sleep();
        dog.bark();

        Cat cat = new Cat();
        cat.setInfo("Aslan", "British", 'F', 1, "Small", "Grey");

        Lion lion = new Lion();
        lion.setInfo("Arslan", "Afriqa", 'M', 2, "Small", "Yellow");

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(lion);

        BritishCat britishCat = new BritishCat();
        britishCat.play();








    }
}
