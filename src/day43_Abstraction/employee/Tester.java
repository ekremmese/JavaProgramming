package day43_Abstraction.employee;

public final class Tester extends Employee{

    public Tester(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " is finding bugs");
    }

    @Override
    public void sleep() {
        System.out.println(getJobTitle() + " is sleeping 10 hours in a day");
    }

    public void bugReport(){
        System.out.println(getJobTitle() + " is creating bug reports");
    }

}
