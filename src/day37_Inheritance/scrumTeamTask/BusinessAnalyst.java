package day37_Inheritance.scrumTeamTask;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender, int ID, double salary) {
        super(name, age, gender, ID, "Business Analyst", salary);
    }

    public  void  analyze(){
        System.out.println(name + " is analyzing the documents");
    }


}
