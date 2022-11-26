package day10_NestedIf;

public class IfStatementsWithoutCurlyBraces {

    public static void main(String[] args) {

        int n = 6;
        String nameOfMonth = ""; // temporary assigned , with the if it will be assigned to its actual data

        if (n <= 12 && n >= 1)
            if (n == 1) {
                nameOfMonth = "January";        //If there is more than one statements in the if block than we have to use curly braces
                System.out.println("Hello");
            }
             else if (n == 2)
                nameOfMonth = "February";

             else if (n == 3)
                nameOfMonth = "March";

             else if (n == 4)
                nameOfMonth = "April";

             else if (n == 5)
                nameOfMonth = "May";

             else if (n == 6)
                nameOfMonth = "June";

             else if (n == 7)
                nameOfMonth = "July";

             else if (n == 8)
                nameOfMonth = "August";

             else if (n == 9)
                nameOfMonth = "September";

             else if (n == 10)
                nameOfMonth = "October";

             else if (n == 11)
                nameOfMonth = "November";

             else if (n == 12)
                nameOfMonth = "December";


         else
            nameOfMonth = "Please enter a valid n!";


            System.out.println(nameOfMonth);


    }
}


// 1:53:58 Ternaries