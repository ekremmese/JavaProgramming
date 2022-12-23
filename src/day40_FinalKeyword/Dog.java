package day40_FinalKeyword;

public final class Dog extends Animal{

    public Dog(String name, String breed, char gender, String color, String size, int age) {
        super(name, breed, gender, color, size, age);
    }

    //eat() method can be overriden because it is not final method, unlike drink()
    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }
    //drink() method can not be overriden because its a final method
    //public void drink(){
        //System.out.println(getName() + " is drinking cold ice tea");
    //}


    public void bark(){
        System.out.println(getName() + " is barking");
    }

}
