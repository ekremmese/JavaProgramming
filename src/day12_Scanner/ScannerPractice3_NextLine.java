package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine(); // Wooden SpoonEnter => This enter key will not be kept in memory because nextLine reads it

        System.out.println("Enter your programming language: ");
        String programming = input.nextLine();  // Java ProgrammingEnter => This enter key will not be kept in memory because nextLine reads it

        System.out.println("Enter your age: ");
        int age = input.nextInt(); //24Enter here the enter is left in Scanner memories

        //input.nextLine();               // With this calling of nextLine we cleared the memory, this nextLine method take out the ENTER key comes from 24Enter
                                            // If we don t have this the school name will be a space because of the mentioned ENTER
        System.out.println("Enter your school name:");
        String schoolName = input.nextLine();  // Because of 24Enter's Enter left in the memory use will not be able to input a schoolName
                                               // Enter key assigned as school name thats why we can not enter school name
                                               //We have to take out the Enter key from the memory
                                                //To do that we have to call nextLine() method again to empty the memory
        //  if we are using nextLine() method after the other methods of scanner, we MUST provide one addition nextLine()
        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        //System.out.println(fullName);



        input.close();

        
    }
}
