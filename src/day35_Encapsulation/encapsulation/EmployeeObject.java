package day35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("", 'M', 23,120000);
        Employee employee2 = new Employee("Jane", 'F', 26,100000);

        employee2.setSalary(employee2.getSalary()+ 15000);
        employee2.setName("Aygun");

        System.out.println(employee2);




    }
}
