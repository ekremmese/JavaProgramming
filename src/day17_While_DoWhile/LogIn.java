package day17_While_DoWhile;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        //username : "Cydeo"
        //password : "Cydeo123"

        Scanner input = new Scanner(System.in);

        System.out.println("Pleas enter your username.");
        String userName = input.next();

        System.out.println("Please enter your password.");
        String password = input.next();
        int attempt = 2;
        while (!(userName.equals("Cydeo") && password.equals("Cydeo123")) && attempt > 0) {
            if(attempt == 1) {
                System.out.println("This is your last attempt.");
            }

            System.err.println("Invalid username or password");
            System.out.println("Please enter username");
            userName = input.next();
            System.out.println("Please enter password");
            password = input.next();
            --attempt;

        }

        if (userName.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("You are succesfully logged in!");
        } else {
            System.out.println("Your account is locked");
        }

        System.out.println("====================================================");






        input.close();

    }
}


//2:44:10