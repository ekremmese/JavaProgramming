package day10_NestedIf;

public class NameOfMonthWithNestedAndTernary {

    public static void main(String[] args) {

        /*

        int n = 5;
         String nameOfMonth = n == 1 ? "Jan" : n == 2 ? "Feb" : n == 3 ? "Mar" : (n == 4) ? "Apr" : (n == 5) ? "May"
                : (n == 6) ? " Jun" : (n == 7) ? "Jul" : (n == 8) ? "Aug" : (n == 9) ? "Sep" : (n == 10) ? "Oct"
                : (n == 11) ? "Nov" : "Dec";
         */

        int n = 14;
       // String nameOfMonth = "";

        String nameOfMonth = (n<=12 && n>=0 ) ? n == 1 ? "Jan" : n == 2 ? "Feb" : n == 3 ? "Mar" : (n == 4) ? "Apr" : (n == 5) ? "May"
                : (n == 6) ? " Jun" : (n == 7) ? "Jul" : (n == 8) ? "Aug" : (n == 9) ? "Sep" : (n == 10) ? "Oct"
                : (n == 11) ? "Nov" : "Dec"                   : "Enter a valid number";

        System.out.println(nameOfMonth);


    }
}
