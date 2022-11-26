package day18_NestedLoop;

import java.util.Scanner;

public class Login {

    /*
     2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your user name.");
        String userName = input.next();

        System.out.println("Please enter your password.");
        String password = input.next();

        if  ( userName.equals("Cydeo") && password.equals("WoodenSpoon") )  {
            System.out.println("Logged in.");
        } else {

            for (int i = 1; i <3 ; i++) {
                System.out.println("Incorrect username or password.");

                System.out.println("Please enter your user name.");
                userName = input.next();

                System.out.println("Please enter your password.");
                password = input.next();

                if(userName.equals("Cydeo") && password.equals("WoodenSpoon")) {

                    System.out.println("Logged In");
                    break;

                }

              /*  if (i == 2) {
                    System.err.println("This is your last attempt");
                }

               */
            }

            if ( !(userName.equals("Cydeo") && password.equals("WoodenSpoon"))) {
                System.err.println("Your account is locked");
            }

        }

        input.close();

    }
}
