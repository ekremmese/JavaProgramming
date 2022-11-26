package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {

        // >, >=, < , <=  == !=

        boolean result1 = 200 > 40;

        System.out.println("result1 = " + result1);

        boolean result2 = 300 >= 150; //true

        System.out.println("result2 = " + result2);

        boolean result3 = 100 >= 100;

        System.out.println("result3 = " + result3);

        boolean result4 = 100 >= 150;

        System.out.println("result4 = " + result4);

        // credit creditScore of 720

        int creditScore = 745;

        boolean isEligibleForLoan = creditScore >= 720;

        System.out.println("isEligibleForLoan = " + isEligibleForLoan);

        int score = 75;

        boolean hasFailed = score < 60;

        System.out.println("hasFailed = " + hasFailed);

        String word = "Ahmet";
        String word2 = "Ahmet";

        boolean match = word == word2;

        System.out.println("match = " + match);

        int n1 = 45;
        int n2 = 45;

        boolean match2 = n1 == n2;

        System.out.println("match2 = " + match2);

        boolean result9 = 'A' == 'A';

        System.out.println("result9 = " + result9);

        System.out.println("----------------------------------------");

        double ask = 2;
        int ask1 = 3;

        boolean match3 = ask == ask1;

        System.out.println("match3 = " + match3); // so if both values are ns in different variable types you can use relational operators;

        boolean result12 = "Java" != "Break";

        System.out.println("result12 = " + result12);


    }


}
