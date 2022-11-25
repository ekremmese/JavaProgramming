package day34_GarbageCollection_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static {  //1st static block gets executed
        System.out.println("Static");
    }
    public Constructor_vs_StaticBlock(){  // this can not get executed if we don't have an object
        System.out.println("Constructor");
    }

    public static void main(String[] args) { //2nd main method gets executed
        new Constructor_vs_StaticBlock(); //1
        new Constructor_vs_StaticBlock(); //2
        new Constructor_vs_StaticBlock(); //3
        new Constructor_vs_StaticBlock(); //4
        new Constructor_vs_StaticBlock(); //5
        System.out.println("Main Method");
    }
}
