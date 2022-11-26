package day09_IfStatements;

public class NameOfDay {


    public static void main(String[] args) {

        int n = 4; // 1 - 7
        String day;

        if (n == 1) {
            // System.out.println("Monday");
            day = "Monday";
        } else if (n == 2) {
            day = "Tuesday";
            //System.out.println("Tuesday");
        } else if (n == 3) {
            day = "Wednesday";
            //System.out.println("Wednesday");
        } else if (n == 4) {
            day = "Thursday";
            //System.out.println("Thursday");
        } else if (n == 5) {
            day = "Friday";
            //System.out.println("Friday");
        } else if (n == 6) {
            day = "Saturday";
            //System.out.println("Saturday");
        } else {
            day = "Sunday";
            //System.out.println("Sunday");
        }

        System.out.println("day = " + day);

    }
}


/**
 *
 * task:
 * 		1. Maximum n between two different ns             MAKE THESE TASKS!!!!!!!!!!
 * 		2. Minimum n between two different ns
 * 		3. Write a progrm that can check if the person is eligible to buy alcohol
 * 		4. Write a progrm that can check if the person is eligible to vote
 *
 * Task:
 * 	1. garde report ==> A, B, C, D, F
 * 	2. name of the month
 */