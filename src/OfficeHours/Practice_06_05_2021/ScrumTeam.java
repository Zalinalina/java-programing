package OfficeHours.Practice_06_05_2021;

import OfficeHours.Practice_06_01_2021.Developer;
import OfficeHours.Practice_06_01_2021.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    /*
- create a class called ScrumTeam

               Attributes:
                            PO, BA, SM,
                            ArrayList<Tester> testersList = new ArrayList<>(),
                            ArrayList<Developer> devopsList = new ArrayList<>(),
                            sprintNumber

                Constructor:
                      sets the names of: PO, BA, SM

                Actions:

                   addTester(Tester tester): adds the given tester to the testers arraylist

                   addTesters(Tester[] testers): adds the given testers to the testers arraylist

                   addDeveloper(Developer developer): adds the given developer to the developers arraylist

                   addDevelopers(Developer[] developers): adds the given developers to the developers arraylist

                   removeTester(long employeeID): removes the given tester from the testers arraylist

                   removeDeveloper(long employeeID): removes the developer from the developers arraylist

                   toString(): prints number of tester,& developers,  PO name, SM name, BA name
 */





        String productOwner;
        String scrumMaster;
        String businessAnalyst;
        ArrayList<Tester> allTesters;
        ArrayList<Developer> allDevelopers;
        int sprintNumber;

        public ScrumTeam(String productOwner, String scrumMaster, String businessAnalyst) {
            this.productOwner = productOwner;
            this.scrumMaster = scrumMaster;
            this.businessAnalyst = businessAnalyst;
            this.allTesters = new ArrayList<>();
            this.allDevelopers = new ArrayList<>();
        }

        public void addTester(Tester tester){
            this.allTesters.add(tester);
        }
        public void addTester(Tester ... testers){ // Tester [] testers
            this.allTesters.addAll(Arrays.asList(testers));
        }

}
