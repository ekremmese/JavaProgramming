package day43_Abstraction.car;

public class Audi extends  Car{

    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Press the button to start: " + getModel());
    }

    public static void main(String[] args) {

    }

}
