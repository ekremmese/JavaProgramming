package day12_Scanner;

public class GradeLevel {


    public static void main(String[] args) {

/*

1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
                grade level and types are:
                        1-5: Elementary school
                        6-8: Middle school
                        9-12: High school
                        13-16: College
                        17-18: Grad School

                        For Any Other grade: Invalid grade level given

                Note:
                    Solution 1: Use switch statement
                    Solution 2: use if & switch both
 */

        byte number = 18;
        String result;

        //Solution 1: Use switch statement

        switch (number) {
            case 1: case 2: case 3: case 4: case 5:
                result = "Elemantary School";
                break;
            case 6: case 7: case 8:
                result = "Middle School";
                break;
            case 9: case 10: case 11: case 12:
                result = "High school";
                break;
            case 13: case 14: case 15: case 16:
                result = "College";
                break;
            case 17: case 18:
                result = "Grad School";
                break;
            default:
                result = "Invalid Grade";
        }

        System.out.println(result);

        System.out.println("==========================================");

        //Solution 2: use if & switch both

        if (number>=1 && number<=18) {
            switch(number) {
                case 6: case 7: case 8:
                    result = "Middle School";
                    break;
                case 9: case 10: case 11: case 12:
                    result = "High school";
                    break;
                case 13: case 14: case 15: case 16:
                    result = "College";
                    break;
                case 17: case 18:
                    result = "Grad School";
                    break;
                default:
                    result = "Elemantary School";
            }

        } else {
            result = "Invalid Grade";
        }

        System.out.println(result);

    }
}


