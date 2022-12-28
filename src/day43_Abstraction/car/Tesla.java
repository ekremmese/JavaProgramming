package day43_Abstraction.car;

public class Tesla extends Car {

    public Tesla(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void start() {
        System.out.println("Say \"Start\" to start: " + getBrand());
    }

}
