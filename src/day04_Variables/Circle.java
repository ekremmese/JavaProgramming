package day04_Variables;

public class Circle {

    public static void main(String[] args) {

        double PI = 3.14;
        double radius = 2.5;
        double diameter = 2 * radius; // this code finds the diameter by multipling radius by 2
        double area = PI * radius * radius;
        double perimeter = PI * diameter;

        System.out.println("radius = " + radius);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);

/**
 3. Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
 PI, radius, diameter, area, perimeter

 Hints: 	PI = 3.14
 area = radius * radius * PI
 Perimeter = 2 * radius * PI
 */
    }


}
