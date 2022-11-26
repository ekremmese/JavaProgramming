package day07_Operators;

public class ShortHandOperator {

    public static void main(String[] args) {

        // = += -= *= /= %=
//assignment operator is =
        int n = 100;

        System.out.println("n = " + n);

        n = 200;

        System.out.println("n = " + n);

        String word = "Java Programming";

        System.out.println("word = " + word);

        word = "Java Virtual Machine";

        System.out.println("word = " + word);

        //String word1 = "11"+1;

        //System.out.println("word1 = " + word1);

        System.out.println("-----------------------------");

        //Addition Assignment Operator x+=y  meaning x=x+y

        int x = 100;

        System.out.println("x = " + x);
        //System.out.println(x + 200);

        x = x + 200;
        x += 200;
        System.out.println("x = " + x);

        String str = "Wooden";
        str += " Spoon";

        System.out.println("str = " + str);

        double num1 = 2.5;

        System.out.println("num1 = " + num1);

        num1 += 5.5;

        System.out.println("num1 = " + num1);

        double availableBalance = 1000.50;

        //if i deposit $300 to the account

        availableBalance += 300;

        System.out.println("availableBalance = " + availableBalance);


        System.out.println("------------------------------------------");

        // withdrawing $500, Subtraction Assignment -=

        availableBalance -= 500;

        System.out.println("availableBalance = " + availableBalance);

        //withdraw 200$ , then depositing 400 $

        availableBalance -= 200;
        availableBalance += 400;

        System.out.println("availableBalance = " + availableBalance);

        System.out.println("------------------------------------------");

        // Multiplication Assignment *=

        double salary = 50000.50;
        System.out.println("salary = " + salary);
        salary *= 2;

        System.out.println("salary = " + salary);

        double doge = 0.00000001;
        System.out.println("doge = " + doge);
        doge *= 1000000;

        System.out.println("doge = " + doge);

        System.out.println("------------------------------------------");

        // Division Assignment /=

        double num2 = 25000.0;

        num2 /= 2;

        System.out.println("num2 = " + num2);

        System.out.println("------------------------------------------");

        // Remainder Assignment %=
        // the only scnario that we use this remainder assignment is if we
        // wanna assign the remainder to the variable


        double num3 = 100;

        num3 %= 3;

        System.out.println("num3 = " + num3);

        int amount = 127;
        int quarters = 127 / 25;
        int cents = 127 % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        int y = 300;

        y %= 16;
        System.out.println("y = " + y);

        System.out.println("------------------------------------------");

        int balance = 3000;

        //insurance fee : 157

        balance %= 157;

        System.out.println("balance = " + balance);

        System.out.println(3000 / 157);
        System.out.println(157 * 19 + 17);

        System.out.println("------------------------------------------");


    }
}
