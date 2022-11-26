package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {

    /*
    2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java

     */

    public static void main(String[] args) {

        String sentence = "I Love Java";

        String[] arr = sentence.split(" ");

        String second = "";

                for (int j = arr[1].length() - 1; j >= 0; j--) {
                    second += "" + arr[1].charAt(j);
                }

        arr[1] = second;
        System.out.println(Arrays.toString(arr));

        for (String each : arr) {
            System.out.print(each+" ");
        }

        System.out.println();
        System.out.println("__________________________________________");

        String word = "abcdeg";
        String[] arr1 = word.split("");

        System.out.println(Arrays.toString(arr1));

    }
}
