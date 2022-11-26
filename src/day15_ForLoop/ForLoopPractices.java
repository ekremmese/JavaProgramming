package day15_ForLoop;

public class ForLoopPractices {

    public static void main(String[] args) {

        for (int i = 15; i <= 45; i++) {

            System.out.print(i + " ");
        }

        System.out.println();

        System.out.println("====================================");


        for (int i = 100; i >= 50; i--) {   // WITH THE FOR LOOP MOSTLY WE WILL USE < , > , >= , <= OPERATORS
            System.out.print(i + " ");
        }

        System.out.println();


        System.out.println("========================================");

        // TASK : PRINT ALL THE EVEN NUMBERS BETWEEN 1 AND 55
/*
        for (int i = 2; i<55; i+=2) {
            System.out.print(i + " ");
        }

 */
        for (int i= 1; i<=55; i++){

            if(i%2 == 0)  {
                System.out.print(i+" ");
            }

        }

        // a _ z



    }
}

//3:03:42