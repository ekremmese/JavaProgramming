package day30_CustomClass;

import java.util.Collections;

public class CapitalOne {

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setInfo("Ali", 234, "SDET", 100000, true, 'M');

        Employee employee2 = new Employee();
        employee1.setInfo("Ahmed", 1005, "Test Lead", 120000, false, 'M');

        Employee employee3 = new Employee();
        employee1.setInfo("Ayse", 45, "Developer", 123000, true, 'F');

        Employee employee4 = new Employee();
        employee1.setInfo("Asiya", 445, "Product Owner", 150000, true, 'F');

        Employee employee5 = new Employee();
        employee1.setInfo("Murat", 623, "Product Manager", 200000, false, 'M');

        Employee[] employees = {employee1, employee2, employee3, employee4, employee5};

        int countFullTime = 0;
        int countPartTime = 0;

        System.out.println(employee1.isFullTime);

        for (Employee each : employees) {
            if ( each.isFullTime ){
                countFullTime++;
            } else {
                countPartTime++;
            }
        }
        System.out.println(countFullTime);
        System.out.println(countPartTime);

    }
}
