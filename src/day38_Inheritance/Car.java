package day38_Inheritance;

public class Car {

    public String brand, model;
    public int year;
    public double price;
    public String color;
    public double miles;

    public Car(String brand, String model, int year, double price, String color, double miles) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.miles = miles;
    }

    public void start(){
        System.out.println(brand + " " + model + " " + " is starting");
    }

    public void drive(){
        System.out.println(brand + " " + model + " " + " is driving");
    }

//    public void fly(){
//
//    } if we declare fly method in the parent class, all the sub classes will have this method but not all the cars can fly

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", miles=" + miles +
                '}';
    }
}
