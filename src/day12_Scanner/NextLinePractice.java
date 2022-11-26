package day12_Scanner;

import java.util.Scanner;           // imported the class

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  //Object is declared and assigned to a value so we can use the methods
        System.out.println("Enter your age: ");
        int age = input.nextInt();   // When I pressed 24Enter, Enter will be kept in the Scanner's memory

        input.nextLine();   // This line here emptied the 34Enter's Enter // Clears out the Scanner // I don t use this data so i don t assign it to a variable, just a space
        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA: ");
        double gpa = input.nextDouble();

        System.out.println("Enter your town's name: ");   //
        String town = input.next();

        input.nextLine();  // This double method here take the ENTER that comes from gpa, townENTER keys are used

        System.out.println("Enter your school name: ");
        String schoolName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("gpa = " + gpa);
        System.out.println("town = " + town);
        System.out.println("schoolName = " + schoolName);

        input.close();
    }
}
