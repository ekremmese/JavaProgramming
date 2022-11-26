package day06_PrimitiveTypeCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        byte a = 100;
        short b = (short) a;

        // compiler in the background automatically makes short b= (short) a;
        // short b = (short) a;  equals to ===>>>    short b = a;

        int c = b;

        // compiler makes in the background int c = (int) b; because int's range can cover short's range of value

        long d = c;

        // compiler makes in the background long d = (long) c; because int's range can cover short's range of value

        float e = d;
        double f = e;

        // System.out.println(e);

        int x = 55;


////////////

        long j = 1000000;

        short k = (short) j;

        System.out.println(j + " : " + k);

        double l = 2.5;

        float m = (float) l;

        System.out.println(l + " : " + m);

        double n = 10.8;
        int s = (int) n;

        System.out.println(n + " : " + s);

       double d1 = 20.5;
       short s1 = (short) d1;

        System.out.println(d1 + " : " + s1);





    }
}


/*
Primitives:

	double > float > long > int > short > byte

	smaller primitives can be directly assigned to larger primitive type
	larger ptimitives can NOT be directly assigned to smaller primitive types (need to be casted manually)
 */