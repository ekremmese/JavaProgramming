package day12_Scanner;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter radius of the circle:");
        double radius = input.nextDouble();
        input.close();                  // IF YOU KNOW  WHERE YOU USE THE SCANNER LAST TIME THEN YOU CLOSE IT, IF YOU DON T CLOSE IT, IT WILL KEEP WORKING
        double area = 3.14 * radius * radius;
        double perimeter = 2 * 3.14 * radius;
        System.out.println("Area of the circle: " + area);

        System.out.println("Perimeter of the circle: " + perimeter);

    }


}
