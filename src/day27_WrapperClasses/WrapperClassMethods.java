package day27_WrapperClasses;

import javax.print.attribute.IntegerSyntax;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";

        //Parse methods return types are primitves

        int num = Integer.parseInt(str);  // return type is int // this is not unboxing or autoboxing

        System.out.println(num + 1);

        System.out.println(str + 1);

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2); // returned the double primitive from Double parse method

        int max = Integer.MAX_VALUE;  // gives the max value of Integer , applicable for all primitives
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        System.out.println("---------------------------------");

        String s1 = "as";

        boolean r1 = Boolean.parseBoolean(s1); // if the String is true returns otherwise always returns false

        System.out.println("r1 = " + r1);

        System.out.println("------------------------------ü");

        //valueOf method: returns wrapper class

        String s2 = "123";

        Integer a1 = Integer.valueOf(s2);


        String s3 = "1.5";
        double z = Double.valueOf(s3);  // here in the background there is an unboxing, because valueOf method
        // turned String to Double Wrapper Class and we assign to a double primitve

        System.out.println("----------------------------------------");

        // Character class : we need to know 3 or 4 methods,

        //isDigit()    : returns true or false, if character is between 0 - 9 returns true

        char ch1 = '0';
        boolean r2 = Character.isDigit(ch1);
        System.out.println(r2);

        //isLetter  :returns true if the character is letter

        boolean r3 = Character.isLetter(ch1);
        System.out.println(r3);

        //if it is a special character we use isLetterOrDigit();

        boolean r4 = !Character.isLetterOrDigit(ch1);

        //upperCase

        boolean r6 = Character.isUpperCase(ch1);

        //lowerCase

        boolean r7 = Character.isLowerCase(ch1);

        System.out.println("--------------------------------------");

        //sum of digits task

        String s = "ab1cde2efg3hi4";

        int sum = 0;

        for (char each : s.toCharArray()) {

            if ( Character.isDigit(each) ){
                sum += Integer.parseInt(""+each);
            }

        }
        System.out.println(sum);

    }
}
