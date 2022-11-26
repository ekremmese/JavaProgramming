package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;

        if (n % 2 == 0) {
            System.out.println("Even"); // Data type is String
        } else {
            System.out.println("Odd");     // Data type is String
        }

        //If both data type are the same we can use Ternaties

        System.out.println("---------------------------------");

        String result1 = ((n & 2) == 0) ? "Even" : "Odd";
        System.out.println(result1);

        System.out.println("==================================");
        int age = 34;

        if (age >= 18) {
            System.out.println("Eligible to buy alcohol");
        } else {
            System.out.println("Not Eligible to buy alcohol");
        }
        //String result2 = (age >= 18) ? "Eligible to buy alcohol" : "Not Eligibile to buy alcohol";
        //System.out.println(result2);

        System.out.println((age >= 21) ? "Eligible" : "Not Eligible");

        System.out.println("==================================");

        int m = -10;

        /*if (n>0) {
            System.out.println("Positive");
        } else if (n<0) {
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }

         */

        System.out.println((m > 0) ? "Positive" : (m < 0) ? "Negative" : "Zero");

        System.out.println((m > 0) ? "Positive" : (m < 0) ? "Negative" : "Zero");


    }
}
// (Condition)   ?     ""