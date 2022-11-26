package day21__ForEachLoop;

public class MinimumNumber {

    public static void main(String[] args) {

        int[] number = {10, 5, 4, 20, 1, 0};

        int min = number[0];

        for (int each : number) {
            if (each < min) {
                min = each;
            }
        }


        System.out.println(min);
    }
}
