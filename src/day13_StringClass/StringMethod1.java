package day13_StringClass;

public class StringMethod1 {

    public static void main(String[] args) {

        //trim() used to remove white spaces // just removes the white spaces in the beginning and in the end
        //the space between batch and 25 is not white space

        String str1 = "            batch    25           ";

        str1 = str1.trim();

        System.out.println(str1);

        System.out.println("=================================");

        String str2 = "Cydeo School";

        int indexNumber = str2.indexOf("ool");

        System.out.println("indexNumber = " + indexNumber);

        String str3 = "Java Programming Language";

        int indexNumber2 = str3.indexOf("an");
        int indexNumber3 = str3.indexOf("ang");

        System.out.println("indexNumber2 = " + indexNumber2);
        System.out.println("indexNumber3 = " + indexNumber3);

        System.out.println("=================================");

        //lastIndexOf()   & indexOF

        int indexNumber5 = str3.lastIndexOf("g");

        System.out.println("indexNumber5 = " + indexNumber5);

        System.out.println("==================================");

        String s = "Java Nova Cava Wawa orange";

        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");

        //int fourthA = s.indexOf("ava W");
        //int fourthA = s.lastIndexOf("av"); // PAY ATTENTION
        int fourthA = s.indexOf("Ca") + 1;

        int fifthA = s.lastIndexOf("a W");
        int sixthA = s.lastIndexOf("aw");

        //int seventhA= s.lastIndexOf("a ");
        int seventhA = s.indexOf("a o");




        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);
        System.out.println("fourthA = " + fourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixthA = " + sixthA);
        System.out.println("seventhA = " + seventhA);


    }
}
