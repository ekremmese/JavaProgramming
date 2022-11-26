package day09_IfStatements;

public class EligibleToVoteTask {

    public static void main(String[] args) {

        String name = "Hasan";
        int age = 45;
        String nationality = "Turkish";
        //boolean isEligible = age>=18 && nationality=="Turkish";

        /*if (age>=18 && nationality=="Turkish") {
            System.out.println(name + " is eligible to Vote in the elections");
        }
else{
            System.out.println(name + " is not eligible to Vote in the elections");
        }
*/

        if (age >=18 && nationality == "Turkish"){
            System.out.println(name + " is eligible to Vote in the elections");
        }
        else{
            System.out.println(name + " is not eligible to Vote in the elections");
        }



/*
String name = "Josh";
        int age = 24;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";
        //Eligible
 */
    }
}
