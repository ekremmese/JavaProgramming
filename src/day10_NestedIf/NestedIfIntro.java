package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 400;

        if (score >= 100 && score <= 100) {  //if the score is valid
            if (score >= 60) {   // if the student pass the exam
                System.out.println("Passed");
            } else { // if the student failed exam
                System.out.println("Failed");
            }
        } else { // if the score is not valid
            System.out.println("Please enter a valid score");
        }

        System.out.println("============================================================");

        int age = 21;
        boolean hasId = false;

        if (hasId) {  //If the person has ID
            if (age >= 21) { //if the person is 21 years old or older

                System.out.println("Eligible to buy alcohol");
            } else { // if the person less than 21years old
                System.out.println("Not eligible to buy alcohol");
            }
        } else { // if the person has no ID
            System.out.println("You must have an ID to buy alcohol");
        }


        System.out.println("============================================================");

        int n = 8;

        if (n > 0 && n <= 7) { // days of week are 7 so this checks if the n are given between 1-7

            if (n == 1) {
                System.out.println("Monday");
            } else if (n == 2) {
                System.out.println("Tuesday");

            } else if (n == 3) {
                System.out.println("Wednesday");
            } else if (n == 4) {
                System.out.println("Thursday");
            } else if (n == 5) {
                System.out.println("Friday");
            } else if (n == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }

        } else {

            System.out.println("Invalid");
        }
    }
}
