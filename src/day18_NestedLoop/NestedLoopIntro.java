package day18_NestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {

        int a = 0;

        for (int i = 0; i < 4; i++) {   // THIS IS CALLED OUTER LOOP

            for (int j = 0; j < 5; j++) {  //   THIS IS CALLED INNER LOOP
                a++;
                System.out.println(a + " Wooden Spoon");
            }

        }


    }
}
