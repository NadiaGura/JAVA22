package person;

public class Main {


    //MAIN
    public static void main(String[] args) {

        Employee[] workers = new Employee[]{
                new Employee("Mike", 16, "ID_IT", "Google"),
                new Employee("Alex", 34, "ID_HR", "Intel"),
                new Employee("Summer", 42, "ID_Accounting", "Apple"),
        };

        Company newCompany = new Company(workers);

        System.out.println("Average age of workers " + Math.round(newCompany.getAvAge()*10.0)/10.0);
        System.out.println("\n");

        newCompany.hourToWork();
        System.out.println("\n");

        newCompany.getDepartment();
        System.out.println("\n");

        newCompany.calculateSalary();

    }
}
