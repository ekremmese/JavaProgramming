package day13_StringClass;

import java.sql.SQLOutput;
import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(2);

        System.out.println(thirdChar);

        //char tenthCharacter= word.charAt(9); //StringIndexOutOfBoundsException error becaus we can get max 4th index

        //System.out.println(tenthCharacter);


        //LENGTH METHOD : COUNTİNG THE CHARACTERS

        String s1 = "Batch 25 is the best batch. Java Programming Language";
        int totalNumOfChar = s1.length();
        System.out.println(s1.length());
        System.out.println(totalNumOfChar);

        System.out.println(s1.charAt(25));
        System.out.println(s1.charAt(s1.length() - 1));    //prints the last character

        char lastChar = s1.charAt(s1.length() - 1);   //index starts from 0 so thats why we subtracts 1 for the last index from total length
        System.out.println(lastChar);

        System.out.println("=================================================================");

        String str = "wooden spoon";

        str = str.toUpperCase(); //WOODEN SPOON => CREATES A NEW ONE BECAUSE STRING IS IMMUTABLE

        System.out.println(str);
        System.out.println(str);

        String sentence = "Today is a great day to learn java programming language.";
        sentence= sentence.toUpperCase();


    }
}
