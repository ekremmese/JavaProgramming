package day15_ForLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max = -2147483648;
        for (int i = 1; i < 6; i++) {

            System.out.println("Please enter a number: ");
            int num = input.nextInt();

            if (num > max) {
                max = num;
            }


        }

        System.out.println(max);
    }
}
