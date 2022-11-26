package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();  // 1st Dog is the variable type of Dog object,

        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        Dog dog2 = new Dog();

        dog2.name = "Ace";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "Whit&Black";

        Dog dog3 = new Dog();

        dog3.setInfo("Jack", "German Shepard", 5, 'F', "Large", "White");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.eat();

        dog2.bark();

        Dog dog4 = new Dog();
        dog4.setInfo("Paty", "Malak", 6, 'M', "Huge", "Brown");

        Dog dog5 = new Dog();
        dog5.setInfo("Josy", "Çoban", 2, 'F', "Medium", "White");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>(Arrays.asList(dogs));

        for (Dog each : dogs) {
            if (each.gender == 'F') {
                femaleDogs.add(each);
            }
        }

        maleDogs.removeIf( p -> p.gender == 'F');

        System.out.println(femaleDogs.size());
        System.out.println(maleDogs.size());

    }

}

//2:22:11