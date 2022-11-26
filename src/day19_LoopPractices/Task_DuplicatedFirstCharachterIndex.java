package day19_LoopPractices;

public class Task_DuplicatedFirstCharachterIndex {

    /*
    Write a program that can return the index number of the first duplicated character from a string
     */

    public static void main(String[] args) {

        String word = "abfjjffggh";
        int result = 0;

        for (int j = 0; j < word.length(); j++) {

            char ch = word.charAt(j);
            int counter = 0;

            for (int i = 0; i < word.length(); i++) {

                char eachCharacter = word.charAt(i);
                if (ch == eachCharacter) {
                    counter++;
                }

            }

            if (counter == 2) {
                result = j;
                break;
            }

        }

        System.out.println(result);


    }


}
