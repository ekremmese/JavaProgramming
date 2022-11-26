package day13_StringClass;

public class StringMethod4 {

    public static void main(String[] args) {

        String str = "Cydeo ";

        str = str.repeat(4);   // Cydeo Cydeo Cydeo Cydeo

        System.out.println("str = " + str);

        String s1 = "Wooden Spoon ";
        String s2 = s1.repeat(10);

        System.out.println("s2 = " + s2);

        System.out.println("-".repeat(30));
        System.out.println("Ali\n".repeat(5));



    }
}
