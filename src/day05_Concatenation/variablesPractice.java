package day05_Concatenation;

public class variablesPractice {

    public static void main(String[] args) {

        byte num1= 100;
        short num2=1000;
        double num3= 3.5;
        float num4= 4.5f;
        long num5= 999_999_999_999L;
        int num6 = 850000;

        float x = 3.5f;






        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("x = " + x);


    }


}

/**
 1. create a class called Varibales_Practice & declear the following variables:
 num1 = 100;
 num2 = 10000;
 num3 = 3.5;
 num4 = 2.5f;
 num5 = 999999999999L;
 num6 = 850000;
 */

/**
        most commonly used data types for integer is int for integers and double for decimals
        we have 3 other variable types for integers which are byte, short,long and we have
        1 another variable type for decimals which is float
        However whenever we type or we declare an integer with any of 4 variable types
        it is accepted by the compiler as int type of integer but if the value is over int's range then we have
        to force compiler to recognize it as a long (which has wider range than int) type of variable by adding l or L
        at the and of the assigned value

        with the decimals; whenever we declare a decimal (whether we declare with float or double) it is accepted
        as double by the compiler, but if we declare it with float variable type double (which the compiler accepts
        the variable as) has a wider range than the float so there is compiler error here, so we have to tell the compiler
        that; don t worry this is a float variable type by adding f or F at the end of the assigned value.

        even though the syntax looks similar (adding l or l , f or F) the reason is the different
        with the long&integer the issue is about the value
        but with the double&float the issue is about ranges of the variable type

        when we declare a variable with long variable we don't have compiler error unless  assigned value is
        exceeding int's range
        when we declare a variable with float everytime we will have a compiler error if don t add f or F at the end
        of assigned value
        */