package day04_Variables;

public class GallonsToLiters {

    /*
    5. Create a class named GallonsToLitters, Write a program that can convert gallon (int) to litter (double)
					Hints: 1 gallon = 3.79 litters
							1000
							10000
     */

    public static void main(String[] args) {

        int gallon = 25;

        double liters = gallon * 3.79;

        System.out.println("gallon = " + gallon);
        System.out.println("liters = " + liters);

    }
}
