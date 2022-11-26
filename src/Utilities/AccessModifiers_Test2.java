package Utilities;

import day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
       // System.out.println(AccessModifiers.defaultData); // default access modifier is not visibe outside of package
        //System.out.println(AccessModifiers.privateData); //private access modifier is not visibe out side of class

        AccessModifiers.method1(); //public
       // AccessModifiers.method2(); //default
        //AccessModifiers.method3(); // private



    }

}
