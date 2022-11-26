package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {


        int score = 100;
        String result = "";

       /* boolean a = score >= 90 && score <= 100, b = score >= 80 && !a,
                // boolean b = score >=80 && score <=89  ---- another way of assigning boolean b same goes or c, d, f
                c = score >= 70 && !b, d = score >= 60 && !c, f = !a && !b && !c && !d;

        */

       /* if (score >= 0 && score <= 100) { // checks if the assigned grade is valid
            if (a) {
                System.out.println("excellent");
            }
            if (b) {
                System.out.println("great");
            }
            if (c) {
                System.out.println("good");
            }
            if (d) {
                System.out.println("passed");
            }

            if (f) {
                System.out.println("failed");
            }
        } else {
            System.out.println("Enter a valid grade"); // execute invalid message in the console
        }
                */


        if (score <= 100 && score >= 0) {
            if (score >= 90) {
                result = "Excellent";
            } else if (score >= 80) {
                result = "Great";
            } else if (score >= 70) {
                result = "Good";

            } else if (score >= 60) {
                result = "Passed";

            } else {
                result = "Failed";
            }
        } else {
            result = "Please enter a valid n";
        }

        System.out.println(result);

    }
}
