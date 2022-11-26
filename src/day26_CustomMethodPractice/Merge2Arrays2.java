package day26_CustomMethodPractice;


import Utilities.ArraysUtility;

import java.util.Arrays;

public class Merge2Arrays2 {

    public static void main(String[] args) {

        String[] array1 = {"Ali", "V", "c"};
        String[] array2 = {"B", "E", "F"};

        String[] newArr = ArraysUtility.merge(array1,array2);

        System.out.println(Arrays.toString(newArr));

    }

    //merges two given arrays and returns a new array
    public static int[] merge(int[] array1, int[] array2){


        int[] result = {}; //temporary

        for( int each : array1){
            result = ArraysUtility.addElement(result,each);
        }

        for( int each : array2){
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //merges two given arrays and returns a new array
    public static double[] merge(double[] array1, double[] array2){


        double[] result = {}; //temporary

        for( double each : array1){
            result = ArraysUtility.addElement(result,each);
        }

        for( double each : array2){
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //merges two given arrays and returns a new array
    public static char[] merge(char[] array1, char[] array2){


        char[] result = {}; //temporary

        for( char each : array1){
            result = ArraysUtility.addElement(result,each);
        }

        for( char each : array2){
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }

    //merges two given arrays and returns a new array
    public static String[] merge(String[] array1, String[] array2){


        String[] result = {}; //temporary

        for( String each : array1){
            result = ArraysUtility.addElement(result,each);
        }

        for( String each : array2){
            result = ArraysUtility.addElement(result,each);
        }
        return result;
    }
}
