package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {

    public static void main(String[] args) {

        System.out.println(10 + 20); //addition
        System.out.println(100 - 50); //subtraction
        System.out.println("12" + 1); //concatenation
        System.out.println(10 * 50); //multiplication

        System.out.println(100.0 / 3);
        System.out.println(10.0 / 4);
        System.out.println(10 / 4.0);
        System.out.println(10d / 4);

        // integer / integer ===> integer
        //decimal / integer ====> decimal
        //integer / decimal===> decimal
        //decimal / decimal ===> decimal


        /*
        +: addition
        -: subtraction
        *:Multiplication
        /:Divison

        in math 10/4 = 2.5
        in java 10/4 = 2 because by default its int

        %:Remainder
         */
int a = 100;
double b = a/6;
        System.out.println(b);

        double c = a/6;
        System.out.println(c);

        String h = "Result A";
        String t = "Result B";

        System.out.println("Result A" + 0 + 1);
        System.out.println("Result B" + 1 + 2);

    }
}
