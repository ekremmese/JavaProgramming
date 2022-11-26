package day15_ForLoop;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {
        System.out.println("Please enter a word: ");
        String word = new Scanner(System.in).next();

        word = word.replace("x", "a").replace("X", "a");  // IF we are sure that methods are are returning string we can use them back to back

        System.out.println(word);

    }
}
