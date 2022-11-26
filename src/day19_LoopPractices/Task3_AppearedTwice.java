package day19_LoopPractices;

public class Task3_AppearedTwice {

    /*
    3. Write a program that can display all the characters that appeared twice in the string.
     */

    public static void main(String[] args) {

        String str = "aaabbccccgguui";

        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {

                char each = str.charAt(i);
                if (ch == each) {
                    count++;
                }

            }

            if ( count == 2) {
                result += ch;
            }

        }

        System.out.println(result);



    }
}
