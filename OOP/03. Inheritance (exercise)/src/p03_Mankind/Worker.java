package p03_Mankind;

public class Worker  extends  Human{
    private double weekSalary;
    private double hoursPerDay;

    protected Worker(String firstName, String lastName, double weekSalary, double hoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setHoursPerDay(hoursPerDay);
    }

    private void setHoursPerDay(double hoursPerDay) {
        if (hoursPerDay<1 || hoursPerDay>12){
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.hoursPerDay = hoursPerDay;
    }

    private void setWeekSalary(double weekSalary) {
        if (weekSalary < 10){
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    private double salaryPerHour(double weekSalary,double hoursPerDay){
        double salaryPerHour = 0;
        salaryPerHour = (weekSalary/7)/hoursPerDay;
        return salaryPerHour;
    }

    @Override
    protected void setLastName(String lastName) {
        if (lastName.length()<3){
            throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName");
        }
        super.setLastName(lastName);
    }

    @Override
    public String toString() {
        StringBuilder worker = new StringBuilder();
        worker.append(super.toString()).append(System.lineSeparator());
        worker.append("Week Salary: ").append(String.format("%.2f",weekSalary)).append(System.lineSeparator())
                .append("Hours per day: ").append(String.format("%.2f",hoursPerDay)).append(System.lineSeparator())
                .append("Salary per hour: ").append(String.format("%.2f",salaryPerHour(this.weekSalary,this.hoursPerDay)));
        return worker.toString();
    }
}
