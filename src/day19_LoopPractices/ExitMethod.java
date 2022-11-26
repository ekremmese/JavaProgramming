package day19_LoopPractices;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if ( i == 3) {
                //continue; // terminates the current iteration of the Loop
                //break; // terminates the loop

                System.exit(0);  // terminates all the program after that point
            }
            System.out.println(i);
        }

        System.out.println("WoodenSpoon");


    }
}
