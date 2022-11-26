package day29_ArrayList;

import java.util.ArrayList;

public class MaxMinAverage {

    /*
    2. Write a program that can find the maximum, minimum and average number from an arrayList of integers
     */

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        //numbers.add(10);

        System.out.println(numbers);

        int min = numbers.get(0);
        int max = numbers.get(0);
        int sum = 0;

        for (Integer each : numbers) {

            if ( each > max){
                max = each;
            }

            if ( each < min ){
                min = each;
            }

            sum += each;

        }

        double average = (double)sum/numbers.size();

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("average = " + average);

    }
}
