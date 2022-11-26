package day25_CustomMethod_Overloading;

import Utilities.ArraysUtility;
import Utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str);

        System.out.println("------------------------------------");

        String str1 =StringUtility.reverseString(str);
        System.out.println(str1);

        System.out.println("------------------------------------");

        String str2 = "Java";

        System.out.println(StringUtility.isPalindrome(str2));


        System.out.println("------------------------------------");

        String[] names = {"Anna", "Amel", "Python", "Ahmet", "racecar", "Mom"};

        int counter = 0;

        for (String each : names) {
            if(StringUtility.isPalindrome(each)){
                counter++;
            }
        }

        System.out.println(counter + " palindromes included");

        System.out.println("------------------------------------");

        String str3 = "aaabbbcccdddeeee";

        str3= StringUtility.removeDuplicates(str3);

        System.out.println(str3);


        System.out.println("------------------------------------");




    }



}
