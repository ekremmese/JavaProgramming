package day38_Inheritance.carTask;

public class BMW extends Car {

    public BMW(String model, int year, double price, String color, double miles) {
        super("BMW", model, year, price, color, miles);
    }

    @Override
    public void start() {
        System.out.println("Call the mechanician to start " + model + " " + brand);
    }


}
