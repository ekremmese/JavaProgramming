package day07_Operators;

public class UnaryOperators {

    //+ - ++ --

    public static void main(String[] args) {

        int num1 = 25;
        int num2 = -25;

        int a = 100;

        System.out.println(a++); //post increment 1st posts the first value
        System.out.println(a++);
        System.out.println(a);

        int x = 200;

        System.out.println(--x); //pre decrement operator, decreases value by 1 immediatly

        int y = 200;

        System.out.println(y--); //post decrement operator, first ps
        System.out.println(y);

        //System.out.println(++a);
        //System.out.println(--a);

        //System.out.println(num1>0);
        // System.out.println(num1<0);

        int q = 30;

        System.out.println(--q);
        System.out.println(q--);
        System.out.println(q);

    }
}
