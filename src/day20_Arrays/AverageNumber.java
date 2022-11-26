package day20_Arrays;

import java.util.Scanner;

public class AverageNumber {
    /*
    4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter? ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter your number: ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        double averge = sum / n;





        System.out.println(averge);

        input.close();
    }
}
