package day03_EscapeSequences;

/*
Escape sequneces: MUST be given with double quote

\n: starts a new line
\t: gives a paragraph space (tab)
\\: prints one backslash in the console
\": in order to print double quote we must use this syntax


 */
public class EscapeSequences {

    public static void main(String[] args) {

        System.out.println("Java \nPython C#");
        System.out.println("Hello Cydeo \nHow are you today? \nIt's nice to see you all! \nWhat class do we have next week?");
        System.out.println("\tJava is a cool programming langauge");

        System.out.println("/ \\"); // in order to print one backslash you need to print to backslash in the source code
        System.out.println("The city that we lived in called \"Istanbul\"");
    }

}
