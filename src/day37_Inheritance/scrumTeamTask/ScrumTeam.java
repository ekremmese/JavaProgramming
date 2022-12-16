package day37_Inheritance.scrumTeamTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public ProductOwner productOwner;
    public BusinessAnalyst businessAnalyst;
    public ScrumMaster scrumMaster;
    public ArrayList<Tester> testerArrayList = new ArrayList<>();
    public ArrayList<Developer> developerArrayList = new ArrayList<>();

    public ScrumTeam(ProductOwner productOwner, BusinessAnalyst businessAnalyst, ScrumMaster scrumMaster) {
        this.productOwner = productOwner;
        this.businessAnalyst = businessAnalyst;
        this.scrumMaster = scrumMaster;
    }

    public void addTester(Tester tester){
        testerArrayList.add(tester);
    }
    
    public void addTesters(Tester[] testers){
        testerArrayList.addAll(Arrays.asList(testers));
    }

    public void removeTester(int ID){
        testerArrayList.removeIf( p -> p.ID == ID);
    }

    public void addDeveloper(Developer developer){
        developerArrayList.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        developerArrayList.addAll(Arrays.asList(developers));
    }

    public void removeDeveloper(int ID){
        developerArrayList.removeIf( p -> p.ID == ID);
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "productOwner=" + productOwner +
                ", businessAnalyst=" + businessAnalyst +
                ", scrumMaster=" + scrumMaster +
                ", number of testerArrayList=" + testerArrayList.size() +
                ", number of developerArrayList=" + developerArrayList.size() +
                '}';
    }
}
