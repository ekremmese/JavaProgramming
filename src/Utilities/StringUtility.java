package Utilities;

import java.util.Arrays;

public class StringUtility {


    //prints each character of the given String:
    public static void printEachChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }

    //returns a given String
    public static String reverseString(String str) {

        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        return result;
    }

    //checks if the given string is Palindrome and returns boolean, level,racecar are palindrome words
    public static boolean isPalindrome(String str) {

        return reverseString(str).equalsIgnoreCase(str);

    }

    //checks the two strings are Anagram or not, returns boolean, listen - silent are anagram
    public static boolean isAnagram(String str1, String str2) {

        char[] ch = str1.toCharArray();
        Arrays.sort(ch);

        char[] ch1 = str2.toCharArray();
        Arrays.sort(ch1);

        return Arrays.equals(ch, ch1);


    }

    //removes the duplicates from a String. "aaaaabbbccc" => "abc"
    public static String removeDuplicates(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if( !result.contains(""+str.charAt(i))){
                result += str.charAt(i);
            }
        }

        return result;
    }


}
