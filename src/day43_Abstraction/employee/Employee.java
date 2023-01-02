package day43_Abstraction.employee;

public abstract class Employee extends Person{


    private final int ID;
    private String jobTitle;

    public Employee(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender);
        if(ID<=0){
            throw new RuntimeException("Invalid ID" + ID);
        }
        this.ID = ID;
        setJobTitle(jobTitle);
        setSalary(salary);

    }

    private double salary;

    public int getID() {
        return ID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract void work();


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

//2:44:42