package day16_ForLoopStringPractice;

public class ReverseString {

    public static void main(String[] args) {

        String word = "Wooden Spoon";
        //String result ="";

        for (int i = word.length()-1; i >=0 ; i--) {
            System.out.print(word.charAt(i));
            //result +=word.charAt(i);
        }

        //System.out.println(result);




    }
}
