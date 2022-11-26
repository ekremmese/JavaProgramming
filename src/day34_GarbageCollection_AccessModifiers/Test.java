package day34_GarbageCollection_AccessModifiers;
import day34_GarbageCollection_AccessModifiers.Circle; // in the same pacjkage that's why implicitly done

import static Utilities.MathUtility.*;

public class Test {

    public static void main(String[] args) {



        System.out.println(Circle.pi);
        System.out.println(Circle.name);
        System.out.println(Circle.numbers);

        System.out.println("---------------------");

        int r1 = sum(10,23);
        System.out.println(r1);
        System.out.println(sum(40,90));

    }
}
