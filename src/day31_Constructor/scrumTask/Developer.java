package day31_Constructor.scrumTask;

public class Developer {

    public String name;
    public long employeeID;
    public String jobTitles;
    public double salary;

    public Developer(String name, long employeeID, String jobTitles, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitles = jobTitles;
        this.salary = salary;
    }


    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitles='" + jobTitles + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name + " is coding");
    }

    public void unitTesting(){
        System.out.println(name + " is unit testing.");
    }

    public void fixingBug(){
        System.out.println(name + " is fixing Bugs");
    }



}
