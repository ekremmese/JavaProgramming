package day13_StringClass;

public class StringMethod2 {

    public static void main(String[] args) {

        //replace() the firs argument (str) with the second

        String str = "Java is fun, I love learning Java";

        String str2 = str.replace("Java", "Python");

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email = "JohnSmith@yahoo.com";

        String gmail = email.replace("yahoo", "gmail");

        System.out.println("email = " + email);
        System.out.println("gmail = " + gmail);

        String sentence = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        String sentence2 = sentence.replace("Python", "").replace("  ", " ");
        sentence2 = sentence2.trim();

        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);

        String s = "dog dog dog dog dog dog dog";
        s = s.replace("dog", "cat");
        System.out.println("s = " + s);

        String s2 = "C# is fun, C# is cool";
        s2 = s2.replace(" C#", " Java");

        System.out.println("s2 = " + s2);

        String s3 = "Java";

        s3 = s3.replace("a", "i");

        System.out.println("s3 = " + s3);

        System.out.println("======================================");

        //replaceFirst() changes only first sequence has occured

        String s4 = "dog dog dog";

        s4 = s4.replaceFirst("dog", "cat");

        System.out.println("s4 = " + s4);

        String s5 = "C# is fun, C# is cool";
        s5 = s5.replaceFirst("C#", "Java");
        System.out.println("s5 = " + s5);

        String s6 = "Java";
        s6 = s6.replaceFirst("va", "ve");
        System.out.println("s6 = " + s6);

    }
    }
//1:50:52