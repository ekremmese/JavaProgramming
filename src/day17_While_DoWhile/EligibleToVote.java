package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        //Valid age 1 - 120

        while (!(age >= 1 && age <= 120)) {
            System.err.println("Please enter a valid age");
            age = input.nextInt();
        }

        System.out.println("Are you a US citizen?");
        //Valid answers :yes or no
        String answer = input.next().toLowerCase();

        //while (!(answer == "yes" || answer == "no")) {
        while (!(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid answer, please re enter yes/no");
            answer = input.next().toLowerCase();
        }


        if (age >= 18 && answer.equals("yes")) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote");
        }


    }
}
