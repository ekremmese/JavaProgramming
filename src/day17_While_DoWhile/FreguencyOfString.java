package day17_While_DoWhile;

public class FreguencyOfString {

    public static void main(String[] args) {

        /*
        2. write a program that can return the frequency of the a word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3
         */

        String sentence = "javajava";
        int frequency = 0;
        System.out.println(sentence.length());
        for (int i = 0; i < sentence.length() -3 ; i++) {

            if (sentence.substring(i,i+4).equals("java")) {
                frequency++;
            }
            System.out.println(sentence.substring(i,i+4));
        }
        System.out.println(frequency);
    }
}


