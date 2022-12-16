package day37_Inheritance.scrumTeamTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int ID, String jobTitle, double salary) {
        super(name, age, gender, ID, jobTitle, salary);
    }

    public void createTicket(){
        System.out.println(jobTitle + " " + " is creating ticket");
    }



}
