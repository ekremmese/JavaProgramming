package day30_CustomClass;

public class Employee {

    public String name;
    public int ID;
    public String jobTitle;
    public double salary;
    public boolean isFullTime;
    public char gender;


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", ID=" + ID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", gender=" + gender +
                '}';
    }

    public void setInfo(String name, int ID, String jobTitle, double salary, boolean isFullTime, char gender) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.gender = gender;
    }

    public void work(){
        System.out.println(name + " is working");
    }
}
