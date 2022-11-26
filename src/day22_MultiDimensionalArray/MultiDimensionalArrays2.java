package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrays2 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2D2 = {{10, 20, 30}, {40, 50, 60}, {70, 80, 10}};

        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 50, 60}, {70, 80, 10}}}; // arr3D.length() = 2 because it has 2 piece of 2 dimensional arrays

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.deepToString(arr3D[1]));

        System.out.println(Arrays.toString(arr3D[1][0]));

        System.out.println(arr3D[1][0][1]);

        for (int i = 0; i < arr3D.length; i++) {

            for (int j = 0; j < arr3D[i].length; j++) {

                for (int k = 0; k < arr3D[i][j].length; k++) {

                    System.out.println(arr3D[i][j][k]);
                }

            }


        }

        System.out.println("-------------------------------------------");


        for (int[][] each2D : arr3D) {
            for (int[] each1D : each2D) {
                for (int element : each1D)
                    System.out.println(element);
            }
        }


    }
}