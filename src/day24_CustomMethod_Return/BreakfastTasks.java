package day24_CustomMethod_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        initials("Vladimir", "Putin");
        domain("ekremmese1@gmail.com");

        System.out.println("----------------------------");

        String[] emails = {"ali@veli.com", "veli@yahoo.com", "mustafa@gmail.com", "osman@hotmail.com"};

        for (String each : emails) {
            domain(each);
        }


        System.out.println("-------------------------------");

        nameOfMonth(1);

        System.out.println("-----------------");

        nameOfDay(4);

    }


    /*
    Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has

     */

    public static void initials(String firstName, String lastName) {

        char a = firstName.charAt(0);

        char b = lastName.charAt(0);

        String initial = a + "." + b;

        initial = initial.toUpperCase();

        System.out.println(initial);


    }

    public static void domain(String email) {

        int indexat = email.indexOf("@");
        int indexdot = email.lastIndexOf(".");

        String domain = email.substring(indexat + 1, indexdot);

        System.out.println(domain);

    }

    public static void nameOfMonth(int monthNumber) {
        String name = "";
        if (monthNumber >= 1 && monthNumber <= 12) {
            name = (monthNumber == 1) ? "January" : (monthNumber == 2) ? "February" : (monthNumber == 3) ? "March" : (monthNumber == 4) ? "April" : (monthNumber == 5) ? "May" : (monthNumber == 6) ? "June" : (monthNumber == 7) ? "July" : (monthNumber == 8) ? "August" : (monthNumber == 9) ? "September" : (monthNumber == 10) ? "October" : (monthNumber == 11) ? "November" : "December";
        } else {
            name = "Invalid";
        }

        System.out.println("Month name: " + name);
    }

    public static void nameOfDay (int dayNumber) {
        String name = "";
        if (dayNumber >= 1 && dayNumber <= 7) {
            name = (dayNumber == 1) ? "Mon" : (dayNumber == 2) ? "Tue" : (dayNumber == 3) ? "Wed" : (dayNumber == 4) ? "Thu" : (dayNumber == 5) ? "Fri" : (dayNumber == 6) ? "Sat" : "Sun";
        } else {
            name = "Invalid";
        }

        System.out.println("Day name: " + name);
    }


}
