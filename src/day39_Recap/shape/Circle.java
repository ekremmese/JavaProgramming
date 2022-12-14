package day39_Recap.shape;

public class Circle extends Shape{

    /*
    Circle extends Shape:
		variables:
			radius
			pi (static)

		Encapsulate the field

		Add a constructor to set the filed

		area(): radius * radius * pi
		perimeter(): 2 * radius * pi
		toString(): r, pi, area, perimeter
     */
    protected double radius;
    public static double pi = 3.14;

    private boolean shape = true;

    public double getRadius() {
        return radius;
    }

    public boolean isShape() {
        return shape;
    }

    public void setShape(boolean shape) {
        this.shape = shape;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            System.err.println("Invalid radius");
            System.exit(1);
        }
        this.radius = radius;
        //return radius;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }

    @Override
    public double area() {
        return pi * radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*pi*radius;
    }
}
