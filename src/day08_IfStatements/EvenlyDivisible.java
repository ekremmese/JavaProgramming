package day08_IfStatements;

public class EvenlyDivisible {

    public static void main(String[] args) {

        /* 2. Create a class called EvenlyDivisible,and write a program that can check if a n is evenly divisible by 2, 3, 5
    		Ex: n = 65;
			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
         */
        int n = 65;

        boolean divisionBy2 = n % 2 == 0;
        boolean divisionBy3 = n % 3 == 0;
        boolean divisionBy5 = n % 5 == 0;

        System.out.println(n + " is divisible by 2: " + divisionBy2);
        System.out.println(n + " is divisible by 3: " + divisionBy3);
        System.out.println(n + " is divisible by 5: " + divisionBy5);


    }
}
