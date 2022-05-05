package day30_CostumClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.color = "White";
        dog1.size = "Small";
        dog1.gender = 'F';

        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.setInfo("Hawhaw", 14, "Hawaza", "Medium", 'M', "White");
        System.out.println(dog2);

        dog1.eat();
        dog2.bark();

        Dog dog3 = new Dog();
        dog3.setInfo("Miao", 1, "Pitbull", "Large", 'F', "Grey");

        Dog dog4 = new Dog();
        dog4.setInfo("Horhor", 3, "Lalama", "Small", 'F', "Red");

        Dog dog5 = new Dog();
        dog5.setInfo("Pispis", 8, "Apsharka", "Small", 'F', "Black");

        System.out.println("======================== Male & Female Dogs =============================================");
        Dog[] dogList = {dog1,dog2,dog3,dog4,dog5};
        ArrayList<Dog> maleDogs = new ArrayList<>();
        ArrayList<Dog> femaleDogs = new ArrayList<>();
        femaleDogs.addAll(Arrays.asList(dogList));

        for (Dog each : dogList) {
            if (each.gender == 'M'){
                maleDogs.add(each);
            }
        }

        femaleDogs.removeIf( p -> p.gender == 'M');
        System.out.println(maleDogs);
        System.out.println(femaleDogs);



    }
}
