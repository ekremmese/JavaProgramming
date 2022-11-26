package day34_GarbageCollection_AccessModifiers;

public class StaticMembers { //outer class public access modifier


    //pre condition to have static class is we must have nested class,
    //classes doesn t take memoery unless we create object

    int a;

    class class1 {  //inner class with default access modifier



    }


    //Static Members:
    public static int num = 4; // 1 - Variables can be static

    public static void method() { // 2 - Methods can be static

    }

    static { // 3 - Blocks can be static

    }


}

class A {  //outer class can never be static because a class has to be contained by another class to be static
    static class B {
        public static void method1() {

        }
    }
}

class C {
    public static void main(String[] args) {
        A.B.method1(); // In order to access class elements we must call the outer class => inner class => element
    }
}

class X {

}
class Y {

}

class  Z{
    class Q{  //only class Q can be static among X,Y,Z,Q

    }
}