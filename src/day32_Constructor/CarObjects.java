package day32_Constructor;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("Toyota");

        Car car2 = new Car("Mercedes","Vito");

        Car car3 = new Car("Mitubishi", "L200", 2020);

        Car car4 = new Car("Bmw", "I520", 2022, 150000);

        Car car5 = new Car("Togg", "Vol", 2022, 100000, "Black");

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);


    }
}
