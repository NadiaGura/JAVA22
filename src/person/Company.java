package person;

public class Company {

    private Employee[] workers;

    public Company(Employee[] workers) {
        this.workers = workers;
    }

    //METHOD TO CALCULATE AVERAGE AGE
    public double getAvAge() {
        double sum = 0;

        for (Employee employee : workers) {
            sum += employee.getAge();

        }
        return sum / workers.length; //length of workers Array
    }


    //METHOD TO CALCULATE WEEKLY WORKING HOURS BASED ON AGE
    public void hourToWork() {
        for (Employee employee : workers) {
            if (employee.getAge() <= 18) {
                System.out.println(employee.getName() + " is under 18 years and only eligible to 30 hour working week.");
            } else System.out.println(employee.getName() + " will be able to work 40 years a week - full time.");
        }
    }

    //METHOD TO ASSIGN A DEPARTMENT BASED ON THE COMPANY ID
    public void getDepartment() {
        for (Employee employee : workers) {
            if (employee.getCompanyID() == "ID_IT") {
                System.out.println("Person with Company ID - " + employee.getCompanyID() + " - is working in IT Department, create access right for IT.");
            } else if (employee.getCompanyID() == "ID_HR") {
                System.out.println("Person with Company ID - " + employee.getCompanyID() + " - is working in HR Department, create access rights for HR.");
            } else if (employee.getCompanyID() == "ID_Accounting") {
                System.out.println("Person with Company ID - " + employee.getCompanyID() + " - is working in Accounting, create access rights for HR.");
            } else {
                System.out.println("Please check companyID, information not found or incorrect!");
            }
        }
    }

    //METHOD TO APPLY HOURLY RATE BASED ON THE DEPARTMENT WITH CALCULATION OF THE WEEKLY 40 HOUR SALARY
    public void calculateSalary() {
        float hourlyRate = 0;
        float monthlySalary = 0;
        for (Employee employee : workers) {
            if (employee.getCompanyID() == "ID_IT" && employee.getAge() >= 18) {
                hourlyRate = 10;
                monthlySalary = hourlyRate * 40;
                System.out.println("For an " + employee.getCompanyID() + " department hourly rate shall be set to " + hourlyRate + " weekle salary = " + monthlySalary);

            } else if (employee.getCompanyID() == "ID_HR" && employee.getAge() >= 18) {
                hourlyRate = 5;
                monthlySalary = hourlyRate * 40;
                System.out.println("For an " + employee.getCompanyID() + " department hourly rate shall be set to " + hourlyRate + " weekly salary = " + monthlySalary);

            } else if (employee.getCompanyID() == "ID_Accounting" && employee.getAge() >= 18) {
                hourlyRate = 6.2f;
                monthlySalary = hourlyRate * 40;
                System.out.println("For an " + employee.getCompanyID() + " department hourly rate shall be set to " + hourlyRate + " weekly salary = " + monthlySalary);

            } else if (employee.getAge() < 18) {
                System.out.println("For " + employee.getName() + " age is below 18 years, hourly rate and weekly salary shall be calculated separately.");
            } else {
                System.out.println("ERROR Please check data entered!");
            }
        }
    }
}