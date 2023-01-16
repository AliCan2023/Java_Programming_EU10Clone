package day47_PolymorphismContinue_OOPReview;

import day43_AbstractionIntro.Employee.Devops;
import day43_AbstractionIntro.Employee.Employee;
import day43_AbstractionIntro.Employee.Tester;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismPractice2 {
    public static void main(String[] args) {


        Employee[] employees = {
                new Tester("Sherali", 32, 'M', 1, "QA", 110000),
                new Devops("Zuhal", 27, 'F', 2, "Java Devops", 128000),
                new Tester("George", 28, 'M', 3, "SDET", 120000),
                new Devops("Cristina", 23, 'F', 4, "Software Devops", 135000),
                new Tester("Cihad", 30, 'M', 5, "SDET", 105000),
                new Devops("Gulistan", 26, 'F', 6, "Web Devops", 130000),
                new Tester("Yuliya", 28, 'F', 7, "QE", 120000),
                new Devops("Cassendra", 29, 'F', 8, "Front-end Devops", 140000),
                new Tester("Aygu", 25, 'F', 9, "SDET", 130000),
                new Devops("Sophie", 26, 'F', 10, "Back-end Devops", 150000),
                new Tester("Timur", 29, 'M', 11, "SDET", 115000),
                new Devops("Fady", 26, 'F', 12, "Full Stack Devops", 142000),
                new Tester("Iryna", 24, 'F', 13, "QE", 125000),
                new Devops("Enes", 26, 'M', 14, "Full Stack Devops", 142000),
                new Tester("Mikael", 30, 'M', 15, "SDET", 105000),
        };

        //1 store all the Devops & testers into the following List of employees
        List<Employee> scrumMembers = new ArrayList<>();
        for (Employee eachEmployee : employees) {
            if (eachEmployee instanceof Tester || eachEmployee instanceof Devops) {
                scrumMembers.add(eachEmployee);

            }
            System.out.println(eachEmployee);
        }


        System.out.println("-------------------------------------");

        //2 store all the testers into the following List of testers:
        //3 store all the Devops into the following List of Devops:
        List<Tester> testers = new ArrayList<>();
        List<Devops> devops = new ArrayList<>();
        for (Employee eachScrumMember : scrumMembers) {
            if (eachScrumMember instanceof Tester) {
                testers.add((Tester) eachScrumMember);//You have to do the downcasting
                System.out.println(testers);
            }
            if (eachScrumMember instanceof Devops) {
                devops.add((Devops) eachScrumMember);
                System.out.println(eachScrumMember);
            }

        }
        System.out.println("***************************************");
        //4 which tester has the maximum salary?
        //5 which Devops has the maximum salary?

        Tester testerWithMaxSalary = testers.get(0);
        Devops devopsWithMaxSalary = devops.get(0);

        for (Tester eachTester : testers) {

            if (eachTester.getSalary() > testerWithMaxSalary.getSalary()) {
                testerWithMaxSalary = eachTester;
            }
        }
        for (Devops eachDevop : devops) {
            if (eachDevop.getSalary() > devopsWithMaxSalary.getSalary()) {
                devopsWithMaxSalary = eachDevop;
            }
        }
        System.out.println(testerWithMaxSalary);
        System.out.println(devopsWithMaxSalary);


    }


}
/*
2. Given the following array that contains Employee objects:
			Employee[] employees = {
                new Tester("Sherali", 32, 'M',1, "QA", 110000),
                new Devops("Zuhal", 27, 'F', 2, "Java Devops", 128000),
                new Tester("George", 28,'M', 3, "SDET", 120000),
                new Devops("Cristina", 23, 'F',4, "Software Devops", 135000),
                new Tester("Cihad", 30, 'M',5, "SDET", 105000),
                new Devops("Gulistan",  26, 'F',6, "Web Devops", 130000),
                new Tester("Yuliya",  28, 'F',7, "QE", 120000),
                new Devops("Cassendra",  29, 'F',8, "Front-end Devops", 140000),
                new Tester("Aygu",  25, 'F',9, "SDET", 130000),
                new Devops("Sophie",  26, 'F',10, "Back-end Devops", 150000),
                new Tester("Timur",  29, 'M',11, "SDET", 115000),
                new Devops("Fady",  26, 'F',12, "Full Stack Devops", 142000),
                new Tester("Iryna",  24, 'F',13, "QE", 125000),
                new Devops("Enes",  26, 'M',14, "Full Stack Devops", 142000),
                new Tester("Mikael",  30, 'M',15, "SDET", 105000),
        	};

    		(import them from day43 package)

	   	2.1 store all the Devops & testers into the following List of employees
        		List<Employee> scrumMembers = new ArrayList<>();

        2.2 store all the testers into the following List of testers:
        		List<Tester> testers = new ArrayList<>();

        2.3 store all the Devopss into the following List of Devopss:
        		List<Devops> Devopss = new ArrayList<>();

        2.4 which tester has the maximum salary?

        2.5 which Devops has the maximum salary?

 */