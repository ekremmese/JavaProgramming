package day26_CustomMethodPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[] arr = {1, 1, 3, 3, 4, 4};
        int[] arr1 = uniqueElement(arr);
        System.out.println(Arrays.toString(arr1));

        System.out.println("---------------------------------");

        double[] arr2 = {1.2, 1.2, 4.5, 1.5, 5, 5};
        System.out.println(Arrays.toString(uniqueElement(arr2)));

    }

    //finds the unique element from given array, returns an array includes the unique elements only
    public static int[] uniqueElement(int[] array) {

        int[] result = {};

        for (int each : array) {

            if (ArraysUtility.frequency(array, each) == 1) { //if the frequency is 1 then it means the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    //finds the unique element from given double array, returns an array includes the unique elements only
    public static double[] uniqueElement(double[] array) {

        double[] result = {};

        for (double each : array) {

            if (ArraysUtility.frequency(array, each) == 1) { //if the frequency is 1 then it means the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    //finds the unique element from given char array, returns an array includes the unique elements only
    public static char[] uniqueElement(char[] array) {

        char[] result = {};

        for (char each : array) {

            if (ArraysUtility.frequency(array, each) == 1) { //if the frequency is 1 then it means the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }

    //finds the unique element from given String array, returns an array includes the unique elements only
    public static String[] uniqueElement(String[] array) {

        String[] result = {};

        for (String each : array) {

            if (ArraysUtility.frequency(array, each) == 1) { //if the frequency is 1 then it means the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;

    }


}
