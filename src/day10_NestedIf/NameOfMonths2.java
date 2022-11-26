package day10_NestedIf;

public class NameOfMonths2 {

    public static void main(String[] args) {

        int n = 5;
         String nameOfMonth = n == 1 ? "Jan" : n == 2 ? "Feb" : n == 3 ? "Mar" : (n == 4) ? "Apr" : (n == 5) ? "May"
                : (n == 6) ? " Jun" : (n == 7) ? "Jul" : (n == 8) ? "Aug" : (n == 9) ? "Sep" : (n == 10) ? "Oct"
                : (n == 11) ? "Nov" : "Dec";

        // Total number of the Question marks has to be equal to total number of coloumns
        // :(condition)? statement for execution
        // in ternaries the statement  not has to be in paranthesis but to make it readable we must use it
        // to ma

        System.out.println(nameOfMonth);

        /* System.out.println((n == 1) ? "Jan" : (n == 2) ? "Feb" : (n == 3) ? "Mar" : (n == 4) ? "Apr" : (n == 5) ? "May"
                : (n == 6) ? " Jun" : (n == 7) ? "Jul" : (n == 8) ? "Aug" : (n == 9) ? "Sep" : (n == 10) ? "Oct"
                : (n == 11) ? "Nov" : "Dec");

         */
    }
}

