package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArraysIntro {

    public static void main(String[] args) {

        String[] group1 = {"John", "Joshua", "Ali"};


        int[][] numbers = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}};

        //System.out.println(Arrays.deepToString(numbers));  //WE NEED deeoToString to pring multi dim arrays

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(Arrays.toString(numbers[i]));
        }


        //System.out.println(numbers[2][3]);

        int z = numbers[1][0];

        //System.out.println(z);
    }
}
