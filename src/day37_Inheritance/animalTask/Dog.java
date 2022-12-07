package day37_Inheritance.animalTask;

public class Dog extends Animal {

    //public int a;
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
        //this.a = a; // if I have a unique variable for sub class I add it with this keyword
    }

    public void bark() {
        System.out.println(name + " is barking");
    }

}
