package day24_CustomMethod_Return;

public class ReturnMethodPractice2 {

    public static void main(String[] args) {

        String letter = grade(80);
        if(letter.equals("A")){
            System.out.println("Excellent");
        } else if (letter.equals("B")) {
            System.out.println("Great");
        } else if (letter.equals("C")) {
            System.out.println("Good");
        } else if (letter.equals("D")) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }


    }

    public static String grade(int score) {
        String result = "";

        if (score < 0 || score > 100) {
            result = "Invalid";
        } else {
            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";
        }
        return result;
    }


}
