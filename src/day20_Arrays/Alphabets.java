package day20_Arrays;

import java.util.Arrays;

public class Alphabets {

    public static void main(String[] args) {

        char[] alphabet = new char[26];

        // Z to A

        for (char i = 'Z', j = 0; j < alphabet.length; i--, j++) { //  i >= 'A' && j < alphabet.length; possible for the condition
            alphabet[j] = i;
        }

        System.out.println(Arrays.toString(alphabet));
    }
}
