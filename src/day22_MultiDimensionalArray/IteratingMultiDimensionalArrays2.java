package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArrays2 {

    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3}, {4, 5, 6, 7, 8}, {9, 10, 11, 12, 13}};

        for (int i = numbers.length - 1; i >= 0; i--) {

            for (int j = 0; j <= numbers[i].length - 1; j++) {

                System.out.print(numbers[i][j] + " ");

            }

            System.out.println();
        }


        System.out.println("---------------------------");

        for (int i = 0; i <= numbers.length - 1; i++) {

            for (int j = numbers[i].length - 1; j >= 0; j--) {

                System.out.print(numbers[i][j] + " ");

            }

            System.out.println();
        }

        System.out.println("---------------------------");

        for (int i = numbers.length - 1; i >=0 ; i--) {

            for (int j = numbers[i].length - 1; j >= 0; j--) {

                System.out.print(numbers[i][j] + " ");

            }

            System.out.println();
        }

    }
}
