package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObject {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setInformation("Mercedes", 2006, "Vito", "Black");


        System.out.println(car1);

        car1.start();

        Car car2 = new Car();
        car2.setInformation("BMW",2012,"i320", "Gray");

        System.out.println(car2);

        Car[] cars = {car1,car2};  // Array of Cars

        ArrayList<Car> carList = new ArrayList<>();  // ArrayList created

        carList.addAll(Arrays.asList(car1,car2));

        for ( Car each : carList) {
            System.out.println( each.brand + " : " + each.color);
        }

        /*
        remove the car has this conditions task:

        BMW : 2005 - 2008
        Mercedes : 2001 - 2005
         */

        carList.removeIf( p -> p.name.equals("Mercedes") && p.year >=2005 && p.year<= 2008);
        carList.removeIf(p -> p.name.equals("BMW") && p.year >= 2001 && p.year<= 2005);


    }
}

//02:58:30