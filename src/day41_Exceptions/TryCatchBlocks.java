package day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.function.IntToDoubleFunction;

public class TryCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test1 Started");

        try {
            System.out.println(9 / 0);
            System.out.println("Try block");
        } catch (ArithmeticException e) {

            System.out.println("Arithmetic Exception was occurred");
        }

        System.out.println("Test1 Completed");

        System.out.println("---------------------------------------");

        System.out.println("Test2 started");

        int[] numbers = {1, 3, 4, 5,};

        try {
            System.out.println("Try Block");
            System.out.println(numbers[200]);

        } catch (
                RuntimeException e) {  //If we don't know the exact type of exception then we should use RunTimeException class which is parent
            System.out.println("Catch Block");
            System.out.println("Array Index Out of Bond exception occurred");

            e.printStackTrace(); //gives the details of exception, it can be very helpful for documentation of bugs
            System.out.println(e.getMessage());  //Only gives the message

        }

        System.out.println("Test2 Completed!");


        System.out.println("---------------------------------------");

        System.out.println("Test3 started!");

        try {
            System.out.println("Cydeo".substring(0));
            System.out.println("Try");

        } catch (RuntimeException e) {
            System.out.println("Catch");
            e.printStackTrace();
        }

        System.out.println("Test3 completed!");

        System.out.println("---------------------------------");

        System.out.println("Hello");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Cydeo");

        System.out.println("---------------------------------");

        try {
            FileInputStream file = new FileInputStream("File Path");
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);  // why I got this different from Muhtar
            e.printStackTrace();
        }

        System.out.println("---------------------------------");




    }
}
