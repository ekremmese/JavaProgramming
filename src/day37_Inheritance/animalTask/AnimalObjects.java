package day37_Inheritance.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Lucy", "Comat", 'F', 4, "Large", "Brown");

        System.out.println(dog1);
        dog1.bark();

        Cat cat1 = new Cat("Tin", "Van", 'M', 2, "Medium", "White");

        System.out.println(cat1);
        cat1.scratch();
        //car1.bark(); we can not call this for cat because cat class not inherited dog class' bark method

        Parrot parrot1 = new Parrot("King", "Macaw", 'M', 3, "Small", "Black");

        System.out.println(parrot1);

    }


}

//1:23:44