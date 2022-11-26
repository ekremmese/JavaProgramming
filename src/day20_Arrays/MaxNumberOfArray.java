package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int[] number = {10,5,4,20,21,0};

        int max = number [0];

        for (int i = 0; i < number.length; i++) {


            if (number[i]>max) {
                max = number[i];
            }

            // EKREM'S APPROACH- including unnecessary declaration of a variable
            /*
            int a = number[i];

            if (a>max) {
                max = a;
            }

             */

        }

        System.out.println(max);

    }
}
