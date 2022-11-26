package day31_Constructor;

public class Person {

    public String name;
    public char gender;
    public int age;

    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", gender=" + gender + ", age=" + age + '}';
    }

    public Person(String name, char gender, int age) { //this is default constructor, if I want to set
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

}
