package day09_IfStatements;

public class MedianNumber {


    public static void main(String[] args) {

        int a = 4;
        int b = 2;
        int c = 6;

        boolean aIsMed = (c > a && a > b) || (b > a && a > c);
        boolean bIsMed = (a > b && b > c) || (c > b && b > a);
        boolean cIsMed = (a > c && c > b) || (b > c && c > a); // boolean cIsMed = !aIsMed & !bIsMEd
                                                                // böyle de tanımlanabilir


        if (aIsMed) {

            System.out.println(a + " is the median n");
        }
        if (bIsMed) {

            System.out.println(b + " is the median n");
        }
        if (cIsMed) {

            System.out.println(c + " is the median n");
        }

        /*

        reate a class called Mediann. write a program that can find the median n between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median n
         */


    }
}
