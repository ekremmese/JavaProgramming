package day35_Encapsulation.encapsulation;

public class Circle {
    /*
    2. Create a class named Circle

			privtae variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the raidus of coircle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()

     */

    private double radius;
    public static double pi = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }



    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            return;
        }
        this.radius = radius;
    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        Circle.pi = pi;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public double calcArea(){
        return pi*radius*radius;
    }

    public double calcPerimeter(){
        return 2*pi*radius;
    }
}
