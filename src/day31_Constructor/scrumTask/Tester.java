package day31_Constructor.scrumTask;

public class Tester {

    public String name;
    public long employeeID;
    public String jobTitles;
    public double salary;

    public Tester(String name, long employeeID, String jobTitles, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitles = jobTitles;
        this.salary = salary;
    }

    public void smokeTesting(){

        System.out.println(name + " is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name + " is creating ticker");
    }

    public void dailyStandUp(){

    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitles='" + jobTitles + '\'' +
                ", salary=" + salary +
                '}';
    }
}
