package day15_ForLoop;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);

        System.out.println("Please enter first name: ");
        String firstName = new Scanner(System.in).next();
        System.out.println("Please last first name: ");
        String lastName = new Scanner(System.in).next();

        //firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        firstName = ("" + firstName.charAt(0)).toUpperCase() + firstName.substring(1).toLowerCase(); // When I add "" + to a char and make it in () it will convert it to a String
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(firstName + " " + lastName);

    }

/*
. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School

 */
}
