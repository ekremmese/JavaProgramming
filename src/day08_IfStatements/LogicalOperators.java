package day08_IfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        // && both (and logical operator)   ,   || either , logical OR operator,
        String name = "Ahmet";
        int age = 14;
        String citizen = "USA";
        //age += 4;


        boolean isEligible = age >= 18 && citizen == "USA";


        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("---------------------------------------");

        String name2 = "Josh";
        int creditScore = 800;
        int age2 = 20;
        int income = 40000;

        boolean isEligibleForLoan = age2 >= 21 && creditScore >= 700 && income >= 60000;

        System.out.println(name2 + " is eligible for loan: " + isEligibleForLoan);

        System.out.println("---------------------------------------");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');

        System.out.println(name3 + " is eligible  " + isEligible3);

        System.out.println("---------------------------------------");

        String name4 = "Muhammed",
                countryOfBirth = "UK";

        boolean marriedToUSCitizen = false;

        boolean isEligibile4 = countryOfBirth == "USA" || marriedToUSCitizen == true;

        System.out.println(name4 + " is eligible : " + isEligibile4);

        System.out.println("---------------------------------------");


        String name5 = "Ali";
        double gpa = 2.5;
        int familyInCome = 40000;

        boolean isEligible5 = gpa >= 3.5 || familyInCome <= 60000;

        System.out.println(name5 + " is eligible for scholarship: " + isEligible5);

        System.out.println("---------------------------------------");

        boolean result2 = true;

        System.out.println("result2 = " + result2);

        boolean result3 = !result2;

        System.out.println("result3 = " + result3);

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);




    }
}
