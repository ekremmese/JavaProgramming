package day21__ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] num = {8, 7, -6, 1, 2, 3, 4, 5, 6};

        // System.out.println(num); // Tht gives hashcode

        System.out.println(Arrays.toString(num));

        System.out.println(num[0]);


        //sort() : sorts the array in ascending order - from smalles to largest
        // if it is a string follows the ASCII table order and sorts it

        int[] scores = {95, 100, 55, 65, 79, 85};

        System.out.println(Arrays.toString(scores));

        Arrays.sort(scores);  //{65....... 100}

        System.out.println(Arrays.toString(scores));

        System.out.println("min score " + scores[0]);

        System.out.println("max score " + scores[scores.length - 1]);

        String[] names = {"Anna", "Zehrb", "Baba", "Zehra", "Ali", "Suna"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        String[] otherNames = {"Anna", "ANNA"};

        Arrays.sort(otherNames);

        System.out.println(Arrays.toString(otherNames));

        System.out.println("===========================================================");

        //equals() method : we have to provide to arrays,
        // equals(array1, array2) : checks the arrays if they are equal and returns boolean

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 1, 3};

        boolean b1 = Arrays.equals(arr1, arr2);

        System.out.println(b1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean b2 = Arrays.equals(arr1, arr2);

        System.out.println(b2);

        System.out.println("============================================================");

        //abc bac
        //Anagram: listen - silent    heart - earth : String build by same chars called Anagram
        //This task wanna check if these 2 chars are Anagram or not

        char[] ch1 = {'a', 'b', 'c'};
        char[] ch2 = {'b', 'a', 'c'};

        Arrays.sort(ch1); //{a,b,c}
        Arrays.sort(ch2); //{a,b,c}

        boolean b3 = Arrays.equals(ch1, ch2);

        System.out.println(b3);

        System.out.println("=============================================================");


    }
}
