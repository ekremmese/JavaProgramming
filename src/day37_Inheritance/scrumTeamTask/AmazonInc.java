package day37_Inheritance.scrumTeamTask;

import org.w3c.dom.ls.LSOutput;

public class AmazonInc {

    public static void main(String[] args) {

        ProductOwner productOwner = new ProductOwner("John", 34, 'M', 322123,120000);
        ScrumMaster scrumMaster = new ScrumMaster("Alan", 23, 'M', 43311, 120000);
        BusinessAnalyst businessAnalyst = new BusinessAnalyst("Ayse", 45, 'F', 20012, 140000);

        Tester tester1 = new Tester("Hakan", 27,'M', 200012, "QA Lead", 80000);
        Tester tester2 = new Tester("Murat", 32,'M', 3000234, "QA Manager", 100000);
        Tester tester3 = new Tester("Hatice", 27,'F', 324001, "Manuel Tester", 40000);
        Tester tester4 = new Tester("Naomi", 23,'F', 100034, "Automation Tester", 65000);

        Tester[] testers = {tester1,tester2,tester3,tester4};

        Developer developer1 = new Developer("Beril", 34, 'F', 34001, "Java Developer", 100000);
        Developer developer2 = new Developer("Bill", 22, 'M', 340001, "Python Developer", 120000);
        Developer developer3 = new Developer("Bekir", 43, 'M', 300, "Java Developer", 100000);
        Developer developer4 = new Developer("Ilyar", 19, 'M', 100, "Python Developer", 100000);
        Developer developer5 = new Developer("Beril", 25, 'F', 200, "Full Stack Developer", 100000);

        Developer[] developers =  {developer1,developer2,developer3,developer4,developer5,developer5};

        ScrumTeam scrumTeam1 = new ScrumTeam(productOwner, businessAnalyst, scrumMaster);


        scrumTeam1.addDeveloper(developer1);
        scrumTeam1.addDevelopers(developers);

        scrumTeam1.addTesters(testers);

        System.out.println(scrumTeam1);

        System.out.println("---------------------------------");


        for (Tester tester : scrumTeam1.testerArrayList){

            System.out.println(tester.name + " " + tester.salary);

        }

    }





}
