package day17_While_DoWhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BranchingStatement {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z' ; i++) {

            if (i == 'F') {  // CHECKS THE CONDITION AND IF TRUE EXITS THE LOOP
                break;
            }

            System.out.print(i);

        }

        System.out.println();

        System.out.println("---------------------------------");

        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Enter a number: ");
            int num = input.nextInt();

            if(num<0) {
                break;
            }

        }


    }
}
