package day21__ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "acdab";
        String str2 = "dbaca";

        //Write a program that checks if 2 str is anagram or not , return boolean

        char[] ch1 = str1.toCharArray();  // I converted string to array
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);  // I sorted ch1 array
        Arrays.sort(ch2);  // I sorted ch2 array

        System.out.println(Arrays.equals(ch1, ch2));



    }
}
