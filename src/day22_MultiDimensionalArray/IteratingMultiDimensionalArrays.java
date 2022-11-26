package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArrays {

    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};

        for (int i = 0; i < numbers.length; i++) {   //i : index numbers of single dimensional arrays

           // System.out.println(Arrays.toString(numbers[i]));

            for (int i1 = 0; i1 < numbers[i].length; i1++) {  //i1 : index number of elements in each single dimensional arrays

                System.out.print(numbers[i][i1] + " ");

            }

            System.out.println();

        }


        System.out.println("----------------------------------------------------");






    }
}
