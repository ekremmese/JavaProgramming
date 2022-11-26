package day29_ArrayList;

import java.security.cert.CertPath;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9));

        ArrayList<Integer> unique = new ArrayList<>();

        //MY SOLUTION
        //list.removeIf( each -> Collections.frequency(list,each) != 1);

        for (Integer each : list) {
            if (Collections.frequency(list, each) == 1) // checks if the frequency of element is 1
                unique.add(each); //adds the elements to uniqe ArrayList
        }
        System.out.println(unique);

        System.out.println("---------------------------------");

        //2nd Muhtar's solution without Loop

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 7, 8, 9, 9));

        ArrayList<Integer> unique2 = new ArrayList<>(list2);

        unique2.removeIf(each -> Collections.frequency(list2,each) !=1 );

        System.out.println("Unique2 " + unique2);




    }
}

//list.removeIf( each -> Collections.frequency(list,each) != 1);