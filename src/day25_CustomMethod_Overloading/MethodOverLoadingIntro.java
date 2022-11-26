package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverLoadingIntro {

    public static void main(String[] args) {

        int[] intArray = {1, 2, 3, 4, 5, 6};
        Arrays.sort(intArray);
        // FUNCTIONALITIES ARE SIMILAR BUT PARAMETERS ARE DIFFERENT, THEY HAVE METHOD NAME
        double[] doubleArray = {1.5, 11.5, 2.6, 3.5}; // IN ARRAYS UTILITY CLASS sort IS AN OVERLOADED METHOD
        Arrays.sort(doubleArray);

        char[] charArray = {'b', 'c', 'g', 'd', 'a'};
        Arrays.sort(charArray);

        int sum = sumOfNumbers(1, 2,4);
        System.out.println(sum);



    }

    public static int sumOfNumbers(int num1, int num2) {

        return num1 + num2;

    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        return sumOfNumbers(num1, num2)+num3;   // we can formulate by calling sumOfNumbers of 2 numbers then add the 3rd one
    }

    public static double sumOfNumbers(int num1, int num2, int num3, int num4) {
        return sumOfNumbers(num1, num2, num3) + num4;
    }


}
