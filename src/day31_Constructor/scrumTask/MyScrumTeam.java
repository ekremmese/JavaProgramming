package day31_Constructor.scrumTask;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Ali", 233, "SDET", 200000);
        Tester tester2 = new Tester("John", 4023, "QA", 125000);
        Tester tester3 = new Tester("Jane", 2012, "SDET", 120000);

        Tester[] testers = {tester1, tester2, tester3};

        Developer developer1 = new Developer("Taylor", 23333, "Developer", 230000);
        Developer developer2 = new Developer("Chris", 4902, "Developer", 150000);
        Developer developer3 = new Developer("Mustafa", 1042, "Developer", 230000);
        Developer developer4 = new Developer("Ayse", 144002, "Developer", 140000);

        Developer[] developers = {developer1, developer2, developer3, developer4};

        ScrumTeam scrum = new ScrumTeam("Calal", "Murat", "Muhammed", 14);

        System.out.println(scrum);

        scrum.addTesters(testers);
        scrum.addDevelopers(developers);

        System.out.println(scrum);

        System.out.println("------------");

        for (Tester each: scrum.testersList) { //scrume is not data structure but scrum.testersList is
            System.out.println(each.name + " : " + each.salary );
        }
        System.out.println("------------");

        for ( Developer eachDeveloper : scrum.devOpsList) {
            System.out.println(eachDeveloper.name + " : " + eachDeveloper.salary);
        }

        scrum.removeDeveloper(4902);

        System.out.println(scrum);

        scrum.removeTester(233);

        System.out.println(scrum);

    }
}
