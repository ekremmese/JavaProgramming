package day21__ForEachLoop;

public class MaximumNumber {

    public static void main(String[] args) {

        int[] number = {10, 5, 4, 20, 1, 0};

        int max = number[0];


        for (int each : number) {
            if (each > max) {
                max = each;
            }
        }

        System.out.println(max);

    }
}
