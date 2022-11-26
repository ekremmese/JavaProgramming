package day17_While_DoWhile;

public class LoopPractices {

    public static void main(String[] args) {

        //{   // USED FOR TO CREAT BLOCK

            for (int i = 1; i <= 10; i++) {
                System.out.println(i);                                // IF WE KNOW THE NUMBER OF REPEATING, FOR IS BEST
            }

            System.out.println("------------------");

            int j = 1;
            while (j <= 10) {                                              // IF THE NUMBER OF REPEAT UNKNOWN WHILE LOOP IS THE BEST
                System.out.println(j);
                j++;
            }

            System.out.println("---------------------");

            int k = 1;
            do {
                System.out.println(k);
                k++;
            } while (k <= 10);


        //}

    }
}
