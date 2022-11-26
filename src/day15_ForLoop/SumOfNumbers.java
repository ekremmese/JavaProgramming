package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        /*
        3. Write a program that can calculate the sum of all integers between 1 to 100

         */

        double sum = 0;
        for (int i = 1; i < 101; i++) {
            sum += i;
        }

        System.out.println(sum);

        System.out.println("=================================================================");

        Scanner input = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i < 6; i++) {

            System.out.println("Enter a number ");

            total += input.nextInt();


        }

        System.out.println(total);

    }
}
