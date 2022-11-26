package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first nunmber");
        int num1 = input.nextInt();

        System.out.println("Enter your second number");
        int num2 = input.nextInt();

        System.out.println("Enter the math operator");
        // + -  ==> only valid operators for this

        char ch = input.next().charAt(0);

        while (!(ch == '+' || ch == '-')) {
            System.out.println("Invalid Operator, Please re-enter");
            ch = input.next().charAt(0);
        }



        System.out.println((ch == '+') ? num1 + num2 : num1 - num2);


    }
}
