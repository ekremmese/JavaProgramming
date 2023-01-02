package day43_Abstraction.employee;

public final class Teacher extends Employee{
    public Teacher(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " is teaching");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping 11 hours");
    }




}
