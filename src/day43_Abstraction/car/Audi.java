package day43_Abstraction.car;

public final class Audi extends  Car{

    public Audi(String model, String color, int year, double price) {
        super("Audi", model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Press the button to start: " + getModel());
    }

    public void autoPark(){
        System.out.println(getBrand() + " " + getModel() + " has auto park feature");
    }

    public static void main(String[] args) {
        Audi audi = new Audi("A4","Brown", 1998, 200000);
        System.out.println(audi);
    }

}
