package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        //Scanner input = new Scanner(System.in);

        System.out.println("Please enter a word: ");
        String word = new Scanner(System.in).next();  // If we need only 1 input from the user we don t need to declare scnner variable

        if(word.charAt(0) == 'x') {
            word = word.replaceFirst("x", "a");
        }

        System.out.println(word);

    }
}
