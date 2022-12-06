package day36_Inheritence.AnimalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 3, "Small", "Brown");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        //dog.hunt();
        System.out.println(dog);



        Cat cat = new Cat();

        cat.setInfo("Tarcin", "British", 'F', 3 ,"Small", "Black");
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();

        cat.scratch();
        cat.meow();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khab" , "Bengal", 'M', 4, "Large", "Orange");
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();

        tiger.roar();
        tiger.hunt();
        System.out.println(tiger);


    }
}


