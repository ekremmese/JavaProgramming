package day39_Recap.shape;

public class ShapeObjects {
    public static void main(String[] args) {

        Square square = new Square(2.5);

        System.out.println("----------------------------");


        Rectangle rectangle = new Rectangle(2,5);

        System.out.println(rectangle);

        rectangle.setLength(10);

        System.out.println(rectangle);

        System.out.println("----------------------------");

        Circle circle = new Circle(7.5);

        System.out.println(circle);

        circle.setRadius(15.5);

        System.out.println(circle.getRadius());

        System.out.println(circle);

        System.out.println(circle.getName());



    }


}
