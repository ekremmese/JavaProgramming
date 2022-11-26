package day21__ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Java";

        char[] chars = str.toCharArray();

        System.out.println(Arrays.toString(chars));

        for (char each : str.toCharArray()) {
            System.out.println(each);
        }

        System.out.println("==============================================");

        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("===============================================");

        String email = "ekremmese1@gmail.com";

        String[] arr = email.split("@");

        System.out.println(arr[0]);
        System.out.println(arr[1]);

        String s = "Today is a nice day. Today we learn Java. Today I am fine.";

        String[] arr2 = s.split("\\. "); // ıf we split with dot then we have to give double backslas \\

        System.out.println(Arrays.toString(arr2));

    }
}
