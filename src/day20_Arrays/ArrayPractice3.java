package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers you want to enter?");
        int answer = input.nextInt();

        if (answer<=0) {
            System.err.println("Invalid");
            System.exit(0);
        }

        int[] numbers = new int[answer];

        for (int i = 0; i < numbers.length; i++) {  // condition can be i < length also
            System.out.println("Please enter a number:");
            numbers[i] = input.nextInt();

            /* THAT WAS MY APPROCH , MUHTAR'S IS QUICKER
            int entrance = input.nextInt();
            numbers[i] = entrance;

             */
        }

        System.out.println(Arrays.toString(numbers));


        //2:36:25

    }
}
