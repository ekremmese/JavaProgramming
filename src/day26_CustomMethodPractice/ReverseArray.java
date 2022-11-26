package day26_CustomMethodPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};
       arr =  reverse(arr);

        System.out.println(Arrays.toString(arr));

    }

    //reverse the array and returns a new array
    public static int[] reverse(int[] array1){

        int result[] = new int[array1.length];

        for (int i = array1.length-1, j=0; i>=0  ; j++, i--) {
            result[j] = array1[i];
        }
        return result;
    }

    //reverse the array and returns a new array
    public static double[] reverse(double[] array1){

        double result[] = new double[array1.length];

        for (int i = array1.length-1, j=0; i>=0  ; j++, i--) {
            result[j] = array1[i];
        }
        return result;
    }

    //reverse the array and returns a new array
    public static char[] reverse(char[] array1){

        char result[] = new char[array1.length];

        for (int i = array1.length-1, j=0; i>=0  ; j++, i--) {
            result[j] = array1[i];
        }
        return result;
    }

    //reverse the array and returns a new array
    public static String[] reverse(String[] array1){

        String result[] = new String[array1.length];

        for (int i = array1.length-1, j=0; i>=0  ; j++, i--) {
            result[j] = array1[i];
        }
        return result;
    }

}
