package day41_Exceptions;

import day39_Recap.cydeoTask.Employee;

import java.lang.reflect.Array;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        System.out.println("Test1 completed");
        Employee employee = null;

        try {
            System.out.println("Try Block");
            System.out.println(employee.getSalary());

        } catch (IndexOutOfBoundsException e){
            System.out.println("1st Catch Block");
            e.printStackTrace();
        } catch (ArithmeticException e){
            System.out.println("2nd Catch Block");
            e.printStackTrace();
        } catch (ClassCastException e) {
            System.out.println("3rd Catch Block");
            e.printStackTrace();
        } catch (NullPointerException e){  //We put RunTimeExpection in the end as an insurance
            System.out.println("4th Catch Block");
            e.printStackTrace();
        }

        System.out.println("Test1 Completed");

        System.out.println("------------------------------------------");

        try {
            System.out.println("java".charAt(-1));
        }catch (RuntimeException e){
            e.printStackTrace();
        }


    }
}
