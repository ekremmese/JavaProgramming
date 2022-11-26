package day17_While_DoWhile;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {

        String str = "Java Java Python Python";

        int frequency = 0;

        while (str.contains("Java")){
            str = str.replaceFirst("Java","");
            frequency++;
        }

        System.out.println(frequency);

        System.out.println("=========================================");

        String sentence = "Cat cat cat dog cat cat dog";
        sentence = sentence.toLowerCase();
        int frequency2 = 0;

        while(sentence.contains("cat")){ // when I add .toLowerCase to the sentence its becoming infinite loop
             sentence = sentence.replaceFirst("cat", "");
             frequency2++;
        }
        System.out.println(frequency2);

    }
}
