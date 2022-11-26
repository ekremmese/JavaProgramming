package day13_StringClass;

import java.lang.String; // This is imported implicitly, done by compiler. That's why we were using String without importing // Any class in this package we don t need to import
import java.sql.SQLOutput;
// If I want I can import but its not necessary // String comes from this package

public class StringIntro {

    public static void main(String[] args) {


        // String class designed char sequencese // 0 - 65000 char // String is combination of chars
        String name = "Wooden Spoon";

        //"Cydeo" or "JAva " these are objects // String allows me to use these objects
        //INDEX NUMBER: Every  character in String has index numbers, starts with 0 (Zer0) . For example for "Cydeo" C's index number is 0
        //STRING IS IMMUTABLE: Once I create "Cydeo" I can not modify it ????
        //TWO WAYS TO CREATE AN OBJECT
        //by STRING LITERAL - BY USING ""
        //OBJECTS ARE IN HEAP, VARIALBE ARE IN STACK - EVERYTHING CONSUMES MEMORY STORED IN HEAP
        //IN THE HEAP WE HAVE SPEACIAL PLACE CALLED STRING POOL - EVERYTHING TAKES SPACE IN MEMORY IN STRING STORED IN STRING POOL
        //IF THERE IS TWO OBJECTS ARE EXACTLYY SAME SEQUENCE OF CHARACTERS IN THE STRING POOL THERE WILL BE ONLY ONE OBJECT , SO OBJECTS WILL NOT BE DUPLICATED THERE

        String name1 = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon";

        System.out.println(name1 == name2); //true
        System.out.println(name2 == name3); //true
        System.out.println(name4 == name4); //true

        //STRING LITERAL IS NOT ONLY WAY FOR CREATING STRING OBJECTS, THERE IS ANOTHER WAY
        //WE CAN USE STRING OBJECT

        String str1 = new String("Java");  //original imported by default, for the moment we ignore it
        String str2 = new String("Java");
        String str3 = new String("Java");
        String str4 = new String("Java");

        //IF I USE OBJECT EVEN THE SEQUENCE ARE SAME THERE ARE 2 DIFFERENT OBJECTS IN HEAP MEMORY
        //NOW WE WILL COMPARE THESE :

        System.out.println(str1 == str2);  //false
        System.out.println(str2 == str3);  //false
        System.out.println(str3 == str4);  // false

        //WHENEVER WE USE new TO CREATE STRING OBJECT THEY WILL BE DIFFERENT

        System.out.println("========================================================================");

        //IF WE WANNA COMPARE VISIBLE TEXT (sequence of characters)  OF TWO STRINGS :

        System.out.println(str1.equals(str2));   // from now on we will use equals method to compare // we will not use == equal operator

        //IN FUTURE IF WE CREATE VARIABLE BY OURSELVES WE WILL USE STRING LITERAL BUT IF GET FROM SCANNER WE WILL USE new KEYWORD

        System.out.println("=========================================================================");
        //INDEX NUMBER:

        String abc = "Java     !";
        //index    :  0123456789     // index numbers are giving us ability to manipulate the Strings, the String data

        //charAt(index) :returns the charachter at given index, returns char



    }


}
