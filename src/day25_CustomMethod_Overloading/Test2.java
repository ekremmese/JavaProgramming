package day25_CustomMethod_Overloading;

import Utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1, 5, 9, 3, 0, 12, 65};

        ArraysUtility.printEachElement(arr1);

        System.out.println("-----------------------------------");

        String[] names = {"Ahmet","Mehmet", "Cuma", "Ilyar"};

        ArraysUtility.printEachElement(names);

        System.out.println("-----------------------------------");


        System.out.println(ArraysUtility.maxNumber(arr1));

        System.out.println(ArraysUtility.minNumber(arr1));

        System.out.println("-----------------------------------");


        int num = 560;

        System.out.println(ArraysUtility.contains(arr1, num));

    }
}
