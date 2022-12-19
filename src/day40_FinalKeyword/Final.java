package day40_FinalKeyword;

public class Final {

    final String birthday;
    final static String name;  //again we have to guarantee it has to be set before its use, it means we need static block because when the class is called static block gets executed

    static {
        name = "EU10";
    }

    public Final(String birthday) {  // if we do not assign the value of a final variable it will give us compile error unless we make a guarantee that it will be assigned before its uses. Here the constructor serves this purpose. Because as soon as the object is created constructor is called and constructor asks to assign the value of our final variable
        this.birthday = birthday;
    }

    public static void main(String[] args) {

        final double  pi = 3.14;

        //pi = 5.13;    //final variables can not be reassigned

        final String name;

        name = "Java";

        //name = "Python";  //final value assigned to Java

        System.out.println("-----------------------");

        Final obj = new Final("June/25");
        //obj.birthday = "Jan/1"; // gives us compile error because at line above its declared once and since its final we can not reassign it.

        System.out.println(Final.name);

        //Final.name = "EU11"; //it gives compiler error because it is a final variable and above I assigned, I can not reassign

    }

}
