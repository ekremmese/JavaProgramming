package day38_Inheritance.carTask;

public class Audi extends Car{

    public Audi(String model, int year, double price, String color, double miles) {
        super("Audi", model, year, price, color, miles);
    }

    @Override
    public void start() {
        System.out.println("Use the button the to start " + model + " " + brand);
    }
}
