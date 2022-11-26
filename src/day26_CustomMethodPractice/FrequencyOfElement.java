package day26_CustomMethodPractice;

public class FrequencyOfElement {

    public static void main(String[] args) {

        int[] arr = {1,4,7,0,2,9,1};
        int num = 1;

       int frequency =  frequency(arr,num);

        System.out.println(frequency);

    }

    /*
    1. Create a class named FrequencyOfElement:
			1.1 Create a method that passes two parameters:
			an integer array and an Integer element. T
			he method returns the frequency of the given integer
			element from the integer array

			1.2 Create a method that passes two parameters:
			a double array and a double element.
			The method returns the frequency of the given integer
			from the array

			1.3 Create a method that passes two parameters:
			a char array and a char element.
			The method returns the frequency of the given
			char element from the char array

			1.4 Create a method that passes two parameters:
			a String array and a String element.
			The method returns the frequency of the given
			String element from the String array
     */

    // finds the frequency of given int in the int array, returns integer value
    public static int frequency(int[] arr, int element){
        int counter = 0;
        for ( int each : arr) {
            if (each == element){
                counter++;
            }
        }
        return counter;
    }

    // finds the frequency of given double in the double array, returns integer value
    public static int frequency(double[] arr, double element){
        int counter = 0;
        for ( double each : arr) {
            if (each == element){
                counter++;
            }
        }
        return counter;
    }

    // finds the frequency of given char in the char array, returns integer value
    public static int frequency(char[] arr, char element){
        int counter = 0;
        for ( char each : arr) {
            if (each == element){
                counter++;
            }
        }
        return counter;
    }


    // finds the frequency of given String in the String array, returns integer value
    public static int frequency(String[] arr, String element){
        int counter = 0;
        for ( String each : arr) {
            if (each == element){
                counter++;
            }
        }
        return counter;
    }


}
