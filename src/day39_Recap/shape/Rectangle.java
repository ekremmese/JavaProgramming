package day39_Recap.shape;

public class Rectangle extends Shape{

    /*
    Rectangle extends Shape:
	variables:
		length
		width

	Encapsulate the fields

	Add a constructor to set the filed

	area(): length * width
	perimeter(): 2 * ( width + length)
	toString(): length, width, area, perimeter
     */

    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<=0){
            System.out.println("Invalid length");
            System.exit(1);
        }
        this.length = length;
    }

    public double getWidth() {

        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            System.out.println("Invalid width");
            System.exit(1);
        }
        this.width = width;
    }

    public Rectangle(double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area='" + area() + '\'' +
                ", perimeter='" + perimeter() + '\'' +
                '}';
    }

    @Override
    public double area() {
        return width*length;
    }

    @Override
    public double perimeter() {
        return (width + length)*2;
    }
}
