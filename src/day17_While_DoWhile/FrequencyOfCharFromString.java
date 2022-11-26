package day17_While_DoWhile;

public class FrequencyOfCharFromString {

    public static void main(String[] args) {


/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3

 */

        String word = "aaffkgkgbeerth";
        char ch = 'a';

        int length = word.length();
        int frequency = 0;

        for (int i = 0; i <length; i++) {
            if (word.charAt(i) == ch) {
                frequency++;
            }
        }
        System.out.println(frequency);




    }
}
