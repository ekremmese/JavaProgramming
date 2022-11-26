package day20_Arrays;

public class UniqueElemetsOfArray {

    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C#", "Python", "Python"};


        for (int i = 0; i < words.length; i++) {

            String elements = words[i];
            int counter = 0;

            for (int i1 = 0; i1 < words.length; i1++) {
                if (words[i1].equals(elements)) {
                    counter++;

                }
            }

            if (counter == 1) {
                System.out.println(elements);
            }
        }


    }
}
