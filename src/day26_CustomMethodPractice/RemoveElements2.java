package day26_CustomMethodPractice;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElements2 {

    public static void main(String[] args) {
        int[] array = {10, 20, 20, 40, 50, 60}; // arr[]
        int index = 2;

        int[] removed = removeElement(array,index);

        System.out.println(Arrays.toString(removed));
    }

    public static int[] removeElement(int[] array, int index) {


        if (index<0 || index> array.length-1){
            System.err.println("ınvalid Index " + index);
            System.exit(0);
        }
        int[] result = {};

        for (int i = 0; i < array.length; i++) {

            if (i != index) {
                result = ArraysUtility.addElement(result, array[i]);
            }

        }
        return result;
    }

}
