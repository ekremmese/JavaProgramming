package day29_ArrayList;

import Utilities.ArraysUtility;
import Utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        //If I wanna remove all the odds

      //  for (int i = 0; i < list.size(); i++) {
           // if(list.get(i) % 2 != 0){
           //     list.remove(i); //could not remove them all, because collection is dynamic by size, while we remove one of them the rest swaps so wecan not remove them properly, we can solve this with iterable but we will learn it soon
          //  }
      //  }

        System.out.println(list);

        list.removeIf( p -> p<5); // basic syntax of lambda expression,

        System.out.println(list);

        System.out.println("----------------------------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        list2.removeIf(each -> each % 2 == 0);   //   -> array token

        System.out.println(list2);

        System.out.println("-----------------------------------------------------------");

        ArrayList<String> names = new ArrayList<>();

        names.addAll(Arrays.asList("Java","Python","C#", "C++","Java","Java"));

        names.removeIf(each -> each.charAt(0) == 'C');
        names.removeIf(each -> each.startsWith("J"));

        System.out.println(names);

        // removeIf method internally uses iterable and loop

        System.out.println("-------------------------------------------------------------");
        //remove all the palindromes
        ArrayList<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Anna", "Racecar", "Level", "Java","Python", "Cydeo"));
        names2.removeIf(each -> !StringUtility.isPalindrome(each)); // removes the Strings which are not palindrome
        System.out.println(names2);

        //removeIf method works with any collection type


    }
}
