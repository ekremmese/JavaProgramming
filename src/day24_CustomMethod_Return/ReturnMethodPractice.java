package day24_CustomMethod_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        int multiplyByTwo = maxNumber(100,252)*2;

        System.out.println(multiplyByTwo);

    }

    //find the max number between 100 & 200
    //multiply the max num by 2

    public static int maxNumber(int num1, int num2){

        int result = 0;
        if(num1>num2) {
            result = num1;
        } else {
            result = num2;
        }

      return result;


    }
}
