package day16_ForLoopStringPractice;

public class UniqueCharacter {

    public static void main(String[] args) {

        /*
        3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique


         */

        String word = "XAABBCCD",
                result ="";

        for (int i = 0; i < word.length(); i++) {

            if (word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i))) {  // if the first and last charachter are same it means the character is unique

                result += word.charAt(i);
            }

        }
        System.out.print(result);
    }
}
