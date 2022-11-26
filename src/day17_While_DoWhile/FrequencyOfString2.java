package day17_While_DoWhile;

public class FrequencyOfString2 {

    public static void main(String[] args) {


        String sentence = "Cat cat cat dog cat dog";
        int frequency = 0;

        for (int i = 0; i < sentence.length() - 4; i++) {

            if (sentence.substring(i, i + 3).equalsIgnoreCase("cat")) {
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}

//1:02:35