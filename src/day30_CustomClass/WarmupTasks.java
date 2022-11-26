package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmupTasks {

    public static void main(String[] args) {

        /*
        1.write a program that can swap the first and last elements of an ArrayList
         */

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));

        Collections.swap(list, 0, list.size() - 1);

        System.out.println(list);

        System.out.println("----------------------------------------------");

        /*
        Write a program that can move all zeros to the last indexes of ArrayList
         */

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 0, 2, 3, 0, 4, 0)); // size 7

        int zeros = Collections.frequency(list1, 0);
        int length = list1.size();

        list1.removeIf(p -> p == 0);

        for (int i = 0; i < zeros; i++) {
            list1.add(0);
        }

        System.out.println(list1);

        System.out.println("------------------------------------");

        String str = "ABCD12aa34%&5^+%bb+%&";
        char[] arr = str.toCharArray();

        ArrayList<Character> list2 = new ArrayList<>();

        for (char ch : arr) {
            list2.add(ch);
        }

        System.out.println(list2);

        ArrayList<Character> numberList = new ArrayList<>(list2);

        numberList.removeIf(p -> !Character.isLetter(p));
/*
        for (Character each : list2) {
            if ( Character.isDigit(each)) {
                numberList.add(each);
            }
        }

 */

        System.out.println(numberList);

        ArrayList<Character> numberLetters = new ArrayList<>(list2);

        numberLetters.removeIf(p -> !Character.isDigit(p));
/*
        for (Character each : list2) {
            if ( Character.isLetter(each)) {
                numberLetters.add(each);
            }
        }

 */
        System.out.println(numberLetters);

        ArrayList<Character> specials = new ArrayList<>(list2);
        specials.removeAll(numberLetters);
        specials.removeAll(numberList);
/*
        for (Character each : list2) {
            if ( !(Character.isLetter(each) || Character.isDigit(each))) {
                specials.add(each);
            }
        }

 */
        System.out.println(specials);

    }
}

//58:23