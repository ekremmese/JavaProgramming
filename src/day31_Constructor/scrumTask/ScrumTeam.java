package day31_Constructor.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    public String PO, BA, SM;
    public ArrayList<Tester> testersList = new ArrayList<>();
    public ArrayList <Developer> devOpsList = new ArrayList<>();
    public int dayOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int dayOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.dayOfSprint = dayOfSprint;
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }

    public void addTesters(Tester[] testers){
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        devOpsList.add(developer);
    }

    public void addDevelopers(Developer[] developers){
        devOpsList.addAll(Arrays.asList(developers));
    }

    public void removeTester(long employeeID){
        testersList.removeIf(p->p.employeeID== employeeID);
    }

    public void removeDeveloper(long employeeID){
        devOpsList.removeIf(p->p.employeeID==employeeID);
    }

    @Override
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", number of testersList=" + testersList.size() +
                ", number of devOpsList=" + devOpsList.size() +
                ", day of sprint " + dayOfSprint +
                '}';
    }
}
