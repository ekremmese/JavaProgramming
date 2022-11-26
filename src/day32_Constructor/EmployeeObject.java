package day32_Constructor;

import java.util.jar.JarOutputStream;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Murat");

        System.out.println(employee1);

        Employee employee2 = new Employee("Jane", 'F');

        System.out.println(employee2);

        Employee employee3 = new Employee("Ali", 'M', "SDET");

        System.out.println(employee3);

        Employee employee4 = new Employee("Mary", 'F', "DevOps", 200000);

        System.out.println(employee4);
    }
}
