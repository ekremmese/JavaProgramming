package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add Method:
        // add(Data);

        numbers.add(10); //by default 10 is int, here it is converted to Integer wrapper class, its implicity done here

        numbers.add(20); // index1
        numbers.add(30); // index 3
        numbers.add(40); // index 4
        numbers.add(50); // index 5
        numbers.add(60); // index 6


        //add(index,data)
        //if index is greater than ArrayLists length it gives outOfBoundException error

        //if you add withoud index number it automatically adds to the last index

        numbers.add(2, 25);
        System.out.println(numbers);

        //size method:size()
        //returns the total number of the elements

        int lastIndex = numbers.size() - 1;

        System.out.println("lastIndex = " + lastIndex);

        // get() method:
        // we need to provide an index number and get() method will give us the element in the given element as Integer wrapper class

        int thirdElement = numbers.get(3);  // here is unboxing happenning because get() returns Integer wrapper class

        System.out.println("thirdElement = " + thirdElement);

        System.out.println("-------------------");


        for (int i = 0; i < numbers.size() - 1; i++) {
            System.out.println(numbers.get(i));
        }

        // set() method
        //set(index,Data) : replaces the old element in this index with the given data as element

        //it is for replacing and size is not effected

        System.out.println("---------------------------");

        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("j");
        list.add(0, "1");
        // list.add("i");
        //list.add("C#");
        //list.add("Ruby");
        list.add("j");
        list.remove("j");


        System.out.println(list); // we don t need to give toString in ArrayList

        // list.set(2,"JavaScript");
        // list.set(3,"C++");
        System.out.println(list);


    }
}

