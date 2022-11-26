package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        //sort() method :

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 7, 0, 9, 3, 5, 12, 4));

        Collections.sort(list); // here we imported Collections class see the line 5
        System.out.println(list);

        System.out.println("---------------------------");

        //reverse() method: swaps the elements in the given 2 indexes

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D', 'E'));
        System.out.println(list2);
        Collections.reverse(list2); //reverses the ArrayList in ascending order
        System.out.println(list2);

        System.out.println("---------------------------");

        // swap() method :swaps the elements in the given 2 indexes

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60));
        Collections.swap(list3,2,3);
        System.out.println(list3);

        System.out.println("---------------------------");

        //max() : returns the maximum of ArrayList
        //min() : returns the minimum of ArrayList

        int max = Collections.max(list3);
        int min = Collections.min(list3);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("---------------------------");

        //replaceAll() :

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,30,50,70,90,25));

        Collections.replaceAll(list4, 10,39);
        System.out.println(list4);

        System.out.println("---------------------------");

        //frequency():

        int frequency = Collections.frequency(list4,39);
        System.out.println("frequency = " + frequency);

        System.out.println("----------------------------");

        // Checking if the frequency of two elements are equals in an ArrayList

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Java","Python","C","C","Python"));
        int countJava = Collections.frequency(words,"Java");
        int countC = Collections.frequency(words,"C");

        System.out.println("countC = " + countC);
        System.out.println("countJava = " + countJava);


    }
}
