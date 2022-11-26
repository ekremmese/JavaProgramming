package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {

    public static void main(String[] args) {

        //Arrays.asList converts an array to Collection type

        String str = "aaabcccdeeef";

        char[] array = str.toCharArray(); //converted str to a charArray

        ArrayList<Character> list = new ArrayList<>();  // created an empty ArrayList to add chars later on

        for ( char each : array ){             // with the loop i added all chars to the ArrayList
            list.addAll(Arrays.asList(each));  // with the asList array converted to ArrayList
        }

        list.removeIf( each -> Collections.frequency(list,each) != 1);  // removed the duplicated frequency != 1

        String result = "";  //empty String created to collect the elements of ArrayList in a String

        for (Character character : list) {  // loop executed for creating result
            result += character;
        }

        System.out.println(result);


    }
}
