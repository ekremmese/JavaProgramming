package day20_Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysPractice1 {

    public static void main(String[] args) {

        //Store those elements 10 20 30 40 50


        int[] numbers = {10, 20, 50, 70};  // size 4 - WE KNOW THE ELEMENTS AND WE KNOW THE VALUES OF THEM

        System.out.println(Arrays.toString(numbers));


        System.out.println("===================================================");

        //Create a variable that can contain 5 scores - WE KNOW THE NUMBER OF ELEMENTS BUT WE DON T KNOW THE VALUES OF THEM

        int[] scores = new int[5];

        scores[1] = 85;
        scores[scores.length - 1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;


        System.out.println(Arrays.toString(scores)); // [65, 85, 55, 75, 95]

        System.out.println("====================================================");

        String[] months = {"January", "February", "March", "April", "May", "June ", "July", "August", "September", "October", "November", "December"};

        for (int i = 0; i < months.length; i++) { // represents the index number starting from zero
            System.out.println(months[i]);
        }

        //System.out.println(months[0]);
        //System.out.println(months[1]);

        System.out.println("===============================");

        for (int i = months.length - 1; i >= 0; i--) {
            System.out.println(months[i]);
        }

    }
}
