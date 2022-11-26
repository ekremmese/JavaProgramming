package day19_LoopPractices;

public class Task_DuplicatedFirstCharachters {
    /*
    Write a program that can return the first duplicated character from a string
     */
    public static void main(String[] args) {

        String word = "abccdd";
        String res = "";

        for (int j = 0; j < word.length(); j++) {

            char ch = word.charAt(j);
            int counter = 0;

            for (int i = 0; i < word.length(); i++) {
                char ch1 = word.charAt(i);
                if (ch == ch1) {
                    counter++;
                }
            }

            if (res.contains("" + ch)) {
                continue;
            }

            if (counter == 2) {

                res += ch;
                break;
            }


        }

        System.out.println(res);

    }

}
