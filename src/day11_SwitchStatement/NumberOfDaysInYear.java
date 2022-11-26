package day11_SwitchStatement;

public class NumberOfDaysInYear {

    public static void main(String[] args) {
        /*
        4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12

			If(1~12){

			}else{
				Invalid
			}
         */

        byte numberOfTheMonth = 4;
        //byte numberOfDays = 0;
        String result = "";
        int year = 2000;

        if (numberOfTheMonth >= 0 && numberOfTheMonth <= 12) {
            switch (numberOfTheMonth) {
                case 2:
                    result = (year % 4 == 0) ? "29 days" : "28 days";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result = "30 days";
                    break;
                default: // HERE DEFAULT STANDS FOR CASE 1, 3, 5, 7, 8, 10, 12
                    result = "31 days";
            }


        } else {
            result = "Invalid";
        }

        System.out.println(result);


        // I SOLVED ONLY WITH SWITCH STATEMENT
       /*  switch (numberOfTheMonth) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                numberOfDays = 31;
                break;
            case 4: case 6: case 9: case 11:
                numberOfDays = 30;
                break;
            case 2:
                numberOfDays = 28;
                break;

            default:
                System.out.println("Invalid");
                break;
        }
        System.out.println(numberOfDays + " days");

        */


    }
}
