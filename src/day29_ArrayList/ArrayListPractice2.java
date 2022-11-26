package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","David","Jimmy","Ahmed","Ahmed","David","John"));

        employees.retainAll(Arrays.asList("Ahmed","David"));

        System.out.println(employees);

        System.out.println("------------------------------------------");

        //remove the String elements that starts with M
        String[] names = {"Mary" , "Monica", "Musti", "Mehray", "Ahmed","Hasan"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf( p -> p.startsWith("M"));

        names = list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));

        System.out.println("------------------------------------------");

    }
}
