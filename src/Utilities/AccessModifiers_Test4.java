package Utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifiers_Test4  extends  ProtectedAccessModifier {

    public static void main(String[] args) {

        System.out.println(ProtectedAccessModifier.name2);

        //AccessModifiers_Test4.method1(); // method1 can not be called but because in the parent class it has default access modifier
        AccessModifiers_Test4.method2(); // method2 can be called if this (current) class extends to the parent class, because it has protected access modifier

    }
}
