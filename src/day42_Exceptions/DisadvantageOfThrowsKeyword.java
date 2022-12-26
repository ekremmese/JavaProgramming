package day42_Exceptions;

public class DisadvantageOfThrowsKeyword {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hello");
        sleep(1);
        System.out.println("Cydeo");

        System.out.println("-------------------------------");

        System.out.println("Hello");

        MorningWorkout.sleep(2.5);

        System.out.println("World");

    }

    public static void sleep(double seconds) throws InterruptedException {


        Thread.sleep((long) (seconds * 1000));

    }
}
