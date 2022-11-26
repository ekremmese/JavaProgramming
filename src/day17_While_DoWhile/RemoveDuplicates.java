package day17_While_DoWhile;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String word = "AABBCCC";

        String result = "";

        for (int i = 0; i < word.length(); i++) {

            String ch = "" + word.charAt(i);

            if(result.contains(ch)) {
                continue;
            }
            result += ch;

        }

        System.out.println(result);


    }
}
