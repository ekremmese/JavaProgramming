package day39_Recap.cydeoTask;

public class Cydeo {

/*
 7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes
 */

    public static void main(String[] args) {

        Developer developer = new Developer("Ali", 23, 'M', "Java Developer", 234343, 100000);
        Tester tester = new Tester("Ali", 23, 'M', 23444, "QA Teacher", 100000);
        Teacher teacher = new Teacher("Ali", 23, 'M', 3432423, "Math Teacher", 100000);
        Student student = new Student("Hasan", 23, 'M', 2343, "Java ");

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("---------------------------------");

        tester.work();
        developer.work();
        teacher.work();
        // student.work();

        System.out.println("-----------------------------------");


        developer.eat();
        developer.fixingBugs();

        System.out.println("------------------------------------");

        tester.eat();
        tester.drink();
        tester.createTicket();

        System.out.println("---------------------------------");

        teacher.eat();
        teacher.drink();

        System.out.println("-----------------------------");

        student.eat();
        student.drink();
        student.sleep();

        student.study();


    }

}
