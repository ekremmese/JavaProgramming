package day33_Statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Ali");

        System.out.println(student1);

        Student student2 = new Student("Hasan", 'M');

        System.out.println(student2);

        Student student3 = new Student("Jane", 112);

        Student student4 = new Student("Havva", 34, 'B');

        Student student5 = new Student("Murat", 'M', 31);

        Student student6 = new Student("John", 'M', 34, 34234);

        Student student7 = new Student("Kasım", 'M', 'F', 29, 1034);

        Student[] students = {student1, student2, student3, student4, student5, student6, student7};

       // System.out.println(Arrays.toString(students));

        System.out.println("---------------------------------------------");
        ArrayList<Student> studentList = new ArrayList<>(Arrays.asList(students));

        System.out.println(studentList);

    }
}


//1:28:02