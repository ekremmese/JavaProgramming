package day39_Recap.cydeoTask;

public class Developer extends Employee {

    /*
    4. Create a sub class of Employee named Developer

            Override the work method

            Extra methods:
                fixingBugs()
     */

    public void fixingBugs(){
        System.out.println(getName() + " " + getJobTitle() + " is fixing bugs");
    }

    public Developer(String name, int age, char gender, String jobTitle, int employeeID, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " " + getJobTitle() + " is working");
    }
}
