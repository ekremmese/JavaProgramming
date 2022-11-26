package day30_CustomClass;

public class Student {

    public String name;   // these are called instance variable
    public char gender;
    public int age;
    public int ID;
    public char grade;

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }


    public void setInfo(String name, char gender, int age, int ID, char grade) {  //these are called local variables
        this.name = name;   // this.name ==>> instance variable name , name ==>> local variable name
                            // this keyword is used for calling the instance variable
        this.gender = gender;
        this.age = age;
        this.ID = ID;
        this.grade = grade;
    }

    public void code(){
        System.out.println(name + " is coding");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }
}
