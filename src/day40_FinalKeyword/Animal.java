package day40_FinalKeyword;

public class Animal {

    private String name;
    private final String breed;
    private final char gender;
    private final String color;
    private String size;
    private int age;


    //let's try to create setter for a final variable and see what happens

    //public void setBreed(String breed){
        //this.breed = breed;  // its giving compile error because during the object creation we will be assigning the breed variable (final variable) so we can not reassigne it with a setter because final variables can  not be reassigned
    //}


    public Animal(String name, String breed, char gender, String color, String size, int age) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.color = color;
        this.size = size;
        this.age = age;
    }

    //we can not have setter for the final variables , because the purpose of setter is assigning the variable but final variable can not be reassigned


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public char getGender() {
        return gender;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
