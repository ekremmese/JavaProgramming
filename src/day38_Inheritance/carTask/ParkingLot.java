package day38_Inheritance.carTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry",2009, 120000, "Brown", 120000);

        Tesla tesla = new Tesla("Model S", 2022, 200000, "Black", 20000);

        BMW bmw = new BMW("i320", 2016, 100000, "Green", 10000);

        Audi audi = new Audi("A4" , 2009, 100000, " Grey" , 10000);


        audi.start();
        toyota.start();
        bmw.start();


    }







}
