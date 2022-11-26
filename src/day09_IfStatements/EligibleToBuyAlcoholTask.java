package day09_IfStatements;

public class EligibleToBuyAlcoholTask {

    public static void main(String[] args) {

        String name = "John";

        int age = 17;

        boolean isDrivingCar = false;

        if (age<18 || isDrivingCar == true){
            System.out.println(name + " is not eligible to buy alcohol");
        }
        else {
            System.out.println(name + " is  eligible to buy alcohol");
        }


    }
}
