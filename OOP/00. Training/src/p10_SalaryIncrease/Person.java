package p10_SalaryIncrease;

import java.text.DecimalFormat;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private String bonus;

    protected Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public void salaryWithBonus(double bonus) {
        DecimalFormat df = new DecimalFormat("#.0########################");
        double bonusSalary = 0.0;
        if (this.age > 30) {
            this.salary += this.salary * bonus / 100;
        } else {
            this.salary += this.salary * bonus / 200;
        }

        this.bonus = df.format(this.salary);
    }


    @Override
    public String toString() {
        return String.format("%s %s gets %s leva", this.firstName, this.lastName, bonus);
    }
}
