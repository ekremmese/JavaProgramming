package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        //create a variable that's capable to contain 5 names

        String[] names = new String[5];

        names[0] = "Ahmet";
        names[1] = "Mehmet";
        names[2] = "Yahya";
        names[3] = "David";
        names[3] = "Ibrahim";
        names[4] = "Polat";
        //names[5] = "Muhtar";

        //names = ;["Ali", "Ahmet",  "Mehmet",  "David", "Christopher"];


        //System.out.println(names); give us hashcode if print in that way
        System.out.println(Arrays.toString(names));

        String[] myGroup = {"Ali", "Veli"};  // another style of declaring variable

        System.out.println(Arrays.toString(myGroup));


        System.out.println("==========================================");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(days.length);  // Gives 7 output

        System.out.println(Arrays.toString(days));

        int number = 1;

        if (number < 1 || number > 7) {
            System.err.println("Invalid");
            System.exit(0);
        }

        System.out.println(days[number - 1]);

        System.out.println("=================================");

        String[] months = {"january", "February", "March", "April", "May", "June ", "July", "August", "September", "October", "November", "December"};

        int i = 4;

        if (i < 0 || i > 12) {

            System.out.println("Invalid entry");
            System.exit(0);
        }

        System.out.println(months[i - 1]);


    }
}
