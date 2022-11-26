package day24_CustomMethod_Return;

public class ReturnMethodPractice3 {

    public static void main(String[] args) {

        String str = "aabbccffhhhe";

        for (int i = 0; i < str.length() ; i++) {
            int frequency =  frequency(str,str.charAt(i));

            if(frequency == 1) {
                System.out.println(str.charAt(i));
            }
        }


    }

    //find out unique character

    public static int frequency(String word, char ch){

        int frequency = 0;

        for (char each : word.toCharArray()) {
            if ( each == ch) {
                frequency++;
            }
        }

        return frequency;

    }


}
