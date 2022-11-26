package day25_CustomMethod_Overloading;

import java.security.PublicKey;
import java.util.Arrays;

public class AddElementToArrays {

    /*
    1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array

					{1,2,3,4}, 5
					new array ==> {1,2,3,4,5}

	    2. create a return method called addDouble that can add a double after the last index of a double array

	    3. create a return method called addString that can add a String after the last index of a String array

	    4. create a return method called addChar that can add a char after last index of a char array

     */

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        int num = 5;

        int[] createdArr = addElementInt(arr, num);

        System.out.println(Arrays.toString(createdArr));

        System.out.println("------------------------------------------");
        double[] arr1 = {1.5, 2.5, 3.5, 4.5};
        double num1 = 5.5;

        double[] createdDoubleArray = addElementsDoubleArr(arr1,num1);

        System.out.println(Arrays.toString(createdDoubleArray));

        System.out.println("------------------------------------------");

        char[] arr2 = {'a', 'b', 'c', 'd', 'e'};
        char ch = 69 ;

        char[] createdCharArry = addElementCharArr(arr2,ch);

        System.out.println(Arrays.toString(createdCharArry));

        System.out.println("------------------------------------------");

        String[] arr3 = {"ahmet", "betül", "cemal", "deniz", "emre"};
        String str ="hasan" ;

        String[] created = addElementStringArr(arr3,str);

        System.out.println(Arrays.toString(created));


    }

    public static int[] addElementInt(int[] arr, int num) {

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

    public static double[] addElementsDoubleArr(double[] arr, double num) {

        double[] newArr = new double[arr.length + 1];

        int i = 0;

        for (double each : arr) {
            newArr[i++] = each;
        }

        newArr[i] = num;

        return newArr;


    }

    public static char[] addElementCharArr(char[] arr, char ch){
        char[] newArr = new char[arr.length + 1];

        int i = 0;

        for (char each : arr) {
            newArr[i++] = each;
        }

        newArr[i] = ch;

        return newArr;
    }

    public static String[] addElementStringArr(String[] arr, String str){
        String[] newArr = new String[arr.length + 1];

        int i = 0;

        for (String each : arr) {
            newArr[i++] = each;
        }

        newArr[i] = str;

        return newArr;
    }

}
