package day23_CustomMethods_Void;

public class MethodPractice2 {

    //create a function that can print hello world 5 times

    public static void helloWorld(){

        System.out.println("Hello World! \n".repeat(5));

    }

    //create a function that can print hello cydeo 5 times

    public static void helloCydeo(){

        System.out.println("Hello Cydeo! \n".repeat(5));

    }

    public static void main(String[] args) {

        helloWorld();
        helloCydeo();
        even();

    }

    //create evens from 1 - 10

    public  static void even(){

        for (int i = 0; i < 11; i++) {
            if(i%2==0)
            {
                System.out.println(i);
            }
        }
    }

}
