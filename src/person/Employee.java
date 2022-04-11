package person;

public class Employee extends Person {

    private String companyID;
    private String companyName;

    public Employee(String name, int age, String companyID, String companyName) {
        super(name, age);
        this.companyID = companyID;
        this.companyName = companyName;
    }

    public String getCompanyID() {
        return companyID;
    }
    public String getCompanyName() {
        return companyID;
    }
}
