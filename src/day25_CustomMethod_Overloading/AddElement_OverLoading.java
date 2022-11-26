package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElement_OverLoading {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int num = 5;

        int[] intArr = addElement(arr, num);

        System.out.println(Arrays.toString(intArr));

        System.out.println("------------------------------------------");
        double[] arr1 = {1.5, 2.5, 3.5, 4.5};
        double num1 = 5.5;


        double[] doubleArr = addElement(arr1, num1);

        System.out.println(Arrays.toString(doubleArr));

        System.out.println("------------------------------------------");

        char[] arr2 = {'a', 'b', 'c', 'd', 'e'};
        char ch = 69;


        char[] charArr = addElement(arr2, ch);

        System.out.println(Arrays.toString(charArr));

        System.out.println("------------------------------------------");

        String[] arr3 = {"ahmet", "betül", "cemal", "deniz", "emre"};
        String str = "hasan";

        String[] stringArr = addElement(arr3, str);
        System.out.println(Arrays.toString(stringArr));

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

}
