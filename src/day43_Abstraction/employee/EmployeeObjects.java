package day43_Abstraction.employee;

public class EmployeeObjects {

    public static void main(String[] args) {

        //Person person = new Person ("josh",23, 'M');
        //Employee employee = new Employee()

        Tester tester = new Tester("Ali", 23,'M', 2233,"QA Manager", 200000);
        Developer developer = new Developer("Veli", 35,'M', 22001,120000);
        Teacher teacher = new Teacher("Ali", 47,'M', 200012,"Teacher", 80000);
        Driver driver = new Driver("John", 56,'M', 20012323,"Driver", 40000);

        System.out.println();

    }
}
