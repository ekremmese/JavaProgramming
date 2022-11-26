package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(10);
        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(20);
        numbers.add(30);
        numbers.add(30);
        numbers.add(30);

        ArrayList<Integer> result = new ArrayList<>();

        for (Integer each : numbers) {

            if (!result.contains(each)) {
                result.add(each);
            }

        }
        System.out.println(result);
    }
}
