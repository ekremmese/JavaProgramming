package Utilities;

public class MathUtility {

    public static int sum(int num1, int num2) {
        return num1+num2;
    }

    public static double sum(double num1, double num2) {
        return num1+num2;
    }

    public static double subtract(double num1,double num2) {
        return num1-num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public static double division(double num1, double num2) {
        return num1/num2;
    }

    public static int multiply(int num1, int num2) {
        return num1*num2;
    }

    public static double multiply(double num1, double num2) {
        return num1*num2;
    }

    public static void oddNumber(int number) {
        if(number%2 == 0){
            System.out.println(number + " is even number.");
        } else {
            System.out.println(number + " is odd number");
        }
    }

    public static int maxNumber(int num1, int num2) {
        if ( num1 > num2)
            return num1;
        else
            return num2;
    }

    //compares two double and returns max
    public static double maxNumber(double num1, double num2) {
        if ( num1 > num2)
            return num1;
        else
            return num2;
    }

    //compares two int and returns min
    public static int minNumber(int num1, int num2) {
        if ( num1 < num2)
            return num1;
        else
            return num2;
    }

    //compares two double and returns min
    public static double minNumber(double num1, double num2) {
        if ( num1 < num2)
            return num1;
        else
            return num2;
    }

    public static int square(int num) {
        return num * num;
    }

    //returns the square of double
    public static double square(double num) {
        return num * num;
    }

    //returns the cube of int
    public static int cube(int num) {
        return num * num * num;
    }

    //returns the cube of double
    public static double cube(double num) {
        return num * num * num;
    }

}
