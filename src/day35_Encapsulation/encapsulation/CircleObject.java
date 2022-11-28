package day35_Encapsulation.encapsulation;

public class CircleObject {

    public static void main(String[] args) {

        Circle circle1 = new Circle(2.5);

        circle1.setRadius(1);

        System.out.println(circle1.calcArea());

    }
}
