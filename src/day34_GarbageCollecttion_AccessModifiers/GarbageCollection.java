package day34_GarbageCollecttion_AccessModifiers;

import day30_CostumClass.Car;
import day30_CostumClass.Dog;

public class GarbageCollection {
    public static void main(String[] args) {

        Dog f = new Dog();
        f.gender = 'F';
        f = null;

        System.out.println(f);

        Car car = new Car();
        car.brand = "Toyota";

        car = null;

        System.out.println(car);










    }
}
