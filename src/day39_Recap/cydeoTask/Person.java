package day39_Recap.cydeoTask;

public class Person {

    private  String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null) {
            System.out.println("Name can not be null");
            System.exit(1);
        }
        if(name.isEmpty() || name.isBlank()){
            System.out.println("Invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            System.out.println("Invalid age" + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender == 'M' || gender == 'F')){
            System.out.println("Invalid gender");
            System.exit(1);
        }
        this.gender = gender;
    }

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    public void eat(){
        System.out.println(name + " is eating");
    }

    public void drink(){
        System.out.println(name + " is drinking");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

}
