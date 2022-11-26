package day33_Statics;

import javax.sound.midi.Soundbank;

public class Iphone {

    public static String brand = "Apple"; //we assign it here because static variable has only one value

    public String model;

    public double price;

    public static String OS = "IOS";

    public String color;

    public String size;

    public static String madeIn = "China";

    public static boolean hasBattery = true;

    public static  boolean isTouchScreen = true;

    public static  boolean hasFaceTime = true;

    public static void printModelAndPrice(){  // static method can not share object members //Static only accepts static members
       // System.out.println(model + " : " + price);
    }

    public void method1(){  // instance method can access instance and static members of class // Instance accepts both instance and static members
        System.out.println(model + " : " + price);
        System.out.println(OS);
    }

    public static void printOS(){
        System.out.println(OS);
    }


}
