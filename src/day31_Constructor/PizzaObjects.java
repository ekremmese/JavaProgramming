package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PizzaObjects {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();

        int numberSmall = 0;

        for (int i = 0; i < 100; i++) {

          /*  pizzas.add(new Pizza('S',2,3));
            pizzas.add(new Pizza('M',3,4));
            pizzas.add(new Pizza('L',4,5));
          */
            Pizza small = new Pizza('S',2,3);
            Pizza medium = new Pizza('M',3,4);
            Pizza large = new Pizza('L',4,5);

            pizzas.addAll(Arrays.asList(small,medium,large));

        }

            double totalPrice = 0;

        for ( Pizza each :pizzas) {
            totalPrice += each.calcCost();
        }

        System.out.println(totalPrice);

    }
}
