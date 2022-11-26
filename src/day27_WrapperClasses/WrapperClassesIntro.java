package day27_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int num1 = 200;

        Integer n1 = num1; //autoboxing, done implicitly

        int num2 = n1; //unboxing , done implicitly

        System.out.println("------------------------------------------");

        // if I have a primitive it can only be converted to its Wrapper class this process is autoboxing

        Integer integerValue = 100;

        long longValue = integerValue;
        Byte a1 = 25;

        byte b1 = a1;
        short b2 = a1;
        int b3 = a1;
        long b4 = a1;
        // if I have a primitive it can only be converted to its Wrapper class this process is autoboxing

        System.out.println("----------------------------------");

        int num3 = 200;

        //Long x = num3; // It gives error because and a primitive can only be converted to its wrapper class, here int ' s wrapper class Integer

        //Double d1 = num3

        System.out.println("---------------------------------");

        Integer z = 900;
        Integer y = z;   // this is not autoboxing or unboxing, we converted Integer object to Wrapper Class

        System.out.println("---------------------------------");

        int[] numbers1 = {1,2,3,4,5,};   // Arrays supports both primitives and wrapper classes but collection and map data structures
        Integer[] numbers2 = {1,2,3,4,5};




    }

}
