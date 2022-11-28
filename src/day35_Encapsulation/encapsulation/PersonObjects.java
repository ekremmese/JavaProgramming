package day35_Encapsulation.encapsulation;

import java.sql.SQLOutput;

public class PersonObjects {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();

       // person1.name = "";  //if the instance variables were public i could set like this in class
       // person1.age = 2200;

        person1.setName("Ali");
        person1.setAge(45);

        person2.setName("Joshua");
        person2.setAge(4);

       // System.out.println(person1.name + " : " + person1.age);


        System.out.println(person1.getName() + " : " + person1.getAge());

    }




}
