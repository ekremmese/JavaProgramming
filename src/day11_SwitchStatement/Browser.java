package day11_SwitchStatement;

public class Browser {

    public static void main(String[] args) {
/*
1. Create a class called Browser. Write a program that can display the name of selected browser
	        1. declear a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name

	        Ex:
	        	String browser = "chrome";

	    	Output:
	    		Chrome Browser is selected

			Note: MUST use nested if
 */

        //  I THINK THIS TASK BETTER CAN BE EXECUTED WITHOUT BESTED IF

        String browserName = "chrome",
                message = "";

        /*
        if (browserName == "Chrome") {
            message = "Chrome browser is selected.";
        } else if (browserName == "Firefox") {
            message = "Firefox browser is selected.";
        } else if (browserName == "Opera") {
            message = "Opera browser is selected";
        } else if (browserName == "Safari") {
            message = "Safari browser is selected";
        } else if (browserName == "Edge") {
            message = "Edge browser is selected";
        } else {
            message = "Invalid browser name";
        }
        System.out.println(message);

         */  // MY SOLUTION WITHOUT NESTED IF IS HERE

        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "safari" ||
                browserName == "opera" || browserName == "edge";

        if (validBrowser) {
            if (browserName == "chrome") {
                message = "Chrome browser is selected.";
            } else if (browserName == "firefox") {
                message = "Firefox browser is selected.";
            } else if (browserName == "opera") {
                message = "Opera browser is selected";
            } else if (browserName == "safari") {
                message = "Safari browser is selected";
            } else {
                message = "Edge browser is selected";
            }

        } else {
            message = "Invalid Browser Name";
        }
        System.out.println(message);
    }
}
