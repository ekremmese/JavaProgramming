package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //System.out.println("Enter true or false:");

        //boolean result = input.nextBoolean();  // WE CAN ONly enter true or false here otherwise it will give us error

        System.out.println("Enter your name: ");
        String name = input.next();    // Reads till the space, anything after this will not be read, READS AS STRING
                                        // If you write Ekrem Mese , it will only take Ekrem, till the space
        input.close();
        System.out.println(name);


    }


}
