package day38_Inheritance.carTask;

import day32_Constructor.Test;

public class ParkingLot {
    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camery", "Black", 2018, 38100, 410000);
        BMW bmw = new BMW( "B 120", "white", 2021, 7000, 1200000);
        Tesla tesla = new Tesla( "T 320", "grey", 2022, 0, 2500000);

        toyota.start();
        bmw.start();
        tesla.start();

    }
}
