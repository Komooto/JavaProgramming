package day30_CostumClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Mercedes", "S 360", "Red", 2020, 1200000);
        System.out.println(car1);

        car1.drive();

        Car car2 = new Car();
        car2.setInfo("Range Rover", "Highlander", "White", 2018, 1600000);
        System.out.println(car2);

        car2.drive();

        Car car3 = new Car();
        car3.setInfo("BMW", "C 240", "Black", 2021, 1150000);
        System.out.println(car3);

        car3.drive();

        System.out.println("==============================================================================");

        Car[] cars = {car1, car2, car3};

        System.out.println(Arrays.toString(cars));

        System.out.println("==============================================================================");

        ArrayList<Car> carsList = new ArrayList<>(Arrays.asList(car1, car2, car3));

        System.out.println(carsList);

        for (Car each : cars) {
            System.out.println(each.brand + " : " + each.price);
        }

        System.out.println(carsList);

        carsList.removeIf( p -> p.model.equals("BMW") && p.year >= 2005 && p.year <= 2008);
        carsList.removeIf( p -> p.model.equals("Mercedes") && p.year >= 1997 && p.year <= 2003);



    }
}
