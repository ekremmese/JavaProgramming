package day20_Arrays;

public class AppearedTwice {

    public static void main(String[] args) {

        char[] chars = {'A', 'B', 'A', 'C', 'D', 'D', 'E'};

        for (int i = 0; i < chars.length; i++) {

            char each = chars[i];
            int count = 0;

            for (char i1 = 0; i1 < chars.length; i1++) {
                if (chars[i1] == each) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(each);
            }




        }


    }
}
