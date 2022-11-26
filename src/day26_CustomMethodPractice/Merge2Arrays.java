package day26_CustomMethodPractice;

public class Merge2Arrays {

    public static void main(String[] args) {

    }

    public static int[] merge(int[] array1, int[]array2){
        int[] result = new int[array1.length+ array2.length];

        int i = 0;

        for( int each : array1){
            result[i++] = each;
        }

        for (int each :array2){
            result[i++] = each;
        }

        return result;

    }

}
