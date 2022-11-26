package day27_WrapperClasses;

import Utilities.ArraysUtility;

public class RemoveDuplicates {

    //removes the duplicated elements from the given array
    public static int[] removeDuplicates(int[] array) {

        int[] result = {};

        for (int each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(array, each);
            }
        }
        return result;
    }


    //removes the duplicated elements from the given array
    public static double[] removeDuplicates(double[] array) {

        double[] result = {};

        for (double each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(array, each);
            }
        }
        return result;
    }

    //removes the duplicated elements from the given array
    public static char[] removeDuplicates(char[] array) {

        char[] result = {};

        for (char each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(array, each);
            }
        }
        return result;
    }

    //removes the duplicated elements from the given array
    public static String[] removeDuplicates(String[] array) {

        String[] result = {};

        for (String each : array) {
            if (!ArraysUtility.contains(result, each)) {
                result = ArraysUtility.addElement(array, each);
            }
        }
        return result;
    }

}

