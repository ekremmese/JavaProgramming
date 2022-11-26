package day27_WrapperClasses;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class Replace {

    /*
    1. Replace Task:
		1.1 Create a method named replace that passes three parameters: integer array, integer index, integer newElement.
		The method replaces the element of the array at given index with the new element, and returns the new array.
				Ex:
					arr = {1,2,3,4,5};

					replace(arr, 2, 30) ===> {1, 2, 30, 4, 5}


		1.2 Create
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arr = replace(arr, 2, 30);
        System.out.println(Arrays.toString(arr));

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
}