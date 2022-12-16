package day37_Inheritance.scrumTeamTask;

public class Developer extends Employee{


    public Developer(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    public void fixBugs(){
        System.out.println(jobTitle + " " + name + " is crying");
    }
}
