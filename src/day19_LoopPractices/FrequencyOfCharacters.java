package day19_LoopPractices;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String word = "aabccd";
        String result = "";
        for (int j = 0; j < word.length(); j++) {

            char ch = word.charAt(j); //'a'
            int counter = 0;

            for (int i = 0; i < word.length(); i++) {

                char each = word.charAt(i);
                if (ch == each) {
                    counter++;
                }

            }

            if (result.contains("" + ch)) {
                continue;
            }
            result += ch;
            result += counter;
        }

        System.out.println(result);


    }


}
