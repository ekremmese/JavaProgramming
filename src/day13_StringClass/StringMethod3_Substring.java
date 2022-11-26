package day13_StringClass;

public class StringMethod3_Substring {

    public static void main(String[] args) {

        //substring() method:We use it when we wanna take some portion of our String as data we use it
        //from beginning index till the ending index is the work flow
        //ending index always excluded
        String word = "Cydeo School";

//brand
        String brande = word.substring(0, 5);
        System.out.println("brande = " + brande);

        String str2 = word.substring(6);
        System.out.println(str2);

        String word2 = "Python C# Ruby";

        String s1;
        String s2;
        String s3;
        // Now this program applicable for every sentence which has 3 words
        s1 = word2.substring(0, word2.indexOf(" "));
        s2 = word2.substring(word2.indexOf(" ")+1, word2.lastIndexOf(" "));
        s3 = word2.substring(word2.lastIndexOf(" ") +1);

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

    }
}
//2:24:08