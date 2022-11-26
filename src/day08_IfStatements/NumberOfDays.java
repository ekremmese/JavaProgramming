package day08_IfStatements;

public class NumberOfDays {

    public static void main(String[] args) {

        int nOfMonth = 5;

        boolean has28Days = nOfMonth ==2;
        boolean has30Days = nOfMonth ==4 ||  nOfMonth ==6 ||  nOfMonth ==9 ||  nOfMonth ==11;
        boolean has31Days = !has30Days && !has28Days; //if the month does not have 30 days and does not have 28 days

        if(has28Days) {   //if the month has 28 days
            System.out.println("The " + nOfMonth+ ". month has 28 days");
        }
        if(has30Days) {    // if the month has 30 days
            System.out.println("The " + nOfMonth+ ". month has 30 days");
        }
        if(has31Days) {   // if the month has 31 days
            System.out.println("The " + nOfMonth+ ". month has 31 days");
        }

/*
3. Write a program that can print the n of days in a month

			Ex:
				n = 1 ~ 12;

			output:
				31 Days


			Hints:
				Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
				Months that has 30 days: 4, 6, 9, 11
				Month that has 28 days: 2

 */
    }
}
