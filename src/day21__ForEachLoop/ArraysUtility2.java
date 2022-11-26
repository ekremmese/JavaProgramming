package day21__ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {

        //copyOf()    ==> copies the element of one array // this method starts copying from 1st element
        //copyOf(array, newLength)

        String[] students = {"Elif", "Ahmet", "Ali", "Emin", "Ekrem", "Jimmy", "Musa"};

        //Arrays.sort(students);

        String[] firstGroup = Arrays.copyOf(students, 2 * 3);

        System.out.println(Arrays.toString(firstGroup));


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        numbers = Arrays.copyOf(numbers, 5); //RE-ASSIGNED THE VALUE OF ARRAY WITH COPYOF METHOD

        System.out.println(Arrays.toString(numbers));

        System.out.println("====================================================================================");

        //copyOfRange   ==> copies from a certain index that is give to another index

        char[] ch1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        char[] ch2 = Arrays.copyOfRange(ch1, 2, 7);  //** index 6 is excluded **

        System.out.println(Arrays.toString(ch2));

        System.out.println("Length of ch1: " + ch1.length);

        int[] scores = {10,20,30,40,50,60,70,80,90,100};

        int[] result = Arrays.copyOfRange(scores, 2,20 );

        System.out.println(Arrays.toString(result));


        //copyOfRange(array, beginningIndex, endingIndex)
        //copys the elements of the array starting from the given index to ending index and returns new array

        System.out.println("====================================================");


    }
}
