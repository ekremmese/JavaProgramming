package day10_NestedIf;

public class GradeReport2 {

    public static void main(String[] args) {

        int score = 30;


        String result = (score <= 100 && score >= 0) ? (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good" : (score > 60) ? " Passed " : "Failed" : "Please enter a Valid score ";

        System.out.println(result);

        System.out.println("=============================================");

        String result2 = " ";

        if (score <= 100 && score >= 0) {

            result2 = (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good" : (score > 60) ? " Passed " : "Failed";

        } else {
            result2 = "Invalid Score";

        }
        System.out.println(result2);
    }
}

// Solution without ternary below:
 /*if (score <= 100 && score >= 0) {
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

         */