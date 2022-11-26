package day12_Scanner;


import java.util.Scanner; // regular import, importing one class

//import java.util.*;  => wild import, imports every classes from the package of util, if we import everything it will effect performance and memory
//so we import just what we need
//we import the Scanner from java.util package

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);   // We declared  Scanner Object and  assigned to a variable  // Now we can use methods of Scanner
                                                  // Scanner() => constructor of the Scanner, all the constructor   // here "input is scanner variable
        //int num = input.nextInt();

        System.out.println("Enter a number between 1 to 7: ");

        int number =  input.nextInt();
        String result;
        if (number>=1 &&number<=7){
            result = (number==1) ? "Monday": (number==2) ? "Tuesday" : (number == 3) ? "Wednesday"
                    : (number == 4) ? "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" : "Sunday";
        } else {
            result = "Invalid Number";
        }
        System.out.println(result);

        input.close();  // after we use it we need to close it, after this line 30 we can not us it anymore, if we wanna use Scanner we have to create new object
    }
}

//1:12:40 kaldığım yer