package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Main Method");

    }

    static { //in java 1st static block gets executed, runs before anything else and only runs one time

        System.out.println("Static Block 1");
    }

    static { //in java 1st static block gets executed, runs before anything else and only runs one time

        System.out.println("Static Block 2");
    }

    static { //in java 1st static block gets executed, runs before anything else and only runs one time

        System.out.println("Static Block 3");
    }

}
