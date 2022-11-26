package day29_ArrayList;

import java.util.ArrayList;

public class FirstUniqueElement {
    /*
    1. Write a program that can return the first unique elements from an arraylist

			Do not use indexOf & lastIndexOf methods
     */

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(50);

        System.out.println(numbers);


        for (int i = 0; i < numbers.size(); i++) {
            int frequency = 0;
            for (int j = 0; j < numbers.size() - 1; j++) {
                if (numbers.get(i) == numbers.get(j)) {
                    frequency++;
                }
            }
            if (frequency == 1) {
                System.out.println(numbers.get(i));
                break;
            }
        }


    }
}
