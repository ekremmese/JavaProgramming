package day34_GarbageCollection_AccessModifiers;


import day30_CustomClass.Dog;
import day31_Constructor.Student;
import day32_Constructor.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        // String a  =   new GarbageCollection().finalize(); // I can not call .finalize() method, WHY ?

        String a = new String("Ali");
        System.out.println(a);
        a = ""; // here the object is assigned to null, so there is not object called a anymore
        System.out.println(a.toUpperCase()); //methods of the Strings are instance methods. In order to use these methods we need an object. When we assign a to null it means there is not object anymore in the heap called a so we can not use instance methods. NullPointerException It will give cannot Invoke error.

        //default value of all non-primitive data types is null

        //null keyword is the fastest way to make an object eligible for garbage collector

        System.out.println("----------------------");

        String str = "Wooden Spoon"; // after line 20 this object "Wooden Spoon" will be eligible for garbage collection. Garbage Collector will collect & destroy the object ,
        str = "Ahmet";

        System.out.println(str);

        System.out.println("---------------------");

        Car car1 = new Car("Toyota");
        //implicitly finalize method is called and the object is collected by Garbage Collector
        car1 = null;

        System.out.println(car1);

        System.out.println("--------------------------");

        Dog dog1 = new Dog();

        dog1.name = "Turi";  //

        dog1 = new Dog();  // this object is not called
        dog1.name = "Max";

        System.out.println(dog1);

        System.out.println("--------------------------");

        String language = "Python"; // because of line 51 this object Python become eligible for Garbage collector
        language = "Java";
        System.out.println(language);

        System.out.println("--------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1;  //interesting, it seems assignment operator works in both directions here

        list2.addAll(Arrays.asList(200,300,400));

        //in line 58 and 59 only one object is created. because when we assign list2 = list1 , list1 become eligible for garbage collector and destroyed.

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list2 == list1);
        System.out.println("--------------------------");


        Student student1 = new Student("Tahir", 23,'M','A',2011);  // there are 2 reference names but only one object created
        student1.grade= 'B';

        Student student2 = student1;
        student2.name = "Ali";

        System.out.println(student1);
        System.out.println(student2);

        System.out.println("-------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = l1;
        l2.add("Python");

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);




    }
}
