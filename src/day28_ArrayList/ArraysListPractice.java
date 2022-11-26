package day28_ArrayList;

import java.util.ArrayList;

public class ArraysListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();

        number.add(1); //here implicitly autoboxing happening, because 1 is default int, and ArrayList does not accept primitive data type
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(5);
        number.add(6);

        for (int i = 0; i < number.size(); i++) {

            number.set(i, number.get(i)*2);

        }

        System.out.println(number);

        System.out.println("------------------------");

        // remove() function: has 2 types and it is overloaded:
        //1 -  remove(int index):
        //removes the element in the given index and decreases the size of ArrayList so the indexes of other elements changes by 1 after the given index

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Ali");
        employees.add("Ahmet");
        employees.add("Suat");
        employees.add("Hasan");
        employees.add("Kamil");
        employees.add("Jean");
        employees.add("John");

        employees.remove(0);
        employees.remove(0);


        System.out.println(employees);

        // remove(Object) - if we pass a non primitive for ex String
        //removes the given object from arraylist, returns boolean

        employees.remove("John");

        System.out.println(employees);

        boolean r1 =  employees.remove("Kamil");

        System.out.println("r1 = " + r1);


    }



}
