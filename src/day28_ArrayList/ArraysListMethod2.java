package day28_ArrayList;

import javax.swing.*;
import java.util.ArrayList;

public class ArraysListMethod2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(200);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        System.out.println(numbers);

       /* int num = 1;
        numbers.remove(num);
        */

        Integer num = 2000;

        //numbers.remove(num);
        boolean r = numbers.remove(num);

        System.out.println(numbers);
        System.out.println(r);

        // clear() : removes all the elements, size becomes zero

        System.out.println(numbers.size());  // here size : 7

        numbers.clear(); // clearing

        System.out.println(numbers.size()); // size 0

        System.out.println(numbers); // numbers = [] :empty

        System.out.println("-------------------------");

        //indexOf(Data)
        //lastIndexOf(Data)


        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A');

        int b = characters.lastIndexOf('A'); // why this is here getting Data as Object ??

        System.out.println(a);
        System.out.println(b);

        boolean r2 = characters.contains('A');
        boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        System.out.println("------------------------");

        //equals() method:

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2); // this returns false because new keyword is used so it is created a new object in the memory

        System.out.println(list1.equals(list2)); // returns true, because same elements same order

        System.out.println("----------------------------");

        //isEmpty() : checks if the size is zero or not
        list1.clear();
        boolean r1 = list1.isEmpty();

        System.out.println("r1 = " + r1);

        System.out.println("---------------------");

        //Bulk Operations :we need collection Type
        //we use asList method converts Arrayal values to collection type





    }
}

