package day13_StringClass;

import java.util.Scanner;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //System.out.println("enter your email adress");
        //String email = input.next();

        String email = "Cydeo.School@gmail.com";

        String domain = email.substring(email.indexOf("@") +1, email.lastIndexOf("."));

        System.out.println("domain = " + domain);

        System.out.println("===================================================");

        String str1 = "Java is fun, Java is cool, I love Java";

        String s1 = str1.substring(0, str1.indexOf(","));
        String s2 = str1.substring(str1.indexOf(",")+2, str1.lastIndexOf(","));
        String s3 = str1.substring(str1.lastIndexOf(",")+2);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

    }
}
