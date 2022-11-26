package Utilities;

import java.util.Arrays;

public class ArraysUtility {

    //Prints each integer of an integer array in separate lines.
    public static void printEachElement(int[] array) {
        for (int each : array) {
            System.out.println(each);
        }
    }

    //Prints each String of an String array in separate lines.
    public static void printEachElement(String[] array) {
        for (String each : array) {
            System.out.println(each);
        }
    }

    //Prints each double of an double array in separate lines.
    public static void printEachElement(double[] array) {
        for (double each : array) {
            System.out.println(each);
        }
    }

    //Prints each char of an char array in separate lines.
    public static void printEachElement(char[] array) {
        for (char each : array) {
            System.out.println(each);
        }
    }

    //Finds the maximum number in an Integer array;
    public static int maxNumber(int[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    //Finds the maximum number in an double array;
    public static double maxNumber(double[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }

    //Finds the minimum number in an Integer array;
    public static int minNumber(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    //Finds the minimum number in an double array;
    public static double minNumber(double[] array) {
        Arrays.sort(array);
        return array[0];
    }

    //checks if specific String element is contained in String array, returns boolean
    public static boolean contains(String[] array, String element) {
        boolean result = false;
        for (String each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if specific int element is contained in integer array, returns boolean
    public static boolean contains(int[] array, int element) {
        boolean result = false;
        for (int each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if specific double element is contained in double array, returns boolean
    public static boolean contains(double[] array, double element) {
        boolean result = false;
        for (double each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //checks if specific char element is contained in char array, returns boolean
    public static boolean contains(char[] array, char element) {
        boolean result = false;
        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    //add element to the charArray
    public static int[] addElement(int[] arr, int num) {

        int[] newArr = new int[arr.length + 1];

        int i = 0;               // MUHTAR'S SOLUTION WITH FOR EACH LOOP - CAREFUL ABOUT i VARIABLE FOR INDEXES
        for (int each : arr) {
            newArr[i++] = each;
        }
        newArr[i] = num;

       /*                           MY SOLUTION WITH FOR LOOP
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = num;

        */

        return newArr;


    }

    public static double[] addElement(double[] arr, double num) {

        double[] newArr = new double[arr.length + 1];

        int i = 0;

        for (double each : arr) {
            newArr[i++] = each;
        }

        newArr[i] = num;

        return newArr;


    }

    public static char[] addElement(char[] arr, char ch) {
        char[] newArr = new char[arr.length + 1];

        int i = 0;

        for (char each : arr) {
            newArr[i++] = each;
        }

        newArr[i] = ch;

        return newArr;
    }

    public static String[] addElement(String[] arr, String str) {
        String[] newArr = new String[arr.length + 1];

        int i = 0;

        for (String each : arr) {
            newArr[i++] = each;
        }

        newArr[i] = str;

        return newArr;
    }

    // finds the frequency of given int in the int array, returns integer value
    public static int frequency(int[] arr, int element) {
        int counter = 0;
        for (int each : arr) {
            if (each == element) {
                counter++;
            }
        }
        return counter;
    }

    // finds the frequency of given double in the double array, returns integer value
    public static int frequency(double[] arr, double element) {
        int counter = 0;
        for (double each : arr) {
            if (each == element) {
                counter++;
            }
        }
        return counter;
    }

    // finds the frequency of given char in the char array, returns integer value
    public static int frequency(char[] arr, char element) {
        int counter = 0;
        for (char each : arr) {
            if (each == element) {
                counter++;
            }
        }
        return counter;
    }


    // finds the frequency of given String in the String array, returns integer value
    public static int frequency(String[] arr, String element) {
        int counter = 0;
        for (String each : arr) {
            if (each.equals(element)) {
                counter++;
            }
        }
        return counter;
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

    //remove the element in the given index from the give array and returns new array
    public static int[] removeElement(int[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("ınvalid Index " + index);
            System.exit(0);
        }
        int[] result = new int[array.length - 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index) {   // if the index of array is matching with the given index
                continue;  // skip the given index's element
            }
            result[j++] = array[i];
        }
        return result;
    }

    //remove the element in the given index from the give array and returns new array
    public static double[] removeElement(double[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("ınvalid Index " + index);
            System.exit(0);
        }
        double[] result = new double[array.length - 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index) {   // if the index of array is matching with the given index
                continue;  // skip the given index's element
            }
            result[j++] = array[i];
        }
        return result;
    }

    //remove the element in the given index from the give array and returns new array
    public static char[] removeElement(char[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("ınvalid Index " + index);
            System.exit(0);
        }
        char[] result = new char[array.length - 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index) {   // if the index of array is matching with the given index
                continue;  // skip the given index's element
            }
            result[j++] = array[i];
        }
        return result;
    }


    //remove the element in the given index from the give array and returns new array
    public static String[] removeElement(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("ınvalid Index " + index);
            System.exit(0);
        }
        String[] result = new String[array.length - 1];
        int j = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == index) {   // if the index of array is matching with the given index
                continue;  // skip the given index's element
            }
            result[j++] = array[i];
        }
        return result;
    }


    //merges two given arrays and returns a new array
    public static int[] merge(int[] array1, int[] array2) {


        int[] result = {}; //temporary

        for (int each : array1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (int each : array2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //merges two given arrays and returns a new array
    public static double[] merge(double[] array1, double[] array2) {


        double[] result = {}; //temporary

        for (double each : array1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (double each : array2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //merges two given arrays and returns a new array
    public static char[] merge(char[] array1, char[] array2) {


        char[] result = {}; //temporary

        for (char each : array1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (char each : array2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //merges two given arrays and returns a new array
    public static String[] merge(String[] array1, String[] array2) {


        String[] result = {}; //temporary

        for (String each : array1) {
            result = ArraysUtility.addElement(result, each);
        }

        for (String each : array2) {
            result = ArraysUtility.addElement(result, each);
        }
        return result;
    }

    //reverse the array and returns a new array
    public static int[] reverse(int[] array1) {

        int result[] = new int[array1.length];

        for (int i = array1.length - 1, j = 0; i >= 0; j++, i--) {
            result[j] = array1[i];
        }
        return result;
    }

    //reverse the array and returns a new array
    public static double[] reverse(double[] array1) {

        double result[] = new double[array1.length];

        for (int i = array1.length - 1, j = 0; i >= 0; j++, i--) {
            result[j] = array1[i];
        }
        return result;
    }

    //reverse the array and returns a new array
    public static char[] reverse(char[] array1) {

        char result[] = new char[array1.length];

        for (int i = array1.length - 1, j = 0; i >= 0; j++, i--) {
            result[j] = array1[i];
        }
        return result;
    }

    //reverse the array and returns a new array
    public static String[] reverse(String[] array1) {

        String result[] = new String[array1.length];

        for (int i = array1.length - 1, j = 0; i >= 0; j++, i--) {
            result[j] = array1[i];
        }
        return result;
    }

    //changes the element in the given index with the given element in array
    public static int[] replace(int[] array, int index, int element) {
        /*
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {

            if (i == index) {
                result[i] = element;
            } else {
                result[i] = array[i];
            }
        }

         */
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = element;
        return array;
    }


    //changes the element in the given index with the given element in array
    public static double[] replace(double[] array, int index, double element) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = element;
        return array;
    }

    //changes the element in the given index with the given element in array
    public static char[] replace(char[] array, int index, char element) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = element;
        return array;
    }

    //changes the element in the given index with the given element in array
    public static String[] replace(String[] array, int index, String element) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = element;
        return array;
    }

    // changes the old value with the new value in the given index of array
    public static int[] replaceAll(int[] array, int oldValue, int newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    // changes the old value with the new value in the given index of array
    public static double[] replaceAll(double[] array, double oldValue, double newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    // changes the old value with the new value in the given index of array
    public static char[] replaceAll(char[] array, char oldValue, char newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    // changes the old value with the new value in the given index of array
    public static String[] replaceAll(String[] array, String oldValue, String newValue) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)) {
                array[i] = newValue;
            }
        }
        return array;
    }

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
