package day26_CustomMethodPractice;

import java.util.Arrays;

public class RemoveElements1 {
    /*
    2. Create a class named RemoveElements:
			2.1 Create a method that passes two parametetrs: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						removeElement(arr, 2) ==> {10, 20, 40}

			2.2 Create a method that passes two parametetrs: a double array and an integer index. the method removes the element at the given index of the array and returns the new array


			2.3 Create a method that passes two parametetrs: a char array and an integer index. the method removes the element at the given index of the array and returns the new array

			2.4 Create a method that passes two parametetrs: a String array and an integer index. the method removes the element at the given index of the array and returns the new array

     */

    public static void main(String[] args) {

        int[] array = {10, 20, 20, 40, 50, 60}; // arr[]
        int index = 2;

        int[] removed = removeElement(array,index);

        System.out.println(Arrays.toString(removed));

    }

    //remove the element in the given index from the give array and returns new array
    public static int[] removeElement(int[] array, int index){

        if (index<0 || index> array.length-1){
            System.err.println("ınvalid Index " + index);
            System.exit(0);
        }
        int[] result = new int[array.length-1];
        int j = 0;

        for( int i = 0; i< array.length; i++){
            if(i==index){   // if the index of array is matching with the given index
                continue;  // skip the given index's element
            }
            result[j++] = array[i];
        }
        return result;
    }

    //remove the element in the given index from the give array and returns new array
    public static double[] removeElement(double[] array, int index){

        if (index<0 || index> array.length-1){
            System.err.println("ınvalid Index " + index);
            System.exit(0);
        }
        double[] result = new double[array.length-1];
        int j = 0;

        for( int i = 0; i< array.length; i++){
            if(i==index){   // if the index of array is matching with the given index
                continue;  // skip the given index's element
            }
            result[j++] = array[i];
        }
        return result;
    }

    //remove the element in the given index from the give array and returns new array
    public static char[] removeElement(char[] array, int index){

        if (index<0 || index> array.length-1){
            System.err.println("ınvalid Index " + index);
            System.exit(0);
        }
        char[] result = new char[array.length-1];
        int j = 0;

        for( int i = 0; i< array.length; i++){
            if(i==index){   // if the index of array is matching with the given index
                continue;  // skip the given index's element
            }
            result[j++] = array[i];
        }
        return result;
    }


    //remove the element in the given index from the give array and returns new array
    public static String[] removeElement(String[] array, int index){

        if (index<0 || index> array.length-1){
            System.err.println("ınvalid Index " + index);
            System.exit(0);
        }
        String[] result = new String[array.length-1];
        int j = 0;

        for( int i = 0; i< array.length; i++){
            if(i==index){   // if the index of array is matching with the given index
                continue;  // skip the given index's element
            }
            result[j++] = array[i];
        }
        return result;
    }
}
