package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        /*
        1. create an Array of String called countries
        2. write a program that can remove all the country names that have length of 10 or greater
         */

        String[] countries = {"United Kingdom", "United States Of America", "Turkey", "Ghana","Camerun","0123456789A"};

        ArrayList<String> countriesList = new ArrayList<>(Arrays.asList(countries)); // CREATED AN ARRAYLIST TO ADD ELEMENTS LATER ON
        countriesList.removeIf( p -> p.length()>=10);

        countries = countriesList.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));


    }
}

/*
 String[] countries = {"United Kingdom", "United States Of America", "Turkey", "Ghana","Camerun","0123456789A"};

        ArrayList<String> countriesList = new ArrayList<>(); // CREATED AN ARRAYLIST TO ADD ELEMENTS LATER ON

        for (String each : countries) {
        countriesList.add(each);
        }

        countriesList.removeIf( each -> each.length()>=10);

        String[] remainingCountries = new String[countriesList.size()];

        for (int i = 0; i < countriesList.size(); i++) {
            remainingCountries[i] = countriesList.get(i);
        }

        System.out.println(Arrays.toString(remainingCountries));
 */