package day38_Inheritance.carTask;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, int miles, double price) {
        super("Tesla", model, color, year, miles, price);
    }

    public void autoPilot(){
        System.out.println(brand + " " + model + " is in auto pilot mode.");
    }

    @Override
    public void start() {
        System.out.println("Say \" Start \" to start " + brand + " " + model);
    }
}
