package day05_Concatenation;

public class StudentInfo {

    public static void main(String[] args) {

        /*
        2. Create a class called StudentInfo, and declare variables for the followings:
    			1. student name (String)
    			2. age (int)
    			3. gender (char)
    			4. school name (String)
    			5. phone n (String) (###)-###-####
    			6. full time (boolean)
         */

        String studentName = "Ekrem";
        int age=22;
        char gender = 'M';
        String schoolName = "Cydeo";
        String phonen= "(532)-420-3548";
        boolean fullTime = true;
        double GPA = 2.5;

        System.out.println("studentName = " + studentName);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("schoolName = " + schoolName);
        System.out.println("phonen = " + phonen);
        System.out.println("fullTime = " + fullTime);
        System.out.println("GPA = " + GPA);



    }
}
