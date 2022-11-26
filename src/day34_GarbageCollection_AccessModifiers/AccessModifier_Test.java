package day34_GarbageCollection_AccessModifiers;

public class AccessModifier_Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData);
        System.out.println(AccessModifiers.defaultData);

        //System.out.println(AccessModifiers.privateData); //private not visible to other classes in the same package


        AccessModifiers.method1(); //public

        AccessModifiers.method2(); //default one

        //AccessModifiers.method3(); //private can not be use other class

    }

}
