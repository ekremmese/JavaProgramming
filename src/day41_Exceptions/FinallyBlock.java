package day41_Exceptions;

public class FinallyBlock {

    public static void main(String[] args) {

        int[] arr = {1,3,4};

        try {
            System.out.println(arr[10]);
            System.out.println("Try Blcok");
        } catch (RuntimeException e){
            System.out.println("Catch Block");
            e.printStackTrace();
            System.exit(0);
        } finally {
            System.out.println("Finally Block");
        }

    }

}
