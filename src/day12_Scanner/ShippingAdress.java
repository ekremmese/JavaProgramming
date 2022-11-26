package day12_Scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ShippingAdress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your building number: ");
        int buildingNumber = input.nextInt();

        input.nextLine();  // Clear the ENTER key in the memory that comes from buildingNumber

        System.out.println("Enter your street name:");
        String streetName = input.nextLine();


        System.out.println("Enter your city name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your state name: ");
        String stateName = input.next();

        System.out.println("Enter your zip code: ");
        String zipCode = input.next();

        input.nextLine();  // Altough there are 2 ENTER in the memory (from state name and zipcode) 1 input.nextLine(); is enough to clear the  memory

        System.out.println("Enter your countryname: ");
        String countryName = input.nextLine();

        input.close();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("stateName = " + stateName);
        System.out.println("zipCode = " + zipCode);
        System.out.println("countryName = " + countryName);



    }
}
