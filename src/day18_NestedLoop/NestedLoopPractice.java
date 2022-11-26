package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {

    public static void main(String[] args) {

        /*
        Eligible to buy alcohol
         */

        Scanner input = new Scanner(System.in);

        //System.out.println("Please enter your age: ");
        //int age = input.nextInt();

        while (true) {

            System.out.println("Please enter your age: ");
            int age = input.nextInt();

            while ((age <= 1 || age >= 120)) {   //  WHILE THE AGE IS VALID, IT WILL EXIT FROM THIS LOOP
                System.err.println("Invalid entry. Please enter a valid age. ");
                age = input.nextInt();
            }


            System.out.println("Would you like to continue?");
            String answer = input.next().toLowerCase();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid entry, please re-enter. Would you like to continue? : ");
                answer = input.next().toLowerCase();
            }

            if (answer.equals("yes")) {

                if (age >= 18) {
                    System.out.println("You are eligible");
                } else {
                    System.out.println("You are not eligible");
                }
                break;
            } else {
                break;
            }


        }

        input.close();

    }
}
