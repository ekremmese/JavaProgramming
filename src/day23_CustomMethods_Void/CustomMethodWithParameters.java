package day23_CustomMethods_Void;

public class CustomMethodWithParameters {

    //create a function tht can check if a number odd or even

    public static void oddOrEven(double num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even number");
        } else {
            System.out.println(num + " is Odd number");
        }
    }


    public static void main(String[] args) {

        oddOrEven(6); // the method demands additional information because of its method has parameters
        ageOfPerson(1981);
        printNumbers(1,10);

    }


    // create a function that can display the age of a person

    public static void ageOfPerson(int birthYear){

        int age = 2022 - birthYear;
        System.out.println("Your age is: " + age);

    }

    //create function that can pring between x and y

    public static void printNumbers(int x, int y){

        for (int i = x; i <y+1 ; i++) {
            System.out.println(i);
        }

    }

}
