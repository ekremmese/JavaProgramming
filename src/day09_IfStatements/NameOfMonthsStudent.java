import java.util.Scanner;

import static java.lang.System.*;

public class NameOfMonthsStudent {
    public static void main(String[] args) {
        System.out.println("Please enter a n from 1 to 12");
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();

        if(n<1 || n>12) {

            if (n == 1) {
                System.out.println("January");
            } else if (n == 2) {
                System.out.println("February");
            } else if (n == 3) {
                System.out.println("March");
            } else if (n == 4) {
                System.out.println("April");
            } else if (n == 5) {
                System.out.println("May");
            } else if (n == 6) {
                System.out.println("June");
            } else if (n == 7) {
                System.out.println("July");
            } else if (n == 8) {
                System.out.println("August");
            } else if (n == 9) {
                System.out.println("September");
            } else if (n == 10) {
                System.out.println("October");
            } else if (n == 11) {
                System.out.println("November");
            } else {
                System.out.println("December");
            }
            System.out.println("You enter an invalid n:\n Please enter a n from 1 to 12");
        }

    }
}