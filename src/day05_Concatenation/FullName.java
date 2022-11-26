package day05_Concatenation;

public class FullName {

    public static void main(String[] args) {

        String firstName = "Ekrem";
        String lastName = "Meşe";
        int age = 35;
        String jobTitle  = "Civil Engineer";
        String companyName  = "Opdima";
        double salary = 100000.58;


        String fullName = firstName + " " + lastName;

        System.out.println("Full name of the person is " + fullName + "." + " " + firstName + " is " + age + " years old.");
        System.out.println(fullName + " is " + jobTitle + "," + " works at " + companyName + ".");
        System.out.println(firstName + "'s salary is " + " $" + salary);
//full name is jobTitle, works at companyName

    }
}
