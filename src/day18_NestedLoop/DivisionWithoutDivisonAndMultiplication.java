package day18_NestedLoop;

public class DivisionWithoutDivisonAndMultiplication {

    /*
     1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators

                        20 / 6 ==> 3 with the reaminder of 2

                        a = 20
                        b = 6;

                        a -= b;  // a = 14
                        a -= b;  // a = 8
                        a -= b;  // a = 2

                        x = 100;
                        y = 8;

                        while(a >= b){
                                a -= b;
                                count++;
                        }
     */

    // this works for the condition a >= b ;

    public static void main(String[] args) {

        int number = 20;
        int divider = 6;
        int counter = 0;

        while (number >= divider) {
            number = number -  divider; // number = 14 , counter = 1  //
            counter++;
        }

        System.out.println(counter + " with a remainder of " + number);


    }


}
