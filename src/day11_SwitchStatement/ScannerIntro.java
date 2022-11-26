package day11_SwitchStatement;


import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);   // give variable name a meaninful name so i did inpıt here // new : keyword // Scanner() : constructor // System.in :
        // we created the object ==> new Scanner(System.in)  ==> constructor part of the object
        // Scanner input = new Scanner(System.in);  ==> Scanner Object

        // If we wanna type something on the console we need to use methods
        System.out.println("Enter an integer: ");
        int number = input.nextInt();


        System.out.println("Enter a decimal: ");
        double num2 = input.nextDouble();

        System.out.println(number);
        System.out.println(num2);
        System.out.println("Multiplication: " + (number * num2));

        input.close(); // closes the scanner and improves your codes performance, if we don t use it we close it, after this we can not use the scanner

        /* System.out.println("Enter an integer: ");
        int num3 = input.nextInt();

        System.out.println(num3);

         */
    }

}
