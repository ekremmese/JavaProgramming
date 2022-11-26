package day19_LoopPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String word = "aabddeeefh";
        String result = "";


        for (int j = 0; j < word.length(); j++) {
            char ch = word.charAt(j); // 'a'
            int counter = 0;

            for (int i = 0; i < word.length(); i++) {

                char each = word.charAt(i);
                if (ch == each) {
                    counter++;
                }
            }

            if (counter == 1) {

                result +=ch;

            }
        }

        System.out.println(result);

    }
}
