package day43_Abstraction.employee;

public final class Developer extends Employee{
    public Developer(String name, int age, char gender, int ID, double salary) {
        super(name, age, gender, ID, "Developer", salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " is developing the application");
    }

    @Override
    public void sleep() {
        System.out.println(getJobTitle() + " is sleeping 5 hours in a day");
    }

    public void unitTesting(){
        System.out.println(getJobTitle() + "is writing unit Tests");
    }
}
