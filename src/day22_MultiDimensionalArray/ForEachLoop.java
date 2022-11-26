package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

       for ( int[] each : numbers ) {
           // System.out.println(Arrays.toString(each));

           for ( int eachInner : each ) {
               System.out.println(eachInner);
           }
       }


    }
}
