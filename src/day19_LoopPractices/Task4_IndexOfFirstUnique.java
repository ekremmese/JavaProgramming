package day19_LoopPractices;

public class Task4_IndexOfFirstUnique {


    /*
    4. Write a program that can return the index number of the first unique character.

     */
    public static void main(String[] args) {

        String lamot = "aahttreetty";
        int res = 0;

        for (int i = 0; i < lamot.length(); i++) {

            char ch = lamot.charAt(i);
            int counter = 0;

            for (int j = 0; j < lamot.length(); j++) {

                char each = lamot.charAt(j);
                if ( ch == each) {
                    counter++;
                }

            }

            if ( counter == 1) {
                res = i;
                break;
            }



        }

        System.out.println(res);


    }
}
