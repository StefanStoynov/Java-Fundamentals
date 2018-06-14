package p09_Google;

public class Company {
    //<companyName> <department> <salary>”
    private String companyName;
    private String department;
    private double salary;

    public Company() {
    }

    public Company(String companyName, String department, double salary) {
        this.companyName = companyName;
        this.department = department;
        this.salary = salary;
    }
}
