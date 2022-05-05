package day32_Constructor;

public class Car {

    public  String brand, model, color;
    public int year;
    public double price;

    public Car(String brand){
        this.brand = brand;
    }

    public Car(String brand, String model){
        this(model);
        this.brand = brand;
    }

    public Car(String brand, String model, int year){
        this(model, brand);
        this.year = year;
    }

    public Car(String brand, String model, int year, double price){
        this(model, brand, year);
        this.price = price;
    }

    public Car(String brand, String model, int year, double price, String color){
        this(model, brand, year, price);
        this.color = color;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price $=" + price +
                '}';
    }
}
