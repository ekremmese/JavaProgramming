package day41_Exceptions;

import day39_Recap.cydeoTask.Student;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {

        //unchecked exceptions

        int a = 10;
        int b = 0;

        //System.out.println(a / b);  //divider can not be 0 in math&&java, it gives Arithmetic Exception

        //System.out.println("Wooden Spoon"); // compiler can not keep continue to execute upcoming code fragments

        char[] characters = {'A', 'B', 'C'};

        //System.out.println(characters[99]);  //ArrayIndexOutOfBoundsException

        //java.lang package implicitly imported and all the exceptions are under this package

        Student student = null; //it means student object is not created thats why I can not call the instance methods of the object

        //System.out.println(student.getName()); //NullPointerException
        //student.study();

        String str = "Wooden Spoon";

        //str = null; //wooden spoon collected by garbage collector

        //System.out.println(str.toUpperCase()); //NullPointerException

        String str2 = "";

        System.out.println(str2.isEmpty());

        //checked Exception: //we haven't seen it so far,

        System.out.println("Hello");

        //Thread.sleep(5000);  //when I 1st write this code sleep give error, this is called checked exception, I have to handle the exception to run my code

        //DIFFERENCE between CHECKED and UNCHECKED
        //CHECKED: we can not run our code, we have to handle the exception and the run the code, if the exception is not handled it will crush the program
        //UNCHECKED:we can run the code, but we get exception on console

        System.out.println("Cydeo");

        //FileInputStream file = new FileInputStream("path of the file");  //Unhandled exception, FileNotFoundException

        //System.out.println("java".charAt(2000)); //compiler can not check the exception during the compiling time, compiler can check in the run time, thats why this is called unchecked exception

        //59:53




    }

}
