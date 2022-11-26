package day17_While_DoWhile;

public class BranchingStatement2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
                continue;       // when i == 'C' then it skips the C and continues for the further iterations
            }
            System.out.println(i);

        }

        System.out.println("-------------------------------------");

        for (int i = 1; i < 11; i++) {

            if (i % 2 == 1) {
                continue;
            }
            System.out.print(i+" ");

        }

        System.out.println();
        System.out.println("--------------------------------------");


        for (int i = 1; i < 11; i++) {

            if( i%2 == 0) {
                continue;
            }

            System.out.print(i+" ");

        }


    }

}
