package day29_ArrayList;

import day28_ArrayList.ArraysListMethod2;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        //addAll(collectiontype) : adds the given data to the collection

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,3,3,3,4,5,4,7,8,8,8,8,9,10));  // Arrays.asList converts (1,2,3,4,5) to collection type

        //removeAll(collectiontype):  removes the given data from the collection

        //for example : I wanna delete 3,5,8 from the list collection

        list.removeAll(Arrays.asList(3,5,8));  // if there are multiple values of those elements , this method removes all

        System.out.println(list);

        System.out.println("----------------------------------------------");

        //retainsAll(collection type) : this method is opposite of removeAll() , it removes all the unmatching

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(0,1,2,3,4,5,6,7,8,8,8,9,10));

        numbers.retainAll(Arrays.asList(0,1,8)); // if there are multiple elements it keeps all

        System.out.println(numbers);

        System.out.println("------------------------------------------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET","Developer", "QA","SDET","BA","BA"));

        jobTitles.retainAll(Arrays.asList("QA","SDET"));

        System.out.println(jobTitles);

        System.out.println("------------------------------------------------");

        //containsAll() : checks if the given collection is included or not and returns boolean
        ArrayList<Integer> numbers2 = new ArrayList<>();

        numbers2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3));
        boolean r1 = numbers2.containsAll(Arrays.asList(1,2,3,40)); //if one of them not contained it will give us false result

        //before we used contains(int) one by one to check for 1, 2, 3 and 4

        System.out.println("r1 = " + r1);

        System.out.println("------------------------------------------------");

        //To convert an Array to Collectin ==>>> asList()

        String[] names = {"josh", "ayse", "sevim", "hasan"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));

        //namesList.addAll(Arrays.asList(names));

        System.out.println(Arrays.toString(names)); //printed Array
        System.out.println(namesList); //printed collection

        System.out.println("------------------------------------------------");

        int[] arr = {10,20,30,40,50,60,70}; // We can not directly convert it to collections because it is primitive and collection does not support primitives
        Integer[] arr2 = {1,2,3,4,5,6,7}; //this can be converted

        ArrayList<Integer> names2 = new ArrayList<>(Arrays.asList(arr2));

        //after creating my custom method, I can use it to convert array of primitives to collection

        ArrayList<Integer> number = new ArrayList<>(convertArrayToArrayList(arr));

        System.out.println(number);


    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) {
            list.add(each);
        }
        return list;
    }
}


//1:22:39
