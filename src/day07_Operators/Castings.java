package day07_Operators;

public class Castings {

    public static void main(String[] args) {

        float averagecreditScore = 20.5f;

        byte num1= (byte) averagecreditScore; //explicit casting
        short num2 = (short) averagecreditScore; //explicit casting
        int num3 = (int) averagecreditScore; //explicit casting
        long num4 = (long) averagecreditScore; //explicit casting
        float num5 = averagecreditScore;  //no castings
        double num6 = averagecreditScore; //implicit casting


        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);

        System.out.println(45/8);
        System.out.println(45%8);

        //double > float > long > int > short > byte



    }
}
