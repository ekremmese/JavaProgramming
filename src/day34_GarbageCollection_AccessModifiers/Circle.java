package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi = 3.14;  //if we need only 1 step to assign the variable we don't need static block to set&assign variable
    public static String name = "Circle";

    public static ArrayList<Integer> numbers = new ArrayList<>();


    public Circle(double radius){
        this.radius=radius;
    }

    static {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>(); // if we need more than 1 step to assign the variable we need static block to set it
        numbers.add(10);
        numbers.add(30);

    }



    public static void main(String[] args) {

        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);

    }


}
