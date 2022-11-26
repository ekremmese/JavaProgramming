package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];

        //System.out.println(Arrays.toString(letters));


        // EKREM ' S SOLUTION: /

      /**java

       char b = 64;

        for (int i = 0; i < letters.length; i++) {

            b++;
            letters[i] = b;

        }

        System.out.print(Arrays.toString(letters));

       */

        // MUHTAR'S 1ST SOLUTION:
        System.out.println("===========================================");

        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {
            letters[j] = i;
        }

        System.out.println(Arrays.toString(letters));


    }
}
