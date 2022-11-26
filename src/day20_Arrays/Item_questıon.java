package day20_Arrays;

import java.util.Scanner;

public class Item_questıon {
    /*
    5. Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] items = new String[5];
        int[] prices = new int[5];

        int totalPrice = 0;

        for (int i = 0; i < 5; i++) {

            System.out.println("Please give the item name: ");
            items[i] = input.next();

            System.out.println("Please enter item's price");
            prices[i] = input.nextInt();

            totalPrice += prices[i];

            //System.out.println(items[i] + " prices is " + prices[i]);

        }

       for (int i = 0; i < prices.length; i++) {   // WHY I COULD NOT MAKE IT UN THE SAME LOOP ABOVE ?
        System.out.println(items[i] + " prices is " + prices[i]);
        }

        System.out.println(totalPrice);

        input.close();

    }
}
