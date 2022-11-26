package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    /*
    . write a program that can return the nth largest number from an arraylist

			arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
			n = 5

			output:
				4
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 8, 8));


        int n = 3;
        for (int i = list.size()-1; i > n+1 ; i--) {  //repeats the action list.size()-1  -  n +1  times
            int max =  Collections.max(list);   //finds the maximum number
            list.removeAll(Arrays.asList(max));   // removes it all (in case there are duplicated)
        }
        System.out.println(list);

        int max = Collections.max(list);

        System.out.println("max = " + max);



/*
        int n = 3;

        for (int i = 1; i < 3; i++) {
            list.removeIf(p -> Collections.max(list) == p);
        }
        int max = Collections.max(list);

        System.out.println(max);


*/

    }
}
