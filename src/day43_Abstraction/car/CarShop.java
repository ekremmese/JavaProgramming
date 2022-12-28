package day43_Abstraction.car;

import org.w3c.dom.ls.LSOutput;

public class CarShop {
    public static void main(String[] args) {
        // Car car1 = new Car("Cydeo", "25", "Blue", 2022, 100000);  //We can not create object from Abstract Class, because abstract class is not concrete



        Honda honda = new Honda("Civic", "Black", 2013, 120000);

        Audi audi = new Audi("A4", "Dark Blue", 1996, 130000);

        Tesla tesla = new Tesla("Tesla", "Model3", "White", 2023, 100000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("----------------");


        honda.setColor("Red");
        audi.setColor("Blue,Pink");
        tesla.setColor("Yellow");

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("----------------");

        honda.setPrice(10000);
        audi.setPrice(10000);
        tesla.setPrice(10000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

    }



}
