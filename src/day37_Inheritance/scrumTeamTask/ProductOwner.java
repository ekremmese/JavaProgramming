package day37_Inheritance.scrumTeamTask;

import org.w3c.dom.ls.LSOutput;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, int ID, double salary) {
        super(name, age, gender, ID, "Product Owner", salary);
    }



}
