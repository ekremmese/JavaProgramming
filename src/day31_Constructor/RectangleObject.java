package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class RectangleObject {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(2.5,3.5);
        Rectangle rectangle2 = new Rectangle(5,3.5);
        Rectangle rectangle3 = new Rectangle(7,12);

        Rectangle[] rectangles = {rectangle1,rectangle2,rectangle3};

        ArrayList<Rectangle> rectangleArrayList = new ArrayList<>(Arrays.asList(rectangles));

        System.out.println(rectangleArrayList);


    }
}
