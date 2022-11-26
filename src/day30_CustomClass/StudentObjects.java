package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Ali",'M',12,124,'A');

        Student student2 = new Student();
        student2.setInfo("Meryem", 'F',23,234324,'B');

        Student student3 = new Student();
        student3.setInfo("Ahmet", 'M', 45,1002,'C');

        Student student4 =new Student();
        student4.setInfo("John",'M', 34, 3434,'A');

        Student student5 = new Student();
        student5.setInfo("Jane", 'F', 12, 901, 'F');

        Student[] students =  {student1,student2,student3,student4,student5};

        for (Student each : students) {
            System.out.println(each);
        }

        System.out.println("--------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(); //grade A
        ArrayList<Student> angryBirds = new ArrayList<>(Arrays.asList(students)); // rest of students

        for (Student each : students) {
            if ( each.grade == 'A' ){
                earlyBirds.add(each);
            }
        }

        angryBirds.removeIf(p -> p.grade=='A');

        System.out.println(earlyBirds);
        System.out.println(angryBirds);


    }
}
