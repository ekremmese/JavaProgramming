package day11_SwitchStatement;

public class DaysInWeek {

    public static void main(String[] args) {
        int number = 9;
        //long number1 = 9L; those four data types we can not use them with switch
        //float number2 = 9F;
        //double number3 = 9D;
        //boolean number4 = true;

        String nameOfDay = "";
        // EXECUTION FLOW OF THE SWITCH STATEMENT
        //only data equals we can use switch, only compares equals, can not take booleans, double and floats, LONG TOO
        //we can give any conditionals in the case of statement
        //I DID NOT GIVE COMMAND BUT I DECLARED A VARIABLE AND ASSIGNED IT**
        // IF WE HAVE TO USE >= OR <= WE CAN NOT USE SWITCH STATEMENT, IT ONLY USED FOR == SIITUATIONS
        // PERFORMANCE IS FASTER THAN IF, THATS WHY WE USED SWITCH
        // IF STATEMENTS ARE MORE POWERFUL
        //IF THERE IS NOT BREAK COMPILER WILL GO FURTHER AND EXECUTE THE 1ST CASE BLOCK THAT IT MEETS, UNTILL FINDING A BREAK { IS ALSO A BREAK

        switch (number) {  // 1,2,3,4,5,6,7, and invalid COMPILER USES ==
            case 1:  // Case value must be unique and same data type in the switch (her it is number)
                // nameOfDay = "Monday";
                System.out.println("Monday");
                break;  // exits the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                //nameOfDay = "Tuesday"; //I DID NOT GIVE COMMAND BUT I DECLARED A VARIABLE AND ASSIGNED IT
                break;  // exits the switch after executing the case block
            case 3:
                System.out.println("Wednesday");
                //nameOfDay = "Wednesday";
                break;  // exits the switch after executing the case block

            case 4:
                System.out.println("Thursday");
                //nameOfDay = "Thursday";
                break;  // exits the switch after executing the case block     // QUESTION : WHEN I DELETE THE BREAK WHY IT IS EXECUTING THE CASE 5 ???? BECAUSE THERE WAS NO BREAK STATEMENT
            case 5:
                System.out.println("Friday");
                //nameOfDay = "Friday";
                break;  // exits the switch after executing the case block
            case 6:
                System.out.println("Saturday");
                //nameOfDay = "Saturday";
                break;  // exits the switch after executing the case block
            case 7:
                System.out.println("Sunday");
                //nameOfDay = "Sunday";
                break;  // exits the switch after executing the case block
            default:  //THE FRAGMENT TO EXECUTE A STATEMENT IF NON OF THE CASE BLOCKS ARA MATCHIN WITH THE DATA THAT WE HAVE
                System.out.println("Invalid");
                // nameOfDay = "Invalid";
                //break;  // exits the switch after executing the case block // this breaks statement is optional because we have curly brace after it, we can place it anywhere in the switch
        }
        //System.out.println(nameOfDay);

    }
}

// 2:26:45 kaldığım yer