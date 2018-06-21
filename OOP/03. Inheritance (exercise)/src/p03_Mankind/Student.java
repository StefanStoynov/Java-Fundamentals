package p03_Mankind;

public class Student extends Human {
    private String facultyNumber;

    protected Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    private void setFacultyNumber(String facultyNumber) {
        if (facultyNumber.length() < 5 || facultyNumber.length() > 10) {
            throw new IllegalArgumentException("Invalid faculty number!");
        }
        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {

        StringBuilder student = new StringBuilder();
        student.append(super.toString()).append(System.lineSeparator());
        student.append("Faculty number: ").append(this.facultyNumber).append(System.lineSeparator());
        return student.toString();
    }
}
